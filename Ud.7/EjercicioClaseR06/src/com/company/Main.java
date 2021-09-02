package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("BIENVENIDO AL VIDEOPOKER");
        System.out.println("Sus cartas son las siguientes");
        PokerDeck mesa = new PokerDeck();

        PokerHand mano = new PokerHand(mesa.drawCard(), mesa.drawCard(),mesa.drawCard(),mesa.drawCard(),mesa.drawCard());
        System.out.println(mano);
        System.out.println();
        System.out.println("A continuación, escoja los numeros correspondientes a la posicion " + '\n' +
                "en la que se encuentran las cartas que quiere descartar (sin espacios)");
        System.out.println("[1·2·3·4·5]");
        System.out.println("··········");
        String descarte;
        descarte = sc.nextLine();
        System.out.println();

        int i;
        for (i = 0; i < descarte.length(); i++)
        {
            int num = Integer.parseInt(Character.toString(descarte.charAt(i)))-1;
            mano.hand[num]= mesa.drawCard();
        }

        System.out.println(mano.toString());

        if (mano.isRoyalFlush())
        {
            System.out.println("··Escalera real··");
            System.out.println("1er premio");
            System.out.println("x800");
        }
        else
        {
            if (mano.isStraightFlush())
            {
                System.out.println("··Escalera de color··");
                System.out.println("2º premio");
                System.out.println("50 puntos");
            }
            else
            {
                if (mano.isPoker())
                {
                    System.out.println("··Poker··");
                    System.out.println("3er premio");
                    System.out.println("25 puntos");
                }
                else
                {
                    if (mano.isFull())
                    {
                        System.out.println("··Full··");
                        System.out.println("4º premio");
                        System.out.println("9 puntos");
                    }
                    else
                    {
                        if (mano.isFlush())
                        {
                            System.out.println("··Color··");
                            System.out.println("5º premio");
                            System.out.println("6 puntos");
                        }
                        else
                        {
                            if (mano.isStraight())
                            {
                                System.out.println("··Escalera··");
                                System.out.println("6º premio");
                                System.out.println("4 puntos");
                            }
                            else
                            {
                                if (mano.isThree())
                                {
                                    System.out.println("··Trio··");
                                    System.out.println("7º premio");
                                    System.out.println("3 puntos");
                                }
                                else
                                {
                                    if (mano.isTwoPair())
                                    {
                                        System.out.println("··Dobles parejas··");
                                        System.out.println("8ª premio");
                                        System.out.println("2 puntos");
                                    }
                                    else
                                    {
                                        if (mano.isPair())
                                        {
                                            System.out.println("··Pareja··");
                                            System.out.println("10º premio");
                                            System.out.println("1 punto");
                                        }
                                        else
                                        {
                                            System.out.println("No tienes nada");
                                            System.out.println("Has perdido");
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }













        /*PokerCard pc1 = new PokerCard(PokerCard.Rank.Ace, PokerCard.Suit.Spades);
        PokerCard pc2 = new PokerCard(PokerCard.Rank.N10, PokerCard.Suit.Spades);
        PokerCard pc3 = new PokerCard(PokerCard.Rank.Queen, PokerCard.Suit.Spades);
        PokerCard pc4 = new PokerCard(PokerCard.Rank.King, PokerCard.Suit.Spades);
        PokerCard pc5 = new PokerCard(PokerCard.Rank.Jack, PokerCard.Suit.Spades);


        PokerHand ph = new PokerHand(pc1, pc2, pc3, pc4, pc5);

        System.out.println(ph.toString());

        System.out.println("Pareja: "+ph.isPair());
        System.out.println("Dobles parejas: "+ph.isTwoPair());
        System.out.println("Trio: "+ ph.isThree());
        System.out.println("Escalera: "+ph.isStraight());
        System.out.println("Color: "+ph.isFlush());
        System.out.println("Trio: "+ph.isFull());
        System.out.println("Poker: "+ph.isPoker());
        System.out.println("Escalera de color: "+ph.isStraightFlush());
        System.out.println("Escalera Real: "+ph.isRoyalFlush());

        PokerDeck pd = new PokerDeck();
        System.out.println(pd.drawCard());*/

    }
}

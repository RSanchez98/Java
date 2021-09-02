package com.company;


public class PokerCard
{
    // ATRIBUTOS*********************************************************************************************************
    enum Rank
    {
        N2, N3, N4, N5, N6, N7, N8, N9, N10, Jack, Queen, King, Ace
    }

    enum Suit
    {
        Hearts, Diamonds, Spades, Clubs
    }


    Rank rank;
    Suit suit;


    // CONSTRUCORES******************************************************************************************************

    public PokerCard(Rank rank, Suit suit)
    {
        this.rank = rank;
        this.suit = suit;
    }


    // PORPIEDADES*******************************************************************************************************

    public Rank getRank()
    {
        return this.rank;
    }

    public Suit getSuit()
    {
        return this.suit;
    }

    // METODOS***********************************************************************************************************

    public String toString()
    {
        String[] valor = new String[]{"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        String[] logo = new String[]{"♥", "♦", "♣", "♠"};

        String carta = valor[this.rank.ordinal()];

        if (this.suit.ordinal() < 2)
        {
            carta = carta + this.ANSI_RED;
        }
        else
        {
            carta = carta + this.ANSI_WHITE;
        }

        carta = carta + logo[this.suit.ordinal()];
        carta = carta + this.ANSI_RESET;

        return carta;

    }


    final String ANSI_BLACK = "\u001B[30m";
    final String ANSI_RED = "\u001B[31m";
    final String ANSI_GREEN = "\u001B[32m";
    final String ANSI_YELLOW = "\u001B[33m";
    final String ANSI_BLUE = "\u001B[34m";
    final String ANSI_PURPLE = "\u001B[35m";
    final String ANSI_CYAN = "\u001B[36m";
    final String ANSI_WHITE = "\u001B[37m";
    final String ANSI_RESET = "\u001b[0m";
}

package com.company;

import java.util.Arrays;

public class PokerHand
{
    // ATRIBUTOS*********************************************************************************************************
    PokerCard[]hand = new PokerCard[5];
    // CONSTRUCORES******************************************************************************************************
        public PokerHand(PokerCard c1, PokerCard c2, PokerCard c3, PokerCard c4, PokerCard c5)
        {
            this.hand[0] = c1;
            this.hand[1] = c2;
            this.hand[2] = c3;
            this.hand[3] = c4;
            this.hand[4] = c5;
            this.shortHand();
        }

    // PORPIEDADES*******************************************************************************************************

    // METODOS***********************************************************************************************************

    public String toString()
    {
        String cadena = "Mano: "+Arrays.toString(hand);
        return cadena;
    }

    public void shortHand()
    {
        PokerCard pc;
        int i, j;

        for (i = 0; i < this.hand.length; i++)
        {
            for (j = 0; j < this.hand.length-1; j++)
            {
                if (this.hand[j].rank.ordinal() > this.hand[j + 1].rank.ordinal())
                {
                    pc = this.hand[j];
                    this.hand[j] = this.hand[j + 1];
                    this.hand[j+1] = pc;
                }
            }
        }

        for (i = 0; i < this.hand.length; i++)
        {
            for (j = 0; j < this.hand.length -1; j++ )
            {
                if ((this.hand[j].rank.ordinal() == this.hand[j+1].rank.ordinal()) &&(this.hand[j].suit.ordinal()> this.hand[j+1].suit.ordinal()))
                {
                    pc = this.hand[j];
                    this.hand[j] = this.hand[j+1];
                    this.hand[j+1] = pc;
                }
            }
        }
    }

    public boolean isPair()
    {
        int i;
        for (i = 0; i < this.hand.length-1; i++)
        {
            if (this.hand[i].rank.ordinal() == this.hand[i + 1].rank.ordinal())
            {
                return true;
            }
        }
        return false;
    }

    public boolean isTwoPair()
    {
        int i, j = 0;
        for (i = 0; i < this.hand.length -1 ; i++)
        {
            if (this.hand[i].rank.ordinal()==this.hand[i + 1].rank.ordinal())
            {
                j++;
                i++;
                if (j == 2)
                {
                    return true;
                }

            }
        }
        return false;
    }

    public boolean isThree()
    {
        int i;
        for (i = 0; i < this.hand.length-1; i++)
        {
            if (this.hand[i].rank.ordinal() == this.hand[i+1].rank.ordinal())
            {
                for (i = 0; i < this.hand.length-2; i++)
                {
                    if (this.hand[i].rank.ordinal() == this.hand[i+2].rank.ordinal())
                    {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean isStraight()
    {
        int i, j = 1;
        for (i = 0; i < this.hand.length -1; i++)
        {
            if (this.hand[i].rank.ordinal() - this.hand[i+1].rank.ordinal() == -1)
            {
                j++;
                if (j == 5)
                {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isFlush()
    {
        int i, j = 1;
        for (i = 0; i<this.hand.length -1; i++)
        {
            if (this.hand[i].suit.ordinal() == this.hand[i+1].suit.ordinal() )
            {
                j++;
                if (j == 5)
                {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isFull()
    {
        int i;
        for (i = 0; i < this.hand.length -1; i++)
        {
            if ((isPair()) &&(isThree()))
            {
                return true;
            }
        }
        return false;
    }

    public boolean isPoker()
    {
        int i;
        int j = 1;
        {
            for (i = 0; i< this.hand.length - 1; i++)
            {
                if (this.hand[i].rank.ordinal() == this.hand[i+1].rank.ordinal())
                {
                    j++;
                    if (j == 4)
                    {
                        return true;
                    }
                }
                else
                {
                    j = 1;
                }
            }
            return false;
        }
    }

    public boolean isStraightFlush()
    {
        if (isStraight() && isFlush())
        {
            return true;
        }
        return false;
    }

    public boolean isRoyalFlush()
    {
        if (isStraightFlush() && this.hand[4].rank.equals(PokerCard.Rank.Ace))
        {
            return true;
        }
        return false;
    }
}

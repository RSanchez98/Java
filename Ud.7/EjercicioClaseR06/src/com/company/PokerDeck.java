package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PokerDeck
{
    // ATRIBUTOS*********************************************************************************************************
    List<PokerCard> deck = new ArrayList<>();

    // CONSTRUCORES******************************************************************************************************

    private void barajar()
    {
        Random r = new Random();

        ArrayList listaApoyo = new ArrayList();

        while (this.deck.size()!=0)
        {
            int mezclar = r.nextInt(this.deck.size());
            listaApoyo.add(this.deck.get(mezclar));
            this.deck.remove(mezclar);
        }
        this.deck.addAll(listaApoyo);
    }

  public PokerDeck()
  {
      int i, j;
      for (i = 0; i <= 12; i++)
      {
          for (j = 0; j <= 3; j++)
          {
              PokerCard pc = new PokerCard(PokerCard.Rank.values()[i], PokerCard.Suit.values()[j]);
              this.deck.add(pc);
          }
      }
      barajar();
  }
    // PORPIEDADES*******************************************************************************************************
    // METODOS***********************************************************************************************************
    PokerCard drawCard()
    {
        PokerCard carta;
        carta = this.deck.get(0);
        this.deck.remove(0);
        return carta;
    }
}

package com.company;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Baraja
{
    private List<Carta> listaCarta;

    Baraja()
    {
        listaCarta = new ArrayList<>();
    }

    Baraja(int tipoBaraja)
    {
        if (tipoBaraja == 1)
        {
            int i;
            for (i = 1; i < 40; i++)
            {
                Carta c = new Carta(i);
                listaCarta.add(c);
            }
        }
        else
        {
            if (tipoBaraja ==2)
            {
                int i;
                for (i = 1; i <40; i++)
                {
                    Carta c = new Carta(i);
                    listaCarta.add(c);
                }
                for (i = 1; i <40; i++)
                {
                    Carta c = new Carta(i);
                    listaCarta.add(c);
                }
            }
            else
            {
                throw new InvalidParameterException("Opcion erronea. Eligue 1 o 2");
            }
        }
    }

    Baraja(int tipoBaraja, boolean barajar)
    {
        if (tipoBaraja == 1)
        {
            int i;
            for (i = 1; i < 40; i++)
            {
                Carta c = new Carta(i);
                listaCarta.add(c);
            }
        }
        else
        {
            if (tipoBaraja ==2)
            {
                int i;
                for (i = 1; i <40; i++)
                {
                    Carta c = new Carta(i);
                    listaCarta.add(c);
                }
                for (i = 1; i <40; i++)
                {
                    Carta c = new Carta(i);
                    listaCarta.add(c);
                }
            }
            else
            {
                throw new InvalidParameterException("Opcion erronea. Eligue 1 o 2");
            }
        }

        if (barajar)
        {
            barajar();
        }
    }



    public void barajar()
    {
        Collections.shuffle(listaCarta);
    }

    public void cortar(int numeroCartas)
    {
        List<Carta> listaCorte = new ArrayList<>();
        for (int i = 0; i <numeroCartas; i++)
        {
            listaCorte.add(this.listaCarta.get(0));
            listaCarta.remove(0);
        }
        listaCarta.addAll(listaCorte);
    }

    public Carta robar()
    {
        Carta c = listaCarta.get(0);
        listaCarta.remove(0);
        return c;
    }

    public void insertaCartaFinal(int idCarta)
    {
        int ultimaCarta = listaCarta.size();
        Carta c = new Carta(idCarta);
        listaCarta.add(ultimaCarta, c);
    }
    public void insertaCartaPrincipio(int idCarta)
    {
        Carta c = new Carta(idCarta);
        listaCarta.add(0,c);
    }

    public void insertaCartaFinal(Carta c)
    {
        listaCarta.add(c);
    }

}

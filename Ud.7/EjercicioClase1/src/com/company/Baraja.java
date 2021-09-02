package com.company;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baraja
{
    //ATRIBUTOS*********************************************************************************************************
    private List<Carta> listaCartas;


    //CONSTRUCTORES*****************************************************************************************************
    public Baraja()
    {
        listaCartas = new ArrayList<>();
    }

    public Baraja(int tipoBaraja)
    {
        listaCartas = new ArrayList<>();
        int i;
        if (tipoBaraja == 1)
        {
            for (i = 1; i <= 40; i++)
            {
                Carta c = new Carta(i);
                listaCartas.add(c);
            }
        }
        else
        {
            if (tipoBaraja == 2)
            {
                for (i = 1; i <= 40; i++)
                {
                    Carta c = new Carta(i);
                    listaCartas.add(c);
                }
                for (i = 1; i <= 40; i++)
                {
                    Carta c = new Carta(i);
                    listaCartas.add(c);
                }
            }
            else
            {
                throw new InvalidParameterException("Las barajas no estan bien");
            }
        }
    }


    public Baraja(int tipoBaraja, boolean barajar)
    {
        listaCartas = new ArrayList<>();
        int i;
        if (tipoBaraja == 1)
        {
            for (i = 1; i <= 40; i++)
            {
                Carta c = new Carta(i);
                listaCartas.add(c);
            }
        }
        else
        {
            if (tipoBaraja == 2)
            {
                for (i = 1; i <= 40; i++)
                {
                    Carta c = new Carta(i);
                    listaCartas.add(c);
                }
                for (i = 1; i <= 40; i++)
                {
                    Carta c = new Carta(i);
                    listaCartas.add(c);
                }
            }
            else
            {
                throw new InvalidParameterException("Las barajas no estan bien");
            }
        }

        if (barajar == true)
        {
            barajar();
        }
    }

    //METODOS***********************************************************************************************************
    public void barajar()
    {
        Collections.shuffle(listaCartas);
    }
    public void cortar(int numeroCartas)
    {
        List<Carta> corteNuevo = new ArrayList<>();
        int i;
        for (i = 0; i < numeroCartas; i++)
        {
            corteNuevo.add(this.listaCartas.get(0));
            listaCartas.remove(0);
        }
        listaCartas.addAll(corteNuevo);
    }
    public Carta robar()
    {
        Carta valor = listaCartas.get(0);
        listaCartas.remove(0);
        return valor;
    }
    public void insertaCartaFinal(int idCarta)
    {
        Carta c = new Carta(idCarta);
        listaCartas.add(c);
    }
    public void insertaCartaPrincipio(int idCarta)
    {
        Carta c = new Carta(idCarta);
        listaCartas.add(0, c);
    }
    public void insertaCartaFinal(Carta c)
    {
        listaCartas.add(c);
    }
    public void insertaCartaPrincipio(Carta c)
    {
        listaCartas.add(0, c);
    }
    public int numeroCartas()
    {
        int cuantasCartas = listaCartas.size();
        return cuantasCartas;
    }
    public boolean vacia()
    {
        boolean estaVacia = true;
        if (listaCartas.size()>0)
        {
            estaVacia = false;
        }
        return estaVacia;
    }
}

package com.company;

import java.lang.reflect.Array;
import java.security.InvalidParameterException;
import java.util.LinkedList;
import java.util.List;

public class Carta
{
    //ATRIBUTOS*********************************************************************************************************
    int numero;
    int palo;


    //CONSTRUCTORES*****************************************************************************************************
    public Carta (int numero, int palo)
    {
        if ((numero < 1 || numero > 10) || (palo < 0 || palo > 3))
        {
            throw new InvalidParameterException("Esa carta no existe");
        }
        else
        {
            this.numero = numero;
            this.palo = palo;
        }
    }

    public Carta(int id)
    {
        if (id>=1&&id<=40)
        {
            if (id <= 10)
            {
                this.numero = id;
                this.palo = 0; //ORO
            }
            else
            {
                if (id <= 20)
                {
                    this.numero = id - 10;
                    this.palo = 1; //COPA
                }
                else
                {
                    if (id <= 30)
                    {
                        this.numero = id - 20;
                        this.palo = 2; //ESPADAS
                    }
                    else
                    {
                        this.numero = id - 30;
                        this.palo = 3; //BASTOS
                    }
                }
            }
        }
        else
        {
            throw new InvalidParameterException("Identificador no valido (debe ser mayor que 1 y menor que 40)");
        }
    }


    //PROPIEDADES*******************************************************************************************************
    public int getNumero()
    {
        return this.numero;
    }
    public int getPalo()
    {
        return this.palo;
    }

    //METODOS***********************************************************************************************************
    public String nombreNumero()
    {
        String texto = "";

        switch (this.numero)
        {
            case 1: texto ="as"; break;
            case 2: texto="dos"; break;
            case 3: texto="tres"; break;
            case 4: texto="cuatro"; break;
            case 5: texto="cinco"; break;
            case 6: texto="seis"; break;
            case 7: texto="siete"; break;
            case 8: texto="sota"; break;
            case 9: texto="caballo"; break;
            case 10: texto="rey"; break;
        }
        return texto;
    }
    public String nombrePalo()
    {
        String texto = "";
        switch (this.palo)
        {
            case 0: texto="oros"; break;
            case 1: texto="copas"; break;
            case 2: texto="espadas"; break;
            case 3: texto="bastos"; break;
        }
        return texto;
    }
    public String nombreCarta()
    {
        String texto = this.nombreNumero()+" de "+this.nombrePalo();
        return texto;
    }
    public int valorTute()
    {
        int valor=0;
        switch (this.numero)
        {
            case 1: valor = 11; break;
            case 2: valor = 0; break;
            case 3: valor = 10; break;
            case 4: valor = 0; break;
            case 5: valor = 0; break;
            case 6: valor = 0; break;
            case 7: valor = 0; break;
            case 8: valor = 2; break;
            case 9: valor = 3; break;
            case 10: valor = 4; break;
        }
        return valor;
    }
    public int valorMus()
    {
        int valor = 0;
        switch (this.numero)
        {
            case 1: valor = 1; break;
            case 2: valor = 1; break;
            case 3: valor = 10; break;
            case 4: valor = 4; break;
            case 5: valor = 5; break;
            case 6: valor = 6; break;
            case 7: valor = 7; break;
            case 8: valor = 10; break;
            case 9: valor = 10; break;
            case 10: valor = 10; break;
        }
        return valor;
    }
    public double valor7yMedia()
    {
        double valor = 0;
        if (this.numero<=7)
        {
            valor = this.numero;
        }
        else
        {
            valor = 0.5;
        }
        return valor;
    }

}

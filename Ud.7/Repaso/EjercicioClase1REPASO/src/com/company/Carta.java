package com.company;

import java.security.InvalidParameterException;

public class Carta
{
    private int numero;
    private int palo;


    public Carta(int numero, int palo)
    {
        if(numero <1 || numero > 40)
        {
            throw new InvalidParameterException ("El numero no puede ser inferior a 1 ni mayor a 10");
        }
        else
        {
            this.numero = numero;
        }

        if (palo <0||palo>3)
        {
            throw new InvalidParameterException("El palo no puede ser inferior a 0 o mayora a 3");
        }
        else
        {
            this.palo = palo;
        }
    }

    public Carta (int id)
    {
        if (id >=1 && id <=40)
        {
            if (id <= 10)
            {
                this.numero = id;
                this.palo = 0;
            }
            else
            {
                if (id <= 20)
                {
                    this.numero = id -10 ;
                    this.palo = 1;
                }
                else
                {
                    if (id <= 30)
                    {
                        this.numero = id -20;
                        this.palo = 2;
                    }
                    else
                    {
                        this.numero = id -30;
                        this.palo = 3;
                    }
                }
            }
        }
        else
        {
            throw new InvalidParameterException("El id debe ser mayor o igual a 1 y menor o igual a 40");
        }
    }


    public int getNumero()
    {
        return numero;
    }
    public int getPalo()
    {
        return palo;
    }



    public String nombreNumero()
    {
        String numero=" ";

        switch (this.numero)
        {
            case 1: numero = "As"; break;
            case 2: numero = "dos"; break;
            case 3: numero = "tres"; break;
            case 5: numero = "cuatro"; break;
            case 4: numero = "cinco"; break;
            case 6: numero = "seis"; break;
            case 7: numero = "siete"; break;
            case 8: numero = "sota"; break;
            case 9: numero = "caballo"; break;
            case 10: numero = "rey"; break;
        }
        return numero;
    }

    public String nombrePalo()
    {
        String palo="";
        switch (this.palo)
        {
            case 0: palo = "oros"; break;
            case 1: palo = "copas"; break;
            case 2: palo = "espadas"; break;
            case 3: palo = "bastos"; break;
        }
        return  palo;
    }

    public String  nombreCarta()
    {
        String nombre = this.nombreNumero()+" de "+this.nombrePalo();
        return nombre;
    }
}

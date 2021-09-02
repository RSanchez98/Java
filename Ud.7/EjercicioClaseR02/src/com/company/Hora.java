package com.company;

import java.security.InvalidParameterException;

public class Hora
{

    // ATRIBUTOS*********************************************************************************************************
    private int segundos;


    // CONSTRUCORES******************************************************************************************************
    public Hora (int segundos)
    {
        if (segundos<0)
        {
            throw new InvalidParameterException("Los segundos no pueden ser 0 o negativos");
        }
        else
        {
            this.segundos = segundos;
        }
    }

    public Hora (int horas, int minutos, int segundos)
    {
        if (minutos < 0 || minutos >59)
        {
            throw new InvalidParameterException("Los minutos no deben ser menores que 0 o mayores de 59");
        }
        else
        {
            if (segundos < 0 || segundos >59)
            {
                throw new InvalidParameterException("Los segundos no deben ser menores que 0 o mayores de 59");
            }
            else
            {
                this.segundos = segundos+ minutos*60 + horas*3600;
            }
        }
    }
    // PORPIEDADES*******************************************************************************************************

    public int getSegundosTotales()
    {
        return segundos;
    }

    public void setSegundosTotales(int segundos)
    {
        this.segundos = segundos;
    }

    public int getSegundos()
    {
        int seg = segundos % 60;

        return  seg;
    }
    public int getMinutos()
    {
        int min = segundos  / 60;
        min = min % 60;

        return min;
    }

    public int getHoras()
    {
        int min = segundos  / 60;
        int hor = min / 60;

        return  hor;
    }

    public void setHoras(int horas)
    {
        /*int seg = segundos % 60;
        int min = segundos  / 60;
        //int hor = min / 60;
        min = min % 60;*/

        int seg = getSegundos();
        int min = getMinutos();
         int hor = horas;
         this.segundos = seg + min*60+hor*3600;
    }

    public void setMinutos(int minutos)
    {
        int seg = segundos % 60;
        int min = segundos  / 60;
        int hor = min / 60;
        //min = min % 60;

        min = minutos;
        this.segundos = seg + min*60+hor*3600;
    }

    public void setSegundos(int segundos)
    {
        //int seg = segundos % 60;
        int min = segundos  / 60;
        int hor = min / 60;
        min = min % 60;

        int seg = segundos;
        this.segundos = seg + min*60+hor*3600;
    }

    //METODOS***********************************************************************************************************
    public void sumaHoras(int horas)
    {
        this.segundos = this.segundos+3600*horas;
    }
    public void sumaMinutos(int minutos)
    {
       this.segundos = this.segundos + 60 * minutos;
    }
    public void sumaSegundos(int segundos)
    {
        this.segundos = this.segundos + segundos;
    }


    //METODOS (operadores)
    public Hora add (Hora h)
    {
        int suma;
        suma = this.segundos + h.segundos;
        Hora hResultado = new Hora(suma);
        return hResultado;
    }
    public Hora substract(Hora h)
    {
        if (this.segundos<=h.segundos)
        {
            System.out.println("La cifra que resta no puede ser mayor o igual que a la que se lo vas a restar");
        }
        int resta;
        resta = this.segundos - h.segundos;
        Hora hResultado = new Hora(resta);
        return hResultado;
    }

    @Override
    public String toString()
    {
        String horaBien="";
        String minBien="";
        String segBien="";
        if (getHoras()<10)
        {
            horaBien = "0"+getHoras();
        }
        else
        {
            horaBien = ""+getHoras();
        }
        if (getMinutos()<10)
        {
            minBien = "0"+getMinutos();
        }
        else
        {
            minBien = ""+getMinutos();
        }
        if (getSegundos()<10)
        {
            segBien = "0"+getSegundos();
        }
        else
        {
            segBien = ""+getSegundos();
        }


        return horaBien+":"+minBien+":"+segBien;
    }

}

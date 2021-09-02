package com.company;

import java.nio.channels.InterruptedByTimeoutException;
import java.security.InvalidParameterException;

enum TipoMoneda
{
    euro, dolar, yen
}

public class Moneda
{
    //ATRIBUTOS*********************************************************************************************************
    private TipoMoneda TMoneda;
    private int decimales;
    private String simbolo;
    private double cambioEuro;

    //CONSTRUCTORES*****************************************************************************************************
    public Moneda(TipoMoneda tMoneda, int decimales, String simbolo, double cambioEuro)
    {
        this.TMoneda = tMoneda;

        if (decimales <0|decimales>4)
        {
            throw new InvalidParameterException("No puede haber menos de 0 o mas de 4 decimales");
        }
        else
        {
            this.decimales = decimales;
        }
        if (simbolo.equals(" "))
        {
            throw new InvalidParameterException("Debe haber un simbolo obligatoriamente");
        }
        else
        {
            this.simbolo = simbolo;
        }

        setCambioEuro(cambioEuro);
    }

    //PROPIEDADES*******************************************************************************************************
    public TipoMoneda getTMoneda()
    {
        return TMoneda;
    }
    public int getDecimales()
    {
        return decimales;
    }
    public String getSimbolo()
    {
        return simbolo;
    }
    public double getCambioEuro()
    {
        return cambioEuro;
    }
    public void setCambioEuro(double cambioEuro)
    {
        if (cambioEuro <0)
        {
            throw new InvalidParameterException("El cambio no puede ser negativo");
        }
        else
        {
            this.cambioEuro = cambioEuro;
        }
    }

    //METODOS***********************************************************************************************************
}

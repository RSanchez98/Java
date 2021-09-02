package com.company;

import java.security.InvalidParameterException;

public class Fraccion
{
    //ATRIBUTOS*********************************************************************************************************
    private int numerador;
    private int denominador;

    //CONSTRUCTORES*****************************************************************************************************
    public Fraccion(int numerador, int denominador)
    {
        if (denominador == 0)
        {
            throw new InvalidParameterException("El denominador no puede ser 0");
        }
        else
        {
            this.numerador = numerador;
            this.denominador = denominador;
        }
    }


    public Fraccion(int numeroEntero)
    {
        this.numerador = numeroEntero;
        this.denominador = 1;
    }

    public Fraccion(double numeroDecimal)
    {
        int numerador;
        int denominador = 1;
        while (numeroDecimal % 1 != 0)
        {
            numeroDecimal = numeroDecimal * 10;
            denominador = denominador * 10;
        }
        numerador = (int) numeroDecimal;
        this.numerador = numerador;
        this.denominador = denominador;
    }

    //PROPIEDADES*******************************************************************************************************
    public int getNumerador()
    {
        return numerador;
    }

    public void setNumerador(int numerador)
    {
        this.numerador = numerador;
    }

    public int getDenominador()
    {
        return denominador;
    }

    public void setDenominador(int denominador)
    {
        if (denominador == 0)
        {
            throw new InvalidParameterException("No puede haber un 0 en el denominador");
        }
        else
        {
            this.denominador = denominador;
        }
    }

    //METODOS***********************************************************************************************************
    //Metodos privados
    //-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
    private static int mcd(int a, int b)
    {
        int mcd = 0;
        int i;

        if (a < b)
        {
            for (i = a; i >= 1; i--)
            {
                if (a % i == 0 && b % i == 0)
                {
                    mcd = i;
                    i = 1;
                }
            }
        }
        else
        {
            for (i = b; i >= 1; i--)
            {
                if (a % i == 0 && b % i == 0)
                {
                    mcd = i;
                    i = 1;
                }
            }
        }
        return mcd;
    }

    private static int mcm(int a, int b)
    {
        int mcm = 0, i;
        if (a > b)
        {
            for (i = a; i <= a * b; i++)
            {
                if (i % a == 0 && i % b == 0)
                {
                    mcm = i;
                    i = a * b;
                }
            }
        }
        else
        {
            for (i = b; i <= a * b; i++)
            {
                if (i % a == 0 && i % b == 0)
                {
                    mcm = i;
                    i = a * b;
                }
            }
        }
        return mcm;
    }

    //Metodos publicos
    //-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
    public void simplificar()
    {
        int divisorComun;
        divisorComun = mcd(numerador, denominador);
        numerador = numerador / divisorComun;
        denominador = denominador / divisorComun;
    }

    public String toString()
    {
        String cadena;
        cadena = numerador + "/" + denominador;
        return cadena;
    }

    //Metodos de operadores
    //-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
    public Fraccion negate()
    {
        int cambioSigno;
        cambioSigno = numerador * -1;
        Fraccion f = new Fraccion(cambioSigno, denominador);
        return f;
    }

    public Fraccion add(Fraccion f)
    {
        int numerador1, numerador2;
        int numeradorFinal, denominadorFinal;

        if (denominador == f.denominador)
        {
            numeradorFinal = numerador + f.numerador;
            denominadorFinal = denominador;
        }
        else
        {
            denominadorFinal = denominador * f.denominador;
            numerador1 = numerador * f.denominador;
            numerador2 = denominador * f.numerador;
            numeradorFinal = numerador1 + numerador2;
        }
        Fraccion fResultado = new Fraccion(numeradorFinal, denominadorFinal);
        return fResultado;
    }

    public Fraccion substract(Fraccion f)
    {
        int numerador1, numerador2;
        int numeradorFinal, denominadorFinal;
        if (denominador == f.denominador)
        {
            numeradorFinal = numerador - f.numerador;
            denominadorFinal = denominador;
        }
        else
        {
            numerador1 = numerador * f.denominador;
            numerador2 = denominador * f.numerador;
            numeradorFinal = numerador1 - numerador2;
            denominadorFinal = denominador * f.denominador;
        }
        Fraccion fResultado = new Fraccion(numeradorFinal, denominadorFinal);
        return fResultado;
    }

    public Fraccion multiply(Fraccion f)
    {
        int numeradorFinal, denominadorFinal;
        numeradorFinal = numerador * f.numerador;
        denominadorFinal = denominador * f.denominador;

        Fraccion fResultado = new Fraccion(numeradorFinal, denominadorFinal);
        return fResultado;
    }

    public Fraccion divide(Fraccion f)
    {
        int numeradorFinal, denominadorFinal;
        numeradorFinal = numerador * f.denominador;
        denominadorFinal = denominador * f.numerador;

        Fraccion fResultador = new Fraccion(numeradorFinal, denominadorFinal);
        return fResultador;
    }

    public boolean equals(Fraccion f)
    {
        simplificar();
        f.simplificar();
        if ((numerador == f.numerador) && (denominador == f.denominador))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public int compareTo(Fraccion f)
    {
        int comparacion = 0;
        double fraccion1, fraccion2;

        fraccion1 = (double) numerador/(double) denominador;
        fraccion2 = (double)f.numerador/(double)f.denominador;

        if (equals(f))
        {
            comparacion = 0;
        }
        else
        {
            if (fraccion1>fraccion2)
            {
                comparacion = 1;
            }
            else
            {
                comparacion = -1;
            }
        }
        return comparacion;
    }
}
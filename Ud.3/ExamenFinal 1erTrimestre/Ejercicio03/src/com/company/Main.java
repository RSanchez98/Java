package com.company;

import java.util.Arrays;

public class Main
{

    public static void main(String[] args)
    {
        String cadena = "El perro de San Roque Ramon Ramirez";
        System.out.println(palabrasImpares(cadena));
    }

    public static String palabrasImpares(String cadena)
    {
        /*int i, cont = 0;
        String cadenaFinal="";
        String[]palabras=cadena.split(" ");

        String[]impar= new String[palabras.length];

        for (i = 0; i<palabras.length; i++)
        {
            String palabraSuelta=palabras[i];
            if (palabraSuelta.length()%2!=0)
            {
                impar[cont]=palabraSuelta;
                cont++;
            }
        }

        String [] palabraFinal = new String[impar.length];
        for (i = 0; i<impar.length;i++)
        {
            palabraFinal[i]=impar[i];
        }
        cadenaFinal = String.join(" ", palabraFinal);
        return cadenaFinal;
    }*/
        int i;
        String impar = "";
        String[] palabras = cadena.split(" ");
        for (i = 0; i < palabras.length; i++)
        {
            if (palabras[i].length() % 2 != 0)
            {
                impar = impar + palabras[i];
            }
        }
        return impar;
    }
}
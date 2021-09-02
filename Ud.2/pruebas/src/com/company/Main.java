package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String cadena="hola,don,pepito,pasó,usted,ya,por,casa";
        System.out.println(ordenaPalabrasComas(cadena));
    }



    public static String ordenaPalabrasComas (String cadena)
    {
        int i, pp;
        String cadena2 = "";
        String abe = "abcdefghijklmnñopqrstuvwxyz";
        int [] position = new int [cadena.length()];

        String [] palabras = cadena.split(",");

        for(i = 0; i < abe.length(); i++)
        {
            pp = cadena.indexOf(abe.charAt(i));
            position [i] = pp;
        }

        return cadena2;
    }
}

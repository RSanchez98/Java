package com.company;

import java.util.Scanner;

public class Main
{
    public static boolean annoBisiesto(int anno)
    {
        boolean resultado;

        if(anno % 4 == 0)
        {
            if(anno % 100 == 0)
            {
                if(anno % 400 == 0)
                {
                    resultado = true;
                }
                else
                {
                    resultado = false;
                }
            }
            else
            {
                resultado = true;
            }
        }
        else
        {
            resultado = false;
        }
        return resultado;
    }

    public static int diasMes(int mesNoBisiesto)
    {
        int texto;

        switch (mesNoBisiesto)
        {
            case 1: texto = 31; break;
            case 2: texto = 28; break;
            case 3: texto = 31; break;
            case 4: texto = 30; break;
            case 5: texto = 31; break;
            case 6: texto = 30; break;
            case 7: texto = 31; break;
            case 8: texto = 31; break;
            case 9: texto = 30; break;
            case 10: texto = 31; break;
            case 11: texto = 30; break;
            case 12: texto = 31; break;
            default: texto = 0 ;break;
        }
        return texto;
    }

    public static int diasMesBisiesto(int mesBisiesto)
    {
        int texto;

        switch (mesBisiesto)
        {
            case 1: texto = 31; break;
            case 2: texto = 29; break;
            case 3: texto = 31; break;
            case 4: texto = 30; break;
            case 5: texto = 31; break;
            case 6: texto = 30; break;
            case 7: texto = 31; break;
            case 8: texto = 31; break;
            case 9: texto = 30; break;
            case 10: texto = 31; break;
            case 11: texto = 30; break;
            case 12: texto = 31; break;
            default: texto = 0 ;break;
        }
        return texto;
    }

    public static int diasTranscurridos (int dia, int mes, int anno)
    {
        int diasPasados, i;
        diasPasados = 0;
        if (annoBisiesto(anno))
        {
            for (i = 1; i < mes; i++)
            {
                diasPasados = diasPasados + diasMesBisiesto(i);
            }
            diasPasados = diasPasados + dia;
        }

        else
        {
            for (i = 1; i < mes; i++)
            {
                diasPasados = diasPasados + diasMes(i);
            }
            diasPasados = diasPasados + dia;
        }
        return diasPasados;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int dia, mes, anno;
        System.out.println("Introduce el dia");
        dia = sc.nextInt();
        System.out.println("Introduce el mes");
        mes = sc.nextInt();
        System.out.println("Introduce el anno");
        anno = sc.nextInt();

        System.out.println("Han pasado " +diasTranscurridos(dia, mes, anno)+ " dias desde el 1 de enero del "+anno );

    }
}
//Escribe una función “diasTranscurridos” a la que le pasamos tres enteros, el día, el mes
//y el anno, y nos dice cuántos días han pasado desde el inicio del anno hasta ese día. Así,
//el 1 de enero será el día 1 y el 31 de diciembre será el 365 ó 366 dependiendo de si el
//anno es bisiesto o no.
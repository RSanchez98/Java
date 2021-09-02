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

    public static int diasTranscurridos1980 (int dia, int mes, int anno)
    {
        int i, diasPasados, annoInicio;
        annoInicio = 1980;
        diasPasados = 0;
        while (annoInicio < anno)
        {
            if(annoBisiesto(annoInicio))
            {
                for (i = 1; i <= 12; i++)
                {
                    diasPasados = diasPasados + diasMesBisiesto(i);
                }
            }
            else
            {
                for (i = 1; i <= 12; i++)
                {
                    diasPasados = diasPasados + diasMes(i);
                }
            }
            annoInicio++;
        }
        diasPasados = diasPasados + diasTranscurridos(dia, mes, anno);
        return diasPasados;
    }

    public static int diasEntreFechas(int dia1, int mes1, int anno1, int dia2, int mes2, int anno2)
    {
        int primeraFecha, segundaFecha, diasPasados;
        if (anno1 < anno2)
        {
            primeraFecha = diasTranscurridos1980(dia1, mes1, anno1);
            segundaFecha = diasTranscurridos1980(dia2, mes2, anno2);
        }
        else
        {
            primeraFecha = diasTranscurridos1980(dia2, mes2, anno2);
            segundaFecha = diasTranscurridos1980(dia1, mes1, anno1);
        }
        diasPasados = segundaFecha - primeraFecha;
        return diasPasados;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int dia1, mes1, anno1, dia2, mes2, anno2;

        System.out.println("Introduces el dia de la primera fecha");
        dia1 = sc.nextInt();
        System.out.println("Introduces el mes de la primera fecha");
        mes1 = sc.nextInt();
        System.out.println("Introduces el año de la primera fecha");
        anno1 = sc.nextInt();

        System.out.println("Introduces el dia de la segunda fecha");
        dia2 = sc.nextInt();
        System.out.println("Introduces el mes de la segunda fecha");
        mes2 = sc.nextInt();
        System.out.println("Introduces el año de la segunda fecha");
        anno2 = sc.nextInt();

        System.out.println("Han pasado " +diasEntreFechas(dia1, mes1, anno1, dia2, mes2, anno2)+ " dias");
    }
}
// Escribe una función “diasEntreFechas” a la que le pasamos 6 enteros. Un día, mes y
//año y otro día, mes y año, y nos dice cuántos días han pasado entre ambas fechas.
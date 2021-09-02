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

    public static String diaSemanaTexto(int diaSemana)
    {
        String texto;

        switch (diaSemana)
        {
            case 1: texto = "lunes"; break;
            case 2: texto = "martes"; break;
            case 3: texto = "miercoles"; break;
            case 4: texto = "jueves"; break;
            case 5: texto = "viernes"; break;
            case 6: texto = "sabado"; break;
            case 7: texto = "domingo"; break;
            default: texto = "error"; break;
        }
        return texto;
    }

    public static String diaSemanaFecha (int dia, int mes, int anno)
    {
        int diasSemana, diasTotales, i;
        String diaFinal;

        diasSemana = 2;
        diasTotales = diasTranscurridos1980(dia, mes, anno);

        System.out.println(diasTotales);

        for (i = 1; i < diasTotales; i++)
        {
            if (diasSemana < 7)
            {
                diasSemana++;
            }
            else
            {
                diasSemana = 1;
            }
        }
        diaFinal = diaSemanaTexto(diasSemana);
        return diaFinal;
    }


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int dia, mes, anno;

        System.out.println("Introduce el dia");
        dia = sc. nextInt();
        System.out.println("Introduce el mes");
        mes = sc. nextInt();
        System.out.println("Introduce el año");
        anno = sc. nextInt();

        System.out.println("El dia "+dia+" del "+mes+" del "+anno+" fue "+diaSemanaFecha(dia, mes, anno));
    }
}
//Teniendo en cuenta que el 01/01/1980 era martes, haz una función “diaSemanaFecha”
//que nos devuelva qué día de la semana corresponde a la fecha (día, mes y año) que le
//pasamos en 3 parámetros. Nos devolverá un entero que corresponderá al día de la
//semana (1=lunes, 2=martes, etc.).
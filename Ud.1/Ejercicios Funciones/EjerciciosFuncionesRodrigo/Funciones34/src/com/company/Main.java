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

    public static int horaASegundos (int hora, int min, int seg)
    {
        int segundoFinal;
        min = min * 60;// minutos a segundos
        hora =  ((hora * 60)*60); // hora a segundos
        segundoFinal = hora + min + seg;

        return  segundoFinal;
    }

    public static int segundosTranscurridos1980(int dia, int mes, int anno, int hora, int min, int seg)
    {
        int diaTotal, tiempoTotal, segTranscurridos;
        diaTotal = 0;
        tiempoTotal = 0;
        segTranscurridos = 0;

        diaTotal = diasTranscurridos1980(dia, mes, anno);
        tiempoTotal = horaASegundos(hora, min, seg);

        segTranscurridos = (diaTotal * 24 * 60 * 60) + tiempoTotal;

        return segTranscurridos;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int dia, mes, anno, hora, min, seg;
        System.out.println("Introduce el dia");
        dia = sc.nextInt();
        System.out.println("Introduce el mes");
        mes = sc.nextInt();
        System.out.println("Introduce el año");
        anno = sc.nextInt();

        System.out.println("Introduce la hora");
        hora = sc.nextInt();
        System.out.println("Introduce los minutos");
        min = sc.nextInt();
        System.out.println("Introduce los segundos");
        seg = sc.nextInt();

        int segundos = segundosTranscurridos1980(dia, mes, anno, hora, min, seg);
        System.out.println("Hay "+segundos+ " desde el 1 de enero de 1980");
    }
}
//Escribe una función “segundosTranscurridos1980” a la que le pasas 6 parámetros: día,
//mes, año, hora, minutos y segundos y te dice cuántos segundos han transcurrido
//desde el 1 de enero de 1980.
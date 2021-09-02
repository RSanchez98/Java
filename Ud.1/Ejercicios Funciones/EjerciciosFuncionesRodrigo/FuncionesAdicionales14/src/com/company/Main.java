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

    public static int diasMes2(int numeroMes, int anno)
    {
        int dias;
        boolean bisiesto;
        bisiesto = false;

        if(anno % 4 == 0 && anno % 100 != 0 || anno % 400 == 0)
        {
            bisiesto = true;
        }

        if(!bisiesto) //bisiesto == false
        {
            dias = diasMes(numeroMes);
        }
        else
        {
            dias = diasMesBisiesto(numeroMes);
        }

        return dias;
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

    public static String mesEnTexto(int mes)
    {
        String texto;
        switch (mes)
        {
            case 1: texto = "Enero"; break;
            case 2: texto = "Febrero"; break;
            case 3: texto = "Marzo"; break;
            case 4: texto = "Abril"; break;
            case 5: texto = "Mayo"; break;
            case 6: texto = "Junio"; break;
            case 7: texto = "Julio"; break;
            case 8: texto = "Agosto"; break;
            case 9: texto = "Septiembre"; break;
            case 10: texto = "Octubre"; break;
            case 11: texto = "Noviembre"; break;
            case 12: texto = "Diciembre"; break;
            default: texto = "ERROR"; break;
        }
        return texto;
    }

    public static void escribeFechaBonita (int dia, int mes, int anno)
    {

        if (dia < 1 || dia > diasMes2(mes, anno))
        {
            System.out.println("Fecha no valida");
        }
        else
        {
            System.out.println(dia+"/"+mes+"/"+anno+" = "+dia+ " de "+mesEnTexto(mes)+" del "+anno);
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int dia, mes, anno;
        System.out.print("Introducel el dia: ");
        dia = sc.nextInt();
        System.out.print("Introduce el mes: ");
        mes = sc.nextInt();
        System.out.print("Introduce el anno: ");
        anno = sc.nextInt();

        escribeFechaBonita(dia, mes, anno);

    }
}
//Escribe dos funciones:
//• Escribe la función mesEnTexto a la que le pasaremos un entero correspondiente a
//un mes y nos devolverá un string con ese mes escrito en texto. Por ejemplo: si le
//pasamos un 10 nos devolverá “octubre”.
//• Escribe la función escribeFechaBonita. La función recibirá tres enteros por
//parámetro: el día, el mes y el año y nos escribirá la fecha por pantalla en el formato
//siguiente: “dia de mes de año” (ej.: 31/11/1980 = “31 de noviembre de 1980”). La
//función no devuelve nada porque escribe el resultado por pantalla. En esta función
//tendremos que usar la función anterior.
//Si la fecha que introducimos no es válida, nos escribirá “Fecha no válida” por
//pantalla en lugar de la fecha.
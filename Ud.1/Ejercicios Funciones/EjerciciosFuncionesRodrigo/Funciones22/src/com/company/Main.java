package com.company;

import java.util.Scanner;

public class Main
{
    public static boolean añoBisiesto(int año)
    {
        boolean resultado;

        if(año % 4 == 0)
        {
            if(año % 100 == 0)
            {
                if(año % 400 == 0)
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

    public static String diasMes(int mesNoBisiesto)
    {
        String texto;

        switch (mesNoBisiesto)
        {
            case 1: texto = "Enero tiene 31 dias"; break;
            case 2: texto = "Febrero tiene 28 dias"; break;
            case 3: texto = "Marzo tiene 31 dias"; break;
            case 4: texto = "Abril tiene 30 dias"; break;
            case 5: texto = "Mayo tiene 31 dias"; break;
            case 6: texto = "Junio tiene 30 dias"; break;
            case 7: texto = "Julio tiene 31 dias"; break;
            case 8: texto = "Agosto tiene 31 dias"; break;
            case 9: texto = "Septiembre tiene 30 dias"; break;
            case 10: texto = "Octubre tiene 31 dias"; break;
            case 11: texto = "Noviembre tiene 30 dias"; break;
            case 12: texto = "Diciembre tiene 31 dias"; break;
            default: texto ="error";break;
        }
        return texto;
    }

    public static String diasMesBisiesto(int mesbisiesto)
    {
        String texto;

        switch (mesbisiesto)
        {
            case 1: texto = "Enero tiene 31 dias"; break;
            case 2: texto = "Febrero tiene 29 dias"; break;
            case 3: texto = "Marzo tiene 31 dias"; break;
            case 4: texto = "Abril tiene 30 dias"; break;
            case 5: texto = "Mayo tiene 31 dias"; break;
            case 6: texto = "Junio tiene 30 dias"; break;
            case 7: texto = "Julio tiene 31 dias"; break;
            case 8: texto = "Agosto tiene 31 dias"; break;
            case 9: texto = "Septiembre tiene 30 dias"; break;
            case 10: texto = "Octubre tiene 31 dias"; break;
            case 11: texto = "Noviembre tiene 30 dias"; break;
            case 12: texto = "Diciembre tiene 31 dias"; break;
            default: texto ="error";break;
        }
        return texto;
    }

    /*public static int diaMes2(int numeroMes)
    {
        int dias = 0;
        boolean añoBisiesto;
        añoBisiesto=false;

        if(añoBisiesto(2) && numeroMes == 2)
        {
            añoBisiesto = true;
        }
        else
        {
            if(!añoBisiesto)
            {
                dias = diasMes(numeroMes);
            }
            else
            {
                dias = diasMesBisiesto(numeroMes);
            }
        }
        return dias;
    }*/

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int mes, año;

        System.out.println("Introduce el año");
        año = sc.nextInt();
        System.out.println("Introduce el mes");
        mes = sc.nextInt();

        if(añoBisiesto(año))
        {
            System.out.println(diasMesBisiesto(mes));
        }
        else
        {
            System.out.println(diasMes(mes));
        }
    }
}
//Debido a que en los años bisiestos el mes de Febrero tiene 29 días en lugar de 28,
//necesitaremos también dar el año para conseguir el resultado correcto. Escribe la
//función “diasMes2” a la que le pasas un mes y un año (ambos enteros) y te dice
//cuántos días tiene ese mes, teniendo en cuenta si el año es bisiesto o no (NOTA:
//Podéis usar la función “Bisiesto” que hicimos con anterioridad)
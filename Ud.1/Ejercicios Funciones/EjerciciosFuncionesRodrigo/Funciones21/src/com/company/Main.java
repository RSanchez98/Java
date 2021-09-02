package com.company;

import java.util.Scanner;

public class Main
{
    public static  String diasMes(int mes)
    {
        String texto;
        switch (mes)
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

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int mes;
        System.out.println("Dinos el mes para decirte cuantos dias tiene");
        mes = sc.nextInt();

        System.out.println(diasMes(mes));
    }

   /* public static void main(String[] args)
    {
        System.out.println(diasMes(8));

    }*/
}
//Escribe una función “diasMes”, a la que le pasamos un mes (en formato numérico
//1=Enero, 2=Febrero, etc.) y nos dice el número de días que tiene ese mes.
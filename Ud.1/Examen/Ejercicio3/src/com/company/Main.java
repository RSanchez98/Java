package com.company;

import java.util.Scanner;

public class Main
{
    public static int leeHora()
    {
        Scanner sc = new Scanner(System.in);
        int hora;
        System.out.print("Hora: ");
        hora = sc.nextInt();
        while (hora < 0 || hora > 23)
        {
            System.out.print("Error, debe ser mayor de 0 y menor de 23");
        }
        return hora;
    }
    public static int leeMinutos()
    {
        Scanner sc = new Scanner(System.in);
        int min;
        System.out.print("Minutos: ");
        min = sc.nextInt();
        while (min < 0 || min > 59)
        {
            System.out.print("Error, debe ser mayor o igual a 0 y menor o igual a 59");
        }
        return min;
    }
    public static int leeSegundos()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Segundos: ");
        int seg;
        seg = sc.nextInt();
        while (seg < 0 || seg > 59)
        {
            System.out.print("Error, debe ser mayor o igual a 0 y menor o igual a 59");
        }
        return seg;
    }
    public static int horaASegundos (int hora, int min, int seg)
    {
        int segundoFinal;
        min = min * 60;// minutos a segundos
        hora =  ((hora * 60)*60); // hora a segundos
        segundoFinal = hora + min + seg;

        return  segundoFinal;
    }

    public static int leeHoraSegundos()
    {
        int segundoTotal;
        segundoTotal = horaASegundos(leeHora(), leeMinutos(), leeSegundos());
        return segundoTotal;
    }

    public static void main(String[] args)
    {
        System.out.println(leeHoraSegundos()+" segundos");
    }
}
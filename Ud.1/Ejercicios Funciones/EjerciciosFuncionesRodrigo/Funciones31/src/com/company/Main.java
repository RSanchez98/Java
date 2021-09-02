package com.company;

import java.util.Scanner;

public class Main
{
    public static void escribeHoraBonita(int hora, int min, int seg)
    {
        if (hora < 10)
        {
            System.out.print("0"+hora);
        }
        else
        {
            System.out.print(hora);
        }
        if(min < 10)
        {
            System.out.print(":0"+min+":");
        }
        else
        {
            System.out.print(":"+min+":");
        }
        if (seg < 10)
        {
            System.out.print("0"+seg);
        }
        else
        {
            System.out.print(seg);
        }
    }

    //System.out.println(hora+""+min+""+seg);

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int hora, min, seg;
        System.out.println("Introduce la hora");
        hora = sc.nextInt();
        System.out.println("Introduce los minutos");
        min = sc.nextInt();
        System.out.println("Introduce los segundos");
        seg = sc.nextInt();

        escribeHoraBonita(hora, min, seg);
    }
}
// Escribe una función “escribeHoraBonita” a la que le pasas tres parámetros
// (hora, minutos y segundos) y te escribe por pantalla la hora en formato
// “HH:MM:SS”.
package com.company;

import java.util.Scanner;

public class Main
{
    public static void escribeSegundosBonito(int seg)
    {
        int segFin, min, hora;
        segFin = seg % 60; //segundos = resto de dividir los segundos entre 60
        min = (seg / 60) % 60; // min = dividir los seg entre 60, y su resto son los min
        hora = (seg / 60) / 60; // hora = dividir los seg entre 60, y el resultado dividirlo entre 60

        escribeHoraBonita(hora, min, segFin);
    }

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

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int hora, min, seg;
        System.out.println("Introduce los segundos");
        seg = sc.nextInt();

        escribeSegundosBonito(seg);
    }
}
//Escribe una función “escribeSegundosBonito” a la que le pasas un parámetro que
//corresponde al número de segundos y te escribe por pantalla la hora en formato
//“HH:MM:SS”.
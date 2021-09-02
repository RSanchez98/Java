package com.company;

import java.net.PortUnreachableException;
import java.util.Scanner;

public class Main
{
    public static int horaASegundos (int hora1, int min1, int seg1)
    {
        int segundoFinalA;
        min1 = min1 * 60;// minutos a segundos
        hora1 =  ((hora1 * 60)*60); // hora a segundos
        segundoFinalA = hora1 + min1 + seg1;

        return  segundoFinalA;
    }

    public static int segundosTranscurridos (int hora1, int min1, int seg1, int hora2, int min2, int seg2)
    {
        int segPasados;
        int segundoFinalA = horaASegundos(hora1, min1, seg1);
        int segundoFinalB = horaASegundos(hora2, min2, seg2);

        if (segundoFinalA>segundoFinalB)
        {
            segPasados = segundoFinalA - segundoFinalB;
        }
        else
        {
            segPasados = segundoFinalB - segundoFinalA;
        }
        return segPasados;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int hora1, hora2, min1, min2, seg1, seg2;
        System.out.println("Introduce la hora de A");
        hora1 = sc.nextInt();
        System.out.println("Introduce los minutos de A");
        min1 = sc.nextInt();
        System.out.println("Introduce los segundos de A");
        seg1 = sc.nextInt();

        System.out.println("Introduce la hora de B");
        hora2 = sc.nextInt();
        System.out.println("Introduce los minutos de B");
        min2 = sc.nextInt();
        System.out.println("Introduce los segundos de B");
        seg2 = sc.nextInt();


        int segundos = segundosTranscurridos(hora1, hora2, min1, min2, seg1, seg2);
        System.out.println(segundos+" segundos entre la hora A y la hora B");

        //System.out.println(segundosTranscurridos());
    }
}
// Escribe una función “segundosTranscurridos” a la que le pasas 2 horas (en total, 6
// parámetros: hora, minutos y segundos para cada una de las dos horas) y te dice
// cuántos segundos han transcurrido entre una y otra.
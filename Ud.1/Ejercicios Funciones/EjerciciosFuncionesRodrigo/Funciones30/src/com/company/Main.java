package com.company;

import java.util.Scanner;

public class Main
{
    public static int horaASegundos (int hora, int min, int seg)
    {
        int segundoFinal;
        min = min * 60;// minutos a segundos
        hora =  ((hora * 60)*60); // hora a segundos
        segundoFinal = hora + min + seg;

        return  segundoFinal;
    }

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

        System.out.println(hora+" horas, "+min+" minutos y "+seg+" segundos son "+horaASegundos(hora, min, seg)+" segundos");
    }
}
//Escribe una función “horaASegundos” a la que le pasas 3 parámetros enteros (hora,
//minutos y segundos) y te devuelve el total de segundos
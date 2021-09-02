package com.company;

import java.util.Scanner;

public class Main
{
    public static int eligeOpcion()
    {
        Scanner sc = new Scanner(System.in);
        int opcion;
        System.out.println("ELIGE UNA OPCION");
        System.out.println("1. add");
        System.out.println("2. substract");
        System.out.println();
        System.out.print("Elija opcion 1 u 2: ");
        opcion = sc.nextInt();
        System.out.println();
        return opcion;

    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int opcion = eligeOpcion();

        int hora1, minutos1, segundos1;
        int hora2, minutos2, segundos2;

        switch (opcion)
        {
            case 1:
            {
                System.out.println("HA ELEGIDO 'SUMAR'");
                System.out.println("Primer sumando");
                System.out.print("Horas: ");
                hora1 = sc.nextInt();
                System.out.print("Minustos: ");
                minutos1 = sc.nextInt();
                System.out.print("Segundos: ");
                segundos1 = sc.nextInt();
                Hora h1 = new Hora(hora1, minutos1, segundos1);
                System.out.println();
                System.out.println("Segundo sumando");
                System.out.print("Horas: ");
                hora2 = sc.nextInt();
                System.out.print("Minutos: ");
                minutos2 = sc.nextInt();
                System.out.print("Segundos: ");
                segundos2 = sc.nextInt();
                Hora h2 = new Hora(hora2, minutos2, segundos2);
                System.out.println();
                Hora h3 = h1.add(h2);
                System.out.println(h1+" + "+h2+" = "+h3);

            }
            break;
            case 2:
            {
                System.out.println("HA ELEGIDO 'RESTAR'");
                System.out.println("Minuendo");
                System.out.print("Horas: ");
                hora1 = sc.nextInt();
                System.out.print("Minustos: ");
                minutos1 = sc.nextInt();
                System.out.print("Segundos: ");
                segundos1 = sc.nextInt();
                Hora h1 = new Hora(hora1, minutos1, segundos1);
                System.out.println();
                System.out.println("Sustraendo");
                System.out.print("Horas: ");
                hora2 = sc.nextInt();
                System.out.print("Minutos: ");
                minutos2 = sc.nextInt();
                System.out.print("Segundos: ");
                segundos2 = sc.nextInt();
                Hora h2 = new Hora(hora2, minutos2, segundos2);
                System.out.println();
                Hora h3 = h1.substract(h2);
                System.out.println(h1+" - "+h2+" = "+h3);
            }
            break;
            default:
            {
                System.out.println("Opcion no valida");
            }
        }
    }
}

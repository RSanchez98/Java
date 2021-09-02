package com.company;

import java.security.SignatureSpi;
import java.util.Scanner;

public class Main
{
    public static void calderilla2(double dinero)
    {
        int centimos = (int) Math.round(dinero*100);

    }



        public static double calderilla(double dinero)
    {
        double euro2 = 2.00, euro1 = 1.00, cent50 = 0.50, cent20 = 0.20, cent10 = 0.10, cent5 = 0.05, cent2 = 0.02, cent1 = 0.01;
        double cambio, cambiototal;

        if (dinero > 5.00)
        {
            System.out.println("La cantidad introducida debe ser menor o igual a 5€");
        }
        cambiototal = 5.00 - dinero;
        System.out.println("La vuelta total es de " + cambiototal + "€");
        cambio = 5.00 - dinero;
        while (cambio >= euro2)
        {
            System.out.println("Da una moneda de 2€");
            cambio = cambio - 2.00;
        }
        while (cambio >= euro1)
        {
            System.out.println("Da una moneda de 1€");
            cambio = cambio - 1.00;
        }
        while (cambio >= cent50)
        {
            System.out.println("Da una moneda de 50 cent");
            cambio = cambio - 0.50;
        }
        while (cambio >= cent20)
        {
            System.out.println("Da una moneda de 20 cent");
            cambio = cambio - 0.20;
        }
        while (cambio >= cent10)
        {
            System.out.println("Da una moneda de 10 cent");
            cambio = cambio - 0.10;
        }
        while (cambio >= cent5)
        {
            System.out.println("Da una moneda de 5 cent");
            cambio = cambio - 0.05;
        }
        while (cambio >= cent2)
        {
            System.out.println("Da una moneda de 2 cent");
            cambio = cambio - 0.02;
        }
        cambio = Math.round(cambio * 100.0)/100.0;
        while (cambio >= cent1)
        {
            System.out.println("Da una moneda de 1 cent");
            cambio = cambio - 0.01;
        }

        return cambio;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double dinero, vuelta;
        System.out.println("Introduce una cantidad menor de 5€ y te diré el cambio");
        dinero = sc.nextDouble();

        vuelta = calderilla(dinero);
        System.out.println("La vuelta es "+vuelta+"€");
    }
}
//Escribe la función calderilla a la que le pasamos una cantidad de dinero (menor de 5€,
//puede tener decimales) y nos muestra por pantalla qué monedas debemos usar para
//dar el cambio (con el menor número posible de monedas). En esta función sí que
//podéis poner println dentro.
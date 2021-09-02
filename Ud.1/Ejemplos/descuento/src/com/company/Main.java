package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
	    double euros, descuento, preciofinal, porcentaje; // variable para guradar números decimales

        System.out.println("¿Cuánto vale el portatil?");
        euros = sc.nextDouble();

        System.out.println("¿Qué descuento tiene?");
        porcentaje = sc.nextDouble();

        descuento = (euros * porcentaje) / 100;

        preciofinal = euros - descuento;

        System.out.println("El precio final es " + preciofinal + "€");
        System.out.println("Te ahorras " + descuento + "€");
    }
}

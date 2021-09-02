package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        double pizzas, personas, porcabeza;

        System.out.println("¿Cuánto han costado las pizzas?");
        pizzas = sc.nextDouble();
        System.out.println("¿Cuánta gente hay?");
        personas = sc.nextDouble();

        porcabeza = pizzas / personas;
        porcabeza = Math.round(porcabeza * 100.0) / 100.0; // para redondear hacia arriba a partir del .5 y hacia abajo si esta por debajo del .5
        //porcabeza = Math.ceil(porcabeza * 100.0) / 100.0; para redondear hacia arriba
        //porcabeza = Math.floor(porcabeza * 100.0) / 100.0; para redondear hacia abajo
        System.out.println("Cada persona tiene que pagar " + porcabeza);
    }
}

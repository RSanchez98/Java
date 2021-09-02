package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double pies, pulgada, centimetros;

        System.out.println("¿Cuantos pies mide?");
        pies = sc.nextDouble();
        System.out.println("¿Cuantos pulgadas mide?");
        pulgada = sc.nextDouble();

        centimetros = (pies * 30.48) + (pulgada * 2.54);

        System.out.println("Mides " + centimetros + " centimetros");
    }
}

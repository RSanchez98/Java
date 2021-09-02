package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        double radio, altura, volumen;

        System.out.println("¿Cuál es el valor del radio?");
        radio = sc.nextDouble();

        System.out.println("¿Cuál es el valor de la altura?");
        altura = sc.nextDouble();

        volumen = (Math.PI * radio * radio * altura) / 3;

        System.out.println("El volumen del cono es " + volumen);
    }
}

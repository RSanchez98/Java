package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double base, altura, area;

        System.out.println("¿Cuanto mide la base?");
        base = sc.nextDouble();
        System.out.println("¿Cuanto mide la altura?");
        altura = sc.nextDouble();

        area = (base * altura) / 2;

        System.out.println("El area del triangulo es " + area);
    }
}

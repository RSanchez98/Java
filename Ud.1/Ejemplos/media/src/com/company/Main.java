package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        double a, b, media;

        System.out.println("Dime el primer numero");
        a = sc.nextDouble();
        System.out.println("Dime el segundo numero");
        b = sc.nextDouble();
        media = (a + b) / 2;

        System.out.println("La media de los numeros " + a + " y " + b + " es " + media);
    }
}

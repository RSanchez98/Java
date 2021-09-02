package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int numero; //variable para guardar un numero entero

        System.out.println("Dime un numero");
        numero = sc.nextInt();

        System.out.println("El doble de " + numero + " es " + numero * 2);
    }
}

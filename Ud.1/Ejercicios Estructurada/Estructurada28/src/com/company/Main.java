package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a, b, n;

        System.out.println("Dime el primer numero");
        a = sc.nextInt();
        System.out.println("Dime el segundo numero");
        b = sc.nextInt();

        if (a < b)
        {
            for (n = a; n <= b; n++)
            {
                System.out.println(n);
            }
        }
        else
        {
            for (n = a; n >= b; n--)
            {
                System.out.println(n);
            }
        }
    }
}
//Escribe un programa que te pide dos números. Si el primero es menor que el segundo,
//escribe todos los números comprendidos entre ambos en orden ascendente. Si el
//primero es mayor que el segundo, escribe todos los números comprendidos entre
//ambos en orden descendente.
package com.company;

import java.util.Scanner;

public class Main
{
    public static void min (int a, int b)
    {
        if (a > b)
        {
            System.out.println(b + " es el menor");
        }
        else
        {
            if (a < b)
            {
                System.out.println(a + " es el menor");
            }
            else
            {
                System.out.println("Los dos numeros son identicos");
            }
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int a, b;
        System.out.println("Introduce el primer numero");
        a = sc.nextInt();
        System.out.println("Introduce el segundo numero");
        b = sc.nextInt();

        min(a,b);
    }
}
// Escribe una función “min” que nos devuelva el menor de los dos números que le
//pasemos por parámetro.
package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int i, n, max;
        System.out.println("1. Introduce un numero");
        n = sc.nextInt();
        n = 0;
        max = n;

        for (i = 2; i <= 10; i++)
        {
            System.out.println(i + ". Introduce un numero");
            n = sc.nextInt();
            if (n > max)
            {
                max = n;
            }
        }
        System.out.println("El numero mayor es " + max);
    }
}
//Calcular el valor máximo de una serie de 10 números introducidos por teclado.
package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a, b, i;

        System.out.print("Introduce el primer numero (debe ser impar): ");
        a = sc.nextInt();
        System.out.print("Introduce el segundo numero (debe ser impar y mayor que el primer numero): ");
        b = sc.nextInt();


        while (a >= b || a % 2 == 0 || b % 2 == 0)
        {
            System.out.print("Introduce el primer numero (debe ser IMPAR): ");
            a = sc.nextInt();

            System.out.print("Introduce el segundo numero (debe ser IMPAR y MAYOR que el primer numero): ");
            b = sc.nextInt();
        }
        for (i = a; i <= b; i = i + 2)
        {
            System.out.print(i+" ");
        }
        System.out.println();
        for (i = b; i >= a; i = i - 2)
        {
            System.out.print(i+" ");
        }
    }
}
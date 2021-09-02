package com.company;

import java.util.Scanner;

public class Main
{
    public static int maximo(int a, int b, int c)
    {
        int max;
        max = 0;
        if (a > b && a > c)
        {
            max = a;
        }
        else
        {
            if (b > a && b > c)
            {
                max = b;
            }
            else
            {
                if (c > a && c > b)
                {
                    max = c;
                }
                else
                {
                    System.out.print("ERROR --> ");
                }
            }
        }
        return max;
    }
    public static int minimo(int a, int b, int c)
    {
        int min;
        min = 0;
        if (a < b && a < c)
        {
            min = a;
        }
        else
        {
            if (b < a && b < c)
            {
                min = b;
            }
            else
            {
                if (c < a && c < b)
                {
                    min = c;
                }
                else
                {
                    System.out.print("ERROR --> ");
                }
            }
        }
        return min;
    }
    public static int medio(int a, int b, int c)
    {
        int med;
        med = 0;
        if ((b > a && a > c)||(c > a && a > b))
        {
            med = a;
        }
        else
        {
            if ((a > b && b > c)||(c > b && b > a))
            {
                med = b;
            }
            else
            {
                if ((a > c && c > b)||(b > c && c > a))
                {
                    med = c;
                }
                else
                {
                    System.out.print("ERROR --> ");
                }
            }
        }
        return med;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.println("Introduce el 1er numero");
        a = sc.nextInt();
        System.out.println("Introduce el 2º numero");
        b = sc.nextInt();
        System.out.println("Introduce le 3er numero");
        c = sc.nextInt();

        System.out.println("El numero mayor es "+maximo(a, b, c));
        System.out.println("El numero mediano es "+medio(a, b, c));
        System.out.println("El numero pequeño es "+minimo(a, b, c));
    }
}
// Escribe tres funciones que se llamarán maximo, medio y minimo. A cada una de las
//funciones le pasaremos tres valores enteros (a, b, c). La función maximo nos devolverá
//el mayor de los tres, la función minimo el menor de los tres y la función medio el del
//medio.
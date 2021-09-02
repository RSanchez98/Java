package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        int mayor, mediano, pequeño;

        System.out.println("Introduce el primer numero");
        a = sc.nextInt();
        System.out.println("Introduce el segundo numero");
        b = sc.nextInt();
        System.out.println("Introduce el tercer numero");
        c = sc.nextInt();

        if (a <= b && b <= c)
        {
            pequeño = a;
            mediano = b;
            mayor = c;
            System.out.println(a + " es el pequeño, " + b + " es el mediano y " + c + " es el mayor");
        }
        else
        {
            if (b <= a && a <= c)
            {
                pequeño = b;
                mediano = a;
                mayor = c;
                System.out.println(b + " es el pequeño, " + a + " es el mediano y " + c + " es el mayor");
            }
            else
            {
                if (c <= a && a <= b)
                {
                    pequeño = c;
                    mediano = a;
                    mayor = b;
                    System.out.println(c + " es el pequeño, " + a + " es el mediano y " + b + " es el mayor");
                }
                else
                {
                    if (c <= b && b <= a)
                    {
                        pequeño = c;
                        mediano = b;
                        mayor = a;
                        System.out.println(c + " es el pequeño, " + b + " es el mediano y " + a + " es el mayor");
                    }
                    else
                    {
                        if (a <= c && c <= b)
                        {
                            pequeño = a;
                            mediano = c;
                            mayor = b;
                            System.out.println(a + " es el pequeño, " + b + " es el mediano y " + c + " es el mayor");
                        }
                        else
                        {
                            if (c <= b && b <= a)
                            {
                                pequeño = c;
                                mediano = b;
                                mayor = a;
                                System.out.println(c + " es el pequeño, " + b + " es el mediano y " + a + " es el mayor");
                            }
                        }
                    }
                }
            }
        }
    }
}
/*if (a > b && a > c)
        {
            System.out.println(a + " es el mayor");
        }
        else if (a > b && a < c)
        {
            System.out.println(a + " es el mediano");
        }
        else if (a < b && a > c)
        {
            System.out.println(a + " es el mediano");
        }
        else if (a < b && a < c)
        {
            System.out.println(a + " es el pequeño");
        }



        if (b > a && b > c)
        {
            System.out.println(b + " es el mayor");
        }
        else if (b < a && b > c)
        {
            System.out.println(b + " es el mediano");
        }
        else if (b > a && b < c)
        {
            System.out.println(b + " es el mediano");
        }
        else if (b < a && b < c)
        {
            System.out.println(b + " es el pequeño");
        }



        if (c > a && c > b)
        {
            System.out.println(c + " es el mayor");
        }
        else if (c > a && c < b)
        {
            System.out.println(c + " es el mediano");
        }
        else if (c > b && c < a)
        {
            System.out.println(c + " es el mediano");
        }
        else if (c < a && c < b)
        {
            System.out.println(c + " es el pequeño");
        }*/
//Dados tres números enteros, A, B, C, determinar cuál es el mayor, cuál el menor y cuál
//el mediano
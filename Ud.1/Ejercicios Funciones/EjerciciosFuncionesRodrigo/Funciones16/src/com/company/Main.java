package com.company;

import java.util.Scanner;

public class Main
{
    public static int elevado(int a, int b)
    {
        int i, c;
        i = 1;
        c = 1;
        while (i <= b)
        {
            c = c * a;
            i++;
        }
        return c;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a, b, resultado;
        System.out.println("Introduce la base");
        a = sc.nextInt();
        System.out.println("Introduce el exponente");
        b = sc.nextInt();
        resultado = elevado(a, b);
        System.out.println(a+" elevado a "+b+" equivale a "+resultado);
    }
}
//Escribe una función “elevado” a la que le pasas dos números enteros (a y b)
// y te devuelve el valor de “a” elevado a “b” (sin usar la función Math.pow)
// (o sea, multiplicando un número muchas veces).
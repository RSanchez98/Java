package com.company;

import java.util.Scanner;

public class Main
{
    public static int factorial(int n)
    {
        int i, fact;
        fact = 1;

        System.out.print(n+"! = 1");
        for (i = 2; i <= n; i++)
        {
            fact = fact * i;
            System.out.print(" x " + i);
        }
        return fact;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n, resultado;
        System.out.println("Introduce un numero para calcular su factorial");
        n=sc.nextInt();


        resultado = factorial(n);
    }
}
//Escribe una función “factorial” que nos calcule el factorial de un número entero.
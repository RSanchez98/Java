package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n, i, factorial;
        factorial = 1;

        System.out.println("Introduce un numero para calcular su factorial");
        n=sc.nextInt();

        System.out.print(n+"! = 1");
        for (i = 2; i <= n; i++)
        {
            factorial = factorial * i;
            System.out.print(" x " + i);
        }
        System.out.println();
        System.out.println(factorial);
    }
}
//Calcular el factorial de un número entero N. Recuerda que el factorial de un número es
//el producto de ese número por todos los enteros menores que él. Por ejemplo, el
//factorial de 5 (simbolizado 5!) se calcula como: 5! = 5 x 4 x 3 x 2 x 1.
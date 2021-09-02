package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a, b, i, mcd;


        System.out.println("Vamos a calcular el MCD");
        System.out.println("Introduce el primer numero");
        a = sc.nextInt();
        System.out.println("Introduce el segundo numero");
        b = sc.nextInt();

        if (a>b)
        {
            for(i =a; i>=1; i--)
            {
                if (a % i == 0 && b % i == 0)
                {
                    mcd = i;
                    System.out.println(mcd);
                    i = 1;
                }
            }
        }
        else
        {
            for (i = b; i >= 1; i--)
            {
                if (a % i == 0 && b % i == 0)
                {
                    mcd = i;
                    System.out.println(mcd);
                    i = 1;
                }
            }
        }
    }
}
//Escribe un programa que calcule el máximo común divisor de 2 números.
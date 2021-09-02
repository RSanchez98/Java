package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a, b, i, mcm;


        System.out.println("Vamos a calcular el mcm");
        System.out.println("Introduce el primer numero");
        a = sc.nextInt();
        System.out.println("Introduce el segundo numero");
        b = sc.nextInt();

        if (a>b)
        {
            i = a;
            while (i<=a*b)
            {
                if (i % a == 0 && i % b == 0)
                {
                    mcm = i;
                    System.out.println(mcm);
                    i = a*b;
                }
                i++;
            }
        }
        else
        {
            i = b;
            while (i<=a*b)
            {
                if (i % a == 0 && i % b == 0)
                {
                    mcm = i;
                    System.out.println(mcm);
                    i = a*b;
                }
                i++;
            }
        }
    }
}
//Escribe un programa que calcule el mínimo común múltiplo de 2 números.
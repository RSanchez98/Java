package com.company;

import java.util.Scanner;

public class Main
{
    public static int mcd(int a, int b)
    {
        int mcd = 0;
        int i;

        if(a<b)
        {
            for (i = a; i >= 1; i--)
            {
                if (a % i == 0 && b % i == 0)
                {
                    mcd = i;
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
                    i = 1;
                }
            }
        }
        return mcd;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int a, b;
        System.out.println("Introduce el primer numero");
        a = sc.nextInt();
        System.out.println("Introduce el segundo numero");
        b = sc.nextInt();

        System.out.println("El MCD es " + mcd(a,b));
    }
}
//Escribe una función que nos calcule el “mcd” de dos números
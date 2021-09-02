package com.company;

import java.util.Scanner;

public class Main
{
    public static int mcm(int a, int b)
    {
        int mcm = 0, i;
        if (a > b)
        {
            for (i = a; i <= a*b; i++)
            {
                if (i % a == 0 && i % b == 0)
                {
                    mcm=i;
                    i=a*b;
                }
            }
        }
        else
        {
            for (i=b; i<=a*b; i++)
            {
                if (i % a == 0 && i % b == 0)
                {
                    mcm=i;
                    i = a*b;
                }
            }
        }
        return mcm;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int a, b;
        System.out.println("Introduce el primer numero");
        a = sc.nextInt();
        System.out.println("Introduce el segundo numero");
        b = sc.nextInt();

        System.out.println("El mcm es " + mcm(a, b));
    }

}
//Escribe una función que nos calcule el “mcm” de dos números.
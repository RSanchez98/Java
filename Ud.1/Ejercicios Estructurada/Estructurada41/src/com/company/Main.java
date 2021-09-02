package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n, i, divisor;

        for(n=1; n <= 1000; n++)
        {
            divisor = 0;
            for (i = 1; i <= n; i++)
            {
                if (n % i == 0)
                {
                    divisor++;
                }
            }

            if (divisor == 2)
            {
                System.out.println(i+ " es primo");
            }
        }
    }
}
//Generalizar el algoritmo anterior para averiguar todos los números primos que existen
//entre 2 y 1000.
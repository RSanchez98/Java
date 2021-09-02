package com.company;

import java.util.Scanner;

public class Main
{
    public static boolean primo(int n)
    {
        boolean primo;
        int i, divisor;

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
            primo = true;
        }
        else
        {
            primo = false;
        }
        return primo;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Introduce el numero para decirte si es primo o no");
        n=sc.nextInt();

        System.out.println(primo(n));
    }
}
//Escribe una función “primo” que nos devuelva “verdadero” si el número que le
//pasamos por parámetro es primo y “falso” en caso contrario.
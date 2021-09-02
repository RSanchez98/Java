package com.company;

import java.util.Scanner;

public class Main
{
    public static boolean primosRelativos(int a, int b)
    {
        int i, mcd = 0;
        boolean relativo;

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
        if(mcd == 1)
        {
            relativo = true;
        }
        else
        {
            relativo = false;
        }
        return relativo;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a, b, resultado;
        System.out.println("Introduce el primer numero");
        a = sc.nextInt();
        System.out.println("Introduce el segundo numero");
        b = sc.nextInt();

        System.out.println(primosRelativos(a, b));
    }
}
// Escribe una función primosRelativos a la que le pasas dos números enteros y
// te dice si son primos relativos, es decir, si no tienen ningún divisor
// común además del 1.
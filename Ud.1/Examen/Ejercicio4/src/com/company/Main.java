package com.company;

import java.util.Scanner;

public class Main
{
    public static int numeroCifras(int n)
    {
        int i, positivo;
        i = 1;
        while (n > 10)
        {
            n = n / 10;
            i = i + 1;
        }

        if (n == 0)
        {
            i = 1;
        }

        if (n < 0)
        {
            n = n * (-1);
            while (n > 10)
            {
                n = n / 10;
                i = i + 1;
            }
        }
        return i;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Introduce un numero para decirte cuantas cifras tiene: ");
        n = sc.nextInt();

        System.out.println("El numero "+n+" tiene "+numeroCifras(n)+" cifra(s)");
    }
}




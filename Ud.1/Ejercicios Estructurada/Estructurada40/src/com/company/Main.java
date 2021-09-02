package com.company;

import javax.swing.*;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n, i, divisor;

        System.out.println("Dime un numero para decirte si es primo o no");
        n = sc.nextInt();

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
            System.out.println("Es primo");
        }
        else
        {
            System.out.println("No es primo");
        }
    }
}
//Escribe un programa que nos diga si un número es primo o no
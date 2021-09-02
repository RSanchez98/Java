package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n, i, resultado;
        System.out.print("Introduce un numero: ");
        n = sc.nextInt();
        for (i = 1; i <= n; i++)
        {
            resultado = i * i;
            if (resultado == n)
            {
                System.out.println("La raiz cuadrada de "+n+" es "+i);
            }
        }
    }
}
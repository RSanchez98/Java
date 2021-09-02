package com.company;

import java.util.Scanner;

public class Main
{
    public static int impirmeSerie(int a, int b)
    {
        int i;
        if (a < b) //PRIMERO MENOR
        {
            for (i = a; i <= b; i++)
            {
                System.out.print(i);
            }
        }
        else //SEGUNDO MENOR
        {
            for (i = a; i >= b; i--)
            {
                System.out.print(i);
            }
        }
        return i;
    }

    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);

       int a, b;

        System.out.println("Introduce el primer numero");
        a = sc.nextInt();
        System.out.println("Introduce el segundo numero");
        b = sc.nextInt();

        impirmeSerie(a, b);

    }

}
//Escribe una función “imprimeSerie” a la que le pases dos enteros y te escriba por la
//pantalla todos los valores comprendidos entre ambos. Lo hará en orden ascendente si
//el primero es menor que el segundo y descendente en caso contrario. Usa “for”.
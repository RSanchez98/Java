package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int i,j;

        System.out.println("Escribe el primer numero");
        i = sc.nextInt();

        System.out.println("Escribe el segundo numero");
        j = sc.nextInt();

        if(i<=j)
        {
            while (i<=j)
            {
                System.out.println(i);
                i = i + 1;
            }
        }
        else
        {
            while (i>=j)
            {
                System.out.println(i);
                i = i - 1;
            }
        }
    }
}
//Escribe un programa que te pide dos números. Si el primero es menor que el segundo,
//escribe todos los números comprendidos entre ambos en orden ascendente. Si el
//primero es mayor que el segundo, escribe todos los números comprendidos entre
//ambos en orden descendente.
package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String palabra;
        int i, j;

        System.out.println("Eligue entre par o impar");
        palabra = sc.nextLine();

        if (palabra.equals("impar"))
        {
            for (i = 1; i <= 10; i = i + 2)
            {
                System.out.println(i);
            }
        }
        else
            if (palabra.equals("par"))
            {
                for (j = 2; j <= 10; j = j + 2)
                {
                   System.out.println(j);
                }
            }
            else
            {
                System.out.println("Esa palabra no es ni la palabra 'par' ni la plabra 'impar' ");
            }
    }
}
//Escribe un programa que te pregunte si quieres números pares o impares. Si te dice
//pares, escribe los números pares del 1 al 10 y si te dice impares, escribe los números
//impares del 1 al 10.
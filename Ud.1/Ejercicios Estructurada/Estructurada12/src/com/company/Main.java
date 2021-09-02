package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int i, j;
        String palabra;
        i = 1;
        j = 2;

        System.out.println("Dime si quieres que te muestre los numeros pares o impares del 1 al 10");
        palabra = sc.nextLine();

        if (palabra.equals("impares"))
        {
            while (i <= 10)
            {
                System.out.println(i);
                i = i + 2;
            }
        }
        else
        {
            if (palabra.equals("pares"))
            {
                while (j <= 10)
                {
                    System.out.println(j);
                    j = j + 2;
                }
            }
            else
            {
                System.out.println("Esa palabra no es valida");
            }
        }
    }
}
//Escribe un programa que te pregunte si quieres números pares o impares. Si te dice
//pares, escribe los números pares del 1 al 10 y si te dice impares, escribe los números
//impares del 1 al 10.
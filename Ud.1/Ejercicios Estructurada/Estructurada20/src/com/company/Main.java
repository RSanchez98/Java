package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int i, numero, max;

        System.out.print("1. Escribe un numero ");
        numero = sc.nextInt();
        max = numero;
        i = 2;
        while (i <= 10)
        {
            System.out.print(i + ". Escribe otro numero ");
            numero = sc.nextInt();
            if (numero > max)
            {
                max = numero;
            }
            i = i + 1; // i++ es lo mismo
        }
        System.out.println("El mayor es: "+max);

    }
}
//Calcular el valor máximo de una serie de 10 números introducidos por teclado.
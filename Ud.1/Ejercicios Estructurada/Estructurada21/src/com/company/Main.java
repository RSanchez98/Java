package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int i, numero, max, min;
        double media, suma;

        System.out.println("1. Introduce un numero");
        numero = sc.nextInt();
        max = numero;
        min = numero;
        suma = numero;
        i = 2;

        while (i <= 10)
        {
            System.out.println(i + ". Introduce un numero");
            numero = sc.nextInt();
            if (numero > max)
            {
                max = numero;
            }
            if (numero < min)
            {
                min = numero;
            }
            i++;
            suma = suma + numero;
        }
        media = suma / i;

        System.out.println("El mayor es " + max);
        System.out.println("El minimo es " + min);
        System.out.println("La media es " + media);
    }
}
//Calcular en el mismo bucle el valor máximo, el valor mínimo y la media aritmética de
//una serie de 10 números introducidos por teclado.
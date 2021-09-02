package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int i, n, max, min;
        double suma, media;
        System.out.println("1. Introduce un numero");
        n = sc.nextInt();
        max = n;
        min = n;
        suma = n;

        for (i = 2; i <= 5; i++)
        {
            System.out.println(i+". Introduce un numero");
            n = sc.nextInt();
            if (n>max)
            {
                max = n;
            }
            if (n<min)
            {
                min = n;
            }
            suma = suma + n;
        }
        media = suma / 5.0;
        System.out.println("El numero mayor es: "+max);
        System.out.println("El numero menor es: "+min);
        System.out.println("La media es: "+media);
    }
}
//Calcular en el mismo bucle el valor máximo, el valor mínimo y la media aritmética de
//una serie de 10 números introducidos por teclado
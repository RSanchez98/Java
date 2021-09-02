package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int i, j;

        System.out.println("Introduce el primer numero");
        i = sc.nextInt();
        System.out.println("Introduce el segundo numero");
        j = sc.nextInt();

        if (i < j)
        {
            if (i % 2 == 0)
            {
                while (i < j)
                {
                    System.out.println(i + 1);
                    i = i + 2;
                }
            }
            else
            {
                while (i < j)
                {
                    System.out.println(i);
                    i = i + 2;
                }
            }
        }
        else
        {
            if (j % 2 == 0)
            {
                while (i > j)
                {
                    System.out.println(j + 1);
                    j = j + 2;
                }
            }
            else
            {
                while (i > j)
                {
                    System.out.println(j);
                    j = j + 2;
                }
            }
        }
    }
}
//Escribir todos los números impares entre dos números A y B introducidos por teclado.
//Antes habrá que comprobar cuál de los dos números A y B es mayor.
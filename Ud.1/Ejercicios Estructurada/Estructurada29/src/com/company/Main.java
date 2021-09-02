package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a, b, i;
        System.out.println("Escribe el primer numero");
        a = sc.nextInt();
        System.out.println("Escribe le segundo numero");
        b = sc.nextInt();

        if (a<b)
        {
            if (a % 2 == 0)
            {
                for (i = a; i <= b;)
                {
                    System.out.println(i = i + 1);
                    i++;
                }
            }
            else
            {
                for (i = a; i<=b;)
                {
                    System.out.println(i);
                    i=i+2;
                }
            }
        }
        else
        {
            if (b % 2 == 0)
            {
                for (i = b; i <= a;)
                {
                    System.out.println(i = i + 1);
                    i++;
                }
            }
            else
            {
                for (i = b; i<=a;)
                {
                    System.out.println(i);
                    i=i+2;
                }
            }
        }
    }
}
// Escribir todos los números impares entre dos números A y B introducidos por teclado.
//Antes habrá que comprobar cuál de los dos números A y B es mayor.
package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double nota;

        System.out.println("¿Qué nota has sacado?");
        nota = sc.nextDouble();

        if (nota < 0 || nota > 10)
        {
            System.out.println("La nota introducida es erronea");
        }
        else
        {
            if (nota >= 0 && nota <= 4.99)
            {
                System.out.println("Has suspendido");
            }
            else
            {
                if (nota >= 5 && nota <= 6.99)
                {
                    System.out.println("Has aprobado");
                }
                else
                {
                    System.out.println("Has sacado un sobresaliente");
                }
            }
        }
    }
}

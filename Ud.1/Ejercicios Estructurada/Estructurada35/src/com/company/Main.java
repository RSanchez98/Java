package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double nota;

        System.out.println("Introduce una nota");
        nota = sc.nextDouble();

        while (nota < 0 || nota > 10)
        {
            System.out.println("La nota introducida es incorrecta, vuleve a inentarlo");
            nota = sc.nextDouble();
        }
        if (nota >= 0 && nota < 5)
        {
            System.out.println("Suspenso");
        }
        else
        {
            if (nota >= 5 && nota < 6)
            {
                System.out.println("Suficiente");
            }
            else
            {
                if (nota >= 6 && nota < 7)
                {
                    System.out.println("Bien");
                }
                else
                {
                    if (nota >= 7 && nota < 9)
                    {
                        System.out.println("Notable");
                    }
                    else
                    {
                        if (nota >= 9 && nota <= 10)
                        {
                            System.out.println("Sobresaliente");
                        }
                    }
                }
            }
        }
    }
}
//Escribe un programa que le pide al usuario la nota de un alumno (un número real). El
//programa escribirá “Suspenso” si la nota está entre 0 y 5; “Suficiente” si la nota está
//entre 5 y 6; “Bien” si la nota está entre 6 y 7; “Notable” si la nota está entre 7 y 9 y
//“Sobresaliente” si está entre 9 y 10. Si la nota no es válida, el programa nos vuelve a
//pedir un valor hasta que introduzcamos una correcta.
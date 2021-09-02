package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String eleccion;
        int i, a, b, c, resultado;

        System.out.println("Elige una de estas 3 opciones");
        System.out.println("Opción a: escribe todos los múltiplos de 11 comprendidos entre 1 y 100");
        System.out.println("Opción b: escribe todos los múltiplos de 17 comprendidos entre 1 y 100");
        System.out.println("Opción c: escribe todos los múltiplos de 23 comprendidos entre 1 y 100");
        eleccion = sc.nextLine();

        if (eleccion.equals("a"))
        {
            for (i = 1; i <= 100; i++)
            {
                if (i % 11 == 0)
                {
                    System.out.println(i);
                    i++;
                }
            }
        }
        else
        {
            if (eleccion.equals("b"))
            {
                for (i = 1; i <= 100; i++)
                {
                    if (i % 17 == 0)
                    {
                        System.out.println(i);
                        i++;
                    }
                }
            }
            else
            {
                if (eleccion.equals("c"))
                {
                    for (i = 1; i <= 100; i++)
                    {
                        if (i % 23 == 0)
                        {
                            System.out.println(i);
                            i++;
                        }
                    }
                }
            }
        }
    }
}
//Escribe un programa que nos presente un menú con 3 opciones. Eligiendo la opción “a”
//nos escribirá todos los múltiplos de 11 comprendidos entre 1 y 100. Eligiendo la opción
//“b” lo mismo, pero con los múltiplos de 17. Eligiendo la opción “c” lo mismo, pero con
//los múltiplos de 23.
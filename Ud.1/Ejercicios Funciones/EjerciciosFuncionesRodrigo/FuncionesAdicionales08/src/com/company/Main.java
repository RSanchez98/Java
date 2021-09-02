package com.company;

import java.util.Scanner;

public class Main
{
/*
    public static void repiteEstrella(int n)
    {
        int i;
        for(i = 0; i < n; i++)
        {
            System.out.print("*");
        }
    }

    public static void repiteEspacio(int n)
    {
        int i;
        for(i = 0; i < n; i++)
        {
            System.out.print(" ");
        }
    }

    public static void cuadradoEstrellitas(int tam)
    {
        int i;

        if (tam == 1)
        {
            System.out.println("*"); // en el caso de que solo haya un asterisco
        }
        else
        {
            repiteEstrella(tam); //te pone la primera fila de asteriscos
            System.out.println();

            for (i = 2; i <= tam - 1; i++) //cuando esten en la fila 2, pone una estrella, deja un hueco del numero introducido menos dos, y vuelve a poner una estrella
            {
                repiteEstrella(1);
                repiteEspacio(tam - 2);
                repiteEstrella(1);
                System.out.println();
            }

            repiteEstrella(tam); //pone la ultima linea de asteriscos
            System.out.println();
        }
    }*/





    public static void cuadradoEstrellitas(int n)
    {
        int alto, ancho, espacio;
        if (n < 1 || n > 20)
        {
            System.out.println("Error");
        }
        else
        {
            for (alto = 1; alto <= n; alto++)
            {
                if (alto == 1||alto==n)
                {
                    for (ancho = 1; ancho <= n; ancho++)
                    {
                        System.out.print("*");
                    }

                }
                else
                {
                    System.out.print("*");
                    for (espacio = n - 2; espacio >= 1; espacio--)
                    {
                        System.out.print(" ");
                    }
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Introduce un numero (min 1 max 20)");
        n = sc.nextInt();

        cuadradoEstrellitas(n);
    }
}
//Escribe la función cuadradoEstrellitas que te pinta un cuadrado realizado con
//estrellitas. El tamaño máximo será 20. Si escribes más de 20 o menos de 1, dará
//un mensaje de error en lugar de pintar el cuadrado.
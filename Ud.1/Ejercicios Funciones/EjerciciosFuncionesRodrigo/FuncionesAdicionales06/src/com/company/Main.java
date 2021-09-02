package com.company;

import java.util.Scanner;

public class Main
{
    public static void rombo(int n)
    {
        int alto, ancho, espacio, espejo;


        for (alto = 1; alto <= n; alto++)
        {
            espejo = alto * 2;
            for (espacio = alto; espacio <= n - 1; espacio++)
            {
                System.out.print(" ");
            }
            for (ancho = 1; ancho <= espejo; ancho++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        for (alto = n - 1; alto <= 1; alto++)
        {
            espejo = alto * 2;
            for (espacio = alto; espacio <= n - 1; espacio++)
            {
                System.out.print(" ");
            }
            for (ancho = 1; ancho <= espejo; ancho++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        for (alto = n - 1; alto >= 1; alto--)
        {
            espejo = alto * 2;
            for (espacio = n - 1; espacio >= alto; espacio--)
            {
                System.out.print(" ");
            }
            for (ancho = espejo; ancho >= 1; ancho--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*public static void repiteEstrella(int n)
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

    public static void rombo(int n)
    {
        int nivel;

        for(nivel = 1; nivel < n; nivel++)
        {
            repiteEspacio(n - nivel);
            repiteEstrella(nivel * 2);
            System.out.println();
        }

        for(nivel = n; nivel >= 1; nivel--)
        {
            repiteEspacio(n - nivel);
            repiteEstrella(nivel * 2);
            System.out.println();
        }
    }*/

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("¿Qué fila quieres que sea la mas ancha? ");
        n = sc.nextInt();

        rombo(n);
    }
}
//Escribe la función rombo que te escribe un rombo en pantalla a base de asteriscos (la
//pirámide del ejercicio 6 sería la cuarta parte del rombo).
//Opcional: Hacerlo con el número de bucles más pequeño posible (se puede hacer sin
//bucles incluso).
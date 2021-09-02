package com.company;

import java.util.Scanner;

public class Main
{
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
            System.out.print("·");
        }
    }

    public static void romboide( int alto, int ancho)
    {
        int i, j, espacio;

        for (i = 1; i <= alto; i++)
        {
            for(espacio = i; espacio <= alto - 1; espacio++)
            {
                System.out.print(" ");
            }
            for(j = 1; j <= ancho; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*static void romboideLuis(int alto, int ancho)
    {
        int i;

        for (i = 1; i <= alto; i++)
        {
            repiteEspacio(alto - i);
            repiteEstrella(ancho);
            System.out.println();
        }
    }
*/
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int alto, ancho;
        System.out.println("--Te voy a dibujar un romboide--");
        System.out.print("Dime la alto: ");
        alto = sc.nextInt();
        System.out.print("Dime la anchura: ");
        ancho = sc.nextInt();

        romboide(alto, ancho);


    }
}

//Escribe la función romboide, que nos pintará un romboide con asteriscos. Habrá que
//pasarle dos parámetros: la alto y la longitud. La longitud será el número de asteriscos
//que hay en cada piso y la alto el número de pisos que tendrá
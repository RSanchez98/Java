package com.company;

import java.util.Scanner;

public class Main
{
    public static void descomponerFactoresPrimos(int n)
    {
        int i, division;
        division = n;
        System.out.print(n+" = ");
        for (i = 2; i <= n; i++)
        {
            while (division % i == 0)
            {
                division = division / i;
                if (division != 1)
                {
                    System.out.print(i+" x ");
                }
                else
                {
                    System.out.print(i);
                }

            }
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Introduce un numero: ");
        n = sc.nextInt();

        descomponerFactoresPrimos(n);

    }
}
//Escribe la función descomponerFactoresPrimos a la que le pasamos un entero y nos
//escribe por pantalla sus factores primos. No devuelve nada porque escribe los datos por
//pantalla.
//Ejemplo: Si le pasamos el número 24, nos debería escribir: 2 2 2 3
//Para los que quieran nota, que aparezca bonito: “24 = 2 x 2 x 2 x 3”.
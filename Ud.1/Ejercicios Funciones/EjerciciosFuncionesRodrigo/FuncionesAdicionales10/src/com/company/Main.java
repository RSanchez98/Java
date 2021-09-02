package com.company;

import java.util.Scanner;

public class Main
{
    public static void escribeSerieNumeros3 (int a, int b, int c)
    {
        Scanner sc = new Scanner(System.in);

        while (a <= 0 || a > 100)
        {
            System.out.println("Vuelve a introducir el 1er numero(entre 1-100)");
            a = sc.nextInt();
        }
        while ((b <= 0 || b > 100) || b < a)
        {
            System.out.println("Vuelve a introducir el 2º numero (entre 1-100 pero MAYOR que el 1º)");
            b = sc.nextInt();
        }
        while (((c <= 0 || c > 100) || c < a) || c > b)
        {
            System.out.println("Vuelve a introducir el 3er numero (entre 1-100 pero MAYOR que el 1º y MENOR que el 2º)");
            c = sc.nextInt();
        }

        int i;
        for (i = a; i <= c; i++)
        {
            System.out.print(i+" ");
        }
        System.out.println();
        for (i = c; i<=b; i++)
        {
            System.out.print(i+" ");
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.println("Introduce el 1er numero(entre 1-100)");
        a =sc.nextInt();
        System.out.println("Introduce el 2º numero (entre 1-100 pero MAYOR que el 1º)");
        b = sc.nextInt();
        System.out.println("Introduce el 3er numero (entre 1-100 pero MAYOR que el 1º y MENOR que el 2º)");
        c = sc.nextInt();

        escribeSerieNumeros3(a, b, c);
    }
}

//Escribe una función escribeSerieNumeros3 que nos pide tres números. El primero
//tendrá que ser un número entre 1 y 100; si el número no es correcto, lo vuelve a pedir.
//El segundo tendrá que ser un número entre 1 y 100 pero con la condición de que sea
//mayor que el primero; lo volverá a pedir mientras no sea correcto. El tercero tendrá que
//ser un número entre 1 y 100 con la condición de que sea mayor que el primero y menor
//que el segundo; también lo volverá a pedir hasta que sea correcto.
//Una vez que tengamos los tres números, nos escribirá por pantalla los números
//comprendidos entre el primero y el tercero y en otra línea los números comprendidos
//entre el tercero y el segundo. Mejor con un ejemplo:
//Los tres números son 5, 12 y 7. Nos tendrá que escribir:
//5 6 7
//7 8 9 10 11 12
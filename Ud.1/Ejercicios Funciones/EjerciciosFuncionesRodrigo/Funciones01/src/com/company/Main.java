package com.company;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int numero;

        System.out.println("Introduce un numero");
        numero = sc.nextInt();
        if(parImar(numero, true))
        {
            System.out.println("El numero "+numero+ " es par");
        }
        else
        {
            System.out.println("El numero "+numero+ " es impar");
        }
    }






    public static boolean parImar(int numero, boolean resultado)
    {
        if(numero % 2 == 0)
        {
            resultado = true;
        }
        else
        {
            resultado = false;
        }
        return resultado;
    }
}
//Escribe una función que te diga si un número es par o no. La función se llamará “par” y
//nos devolverá un valor booleano que será “verdadero” si el número es par y “falso” si
//es impar.
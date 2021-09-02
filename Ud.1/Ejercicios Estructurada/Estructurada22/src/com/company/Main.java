package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int i, numero, factorial;
        i = 2;
        factorial = 1;

        System.out.println("Introduce un numero para calcular su factorial");
        numero = sc.nextInt();

        while (i <= numero)
        {
            factorial = factorial * i;
            i = i + 1;
        }
        System.out.println("El factorial de " + numero + " es " + factorial);
    }
}
//Calcular el factorial de un número entero N. Recuerda que el factorial de un número es
//el producto de ese número por todos los enteros menores que él. Por ejemplo, el
//factorial de 5 (simbolizado 5!) se calcula como: 5! = 5 x 4 x 3 x 2 x 1.
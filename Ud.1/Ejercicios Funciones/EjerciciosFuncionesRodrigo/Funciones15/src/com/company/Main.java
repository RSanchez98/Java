package com.company;

import java.util.Scanner;

public class Main
{
    public static int leeNumero()
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un numero comprendido entre 1 y 20 (ambos incluidos)");
        n = sc.nextInt();
        while (n < 1 || n > 20)
        {
            System.out.println("Ese numero esta fuera de nuestro rango ("+n+")");
            System.out.println("Vuelve a intentarlo");
            n = sc.nextInt();
        }
        return n;
    }

    public static void main(String[] args)
    {
        int numero;
        numero = leeNumero();
        System.out.println("El numero "+numero+" es correcto");
    }
}
//Escribe una función “leeNúmero” a la que le pasas dos parámetros (a y b)
// y nos lee del teclado un número comprendido entre a y b (ambos incluidos).
// Si el número no es correcto, te vuelve a pedir que lo introduzcas.
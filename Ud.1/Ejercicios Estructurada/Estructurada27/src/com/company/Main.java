package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n, i, resultado;

        System.out.println("Escribe un numero para mostrarte su tabla de multiplicar");
        n = sc.nextInt();

        for (i = 0; i <= 10; i++)
        {
            resultado = n * i;
            System.out.println(n+ " x " +i+ " = " +resultado);
        }
    }
}
//Escribe un programa que te escribe la tabla de multiplicar del número que le introduzcas
//por teclado.
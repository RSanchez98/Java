package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int i, numero;

        System.out.println("Dime un numero para mostrarte su tabla de multiplicar");
        i = 0;
        numero = sc.nextInt();

        while (i<=10)
        {
            System.out.println(numero+ "*"+ i +"="+ numero*i);
            i = i + 1;
        }
    }
}
//Escribe un programa que te escribe la tabla de multiplicar del número que le introduzcas
//por teclado.
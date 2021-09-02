package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int a;
        System.out.println("Introduce un numero para mostrarte su tabla de multilicar");
        a = sc.nextInt();
        tablaMultiplicar(a);

    }



    public static void tablaMultiplicar(int a)
    {
        int i;
        int n;
        for (i = 0; i <=10; i++)
        {
            n = i * a;
            System.out.println(a +" x "+ i +" = "+n);
        }
    }
}
//Escribe una función “tablaMultiplicar” a la que le pases un entero y nos escriba la tabla
//de multiplicar de ese número.
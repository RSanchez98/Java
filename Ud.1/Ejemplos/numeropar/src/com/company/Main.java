package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int numero, resto;

        System.out.println("Dime un numero para decirte si es par o impar");
        numero = sc.nextInt();

        resto = numero % 2; //el numero lo divides entre 2 y si el resto sale 0, es par, si no, impar

        if(resto == 0)
        {
            System.out.println("El numero " + numero + " es par");
        }
        else
        {
            System.out.println("El numero " + numero + " es impar");
        }
    }
}

package com.company;

import java.util.Scanner;

public class Main
{
    public static void signo(int n)
    {
        if(n>0)
        {
            System.out.println("1");
        }
        else
        {
            if (n<0)
            {
                System.out.println("-1");
            }
            else
            {
                System.out.println("0");
            }
        }
    }


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Introduce un numero");
        n = sc.nextInt();

        signo(n);
    }
}
//Escribe una función “signo” a la que le pasemos un número y nos devuelva “1” si es
//positivo, “0” si es cero y “-1” si es negativo.
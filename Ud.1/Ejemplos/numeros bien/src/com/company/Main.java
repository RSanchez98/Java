package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Escribe un numero entre 1 y 10");
        n = sc.nextInt();

        while (n > 10 || n < 1)
        {
            System.out.println("El numero esta mal, escribelo de nuevo");
            n = sc.nextInt();
        }
        System.out.println("El numero es " + n);
    }
}

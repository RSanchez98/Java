package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int numero, resto;

        System.out.println("Dime un numero para decirte si es multiplo de 10");
        numero = sc.nextInt();

        resto = numero % 10;

        if(resto==0){ // (numero % 10 == 0)
            System.out.println("El numero es multiplo de 10");
        }
        else {
            System.out.println("El numero NO es multiplo de 10");
        }
    }
}

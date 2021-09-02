package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);

        System.out.println("Introduce un numero entre el 0 y el 10");
        int numero;

        numero = sc.nextInt();

        if(numero >= 0 && numero <= 10) {
            System.out.println("El numero introducido es correcto");
        }
        else {
            System.out.println("El numero introducido es incorrecto");
        }
    }
}

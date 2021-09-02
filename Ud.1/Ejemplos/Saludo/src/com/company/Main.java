package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String nombre; //variable para guardar texto

        System.out.println("¿Cómo te llamas?");
        nombre = sc.nextLine();

        System.out.println("Hola " + nombre);

    }
}
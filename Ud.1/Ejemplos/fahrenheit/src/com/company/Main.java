package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double fahrenheit, celsius;

        System.out.println("¿Cuantos grados Fahrenheit quieres que pasemos a Celsius?");
        fahrenheit = sc.nextDouble();

        celsius = ((fahrenheit - 32) * 5) / 9;

        System.out.println(fahrenheit + " grados fahrenheit equivalen a " + celsius + " grados celsius");
    }
}

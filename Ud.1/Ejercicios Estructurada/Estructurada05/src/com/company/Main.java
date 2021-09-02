package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double a, b, c;

        System.out.println("Dime el primer numero");
        a = sc.nextDouble();

        System.out.println("Dime el segundo numero");
        b = sc.nextDouble();

        System.out.println("Dime el tercer numero");
        c = sc.nextDouble();

        if (b - 1 == a && b + 1 == c){
            System.out.println("Los numeros son consecutivos");
        }
        else {
            System.out.println("Lons numeros NO son consecutivos");
        }
    }
}
//Como el anterior, pero para averiguar si los números son consecutivos.
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

        if (a<b && a<c && b<c){
            System.out.println("Están ordenados de menor a mayor");
        }
        else {
            System.out.println("NO están ordenados de menor a mayor");
        }
    }
}
//Leer tres números por teclado, X, Y y Z, y decidir si están ordenados de menor a mayor.
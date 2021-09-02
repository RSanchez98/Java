package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double lado, area;

        System.out.println("¿Cuanto mide el lado?");
        lado = sc.nextDouble();

        area = lado * lado;

        System.out.println("El area del cuadrado es " + area);
    }
}

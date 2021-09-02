package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double radio, area;

        System.out.println("¿Cuanto mide el radio del cirulo?");
        radio = sc.nextDouble();

        area = (2*3.1415926535) * radio;

        System.out.println("El area del circulo es " + area);
    }
}

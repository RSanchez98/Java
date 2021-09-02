package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        double euros, dolares, libras, yenes;

        System.out.println("¿Cuántos euros tienes?");
        euros = sc.nextDouble();
        dolares = euros * 1.10669;
        libras = euros * 0.882200;
        yenes = euros * 119.347000;

        System.out.println(euros + " € equivalen a " + dolares + " dolares, " + libras + " libras " + "y " + yenes + " yenes");
    }
}

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        double altura, peso, imc;

        System.out.println("Dime tu altura en metros");
        altura = sc.nextDouble();
        System.out.println("Dime tu peso en kilos");
        peso = sc.nextDouble();

        imc = peso / (altura * altura);

        System.out.println("Tu indice de masa corporal es "+ imc);
    }
}

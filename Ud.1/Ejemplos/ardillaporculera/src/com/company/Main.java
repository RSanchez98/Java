package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int numero, doble;

        System.out.println("Dime un numero para decirte el doble");
        numero = sc.nextInt();

        if(numero == 5)
        {
            System.out.println("Por el culo te la hinco");;
        }
        else
        {
            doble = numero * 2;
            System.out.println("El doble del numero " + numero + " es " + doble);
        }
    }
}

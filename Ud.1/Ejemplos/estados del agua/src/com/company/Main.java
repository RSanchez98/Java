package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);

        System.out.println("¿A qué temperatura se encuentra el agua?");
        double agua;
        agua = sc.nextDouble();

        if (agua < 0) {
            System.out.println("El agua se encuentra en estado solido");
        }
        else if (agua > 100) {
            System.out.println("El agua se encuentra en estado gaseoso");
        }
        else {
            System.out.println("El agua se encuentra en estado líquido");
        }
    }
}

package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("¿Cuánto alcohol en sangre tiene?");
        double alcohol;
        alcohol = sc.nextDouble();

        if (alcohol >= 0 && alcohol <= 0.25) {
            System.out.println("Puedes conducir");
        }
        else if (alcohol > 0.26){
            System.out.println("Estas demasiado borracho para conducir");
        }
        else {
            System.out.println("El numero introducido es erroneo");
        }
    }
}

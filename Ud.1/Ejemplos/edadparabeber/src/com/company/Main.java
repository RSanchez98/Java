package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
         int edad;

        System.out.println("Dime tu edad");
        edad = sc.nextInt();

        if(edad >= 18 ) //el if no lleva punto y coma
        {
            System.out.println("Aqui tienes tu cubata campeón");
        }
        else //else tampoco lleva punto y coma
        {
            System.out.println("Aqui tienes tu zumito de piña");
        }
    }
}

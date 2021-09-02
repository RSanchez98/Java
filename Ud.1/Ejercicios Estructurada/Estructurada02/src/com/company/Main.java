package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int numero, resto;

        System.out.println("Dime un año para decirte si es bisiesto o no lo es");
        numero = sc.nextInt();

        resto = numero % 4;

        if(resto==0){ // (numero % 10 == 0)
            System.out.println("El año " + numero + " es bisiesto");
        }
        else {
            System.out.println("El año " + numero + " NO es bisiesto");
        }
    }
}
//Determinar si un año es bisiesto o no (los años bisiestos son múltiplos de 4; utilícese el
//operador módulo).
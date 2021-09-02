package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        double numero1, numero2, solucion;

        System.out.println("Primer numero");
        numero1 = sc.nextDouble();
        System.out.println("Segundo numero");
        numero2 = sc.nextDouble();

        if (numero1 > numero2){
            solucion = numero1 - numero2;
            System.out.println("La solución es " + solucion);
        }
        else {
            solucion = numero2 - numero1;
            System.out.println("La solución es " + solucion);
        }
    }
}
//Leídos dos números por teclado, A y B, calcular la resta del mayor menos el menor. Por
//ejemplo, si A = 8 y B = 3, el resultado debe ser A – B, es decir, 5. Pero si A = 4 y B = 7, el
//resultado debe ser B – A, es decir, 3.
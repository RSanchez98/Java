package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        double resultado1, resultado2;

        System.out.println("Introduce el valor de a ");
        a = sc.nextDouble();

        System.out.println("Introduce el valor de b ");
        b = sc.nextDouble();

        System.out.println("Introduce el valor de c ");
        c = sc.nextDouble();

        double numeroraiz = (b * b) - (4 * a * c);

        if (numeroraiz > 0)
        {
            System.out.println("La ecuación tiene dos soluciones");
            resultado1 = (-b + Math.sqrt(numeroraiz)) / (2.0 * a);
            resultado2 = (-b - Math.sqrt(numeroraiz)) / (2.0 * a);
            System.out.println("El valor de x1 es " + resultado1);
            System.out.println("El valor de x2 es " + resultado2);
        }
        else
        {
            if (numeroraiz == 0)
            {
                System.out.println("La ecuación tiene una solución");
                resultado1 = -b / (2.0 * a);
                System.out.println("La solución de x1 es " + resultado1);
            }
            else
            {
                System.out.println("La ecuación no tiene solución real");
            }
        }
    }
}
//Calcular las dos soluciones de una ecuación de segundo grado, del tipo ax2 + bx + c = 0.
//Los coeficientes a, b y c deberá introducirlos el usuario a través del teclado.
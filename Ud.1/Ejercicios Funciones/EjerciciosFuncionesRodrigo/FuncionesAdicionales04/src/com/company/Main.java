package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main
{
    public static void potencia2(int a, int b)
    {
        int potenciaA, potenciaB, resultado, i;
        potenciaA = 1;
        potenciaB = 1;
        if (a == -a || b == -b)
        {
            System.out.println("-1");
        }
        else
        {
            for (i = 1; i <= a; i++)
            {
                potenciaA = 2 * potenciaA;
            }
            for (i = 1; i <= b; i++)
            {
                potenciaB = 2 * potenciaB;
            }
        }
        System.out.println(a+" elevado a 2 = "+potenciaA);
        System.out.println(b+ " elevado a 2 = "+potenciaB);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Introduce el primer numero");
        a = sc.nextInt();
        System.out.println("Introduce el el segundo numero");
        b = sc.nextInt();

        potencia2(a,b);
    }
}
//Escribe una función potencia2 que te devuelva la potencia de 2 del número que le pasas
//por parámetro (ambos enteros). El valor del parámetro tendrá que ser 0 (un caso
//especial) o un número positivo. Si se le manda un número negativo, la función devolverá
//-1. No se podrá utilizar la función Math.pow() (evidentemente).
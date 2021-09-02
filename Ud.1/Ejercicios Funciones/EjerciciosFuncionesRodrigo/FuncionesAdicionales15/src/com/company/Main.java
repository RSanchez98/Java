package com.company;

import java.util.Scanner;

public class Main
{
    public static boolean cuadradoPerfecto(int n)
    {
        int i, mult;
        mult = 0;
        boolean cuadrado = false;
        for (i = 1; i <= n; i++)
        {
            mult = i * i;
            if (mult == n)
            {
                cuadrado = true;
            }
        }
        return cuadrado;
    }

    public static int listaCuadradosPerfectos (int min, int max)
    {
        int i;
        for (i = min; i <= max; i++)
        {
            if (cuadradoPerfecto(i))
            {
                System.out.println(i);
            }
        }
        return i;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int min, max;
        System.out.print("Introduce el primer numero (pequeño): ");
        min = sc.nextInt();
        System.out.print("Introduce el segundo numero (mayor): ");
        max = sc.nextInt();

        listaCuadradosPerfectos(min, max);
    }
}
//Escribe dos funciones:
//• A la función cuadradoPerfecto le pasaremos un entero por parámetro y nos
//devolverá un boolean, que será true si el entero es un cuadrado perfecto y false si
//no lo es.
//Un número A es un cuadrado perfecto si existe otro número B que multiplicado por
//sí mismo nos da A. O, dicho de otra forma, un número es un cuadrado perfecto si su
//raíz cuadrada sale exacta. Ej.: 4, 9, 16, 25, etc.
//• A la función listaCuadradosPerfectos le pasaremos dos enteros min y max y nos
//escribirá por pantalla todos los cuadrados perfectos que existen entre esos dos
//números. No devuelve nada porque escribe el resultado directamente por pantalla.
//Esta función usará la función anterior para el cálculo.
//Por ejemplo: listaCuadradosPerfectos(10, 20) nos escribirá el 9 y el 16.
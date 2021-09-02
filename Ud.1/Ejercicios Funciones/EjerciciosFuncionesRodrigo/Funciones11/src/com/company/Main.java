package com.company;

import java.net.SecureCacheResponse;
import java.util.Scanner;

public class Main
{
    public static int areaTriangulo(int base, int altura)
    {
        int area;
        area = (base * altura) / 2;
        return area;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int base, altura;
        System.out.println("Vamos a calcular el área de un triangulo");
        System.out.println("Introduce el valor de la base");
        base = sc.nextInt();
        System.out.println("Introduce el valor de la altura");
        altura = sc.nextInt();

        System.out.println(areaTriangulo(base, altura));
    }
}
//Escribe una función “areaTriangulo” que te calcule el área de un triángulo. Habrá que
//pasarle como parámetros la base y la altura.
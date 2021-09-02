package com.company;

import java.util.Scanner;

public class Main
{
    public static double pulgadasACentimetros (double pulgadas)
    {
        double centimetros = pulgadas * 0.39370;
        return centimetros;
    }

    public static double centimetrosAPulgadas (double centimetros)
    {
        double pulgadas = centimetros * 2.54;
        return pulgadas;
    }


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String  palabra;
        double pulgadas, centimetros;
        System.out.println("¿Que valor quieres introducir, pulgadas o centimetros?");
        palabra = sc.nextLine();

        if (palabra.equals("pulgadas"))
        {
            System.out.println("Introduce el valor de las pulgadas para pasarlas a centímetros");
            pulgadas = sc.nextDouble();
            System.out.println(pulgadasACentimetros(pulgadas));
        }
        else
        {
            if (palabra.equals("centimetros"))
            {
                System.out.println("Introduce el valor de los centímetros para pasarlo a pulgadas");
                centimetros = sc.nextDouble();
                System.out.println(centimetrosAPulgadas(centimetros));
            }
            else
            {
                System.out.println("Esa palabra introducida no es válida");
            }
        }
    }
}
//Escribe una función “pulgadasACentimetros” a la que le pases un valor en pulgadas (de
//tipo double) y te devuelva el valor en centímetros. Haz también la función
//“centímetrosAPulgadas”.
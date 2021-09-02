package com.company;

import java.util.Scanner;

public class Main
{
    public static double centigradosAFahrenheit(double centigrados)
    {
        double centAFahren;

        centAFahren = (centigrados * 1.8) + 32;

        return centAFahren;
    }

    public static double fahrenheitACentigrados(double fahrenheit)
    {
        double fahrenACent;

        fahrenACent = (fahrenheit - 32) / 1.8;

        return fahrenACent;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String letra;
        double centigrados, fahrenheit, resultadoCentAFahren, resultadoFahrenACent;

        System.out.println("¿Qué dato es el que tienes, Centigrados o Fahrenheit?");
        System.out.println("Escribe la letra en mayúscula 'C' o 'F'");
        letra = sc.nextLine();

        if (letra.equals("C"))
        {
            System.out.println("Introduce la temperatura en grados centigrados");
            centigrados = sc.nextDouble();

            resultadoCentAFahren = centigradosAFahrenheit(centigrados);
            System.out.println(centigrados + "º centigrados son " + resultadoCentAFahren + "º Fahrenheit");
        }
        else
        {
            if (letra.equals("F"))
            {
                System.out.println("Introduce la temperatura en grados fahrenheit");
                fahrenheit = sc.nextDouble();

                resultadoFahrenACent = fahrenheitACentigrados(fahrenheit);
                System.out.println(fahrenheit + "º Fahrenheit son " + resultadoFahrenACent + "º Centigrados");
            }
            else
            {
                System.out.println("Algo has hecho mal, melón");
            }
        }
    }
}
//Escribe una función centigradosAFahrenheit que nos convierta una temperatura que
//está en grados centígrados a grados Fahrenheit. La función tendrá un parámetro, que
//será un número real, y devolverá otro número real. La fórmula es:
//Temp.(F)=1,8*Temp.(C°)+32.

//Escribe una función fahrenheitACentigrados que nos convierta una temperatura que
//está en grados Fahrenheit a grados centígrados. La función tendrá un parámetro, que
//será un número real, y devolverá otro número real. La fórmula es:
//Temp.(C)=(Temp.(F)-32)/1,8.
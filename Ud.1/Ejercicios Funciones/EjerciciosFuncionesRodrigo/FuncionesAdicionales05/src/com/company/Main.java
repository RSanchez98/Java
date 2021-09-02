package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main
{
    public static void trianguloEstrellitas(int n)
    {

        if(n < 3 || n> 20)
        {
            System.out.println("ERROR");
        }
        else
        {
            int alto, ancho;
            for (alto = 1; alto <= n; alto++)
            {
                for (ancho = 0; ancho < alto; ancho++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("¿De cuanta altura quieres que sea el triangulo de asteriscos? (min 3 max 20)");
        n = sc.nextInt();

        trianguloEstrellitas(n);
    }
}
//Escribe la función trianguloEstrellitas. La función te pedirá un número que deberá ser
//como mínimo el número 3 y como máximo el 20. Si el número no es correcto, escribirá
//“ERROR”. La función escribirá por pantalla una pirámide a base de estrellitas como la
//del ejemplo. La función deberá funcionar para cualquier número entre 3 y 20 (o sea,
//nada de escribir las estrellitas a mano).
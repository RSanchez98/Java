package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int nota, contador;
        double suma, media;
        nota = sc.nextInt();
        suma = 0;
        contador = 0;

        while (nota >= 0)
        {
            suma = suma + nota;
            contador = contador + 1;
            nota = sc.nextInt();
        }
            //no hace falta meterle en un "if" porque en el momento en el que ponga el numero negativo se va a salir del "while"
        media = suma / contador;
        System.out.println("La media de los números introducidos es: " + media);

    }
}
//Calcular el valor medio de una serie de valores enteros positivos introducidos por
//teclado. Para terminar de introducir valores, el usuario debe teclear un número
//negativo.
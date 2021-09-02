package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        Random r = new Random();
        int n, i, j, respuesta;
        j = 0;
        n = r.nextInt();
        for (i = 0; i < 10; i++)
        {
            n = r.nextInt(10) + 1;
        }
        System.out.println("Dime un numero del 1 al 10 sara ver si has adivinado el numero secreto");
        respuesta = sc.nextInt();
        while (respuesta != n)
        {
            if (respuesta < n)
            {
                System.out.println("Mi numero es mayor que el " + respuesta);
                respuesta = sc.nextInt();
                j = j + 1;
            }
            else
            {
                if (respuesta > n)
                {
                    j = j + 1;
                    System.out.println("Mi numero es mas pequeño que el " + respuesta);
                    respuesta = sc.nextInt();
                }
            }
        }
        if (respuesta == n)
        {
            j = j + 1;
            System.out.println("Enhorabuena, has acertado, el numero secreto es " + n);
            System.out.println("Solo te ha costado " + j + " intento/s");
        }
    }
}
//Juego del número secreto. El ordenador elegirá un número al azar entre 1 y 100. El
//usuario irá introduciendo números por teclado, y el ordenador le irá dando pistas: "mi
//número es mayor" o "mi número es menor", hasta que el usuario acierte. Entonces el
//ordenador le felicitará y le comunicará el número de intentos que necesitó para acertar
//el número secreto.
package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
            Scanner sc = new Scanner(System.in);
        int numero;

        System.out.println("Introduce un numero cualquiera para decirte cuantas cifras tiene");
        numero = sc.nextInt();

        if (numero >= -9 && numero <= 9)
        {
            System.out.println("El numero " + numero + " tiene una cifra");
        }
        else
        {
            if (numero >= -99 && numero <= 99)
            {
                System.out.println("El numero " + numero + " tiene dos cifras");
            }
            else
            {
                if (numero >= -999 && numero <= 999)
                {
                    System.out.println("El numero " + numero + " tiene tres cifras");
                }
                else
                {
                    if (numero >= -9999 && numero <= 9999)
                    {
                        System.out.println("El numero " + numero + " tiene cuatro cifras");
                    }
                    else
                    {
                        if (numero >= -99999 && numero <= 99999){
                            System.out.println("El numero " + numero + " tiene cinco cifras");
                        }
                        else {
                            System.out.println("El numero " + numero + " tiene mas de cinco cifras");
                        }
                    }
                }

            }
        }
    }
}
//Determinar el número de cifras de un número entero. El algoritmo debe funcionar para
//números de hasta 5 cifras, considerando los negativos. Por ejemplo, si se introduce el
//número 5342, la respuesta del programa debe ser 4. Si se introduce -250, la respuesta
//debe ser 3.
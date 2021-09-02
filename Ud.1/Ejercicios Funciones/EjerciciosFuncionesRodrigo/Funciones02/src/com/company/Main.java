package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int año;

        System.out.println("Introduce un año para decirte si es bisiesto o no");
        año = sc.nextInt();

        if(bisiesto(año))
        {
            System.out.println("El año "+año+" es bisiesto");
        }
        else
        {
            System.out.println("El año "+año+" NO es bisiesto");
        }
    }





    public static boolean bisiesto(int año)
    {
        boolean resultado;

        if(año % 4 == 0)
        {
            if(año % 100 == 0)
            {
                if(año % 400 == 0)
                {
                    resultado = true;
                }
                else
                {
                    resultado = false;
                }
            }
            else
            {
                resultado = true;
            }
        }
        else
        {
            resultado = false;
        }
        return resultado;
    }
}
//Escribe una función que nos diga si un año es bisiesto o no. La función se llamará
//“bisiesto” y nos devolverá “verdadero” si es bisiesto y “falso” si no lo es.
package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int primernum, segundonum, i;

        System.out.println("Escribeme un numero");
        primernum = sc.nextInt();

        System.out.println("Escribeme el segundo numero, pero debe ser mayor que el primero");
        segundonum = sc.nextInt();

        if (primernum < segundonum)
        {
            while (primernum <= segundonum)
            {
                System.out.println(primernum);
                primernum = primernum + 1;
            }
        }
        else
        {
            System.out.println("La condición es que el segundo numero debe se mayor que el primero, vuelve a intentarlo");
        }
    }
}
//Escribe un programa que te pida dos números con la condición de que el segundo sea
//mayor que el primero, en caso contrario te pregunta de nuevo el número hasta que sea
//correcto. Si los números son correctos, escribe todos los números comprendidos entre
//el primer y el segundo número (ambos inclusive).
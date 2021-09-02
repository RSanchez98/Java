package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double nota;
        int contador, suspenso, aprobado;
        contador = 1;
        aprobado = 0;
        suspenso = 0;

        while (contador <= 30)
        {
            System.out.print("Indroduce la nota nº" + contador + ": "); // si le quito nl a printnl no te salta la linea
            nota = sc.nextInt();
            contador = contador + 1;

            if (nota <= 4)
            {
                suspenso = suspenso + 1;
            }
            else
            {
                aprobado = aprobado + 1;
            }
        }
        System.out.println("Hay " +suspenso+" suspensos");
        System.out.println("Hay " +aprobado+" aprobados");
    }
}
//El usuario de este programa será un profesor, que introducirá las notas de sus 30
//alumnos de una en una. El algoritmo debe decirle cuántos suspensos y cuántos
//aprobados hay.
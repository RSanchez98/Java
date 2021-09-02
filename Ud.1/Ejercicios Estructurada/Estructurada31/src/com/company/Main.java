package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int i, aprobado, suspenso;
        double nota;
        aprobado = 0;
        suspenso = 0;


        for (i = 1; i <= 30; i++)
        {
            System.out.println(i + ". Introduce una nota");
            nota = sc.nextDouble();
            {
                if (nota >= 0 && nota <= 4.9)
                {
                    suspenso++;
                }
                else
                {
                    if (nota >= 5.0 && nota <= 10.0)
                    {
                        aprobado++;
                    }
                }
            }
        }
        System.out.println("Hay " + aprobado + " aprobados");
        System.out.println("Hay " + suspenso + " suspensos");

    }
}
//El usuario de este programa será un profesor, que introducirá las notas de sus 30
//alumnos de una en una. El algoritmo debe decirle cuántos suspensos y cuántos
//aprobados hay.
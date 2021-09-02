package com.company;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class Main
{
    public static String notaEnTexto(double nota)
    {
        String texto;
        if (nota >= 0.0 && nota < 5.0)
        {
            texto = "Suspenso";
        }
        else
        {
            if (nota >=5.0 && nota <= 5.9)
            {
                texto = "Suficiente";
            }
            else
            {
                if (nota >=6.0 && nota <= 6.9)
                {
                    texto = "Bien";
                }
                else
                {
                    if (nota >=7.0 && nota <= 8.9)
                    {
                        texto = "Notable";
                    }
                    else
                    {
                        if (nota >=9.0 && nota <= 10.0)
                        {
                            texto = "Sobresaliente";
                        }
                        else
                        {
                            texto = "No válida";
                        }
                    }
                }
            }
        }
        return texto;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double nota;
        System.out.println("Introduce una nota");
        nota = sc.nextDouble();

        System.out.println("La nota es " + notaEnTexto(nota));
    }
}
//Escribe una función “notaEnTexto” a la que le pasamos la nota de un alumno
// como un double y nos devolverá la calificación en formato texto
// (“aprobado”, “suficiente”, etc.).
package com.company;

import java.util.Scanner;

public class Main
{

    public static double calculaNotaFinal()
    {
        Scanner sc = new Scanner(System.in);
        double nota, media, suma;
        int i, contador;
        contador = 0;
        suma = 0;

        for (i = 1; i <= 7; i++)
        {
            System.out.print("Introduce la nota " + i + ": ");
            nota = sc.nextDouble();
            while (nota < 0 || nota > 10)
            {
                System.out.println("La nota debe ser mayor de 0 y menor de 10, vuleve a introducirla");
                nota = sc.nextDouble();
            }
            if (nota <= 4)
            {
                contador++;
            }
            suma = suma + nota;
        }
        if (contador < 2)
        {
            media = suma / 7.0;
            media = Math.round(media*100.00)/100.00;
        }
        else
        {
            media = 4;
        }
        return media;
    }

    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        double media;
        media = calculaNotaFinal();
        if (media <= 4.0)
        {
            System.out.println("El alumno ha sacado una nota de 4 o menos de 4 en 2 o más exámenes");
            System.out.println("Lo cual hace que su nota final sea de: "+media);
        }
        else
        {
            System.out.println("La nota final del alumno es: "+media);
        }
    }
}
// Escribe el programa calculaNotaFinal. El programa nos ira pidiendo 7 doubles
//correspondientes a las notas de los 7 exámenes que se hacen en una asignatura durante
//el curso. La nota final que nos escribirá por pantalla será la media de los 7 doubles, con
//una excepción: si hemos suspendido dos o más exámenes durante el curso, la nota final
//no superará el 4 aunque la media salga más alta. Por ejemplo: si las notas son [10, 10,
//10, 10, 10, 2, 3], la media saldría 7’86, pero devolveríamos un 4 porque ha suspendido
//dos exámenes.
//El programa tendrá que controlar que cada nota introducida esté entre 0 y 10. Si no lo
//está, no la dará por válida y la volverá a pedir
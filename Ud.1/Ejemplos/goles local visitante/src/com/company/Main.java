package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int local, visitante;
        String nombrelocal, nombrevisitante;

        System.out.println("¿Cuál es el nombre del equipo local?");
        nombrelocal = sc.nextLine();

        System.out.println("¿Cuál es el nombre del equipo visitante?");
        nombrevisitante = sc.nextLine();

        System.out.println("¿Cuantos goles ha marcado el " + nombrelocal + "?");
        local =sc.nextInt();
        System.out.println("¿Cuantos goles ha marcado el " + nombrevisitante +"?");
        visitante =sc.nextInt();

        if (local > visitante){
            System.out.println("El ganador es el equipo " + nombrelocal);
        }
        else
        {
            if (local < visitante) {
                System.out.println("El ganador es el equipo " + nombrevisitante);
            }
            else {
                System.out.println("El partido ha empatado");
            }
        }
    }
}

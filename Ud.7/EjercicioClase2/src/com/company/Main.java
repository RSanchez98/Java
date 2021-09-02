package com.company;

import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Grupo g = new Grupo();
        int opcion = -1;
        while (opcion!=0)
        {
            System.out.println("1.- insertaAlumnoLista");
            System.out.println("2.- insertaAlumnoLista2");
            System.out.println("3.- toString");
            System.out.println("4.- escribeFicheroBinario");
            System.out.println("5.- leeFicheroBinario");
            System.out.println("6.- escribeFicheroTexto");
            System.out.println("7.- leeFicheroTexto");
            System.out.println("8.- escribeFicheroCSV");
            System.out.println("9.- leeFicheroCSV");
            System.out.println("    PARA SALIR PULSE -> 0");
            System.out.println();
            System.out.print("¿Qué función quieres ejecutar? ");
            System.out.println();
            opcion = sc.nextInt();

            switch (opcion)
            {
                case 1:
                {
                    String nombre;
                    int edad;
                    double nota;
                    System.out.print("Nombre del alumno: ");
                    nombre = sc.next();
                    System.out.print("Edad del alumno: ");
                    edad = sc.nextInt();
                    System.out.print("Nota del alumno: ");
                    nota = sc.nextDouble();

                    Alumno a = new Alumno(nombre, edad, nota);
                    g.insertaAlumnoLista(a);
                }
                break;
                case 2:
                {
                    String nombre;
                    int edad;
                    double nota;
                    System.out.print("Nombre del alumno: ");
                    nombre = sc.next();
                    System.out.print("Edad del alumno: ");
                    edad = sc.nextInt();
                    System.out.print("Nota del alumno: ");
                    nota = sc.nextDouble();

                    g.insertaAlumnosLista(nombre, edad, nota);
                }
                break;
                case 3:
                {
                    System.out.println(g.toString());
                }
                break;
                case 4:
                {
                    String fichero="prueba.bin";
                    g.escribeFicheroBinario(fichero);
                }
                break;
                case 5:
                {
                    String fichero ="prueba.bin";
                    g.leeFicheroBinario(fichero);
                }
                break;
                case 6:
                {
                    String fichero ="pureba.txt";
                    g.escribeFicheroTexto(fichero);
                }
                break;
                case 7:
                {
                    String fichero = "prueba.txt";
                    g.leeFicheroTexto(fichero);
                }
                break;
                case 8:
                {
                    String fichero = "prueba.csv";
                    g.escribeFicheroCSV(fichero);
                }
                break;
                case 9:
                {
                    String fichero = "prueba.csv";
                    g.leeFicheroCSV(fichero);
                }
                break;
                default:
                    System.out.println("Ha finalidazo");
            }
        }
    }
}

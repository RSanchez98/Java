package com.company;

import java.time.LocalDate;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
//        AutoVenta av = new AutoVenta();
//        av.cargaCSV("Coches.csv");
//        System.out.println(av.imprimeListado());
        Scanner sc = new Scanner(System.in);
        String fichero = "Coches.csv";
        AutoVenta av = new AutoVenta();
        av.cargaCSV(fichero);

        int opcion = -1;
        while (opcion != 0)
        {
            System.out.println();
            System.out.println("-------------------------------------------------------------");
            System.out.println("1. Insertar coche");
            System.out.println("2. Buscar un coche por la matricula");
            System.out.println("3. Listado de coches");
            System.out.println("**************************************");
            System.out.println("0. Salir");
            System.out.println();
            System.out.print("Elige una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();
            System.out.println("-------------------------------------------------------------");

            Coche c;
            System.out.println();

            switch (opcion)
            {
                case 1:
                {
                    String matricula, marca, modelo;
                    LocalDate fehcaMatriculacion;
                    double precio;

                    System.out.print("Maticula del coche: ");
                    matricula = sc.nextLine().toUpperCase();
                    System.out.print("Fecha de matriculacion(yyyy-MM-dd): ");
                    fehcaMatriculacion = LocalDate.parse(sc.nextLine());
                    System.out.print("Marca del coche: ");
                    marca = sc.next();
                    System.out.print("Modelo del coche: ");
                    modelo = sc.next();
                    System.out.print("Precio del coche: ");
                    precio = sc.nextDouble();
                    Coche cocheNuevo = new Coche(matricula, fehcaMatriculacion, marca, modelo, precio);
                    av.insertaCoche(cocheNuevo);
                    System.out.println(av.imprimeListado());
                }
                break;
                case 2 :
                {
                    String matricula;
                    System.out.println("Introduza la matricula del coche desado: ");
                    matricula = sc.nextLine().toUpperCase();
                    c = av.buscaCoche(matricula);
                    if (c!=null)
                    {
                        System.out.println(c.toString());
                    }
                    else
                    {
                        System.out.println("La matricula "+matricula+" no se encuentra");
                    }

                }
                break;
                case 3:
                {
                    System.out.println(av.imprimeListado());

                }
                break;
            }
        }
        av.guardaCSV(fichero);
    }
}

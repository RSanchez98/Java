package com.company;

import javafx.beans.property.ReadOnlySetProperty;
import javafx.util.converter.LocalDateStringConverter;

import java.sql.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main
{
    public static void main(String[] args)
    {
        CineDB c = new CineDB("jdbc:sqlite:C:\\Users\\Rodrigo\\IdeaProjects\\Ud.7\\Recursos Ficheros para la Base de Datos de Películas-20200317\\cine.db");
        Scanner sc = new Scanner(System.in);
        int opcion=-1;
        while (opcion!=0)
        {
            System.out.println();
            System.out.println("Bienvenido a la base de datos de ACTORES & PELICULAS");
            System.out.println();
            System.out.println("*******************   MENU   *******************");
            System.out.println("|   1. Insertar una pelicula                   |");
            System.out.println("|   2. Ver listado de peliculas                |");
            System.out.println("|   3. Ver listado de actores                  |");
            System.out.println("|   4. Ver listado de peliculas de un actor    |");
            System.out.println("|   5. Informacion de una pelicula             |");
            System.out.println("************************************************");
            System.out.println("|              PARA SALIR PULSE 0              |");
            System.out.println("************************************************");
            System.out.print("¿Qué opcion desea? ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion)
            {
                case 1:
                {
                    System.out.println();
                    System.out.println("Ha elegido INSERTAR UNA PELICULA");
                    System.out.println();
                    String titulo;
                    int anno;
                    boolean tieneOscar = false;
                    String tieneOscarTexto;
                    double valoracion;
                    int idPelicula;

                    System.out.print("Nombre de la pelicula: ");
                    titulo = sc.nextLine();
                    System.out.print("Año de la pelicula '"+titulo+"': ");
                    anno = sc.nextInt();
                    sc.nextLine();
                    System.out.print("¿Tiene oscar '"+titulo+"' (si|no)? ");
                    tieneOscarTexto = sc.nextLine();
                    if (tieneOscarTexto.equals("si"))
                    {
                        tieneOscar = true;
                    }
                    else
                    {
                        tieneOscar = false;
                    }
                    System.out.print("Valoracion de '"+titulo+"' (X,X): ");
                    valoracion = sc.nextDouble();
                    sc.nextLine();
                    idPelicula = c.insertarPelicula(titulo,anno,tieneOscar, valoracion);

                    String nombreActor;
                    int actorExistente, idActor;
                    int masActores = -1;
                    while (masActores!=0)
                    {
                        System.out.print("Actor que participa en '"+titulo+"': ");
                        nombreActor = sc.nextLine();
                        actorExistente = c.buscaActor(nombreActor);

                        if (actorExistente == -1) //no exitste en la bbdd
                        {
                            System.out.print("Fecha de nacimineto de '"+nombreActor+"'(yyyy-MM-dd): ");
                            String fecha = sc.nextLine();
                            LocalDate fechaNacimiento =LocalDate.parse(fecha);
                            idActor = c.insertaActor(nombreActor, fechaNacimiento);

                            System.out.print("¿"+nombreActor+" es el personaje principal? (si|no) ");
                            String pricipalTexto = sc.nextLine().toLowerCase();
                            boolean principal = false;
                            if(pricipalTexto.equals("si"))
                            {
                                principal = true;
                            }
                            else
                            {
                                principal = false;
                            }
                            c.asociaActorPelicula(idActor, idPelicula, principal);
                        }
                        else
                        {
                            System.out.println("El actor '"+nombreActor+"' ya esta en la base de datos");
                            System.out.print("¿"+nombreActor+" es el actor principal?");
                            String pricipalTexto = sc.nextLine().toLowerCase();
                            boolean principal = false;
                            if (pricipalTexto.equals("si"))
                            {
                                principal = true;
                            }
                            else
                            {
                                principal = false;
                            }
                            idActor = c.buscaActor(nombreActor);
                            c.asociaActorPelicula(idActor, idPelicula, principal);
                        }
                        System.out.println();
                        System.out.println("·····ACTOR AÑADIDO A LA LISTA·····");
                        System.out.println("Si quieres añadir mas actores a la pelicula "+titulo+", PULSE 1");
                        System.out.println("Si quieres salir, PULSE 2");
                        System.out.print("Elija: ");
                        masActores = sc.nextInt();
                    }
                }
                break;
                case 2:
                {
                    System.out.println();
                    System.out.println("Ha elegido VER LISTADO DE PELICULAS");
                    List<Pelicula>listaPeliculas = c.listadoPelicualas();
                    int i;
                    for (i = 0; i <listaPeliculas.size(); i++)
                    {
                        System.out.println(listaPeliculas.get(i).getTitulo());
                    }
                    System.out.println();
                }
                break;
                case 3:
                {
                    System.out.println();
                    System.out.println("Ha elegido VER LISTADO DE ACTORES");
                    List<Actor>listaActores=c.listadoActores();
                    int i;
                    for (i = 0; i < listaActores.size(); i++)
                    {
                        System.out.println(listaActores.get(i).getActor());
                    }
                    System.out.println();
                }
                break;
                case 4:
                {
                    System.out.println();
                    String nombreActor;
                    int idActor;

                    System.out.println("Ha elegido VER PELICULAS DE UN ACTOR");
                    System.out.print("Escriba el nombre del actor: ");
                    nombreActor = sc.nextLine();
                    idActor = c.buscaActor(nombreActor);
                    List<Pelicula>listaPeliculasPorActor= new ArrayList<>();
                    listaPeliculasPorActor = c.listadoPeliculasPorActor(idActor);
                    int i;
                    for (i = 0 ; i < listaPeliculasPorActor.size(); i++)
                    {
                        System.out.println(listaPeliculasPorActor.get(i).getTitulo());
                    }
                }
                break;
                case 5:
                {
                    System.out.println();
                    System.out.println("Ha elegido VER INFORMACION DE UNA PELICULA");
                    String nombrePelicula;
                    System.out.print("Escriba el nombre de la pelicula: ");
                    nombrePelicula = sc.nextLine();
                    int idPelicula;
                    idPelicula = c.buscaPelicula(nombrePelicula);

                    Pelicula p = c.datosPelicula(idPelicula);
                    System.out.println("Datos de la pelicula "+nombrePelicula+": ");
                    System.out.println(p.toString());
                    System.out.println();
                    List<ActorPelicula> listaActores=c.listadoActoresPorPelicula(idPelicula);
                    System.out.println("Actores que participan en "+nombrePelicula+": ");
                    int i;
                    for (i = 0; i < listaActores.size(); i++)
                    {
                        Actor a = c.datosActor(listaActores.get(i).getId());
                        System.out.println(a.toString());
                    }

                }
                break;
                default:
                {
                    System.out.println("-_-Opcion no valida-_-");
                }
            }

        }

        //c.insertarPelicula("Los coches y los camiones", 1976, true,5.7);
        //c.insertaActor("Antoñito Carmona", LocalDate.of(1955,5,22));
        //c.asociaActorPelicula(2, 2, true);
        //c.buscaActor("Clint Eastwood");
        //System.out.println("El id del actor es " + c.buscaActor("Clint Eastwood"));
        //System.out.println("El id de la pelicual es " + c.buscaPelicula("Los coches y los camiones"));
        //System.out.println("Los datos de la pelicual son: " + c.datosPelicula(23));
        //System.out.println("Los datos del actor son: " + c.datosActor(3));
        //System.out.println(c.listadoPelicualas());
        //System.out.println(c.listadoActores());
        //System.out.println(c.listadoPeliculasPorActor(12));
        //System.out.println(c.listadoActoresPorPelicula(22));



    }
}

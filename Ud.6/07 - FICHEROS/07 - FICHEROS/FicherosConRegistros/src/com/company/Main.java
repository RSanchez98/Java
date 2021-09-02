package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void leeAlumnosLista(List<FichaAlumno> listaAlumnos)
    {
        Scanner sc = new Scanner(System.in);
        String nombre;
        int edad;
        double calificacion;

        System.out.println("Indique el nombre del alumno:");
        nombre = sc.next();
        System.out.println("Indique la edad del alumno:");
        edad = sc.nextInt();
        System.out.println("Indique la calificación del alumno:");
        calificacion = sc.nextDouble();

        FichaAlumno f = new FichaAlumno();
        f.nombre = nombre;
        f.edad = edad;
        f.calificacion = calificacion;

        listaAlumnos.add(f);
    }

    public static void imprimeListaAlumnos(List<FichaAlumno> listaAlumnos)
    {
        int i;

        for(i = 0; i < listaAlumnos.size(); i++)
        {
            System.out.println("Nombre del alumno: " + listaAlumnos.get(i).nombre);
            System.out.println("Edad del alumno: " + listaAlumnos.get(i).edad);
            System.out.println("Calificación del alumno: " + listaAlumnos.get(i).calificacion);
        }
    }

    public static void escribeFicheroAlumnosBinario(List<FichaAlumno> listaAlumnos, String nombreFichero)
    {
        int numeroDeAlumnos = listaAlumnos.size();
        String nombreAlumno;
        int edadAlumno, i;
        double calificacionAlumno;

        try
        {
            FileOutputStream fos = new FileOutputStream(nombreFichero + ".bin");
            DataOutputStream dos = new DataOutputStream(fos);

            dos.writeInt(numeroDeAlumnos);

            for(i = 0; i < listaAlumnos.size(); i++)
            {
                nombreAlumno = listaAlumnos.get(i).nombre;
                dos.writeUTF(nombreAlumno);

                edadAlumno = listaAlumnos.get(i).edad;
                dos.writeInt(edadAlumno);

                calificacionAlumno = listaAlumnos.get(i).calificacion;
                dos.writeDouble(calificacionAlumno);
            }

            dos.close();
            fos.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void leeFicheroAlumnosBinario(List<FichaAlumno> listaAlumnos, String nombreFichero)
    {
        int numeroDeResgistros;
        String nombreAlumno;
        int edadAlumno, i;
        double calificacionAlumno;

        listaAlumnos.clear();

        try
        {
            FileInputStream fis = new FileInputStream(nombreFichero + ".bin");
            DataInputStream dis = new DataInputStream(fis);

            numeroDeResgistros = dis.readInt();

            for(i = 0; i < numeroDeResgistros; i++)
            {
                nombreAlumno = dis.readUTF();
                edadAlumno = dis.readInt();
                calificacionAlumno = dis.readDouble();

                FichaAlumno fa = new FichaAlumno();
                fa.nombre = nombreAlumno;
                fa.edad = edadAlumno;
                fa.calificacion = calificacionAlumno;

                listaAlumnos.add(fa);
            }

            dis.close();
            fis.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void escribeFicheroAlumnosTexto(List<FichaAlumno> listaAlumnos, String nombreFicheroTexto)
    {
        int i, j, numeroDeRegistros = listaAlumnos.size();
        try
        {
            FileWriter ficheroAlumnos = new FileWriter(nombreFicheroTexto + ".txt");
            BufferedWriter dentroFichero = new BufferedWriter(ficheroAlumnos);

            dentroFichero.write(String.valueOf(numeroDeRegistros));
            dentroFichero.newLine();

            for(i = 0; i < listaAlumnos.size(); i++)
            {
                dentroFichero.write(listaAlumnos.get(i).nombre);
                dentroFichero.newLine();

                dentroFichero.write(String.valueOf(listaAlumnos.get(i).edad));
                dentroFichero.newLine();

                dentroFichero.write(String.valueOf(listaAlumnos.get(i).calificacion));
                dentroFichero.newLine();
            }

            dentroFichero.close();
            ficheroAlumnos.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void leeFicheroAlumnosTexto(List<FichaAlumno> listaAlumnos, String nombreFicheroTexto)
    {
        int numeroDeResgistros;
        String nombreAlumno;
        int edadAlumno, i;
        double calificacionAlumno;

        listaAlumnos.clear();

        try
        {
            FileReader archivoALeer = new FileReader(nombreFicheroTexto + ".txt");
            BufferedReader leyendoArchivo = new BufferedReader(archivoALeer);

            numeroDeResgistros = Integer.valueOf(leyendoArchivo.readLine());

            for(i = 0; i < numeroDeResgistros; i++)
            {
                nombreAlumno = leyendoArchivo.readLine();
                edadAlumno = Integer.valueOf(leyendoArchivo.readLine());
                calificacionAlumno = Double.valueOf(leyendoArchivo.readLine());

                FichaAlumno fa = new FichaAlumno();
                fa.nombre = nombreAlumno;
                fa.edad = edadAlumno;
                fa.calificacion = calificacionAlumno;

                listaAlumnos.add(fa);
            }

            leyendoArchivo.close();
            archivoALeer.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void escribeFicheroAlumnosCSV(List<FichaAlumno> listaAlumnos, String nombreFicheroCSV)
    {
        int i, numeroDeRegistros = listaAlumnos.size();
        try
        {
            FileWriter ficheroAlumnos = new FileWriter(nombreFicheroCSV + ".csv");
            BufferedWriter dentroFichero = new BufferedWriter(ficheroAlumnos);

            dentroFichero.write(String.valueOf(numeroDeRegistros));
            dentroFichero.newLine();

            for(i = 0; i < listaAlumnos.size(); i++)
            {
                dentroFichero.write(listaAlumnos.get(i).nombre + ";");

                dentroFichero.write(String.valueOf(listaAlumnos.get(i).edad + ";"));

                dentroFichero.write(String.valueOf(listaAlumnos.get(i).calificacion + ";"));
            }

            dentroFichero.close();
            ficheroAlumnos.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void leeFicheroAlumnosCSV(List<FichaAlumno> listaAlumnos, String nombreFicheroCSV)
    {
        String registros;
        String nombreAlumno;
        int edadAlumno, i;
        double calificacionAlumno;
        String[] diferentesCampos;

        listaAlumnos.clear();

        try
        {
            FileReader archivoALeer = new FileReader(nombreFicheroCSV + ".csv");
            BufferedReader leyendoArchivo = new BufferedReader(archivoALeer);

            registros = leyendoArchivo.readLine();

            while (registros != null)
            {
                diferentesCampos = registros.split(";");

                nombreAlumno = diferentesCampos[0];
                edadAlumno = Integer.valueOf(diferentesCampos[1]);
                calificacionAlumno = Double.valueOf(diferentesCampos[2]);

                FichaAlumno fa = new FichaAlumno();
                fa.nombre = nombreAlumno;
                fa.edad = edadAlumno;
                fa.calificacion = calificacionAlumno;

                listaAlumnos.add(fa);

                registros = leyendoArchivo.readLine();
            }

            leyendoArchivo.close();
            archivoALeer.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

     List<FichaAlumno> listaAlumnos = new ArrayList<>();

     int opcion = -1;
     Scanner sc = new Scanner(System.in);

     while (opcion != 0)
     {
         System.out.println("***************************************");
         System.out.println("*  EJERCICIOS FICHEROS CON REGISTROS  *");
         System.out.println("***************************************");
         System.out.println("* 1.- leeAlumnoLista                | *");
         System.out.println("* 2.- imprimeListaAlumnos           | *");
         System.out.println("* 3.- escribeFicheroAlumnosBinario  | *");
         System.out.println("* 4.- leeFicheroAlumnosBinario      | *");
         System.out.println("* 5.- escribeFicheroAlumnosTexto    | *");
         System.out.println("* 6.- leeFicheroAlumnosTexto        | *");
         System.out.println("* 7.- escribeFicheroAlumnosCSV      | *");
         System.out.println("* 8.- leeFicheroAlumnosCSV          | *");
         System.out.println("***************************************");
         System.out.println("*        PARA SALIR PULSE -> 0        *");
         System.out.println("***************************************");
         System.out.println();
         System.out.print("¿Qué función quieres ejecutar? ");
         opcion = sc.nextInt();

         switch (opcion)
         {
             case 1:

                 leeAlumnosLista(listaAlumnos);

             break;
             case 2:

                 imprimeListaAlumnos(listaAlumnos);
                 break;
             case 3:
             {
                 String nombreFichero = "ficheroBinarioRegistros";
                 escribeFicheroAlumnosBinario(listaAlumnos,nombreFichero);
             }
                 break;
             case 4:
             {
                 String nombreFichero = "ficheroBinarioRegistros";
                 leeFicheroAlumnosBinario(listaAlumnos,nombreFichero);
             }
             break;
             case 5:
             {
                 String nombreFichero = "ficheroTextoRegistros";
                 escribeFicheroAlumnosTexto(listaAlumnos,nombreFichero);
             }
             break;
             case 6:
             {
                 String nombreFichero = "ficheroBinarioRegistros";
                 leeFicheroAlumnosTexto(listaAlumnos,nombreFichero);
             }
             break;
             case 7:
             {
                 String nombreFichero = "ficheroCSVRegistros";
                 escribeFicheroAlumnosCSV(listaAlumnos,nombreFichero);
             }
             break;
             case 8:
             {
                 String nombreFichero = "ficheroCSVRegistros";
                 leeFicheroAlumnosCSV(listaAlumnos,nombreFichero);
             }
             break;
             default:
                 System.out.println("Ha terminado con el registro.");
         }
     }



    }
}

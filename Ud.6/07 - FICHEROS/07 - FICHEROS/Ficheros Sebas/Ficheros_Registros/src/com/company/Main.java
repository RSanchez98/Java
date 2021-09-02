package com.company;

import java.io.*;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main
{

    public static void leeAlumnoLista(List<FichaAlumno> lista)
    {
        Scanner sc = new Scanner(System.in);
        String nombre;
        int edad;
        Double calificacion;

        System.out.print("Dime el nombre del alumno: ");
        nombre = sc.next();
        System.out.print("Dime la edad del alumno: ");
        edad = sc.nextInt();
        System.out.print("Dime la calificación del alumno: ");
        calificacion = sc.nextDouble();

        FichaAlumno f = new FichaAlumno();
        f.nombre = nombre;
        f.edad = edad;
        f.calificacion = calificacion;

        lista.add(f);
    }
    public static void imprimeListaAlumnos(List<FichaAlumno> lista)
    {
        int i;

        for (i = 0; i < lista.size(); i++)
        {
            System.out.println("Nombre: " + lista.get(i).nombre);
            System.out.println("Edad: " + lista.get(i).edad);
            System.out.println("Calificación: " + lista.get(i).calificacion);
        }
    }
    public static void escribeFicheroAlumnosBinario(List<FichaAlumno> lista, String fichero)
    {
        int i;
        try
        {
            FileOutputStream fos = new FileOutputStream(fichero + ".bin");
            DataOutputStream dos = new DataOutputStream(fos);

            dos.writeInt(lista.size());

            for (i = 0; i < lista.size(); i++)
            {
                dos.writeUTF(lista.get(i).nombre);
                dos.writeInt(lista.get(i).edad);
                dos.writeDouble(lista.get(i).calificacion);
            }

            dos.close();
            fos.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    public static void leeFicheroAlumnosBinario(List<FichaAlumno> lista, String fichero)
    {
        int num, i;
        lista.clear();

        try
        {
            FileInputStream fis = new FileInputStream(fichero + ".bin");
            DataInputStream dis = new DataInputStream(fis);

            num = dis.readInt();

            for (i = 0; i < num; i++)
            {
                String nombre = dis.readUTF();
                int edad = dis.readInt();
                Double calificacion = dis.readDouble();

                FichaAlumno f = new FichaAlumno();
                f.nombre = nombre;
                f.edad = edad;
                f.calificacion = calificacion;

                lista.add(f);
            }

            dis.close();
            fis.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    public static void escribeFicheroAlumnosTexto(List<FichaAlumno> lista, String fichero)
    {
        int i;

        try
        {
            FileWriter fw = new FileWriter(fichero + ".txt");
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write(String.valueOf(lista.size()));
            bw.newLine();

            for (i = 0; i < lista.size(); i++)
            {
                bw.write(lista.get(i).nombre);
                bw.newLine();
                bw.write(String.valueOf(lista.get(i).edad));
                bw.newLine();
                bw.write(String.valueOf(lista.get(i).calificacion));
                bw.newLine();
            }

            bw.close();
            fw.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    public static void leeFicheroAlumnosTexto(List<FichaAlumno> lista, String fichero)
    {
        int i, num;
        lista.clear();

        try
        {
            FileReader fr = new FileReader(fichero + ".txt");
            BufferedReader br = new BufferedReader(fr);

            num = Integer.valueOf(br.readLine());

            for (i = 0; i < num; i++)
            {
                String nombre = br.readLine();
                int edad = Integer.valueOf(br.readLine());
                Double calificacion = Double.valueOf(br.readLine());

                FichaAlumno f = new FichaAlumno();
                f.nombre = nombre;
                f.edad = edad;
                f.calificacion = calificacion;

                lista.add(f);
            }

            br.close();
            fr.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    public static void escribeFicheroAlumnosCSV(List<FichaAlumno> lista, String fichero)
    {
        int i;

        try
        {
            FileWriter fw = new FileWriter(fichero + ".csv");
            BufferedWriter bw = new BufferedWriter(fw);

            for (i = 0; i < lista.size(); i++)
            {
                bw.write(lista.get(i).nombre + ";");
                bw.write(String.valueOf(lista.get(i).edad) + ";");
                bw.write(String.valueOf(lista.get(i).calificacion) + ";");
                bw.newLine();
            }

            bw.close();
            fw.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    public static void leeFicheroAlumnosCSV(List<FichaAlumno> lista, String fichero)
    {
        String s;
        String[] campos;
        lista.clear();

        try
        {
            FileReader fr = new FileReader(fichero + ".csv");
            BufferedReader br = new BufferedReader(fr);

            s = br.readLine();

            while (s != null)
            {
                campos = s.split(";");

                String nombre = campos[0];
                int edad = Integer.valueOf(campos[1]);
                double calificacion = Double.valueOf(campos[2]);

                FichaAlumno f = new FichaAlumno();
                f.nombre = nombre;
                f.edad = edad;
                f.calificacion = calificacion;

                lista.add(f);

                s = br.readLine();
            }

            br.close();
            fr.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void main(String[] args)
    {
        List<FichaAlumno> listaAlumnos = new ArrayList<>();

        int opcion = -1;
        Scanner sc = new Scanner(System.in);

        while (opcion != 0)
        {
            System.out.println("MENÚ DE FICHEROS CON REGISTROS");
            System.out.println("==============================");
            System.out.println("1.- LeeAlumnoLista");
            System.out.println("2.- ImprimeListaAlumnos");
            System.out.println("3.- EscribeFicheroAlumnosBinario");
            System.out.println("4.- LeeFicheroAlumnosBinario");
            System.out.println("5.- EscribeFicheroAlumnosTexto");
            System.out.println("6.- LeeFicheroAlumnosTexto");
            System.out.println("7.- EscribeFicheroAlumnosCSV");
            System.out.println("8.- LeeFicheroAlumnosCSV");
            System.out.println();
            System.out.println("Salir = 0");
            System.out.println();
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            switch (opcion)
            {
                case 1:

                    leeAlumnoLista(listaAlumnos);

                break;

                case 2:

                    imprimeListaAlumnos(listaAlumnos);

                break;

                case 3:
                {
                    String fichero;

                    System.out.println("Nombre del fichero para escribir en él (.bin): ");
                    fichero = sc.next();

                    escribeFicheroAlumnosBinario(listaAlumnos, fichero);
                }
                break;

                case 4:
                {
                    String fichero;

                    System.out.println("Nombre del fichero para leerlo (.bin): ");
                    fichero = sc.next();

                    leeFicheroAlumnosBinario(listaAlumnos, fichero);
                }
                break;

                case 5:
                {
                    String fichero;

                    System.out.println("Nombre del fichero para escribir en él (.txt): ");
                    fichero = sc.next();

                    escribeFicheroAlumnosTexto(listaAlumnos, fichero);
                }
                break;

                case 6:
                {
                    String fichero;

                    System.out.println("Nombre del fichero para leerlo (.txt): ");
                    fichero = sc.next();

                    leeFicheroAlumnosTexto(listaAlumnos, fichero);
                }
                break;

                case 7:
                {
                    String fichero;

                    System.out.println("Nombre del fichero para escribir en él (.csv): ");
                    fichero = sc.next();

                    escribeFicheroAlumnosCSV(listaAlumnos, fichero);
                }
                break;

                case 8:
                {
                    String fichero;

                    System.out.println("Nombre del fichero para leerlo (.csv): ");
                    fichero = sc.next();

                    leeFicheroAlumnosCSV(listaAlumnos, fichero);
                }
                break;

            }
        }
    }
}


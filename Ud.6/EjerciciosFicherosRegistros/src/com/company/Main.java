package com.company;

import javafx.scene.shape.FillRule;

import java.io.*;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        List<FichaAlumno> listaAlumnos = new ArrayList<FichaAlumno>();

        int ejercicio = -1;
        while (ejercicio != 0)
        {
            System.out.println("********MENÚ********");
            System.out.println();
            System.out.println("Ejercicio 1");
            System.out.println("Ejercicio 2");
            System.out.println("Ejercicio 3");
            System.out.println("Ejercicio 4");
            System.out.println("Ejercicio 5");
            System.out.println("Ejercicio 6");
            System.out.println("Ejercicio 7");
            System.out.println("Ejercicio 8");
            System.out.println();
            System.out.print("Elige un ejercicio: ");
            ejercicio = sc.nextInt();
            System.out.println();
            System.out.println("******** EJERCICIO " + ejercicio + " ********");


            switch (ejercicio)
            {
                case 1: //leeAlumnoLista
                {
                    leeAlumnoLista(listaAlumnos);
                }
                break;
                case 2: //imprimeListaAlumnos
                {
                    imprimeListaAlumnos(listaAlumnos);
                }
                break;
                case 3: //escribeFicheroAlumnosBinario
                {
                    escribeFicheroAlumnoBinario(listaAlumnos, "ficheroRegistros.bin");
                }
                break;
                case 4: //leeFicheroAlumnoBinario()

                {
                    leeFicheroAlumnoBinario(listaAlumnos, "ficheroRegistros.bin");
                }
                break;
                case 5: //escribeFicheroAlumnosTexto
                {
                    escribeFicheroAlumnosTexto(listaAlumnos, "escribeFicheroAlumnosTexto.txt");
                }
                break;
                case 6: //leeFicherosAlumnoTexto
                {
                    leeFicheroAlumnosTexto(listaAlumnos, "ficheroRegistros.bin");
                }
                break;
                case 7: //escribeFicheroAlumnosCSV
                {
                    escribeFicheroAlumnosCSV(listaAlumnos, "ficheroCSVRegistros.csv");
                }
                break;
                case 8: //leeFicheroAlumnosCSV
                {
                    leeficheroAlumnosCSV(listaAlumnos, "ficheroCSVRegistros.csv");
                }
                break;
            }
        }
    }

    /*1.*//*Escribe una función leeAlumnoLista a la que le pasas la lista de
    alumnos y te pide un nuevo alumno desde el teclado, cuyos datos se
    añadirán a la lista.*/
    private static void leeAlumnoLista(List<FichaAlumno> listaAlumnos)
    {
        Scanner sc = new Scanner(System.in);
        String nombre;
        int edad;
        double calificacion;
        System.out.print("Nombre: ");
        nombre = sc.nextLine();
        System.out.print("Edad: ");
        edad = sc.nextInt();
        System.out.print("Calificación: ");
        calificacion = sc.nextDouble();

        FichaAlumno fa = new FichaAlumno();

        fa.nombre=nombre;
        fa.edad=edad;
        fa.nota=calificacion;

        listaAlumnos.add(fa);
    }

    /*2.*//*Escribe una función imprimeListaAlumnos a la que la pasas la lista
    de alumnos y te la imprime por pantalla.*/
    private static void imprimeListaAlumnos(List<FichaAlumno> listaAlumnos)
    {
        int i;
        for (i = 0; i < listaAlumnos.size(); i++)
        {
            System.out.println("· Nombre del alumno: "+listaAlumnos.get(i).nombre);
            System.out.println("· Edad del alumno: "+listaAlumnos.get(i).edad);
            System.out.println("· Nota del alumno: "+listaAlumnos.get(i).nota);
            System.out.println("···································");
        }
    }

    /*3.*//*Escribe una función escribeFicheroAlumnosBinario a la que le pasas la
    lista y el nombre del fichero y te escribe la lista en el fichero. La estructura
    del fichero será la siguiente:
        - Al principio habrá un entero que será el número de alumnos que hay en
          la lista.
        - Después irán los registros, escribiéndose un String para el nombre, un int
          para la edad y un double para la nota.
        - Iremos escribiendo todos los registros uno a uno hasta el final.*/
    private static void escribeFicheroAlumnoBinario(List<FichaAlumno> listaAlumnos, String fichero)
    {
        int numeroDeAlumnos = listaAlumnos.size();
        String nombre;
        int edad;
        double nota;
        try
        {
            FileOutputStream fos = new FileOutputStream(fichero);
            DataOutputStream dos = new DataOutputStream(fos);
            int i;
            dos.writeInt(numeroDeAlumnos);

            for (i = 0; i < listaAlumnos.size(); i++)
            {
                nombre = listaAlumnos.get(i).nombre;
                dos.writeUTF(nombre);
                
                edad = listaAlumnos.get(i).edad;
                dos.writeInt(edad);
                
                nota = listaAlumnos.get(i).nota;
                dos.writeDouble(nota);
            }
            dos.close();
            fos.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }

    /*4.*//*Escribe una función leeFicheroAlumnosBinario a la que le pasas una lista y
    el nombre del fichero y leerá la lista desde el fichero. El fichero tendrá la misma
    estructura que el del ejercicio anterior (evidentemente). La lista que nos pasen la
    borraremos antes de leer los datos del fichero.

    Para poder meter el alumno en la lista primero tendremos que crear un registro de
    tipo FichaAlumno:

    FichaAlumno fa = new FichaAlumno();

    Guardaremos los tres valores que hemos leído en el registro y lo añadiremos a la lista.*/
    private static void leeFicheroAlumnoBinario(List<FichaAlumno> listaAlumnos, String fichero)
    {
        int registros, i;
        String nombre;
        int edad;
        double nota;

        listaAlumnos.clear();
        try
        {
            FileInputStream fis = new FileInputStream(fichero);
            DataInputStream dis = new DataInputStream(fis);

            registros = dis.readInt();
            for (i = 0; i < registros; i++)
            {
                nombre = dis.readUTF();     //leemos los datos que vamos a meter
                edad = dis.readInt();
                nota = dis.readDouble();

                FichaAlumno fa = new FichaAlumno(); //creamos el registro

                fa.nombre = nombre;     //le decimos que en el registro de nombre va el dato nombre
                fa.edad = edad;
                fa.nota = nota;

                listaAlumnos.add(fa);   //añadimos a la listaalumno, los datos del registro fa
            }

            dis.close();
            fis.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    /*5.*//*Escribe la función escribeFicheroAlumnosTexto similar a la función del
    ejercicio 3 pero usando un fichero de texto. La estructura del fichero será similar,
    pero ahora guardaremos un valor en cada línea. */
    private static void escribeFicheroAlumnosTexto(List<FichaAlumno> listaAlumnos, String fichero)
    {
        int i, registros=listaAlumnos.size();
        try
        {
            FileWriter fw = new FileWriter(fichero);
            BufferedWriter bw = new BufferedWriter(fw);


            bw.write(String.valueOf(registros));
            bw.newLine();

            for (i = 0; i < listaAlumnos.size(); i++)
            {
                bw.write(listaAlumnos.get(i).nombre);
                bw.newLine();

                bw.write(String.valueOf(listaAlumnos.get(i).edad));
                bw.newLine();

                bw.write(String.valueOf(listaAlumnos.get(i).nota));
                bw.newLine();
            }

            bw.close();
            fw.close();

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    /*6.*//*Escribe la función leeFicheroAlumnosTexto similar a la función del ejercicio
    4 pero que funciona con los ficheros de texto del ejercicio anterior.*/
    private static void leeFicheroAlumnosTexto(List<FichaAlumno> listaAlumnos, String fichero)
    {
        int registro, i;
        String nombre;
        int edad;
        double nota;

        listaAlumnos.clear();
        try
        {
            FileReader fr = new FileReader(fichero);
            BufferedReader br = new BufferedReader(fr);

            registro = Integer.valueOf(br.readLine());

            for (i = 0; i < registro; i++)
            {
                nombre = br.readLine();
                edad = Integer.valueOf(br.readLine());
                nota = Integer.valueOf(br.readLine());

                FichaAlumno fa = new FichaAlumno();
                fa.nombre=nombre;
                fa.edad=edad;
                fa.nota=nota;

                listaAlumnos.add(fa);
            }

            br.close();
            fr.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    /*7.*//*Escribe la función escribeFicheroAlumnosCSV. En este caso, no vamos a guardar el
    número de registros en la primera línea, ya que los ficheros CSV estándar no lo hacen.
    Como carácter separador usaremos el punto y coma, ya que uno de los datos que
    usamos ya contiene comas.*/
    private static void escribeFicheroAlumnosCSV(List<FichaAlumno> listaAlumnos, String fichero)
    {
        try
        {
            FileWriter fw = new FileWriter(fichero);
            BufferedWriter bw = new BufferedWriter(fw);

            int i;
            for (i = 0; i < listaAlumnos.size(); i++)
            {
                bw.write(listaAlumnos.get(i).nombre+";");
                bw.write(listaAlumnos.get(i).edad+";");
                bw.write(String.valueOf(listaAlumnos.get(i).nota).replace('.', ','));
                bw.newLine();
            }

            bw.close();
            fw.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    /*8.*//*Escribe la función leeFicheroAlumnosCSV que lee los datos del fichero
    anterior en una lista. Para separar los datos, lo más fácil es usar la función
    Split de las cadenas. Con esto conseguiremos un array de cadenas compuesto por
    tres cadenas: “Nombre”, “Edad”, “Calificación”, que tendremos que convertir al
    tipo de dato adecuado y meter en un registro FichaAlumno y luego en la lista.*/
    private static void leeficheroAlumnosCSV(List<FichaAlumno> listaAlumnos, String fichero)
    {
        String nombre, registros;
        int edad;
        double nota;
        String[]campos;

        listaAlumnos.clear();

        try
        {
            FileReader fr = new FileReader(fichero);
            BufferedReader br = new BufferedReader(fr);

            registros=br.readLine();
            while (registros != null)
            {
                campos = registros.split(";");
                nombre = campos[0];
                edad = Integer.valueOf(campos[1]);
                nota = Integer.valueOf(campos[2]);

                FichaAlumno fa = new FichaAlumno();
                fa.nombre=nombre;
                fa.edad=edad;
                fa.nota=nota;

                listaAlumnos.add(fa);

                registros=br.readLine();

            }
            br.close();
            fr.close();

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}

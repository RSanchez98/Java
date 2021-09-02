package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main
{
    public static int cuantosFicheros(String extension)
    {
        int i, cont = 0;
        File directorio = new File("C:\\Windows");
        File[] ficheros = directorio.listFiles();

        for(i = 0; i < ficheros.length; i++)
        {
            if(ficheros[i].isFile() && (ficheros[i].getName().endsWith(extension)))
            {
                System.out.println(ficheros[i].getName());
                cont++;
            }
        }
        return cont;
    }
    public static int cuantosFicherosPro(String extension, String carpeta)
    {
        int i, cont = 0;

        File directorio = new File(carpeta);
        File[] ficheros = directorio.listFiles();

        for (i = 0; i < ficheros.length; i++)
        {
            if (ficheros[i].isFile() && ficheros[i].getName().endsWith(extension))
            {
                System.out.println(ficheros[i].getName());
                cont++;
            }
        }
        return cont;
    }
    public static void creaBackup(String fichero)
    {
        String ficheroCopia = fichero + ".bak";

        try
        {
            if (Files.exists(Paths.get(fichero)))
            {
                while (Files.exists(Paths.get(ficheroCopia)))
                {
                    ficheroCopia = ficheroCopia + ".bak";
                }
            }
            Files.copy(Paths.get(fichero), Paths.get(ficheroCopia));
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    public static void renombraMasivo(String extension1, String extension2)
    {
        int i, tam;
        String nuevoFichero;
        String fichero;
        tam = extension1.length();

        File directorio = new File("C:\\Users\\Sebas\\Desktop");
        File[] ficheros = directorio.listFiles();

        for (i = 0; i < ficheros.length; i++)
        {
           if (ficheros[i].isFile())
            {
                fichero = ficheros[i].getAbsolutePath();
                //Para coger toda la ruta se pone getAbsolutePath();

                if (fichero.endsWith(extension1))
                {
                    try
                    {
                        nuevoFichero = fichero.substring(0, fichero.length() - tam);
                        nuevoFichero = nuevoFichero + extension2;
                        System.out.println("nombreAntiguo = " + fichero);
                        System.out.println("nombreNuevo = " + nuevoFichero);
                        Files.move(Paths.get(fichero), Paths.get(nuevoFichero));
                    }
                    catch (Exception e)
                    {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
    public static int cuentaLineasFicheros(String extension)
    {
        int i, cont = 0;

        File directorio = new File("C:\\Users\\Sebas\\Desktop");
        File[] ficheros = directorio.listFiles();

        for (i = 0; i < ficheros.length; i++)
        {
            if (ficheros[i].isFile())
            {
                if (ficheros[i].getName().endsWith(extension))
                {
                    String lineas;
                    String fichero = ficheros[i].getAbsolutePath();
                    try
                    {
                        FileReader fr = new FileReader(fichero);
                        BufferedReader br = new BufferedReader(fr);

                        lineas = br.readLine();

                        while(lineas != null)
                        {
                            cont++;
                            lineas = br.readLine();
                        }

                        br.close();
                        fr.close();
                    }
                    catch (Exception e)
                    {
                        e.printStackTrace();
                    }
                }
            }
        }
        return cont;
    }
    public static String ficheroMasGrande()
    {
        int i;
        long max = -1;
        String ficheroMax = "";

        File directorio = new File("C:\\Users\\Sebas\\Desktop");
        File[] ficheros = directorio.listFiles();

        for (i = 0; i < ficheros.length; i++)
        {
            if (ficheros[i].isFile())
            {
                long tamanno = ficheros[i].length();

                if (tamanno > max)
                {
                    max = tamanno;
                    ficheroMax = ficheros[i].getName();
                }
            }
        }
        return ficheroMax;
    }
    public static void clasificaFicheros()
    {
        int i, cont = 0;
        List<String> lista = new ArrayList<>();
        List<String> extension = new ArrayList<>();

        File directorio = new File("C:\\Users\\Sebas\\Desktop");
        File[] ficheros = directorio.listFiles();

        for (i = 0; i < ficheros.length; i++)
        {
            if (ficheros[i].isFile())
            {
                lista.add(ficheros[i].getName());
            }
        }

        for (i = 0; i < lista.size(); i++)
        {
            extension.add(lista.get(i).substring(lista.get(i).indexOf(".")));
        }

        Collections.sort(extension);
        System.out.println(extension);

        for (i = 0; i < extension.size() - 1; i++)
        {
            if (extension.get(i).equals(extension.get(i + 1)))
            {
                cont++;
            }
            System.out.println(extension.get(i) + " = " + cont);
        }
    }

    public static void main(String[] args)
    {
        int opcion;
        Scanner sc = new Scanner(System.in);

        System.out.println("MENÚ DE FICHEROS Y DIRECTORIOS");
        System.out.println("==============================");
        System.out.println("1.- CuantosFicheros");
        System.out.println("2.- CuantosFicherosPro");
        System.out.println("3.- CreaBackup");
        System.out.println("4.- RenombraMasivo");
        System.out.println("5.- CuentaLineasFicheros");
        System.out.println("6.- FicheroMasGrande");
        System.out.println("7.- ClasificaFicheros");
        System.out.println();
        System.out.print("Elige una opción: ");
        opcion = sc.nextInt();

        switch (opcion)
        {
            case 1:
            {
                String extension;
                System.out.println("Dime la extensión: ");
                extension = sc.next();
                System.out.println("Hay " + cuantosFicheros(extension) + " ficheros con la extensión ." + extension);
            }
            break;

            case 2:
            {
                String extension, directorio;
                System.out.println("Dime el directorio: ");
                directorio = sc.next();
                System.out.println("Dime la extensión: ");
                extension = sc.next();
                System.out.println("Hay " + cuantosFicherosPro(extension, directorio) + " ficheros con la extensión ." + extension + " en el directorio " + directorio);
            }
            break;

            case 3:
            {
                creaBackup("C:\\Users\\Sebas\\Desktop\\fichero.txt");
            }
            break;

            case 4:
            {
                String extension1, extension2;
                System.out.println("Extensión antigua: ");
                extension1 = sc.next();
                System.out.println("Extensión nueva: ");
                extension2 = sc.next();
                renombraMasivo(extension1, extension2);
            }
            break;

            case 5:
            {
                String extension;
                System.out.println("Dime la extensión (preferible .txt): ");
                extension = sc.next();
                System.out.println("Hay " + cuentaLineasFicheros(extension) + " líneas");
            }
            break;

            case 6:
            {
                System.out.println("El fichero más grande de dicho directorio es: " + ficheroMasGrande());
            }
            break;

            case 7:
            {
                clasificaFicheros();
            }
            break;

            default:
            {
                System.out.println("Error");
            }
            break;
        }
    }
}

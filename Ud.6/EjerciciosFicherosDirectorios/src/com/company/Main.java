package com.company;

import javax.tools.DiagnosticListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.ref.PhantomReference;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int ejercicio;
        System.out.println("********MENÚ********");
        System.out.println();
        System.out.println("Ejercicio 1");
        System.out.println("Ejercicio 2");
        System.out.println("Ejercicio 3");
        System.out.println("Ejercicio 4");
        System.out.println("Ejercicio 5");
        System.out.println("Ejercicio 6");
        System.out.println("Ejercicio 7");
        System.out.println();
        System.out.print("Elige un ejercicio: ");
        ejercicio = sc.nextInt();
        System.out.println();
        System.out.println("******** EJERCICIO " + ejercicio + " ********");

        switch (ejercicio)
        {
            case 1: //cuantosFicheros
            {
                System.out.println("Existen " + cuantosFicheros("txt") + " fichero/s txt en el directorio acutal");
            }
            break;
            case 2: //cuantosFicherosPro
            {
                System.out.println("Existen " + cuantosFicherosPro(".txt", "C:\\Windows") + " fichero/s txt en la carpeta de Windows");
            }
            break;
            case 3: //creaBackup
            {
                creaBackup("texto.txt");
            }
            break;
            case 4: //renombraMasivo
            {
                renombraMasivo(".txt", ".texto");
            }
            break;
            case 5: //
            {
                System.out.println("Entre todos los ficheros hay " + cuentaLineasFicheros("txt") + " linea/s escrita/s");

            }
            break;
            case 6: //ficheroMasGrande
            {
                System.out.println("El fichero con mas peso que hay en la carpeta es: ");
                System.out.print("<<" + ficheroMasGrande(".\\ficheros") + ">>");
            }
            break;
            case 7: //clasificaFicheros
            {
                clasificaFicheros(".\\ficheros");
            }
            break;
        }
    }


    /*1.*//*Escribe la función cuantosFicheros a la que le pasas una extensión
    de archivo y te devuelve un entero que nos dice cuántos ficheros con esa
    extensión hay en el directorio actual.
    Ej.: CuantosFicheros(“txt”) nos dirá cuántos ficheros .txt hay.*/
    private static int cuantosFicheros(String fichero)
    {
        int i, cont = 0;
        File directorio = new File(".");
        File[] arrayFichero = directorio.listFiles();

        for (i = 0; i < arrayFichero.length; i++)
        {
            if (arrayFichero[i].isFile())
            {
                if (arrayFichero[i].getName().endsWith(".txt"))
                {
                    cont++;
                }
            }
        }
        return cont;
    }

    /*2.*//*Escribe la función cuantosFicherosPro a la que le pasas una
    extensión de archivo y una carpeta y te dice cuántos archivos con esa
    extensión hay en esa carpeta.
    Ej.: CuantosFicherosPro(“txt”, “C:\\Windows”) nos dirá cuántos ficheros .txt
    hay en la carpeta C:\Windows.*/
    private static int cuantosFicherosPro(String extension, String ruta)
    {
        File directorio = new File(ruta);
        File[] arrayFichero = directorio.listFiles();
        int i, cont = 0;
        for (i = 0; i < arrayFichero.length; i++)
        {
            if (arrayFichero[i].isFile())
            {
                if (arrayFichero[i].getName().endsWith(extension))
                {
                    cont++;
                }
            }
        }
        return cont;
    }

    /*3.*//*Escribe la función creaBackup a la que le pasas un nombre de
    fichero. La función copiará ese fichero en otro al que le añadiremos la
    extensión “.bak” (para tener una copia de seguridad). Si el nuevo fichero
    existe, le añadiremos otra vez “.bak” hasta que encontremos un nombre de
    fichero disponible.
    Ej.: CreaBackup(“texto.txt”) copiará el fichero texto.txt a texto.txt.bak.
    Si este nombre existe, lo copiará a texto.txt.bak.bak, etc.*/
    private static void creaBackup(String fichero)
    {
        File directorio = new File(".");
        File[] arrayFichero = directorio.listFiles();

        String ficheroCopia = fichero + ".bak";
        try
        {
            if (Files.exists(Path.of(fichero)))
            {
                while (Files.exists(Path.of(ficheroCopia)))
                {
                    ficheroCopia = ficheroCopia + ".bak";
                }
            }
            Files.copy(Path.of(fichero), Path.of(ficheroCopia));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    /*4.*//*Escribe la función renombraMasivo a la que le pasas dos extensiones
     de fichero. La función te renombrará todos los ficheros que haya en el
     directorio actual con la primera extensión y les pondrá la segunda
     extensión.
     Ej.: RenombraMasivo(“txt”, “texto”) renombrará todos los ficheros *.txt
     a *.texto.*/
    private static void renombraMasivo(String extensionOriginal, String extensionNueva)
    {
        File directorio = new File(".\\ficheros");
        File[] arrayFichero = directorio.listFiles();
        int i;
        String nombreViejo, nombreNuevo;

        for (i = 0; i < arrayFichero.length; i++)
        {
            nombreViejo = arrayFichero[i].getAbsolutePath();

            if (nombreViejo.contains("."))
            {
                if (nombreViejo.endsWith(extensionOriginal))
                {
                    nombreNuevo = nombreViejo.substring(0, nombreViejo.lastIndexOf("."));
                    nombreNuevo = nombreNuevo + extensionNueva;

                    File ficheroNuevo = new File(nombreNuevo);
                    arrayFichero[i].renameTo(ficheroNuevo);
                }
            }
        }
    }

    /*5.*//*Escribe la función cuentaLineasFicheros a la que le pasas una
    extensión y te cuenta el total de líneas que hay entre todos los ficheros
    con esa extensión que hay en la carpeta actual (esos ficheros deberían
    ser de texto, que si no va a contar poco). El resultado te lo devolverá
    en un entero.
    Ej.: CuentaLineasFicheros(“txt”) te suma las líneas que tienen todos los
    ficheros .txt de la carpeta actual.*/
    private static int cuentaLineasFicheros(String extension)
    {
        int i, contador = 0;
        String ruta, linea;

        File directorio = new File(".");
        File[] arrayListado = directorio.listFiles();

        for (i = 0; i < arrayListado.length; i++)
        {
            if (arrayListado[i].isFile())
            {
                if (arrayListado[i].getName().endsWith(extension))
                {
                    ruta = arrayListado[i].getAbsolutePath();
                    try
                    {
                        FileReader fr = new FileReader(ruta);
                        BufferedReader br = new BufferedReader(fr);

                        linea = br.readLine();

                        while (linea != null)
                        {
                            contador++;
                            linea = br.readLine();
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
        }

        return contador;
    }

    /*6.*//*Escribe la función ficheroMasGrande que nos devuelve una cadena
    con el nombre del fichero de mayor tamaño que haya en la carpeta actual*/
    private static String ficheroMasGrande(String carpeta)
    {
        File dir = new File(".\\ficheros");
        File[] arrayFicehro = dir.listFiles();
        String ficheroMasLargo = "";
        int i, grande = 0, pequenno;

        for (i = 0; i < arrayFicehro.length; i++)
        {
            pequenno = arrayFicehro[i].getName().length();
            if (pequenno > grande)
            {
                grande = pequenno;
                ficheroMasLargo = arrayFicehro[i].getName();
            }
        }
        return ficheroMasLargo;
    }

    /*7.*//*Escribe la función clasificaFicheros que te clasifica todos los
    ficheros que hay en la carpeta actual de acuerdo a su extensión.
    Ej.: Si en la carpeta actual están los ficheros: uno.txt, dos.txt, tres.exe,
    la función nos escribirá: txt => 2, exe => 1.
    La función no devolverá nada, sino que lo escribirá por pantalla con
    println directamente.*/
    private static void clasificaFicheros(String ubicado)
    {
        List<Integer> listaVeces = new ArrayList<>();
        List<String> listaExt = new ArrayList<>();

        int pos, i;
        String ext, fich;

        File dir = new File(ubicado);
        File[] ficheros = dir.listFiles();

        for (i = 0; i < ficheros.length; i++)
        {
            if (ficheros[i].isFile())
            {
                fich = ficheros[i].getName();
                if (fich.contains("."))
                {
                    pos = fich.lastIndexOf(".");
                    ext = fich.substring(pos+1);
                }
                else
                {
                    ext = "sin extension";
                }
                pos = listaExt.indexOf(ext);

                if (pos==-1)
                {
                    listaExt.add(ext);
                    listaVeces.add(1);
                }
                else
                {
                    listaVeces.set(pos, listaVeces.get(pos)+1);
                }
            }
        }
        for (i = 0; i < listaExt.size(); i++)
        {
            System.out.println(listaExt.get(i) +" --> "+ listaVeces.get(i));
        }
    }
}
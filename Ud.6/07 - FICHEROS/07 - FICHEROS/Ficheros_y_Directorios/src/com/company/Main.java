package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.net.PortUnreachableException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Main {

    public static int eligeFuncion(){
        Scanner sc = new Scanner(System.in);
        int opcion;

        System.out.println("***************************************");
        System.out.println("*  EJERCICIOS FICHEROS Y DIRECTORIOS  *");
        System.out.println("***************************************");
        System.out.println("* 1.- cuantosFicheros               | *");
        System.out.println("* 2.- cuantosFicherosPro            | *");
        System.out.println("* 3.- creaBackup                    | *");
        System.out.println("* 4.- renombraMasivo                | *");
        System.out.println("* 5.- cuentasLineasFicheros         | *");
        System.out.println("* 6.- ficheroMasGrande              | *");
        System.out.println("* 7.- clasificaFicheros             | *");
        System.out.println("***************************************");
        System.out.println();
        System.out.print("¿Qué función quieres ejecutar? ");
        System.out.println();
        opcion = sc.nextInt();

        return opcion;
    }

    public static int cuantosFicheros(String extensionArchivo)
    {
        int numeroTotalFicheros = 0, i;

        File directorio = new File("D:\\DAW\\01 - PROGRAMACIÓN");

        File[] listado = directorio.listFiles();

        for(i = 0; i < listado.length; i++)
        {
            if(listado[i].isFile() && (listado[i].getName().endsWith(extensionArchivo)))
            {
                System.out.println(listado[i].getName());
                numeroTotalFicheros++;
            }
        }

        return numeroTotalFicheros;
    }

    public static int cuantosFicherosPro(String extensionArchivo, String rutaCarpeta)
    {
        int numeroTotalFicheros = 0, i;

        File directorio = new File(rutaCarpeta);

        File[] listado = directorio.listFiles();

        for(i = 0; i < listado.length; i++)
        {
            if(listado[i].isFile() && (listado[i].getName().endsWith(extensionArchivo)))
            {
                System.out.println(listado[i].getName());
                numeroTotalFicheros++;
            }
        }

        return numeroTotalFicheros;
    }

    public static void creaBackup(String nombreFichero)
    {
        String nombreFicheroCopia = nombreFichero + ".bak";

        try
        {
            if(Files.exists(Paths.get(nombreFichero)))
            {
                while(Files.exists(Paths.get(nombreFicheroCopia)))
                {
                    nombreFicheroCopia = nombreFicheroCopia + ".bak";
                }
            }
            Files.copy(Paths.get(nombreFichero), Paths.get(nombreFicheroCopia));
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }

    public static void renombraMasivo(String extensionActual, String extensionQueQuiero)
    {
        int i, tamanoExtension = extensionActual.length();

        String fichero, nuevoFichero;

        File directorio = new File("D:\\DAW\\01 - PROGRAMACIÓN\\Distintos ficheros");

        File[] listado = directorio.listFiles();

        for(i = 0; i < listado.length; i++)
        {
            if(listado[i].isFile())
            {
                fichero = listado[i].getAbsolutePath();

                if(fichero.endsWith(extensionActual))
                {
                    try
                    {
                        nuevoFichero = fichero.substring(0, fichero.length() - tamanoExtension);
                        nuevoFichero = nuevoFichero + extensionQueQuiero;
                        System.out.println("nombre antiguo: " + fichero);
                        System.out.println("nombre actual: " + nuevoFichero);
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
        int numeroTotalLineas = 0, i;

        String linea, rutaFichero;

        File directorio = new File("D:\\DAW\\01 - PROGRAMACIÓN\\Distintos ficheros\\");

        File[] listado = directorio.listFiles();

        for(i = 0; i < listado.length; i++)
        {
            if(listado[i].isFile())
            {
                if(listado[i].getName().endsWith(extension))
                {
                    rutaFichero = listado[i].getAbsolutePath();
                    try
                    {
                        FileReader archivoALeer = new FileReader(rutaFichero);
                        BufferedReader leyendoArchivo = new BufferedReader(archivoALeer);

                        linea = leyendoArchivo.readLine();
                        while (linea != null)
                        {
                            numeroTotalLineas++;
                            linea = leyendoArchivo.readLine();
                        }

                        leyendoArchivo.close();
                        archivoALeer.close();

                    }
                    catch (Exception e)
                    {
                        e.printStackTrace();
                    }
                }
            }
        }
        return numeroTotalLineas;
    }

    public static String ficheroMasGrande()
    {
        String ficheroNombreMasLargo = "";

        File directorio = new File("D:\\DAW\\01 - PROGRAMACIÓN\\Distintos ficheros");

        File[] listado = directorio.listFiles();

        int i, mayorTamano = -1, menorTamano;

        for(i = 0; i < listado.length; i++)
        {
            menorTamano = listado[i].getName().length();

            if(menorTamano > mayorTamano)
            {
                mayorTamano = menorTamano;
                ficheroNombreMasLargo = listado[i].getName();
            }
        }
        return ficheroNombreMasLargo;

    }

    public static void clasificaFicheros()
    {
        String archivoCompleto, extension;
        int i, j, posicion, contador;

        List<String> listaExtensiones = new ArrayList<>();

        File directorio = new File("D:\\DAW\\01 - PROGRAMACIÓN\\Distintos ficheros");

        File[] listado = directorio.listFiles();

        for(i = 0; i < listado.length; i++)
        {
            if(listado[i].isFile())
            {
                archivoCompleto = listado[i].getAbsolutePath();
                posicion = archivoCompleto.indexOf(".");
                extension = archivoCompleto.substring(posicion);
                listaExtensiones.add(extension);
            }
        }

        Collections.sort(listaExtensiones);

        System.out.println(listaExtensiones);

        for(i = 0; i < listaExtensiones.size(); i++)
        {
            contador = 0;
            for(j = 0; j < listaExtensiones.size(); j++)
            {
                if(listaExtensiones.get(i).equals(listaExtensiones.get(j)))
                {
                    contador++;
                }
            }
            if(contador > 1)
            {
                listaExtensiones.remove(i);
            }

            System.out.println(listaExtensiones.get(i) + "=>" + contador);

        }
    }
    public static void main(String[] args) {

        int opcion;

        opcion = eligeFuncion();

        switch (opcion)
        {
            case 1:
            {
                int numeroDeFicheros;
                String extension = ".pdf";

                numeroDeFicheros = cuantosFicheros(extension);

                System.out.println(numeroDeFicheros);
            }
            break;
            case 2:
            {
                int numeroDeFicheros;
                String extension = ".pdf";
                String rutaCarpeta = "D:\\DAW\\01 - PROGRAMACIÓN";

                numeroDeFicheros = cuantosFicherosPro(extension,rutaCarpeta);

                System.out.println(numeroDeFicheros);
            }
            break;
            case 3:
            {
                String nombreFichero = "D:\\DAW\\01 - PROGRAMACIÓN\\Java_Basico.pdf";
                creaBackup(nombreFichero);
            }
            break;
            case 4:
            {
                String extensionActual = ".png";
                String extensionQueQuiero = ".txt";

                renombraMasivo(extensionActual,extensionQueQuiero);
            }
            break;
            case 5:
            {
                String extension = ".txt";
                int numeroTotalLineas;

                numeroTotalLineas = cuentaLineasFicheros(extension);

                System.out.println("Hay un total de: " + numeroTotalLineas + " líneas.");
            }
            break;
            case 6:
            {
                String ficheroConNombreMasLargo;

                ficheroConNombreMasLargo = ficheroMasGrande();

                System.out.println("El fichero que tiene el nombre más largo es: " + ficheroConNombreMasLargo);
            }
            break;
            case 7:
            {
                clasificaFicheros();
            }
            break;
            default:
                System.out.println("Ha elegido un número no válido.");
        }
    }
}

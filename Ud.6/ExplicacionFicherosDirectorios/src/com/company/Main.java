package com.company;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main
{

    public static void main(String[] args)
    {
        //para ver si un fichero existe
        //metodo antiguio : File

        //file nos permite obtener info sobre el ficher oque le digamos
        //el fichero no tiene pq existir
        File fich = new File("fichero.txt");
        if (fich.exists())
        {
            if (fich.isFile())
            {
                System.out.println("El fichero extite");

            }
        }
        else
        {
            if (fich.isDirectory())
            {
                System.out.println("El fichero no existe");
            }
        }

        //metodo moderno: Files
        if (Files.exists(Path.of("fichero.txt")))
        {
            if (Files.isRegularFile(Path.of("fichero.txt")))
            {
                System.out.println("Metodo nuevo: EXISTE");
            }
            else
            {
                if (Files.isDirectory(Path.of("fichero.txt")))
                {
                    System.out.println("Metodo nuevo: NO EXISTE, es un diredctorio");
                }
            }
        }

        //operaciones con ficheros: borrar, copiar, mover/renombrar
        //version antigua
        fich.delete();
        File fich2 = new File("fichero2.txt");
        fich.renameTo(fich2);

        //version nueva
        try
        {
            Files.delete(Path.of("fichero.txt"));
            Files.copy(Path.of("fichero.txt"), Path.of("fichero2.txt"));
            Files.move(Path.of("fichero.txt"), Path.of("fichero2.txt"));

            Files.createDirectories(Path.of("carpeta"));

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        //obtener el listado de un directorio
        File dir = new File("."); //"."=directorio actual
        File[] arrayFichero = dir.listFiles();//listado del contenido en un array

        int i;

        dir.length();//tamaño

        for (i = 0; i < arrayFichero.length; i++)
        {
            if (arrayFichero[i].isFile())
            {
                if (arrayFichero[i].getName().endsWith(".txt"))
                {
                    System.out.println(arrayFichero[i].getName());
                    //System.out.println(arrayFichero[i].getAbsolutePath());
                }
            }
        }
    }
}
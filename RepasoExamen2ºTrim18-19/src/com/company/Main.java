package com.company;

import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args) throws FileNotFoundException
    {
        List<String> listaCiudades = new ArrayList<>(Arrays.asList("Jerez","Tarifa","Barbate"));
        List<Double> listaTemperaturas = new ArrayList<>(Arrays.asList(18.9,14.1,16.8));

        System.out.println(listaCiudades);
        System.out.println(listaTemperaturas);

        haceCalor(listaCiudades, listaTemperaturas);
        System.out.println(".............");

        System.out.println(listaCiudades);
        System.out.println(listaTemperaturas);


    }

    /*private static void cuatroVocales(String fichero)
    {

        String fichero = "quijote.txt";

        try
        {
            List<String> cuatroVocales = new ArrayList<>();

            FileReader fr = new FileReader(fichero);
            BufferedReader br = new BufferedReader(fr);

            String linea;
            String[] palabras;
            int i;

            linea = br.readLine();

            while (linea != null)
            {
                linea = lipiaCadena(linea);
                palabras = linea.split(" ");

                for (i = 0; i < palabras.length; i++)
                {
                    if (tiene4vocales(palabras[i]))
                    {
                        if ((!cuatroVocales.contains(palabras[i])))
                        {
                            cuatroVocales.add(palabras[i]);
                        }
                    }
                }
                linea = br.readLine();
            }
            br.close();
            fr.close();

            FileWriter fw = new FileWriter("4vocales.txt");
            BufferedWriter bw = new BufferedWriter(fw);

            for (i = 0; i < cuatroVocales.size(); i++)
            {
                bw.write(cuatroVocales.get(i));
                bw.newLine();
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }*/
    private static boolean esVocal (char charAt)
    {
        String vocal = "aeiouáéíóúü";
        if (vocal.indexOf(charAt)!=-1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    private static boolean tiene4vocales(String palabra)
    {
        int i, contador=0;
        palabra = palabra.toLowerCase();

        for (i = 0; i < palabra.length(); i++)
        {
            if (esVocal(palabra.charAt(i)))
            {
                contador++;
            }
        }
        if (contador>=4)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    private static String lipiaCadena(String s)
    {
        int i;
        String res="";

        for (i = 0; i < s.length(); i++)
        {
            if (s.charAt(i)==' '||Character.isLetter(s.charAt(i)))
            {
                res = res + s.charAt(i);
            }
        }
        return res;
    }





    private static void haceCalor(List<String> listaCiudades, List<Double> listaTemperaturas)
    {
        if(listaCiudades.size()==listaTemperaturas.size())
        {
            int i;
            double media=0.0, suma =0.0;
            for (i = 0; i < listaTemperaturas.size(); i++)
            {
                suma = suma + listaTemperaturas.get(i);
            }
            media = suma/listaTemperaturas.size();
            for (i = 0; i < listaTemperaturas.size(); i++)
            {
                if (listaTemperaturas.get(i)<media)
                {
                    listaTemperaturas.remove(i);
                    listaCiudades.remove(i);
                    i--;
                }
            }
        }
        else
        {
            System.out.println("no son igual de largas las listas");
        }
    }

}
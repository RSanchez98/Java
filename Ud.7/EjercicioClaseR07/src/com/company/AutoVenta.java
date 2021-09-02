package com.company;

import java.io.*;
import java.text.DateFormat;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AutoVenta
{
    // ATRIBUTOS*********************************************************************************************************
    private List<Coche> listaCoches = new ArrayList<>();

    // CONSTRUCORES******************************************************************************************************

    public AutoVenta()
    {
    }

    // PORPIEDADES*******************************************************************************************************

    // METODOS***********************************************************************************************************
    public void cargaCSV(String fichero)
    {
        String matricula, marca, modelo;
        LocalDate fechaMatriculacion;
        double precio;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        try
        {
            FileReader fr = new FileReader(fichero);
            BufferedReader br = new BufferedReader(fr);

            br.readLine(); //la lee y no la guarda
            String texto = br.readLine();

            while (texto!=null)
            {
                String[]partes;
                partes = texto.split(";");
                if (partes.length == 5)
                {
                    matricula = partes[0];
                    marca = partes[1];
                    modelo = partes[2];
                    fechaMatriculacion = LocalDate.parse(partes[3], formatter);
                    //fechaMatriculacion.format(formatter);
                    precio = Double.parseDouble(partes[4]);

                    Coche c = new Coche(matricula, fechaMatriculacion, marca, modelo, precio);
                    listaCoches.add(c);
//                    System.out.println(c);

                }
                texto = br.readLine();
            }

            br.close();
            fr.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public void guardaCSV(String fichero)
    {
        try
        {
            FileWriter fw = new FileWriter(fichero);
            BufferedWriter bw = new BufferedWriter(fw);

            for(int i = 0; i < listaCoches.size(); i++)
            {
                bw.write(listaCoches.get(i).getMatricula()+", ");
                bw.write(listaCoches.get(i).getMarca()+", ");
                bw.write(listaCoches.get(i).getModelo()+", ");
                bw.write(listaCoches.get(i).getFechaMatriculación()+", ");
                bw.write(listaCoches.get(i).getPrecio()+", ");
            }
            bw.close();
            fw.close();

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }

    public void insertaCoche(Coche c)
    {
        listaCoches.add(c);
    }

    public Coche buscaCoche(String marticula)
    {
        for (int i = 0; i < listaCoches.size(); i++)
        {
            if (listaCoches.get(i).getMatricula().contains(marticula))
            {
                return listaCoches.get(i);
            }
        }
        return null;
    }
    
    public String imprimeListado()
    {
        String cadena = padRight("MATRICULA", 15)+padRight("MARCA", 20)+padRight("MODELO", 15)+padRight("FECHA MATR.", 15)+padRight("PRECIO", 15)+'\n';
        for (int i = 0; i < listaCoches.size(); i++)
        {
            cadena = cadena + padRight(listaCoches.get(i).getMatricula(), 15) +
                    padRight(listaCoches.get(i).getMarca(), 20)+
                    padRight(listaCoches.get(i).getModelo(), 15)+
                    padRight(listaCoches.get(i).getFechaMatriculación().format(DateTimeFormatter.ofPattern("dd-MM-yyyy")), 15)+
                    padRight(String.valueOf(listaCoches.get(i).getPrecio()), 15) + '\n';
        }
        return cadena;
    }


    public static String padRight(String cadena, int numRight)
    {
        int i;
        int longCadena = cadena.length();
        int longFinal = numRight - longCadena;

        for (i = 0; i < longFinal; i++)
        {
            cadena = cadena + " ";
        }
        return cadena;
    }
    public static void padLeft(String cadena, int numLeft)
    {
        int i;
        int longCadena = cadena.length();
        int lonfFinal = numLeft - longCadena;
        for (i = 0; i < lonfFinal; i++)
        {
            System.out.print("·");
        }
        System.out.print(cadena);
    }

}

package com.company;

import javax.swing.plaf.FileChooserUI;
import java.io.*;
import java.rmi.UnmarshalException;
import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.List;

public class Grupo
{
    private List<Alumno>listaAlumnos;

    public Grupo()
    {
        listaAlumnos = new ArrayList<>();
    }

    void insertaAlumnoLista(Alumno a)
    {
        listaAlumnos.add(a);
    }

    void insertaAlumnosLista(String nombre, int edad, double calificacion)
    {
        Alumno a = new Alumno(nombre, edad, calificacion);
        listaAlumnos.add(a);
    }

    public String toString()
    {
        String texto = " ";
        for (int i = 0; i < listaAlumnos.size(); i++)
        {
            texto = texto + listaAlumnos.get(i).toString()+'\n';
        }
        return  texto;
    }

    void escribreFicheroBinario(String fichero)
    {
        String nombre;
        int edad;
        double calificacion;
         try
         {
             FileOutputStream fos = new FileOutputStream(fichero);
             DataOutputStream dos = new DataOutputStream(fos);

             for (int i = 0; i < listaAlumnos.size(); i++)
             {
                 nombre = listaAlumnos.get(i).getNombre();
                 dos.writeUTF(nombre);

                 edad = listaAlumnos.get(i).getEdad();
                 dos.writeInt(edad);

                 calificacion = listaAlumnos.get(i).getCalificacion();
                 dos.writeDouble(calificacion);
             }

             dos.close();
             fos.close();
         }
         catch (IOException e)
         {
             e.printStackTrace();
         }
    }
    void leeFicheroBinario(String fichero)
    {
        String nombre;
        int edad;
        double calificacion;
        try
        {
            int leer;
            FileInputStream fis = new FileInputStream(fichero);
            DataInputStream dis = new DataInputStream(fis);

            leer = dis.readInt();
            for (int i= 0; i < listaAlumnos.size(); i++)
            {
                nombre = dis.readUTF();
                edad = dis.readInt();
                calificacion = dis.readDouble();

                Alumno a = new Alumno(nombre, edad, calificacion);

                listaAlumnos.add(a);
            }

            dis.close();
            fis.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    void escribeFicheroTexto(String fichero)
    {
        int registros = listaAlumnos.size();
        try
        {
            FileWriter fw = new FileWriter(fichero);
            BufferedWriter bw = new BufferedWriter( fw);

            bw.write(String.valueOf(registros));
            bw.newLine();

            for (int i = 0; i < listaAlumnos.size(); i++)
            {
                bw.write(listaAlumnos.get(i).getNombre());
                bw.newLine();

                bw.write(String.valueOf(listaAlumnos.get(i).getEdad()));
                bw.newLine();

                bw.write(String.valueOf(listaAlumnos.get(i).getCalificacion()));
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
    void leeFicheroTexto(String fichero)
    {
        String nombre;
        int edad, registros;
        double calificacion;
        try
        {
            FileReader fr = new FileReader(fichero);
            BufferedReader br = new BufferedReader(fr);

            registros = Integer.valueOf(br.readLine());
            for(int i = 0; i < listaAlumnos.size(); i++)
            {
                nombre = br.readLine();
                edad = Integer.valueOf(br.readLine());
                calificacion = Double.valueOf(br.readLine());

                Alumno a = new Alumno(nombre, edad, calificacion);
                listaAlumnos.add(a);
            }

            br.close();
            fr.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    void escribeFicheroCSV(String fichero)
    {
        try
        {
            FileWriter fw = new FileWriter(fichero);
            BufferedWriter bw = new BufferedWriter(fw);

            for (int i = 0; i < listaAlumnos.size(); i++)
            {
                bw.write(listaAlumnos.get(i).getNombre()+";");
                bw.write(listaAlumnos.get(i).getEdad()+";");
                bw.write(listaAlumnos.get(i).getCalificacion()+";");
            }
            bw.close();
            fw.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    void leeficheroCSV(String fichero)
    {
        String nombre;
        int edad;
        double calificacion;
        try
        {
            for (int i = 0; i < listaAlumnos.size(); i++)
            {

            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}

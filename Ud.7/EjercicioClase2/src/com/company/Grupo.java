package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Grupo
{
    //ATRIBUTOS*********************************************************************************************************
    private List<Alumno> listaAlumno;

    //CONSTRUCTORES*****************************************************************************************************
    public Grupo()
    {
        listaAlumno = new ArrayList<>();
    }

    //METODOS***********************************************************************************************************
    void insertaAlumnoLista(Alumno a)
    {
        listaAlumno.add(a);
    }
    void insertaAlumnosLista(String nombre, int edad, double nota)
    {
        Alumno a = new Alumno(nombre, edad, nota);
        listaAlumno.add(a);
    }

    public String toString()
    {
        int i;
        String texto="";
        for (i = 0; i <listaAlumno.size(); i++)
        {
            texto = texto + listaAlumno.get(i).toString();
        }
        return texto;
    }


    void escribeFicheroBinario(String fichero)
    {
        String nombre;
        int edad;
        double nota;
        try
        {
            FileOutputStream fos = new FileOutputStream(fichero);
            DataOutputStream dos = new DataOutputStream(fos);

            int i;

            for (i = 0; i <listaAlumno.size(); i++)
            {
                nombre = listaAlumno.get(i).getNombre();
                dos.writeUTF(nombre);

                edad = listaAlumno.get(i).getEdad();
                dos.writeInt(edad);

                nota = listaAlumno.get(i).getNota();
                dos.writeDouble(nota);
            }

            dos.close();
            fos.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
    void leeFicheroBinario (String fichero)
    {
        String nombre;
        int edad;
        double nota;

        int i, registro;
        try
        {
            FileInputStream fis = new FileInputStream(fichero);
            DataInputStream dis = new DataInputStream(fis);

            registro = dis.readInt();
            for (i =0;i < registro; i++)
            {
                nombre = dis.readUTF();
                edad = dis.readInt();
                nota = dis.readDouble();

                Alumno a = new Alumno(nombre, edad, nota);

                listaAlumno.add(a);
            }
            dis.close();
            fis.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    void escribeFicheroTexto(String fichero)
    {
        int i, registros = listaAlumno.size();
        try
        {
            FileWriter fw = new FileWriter(fichero);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write(String.valueOf(registros));
            bw.newLine();
            for (i = 0; i < listaAlumno.size(); i++)
            {
                bw.write(listaAlumno.get(i).getNombre());
                bw.newLine();

                bw.write(String.valueOf(listaAlumno.get(i).getEdad()));
                bw.newLine();

                bw.write(String.valueOf(listaAlumno.get(i).getNota()));
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
    void leeFicheroTexto(String fichero)
    {
        String nombre;
        int edad, numRegistros, i;
        double nota;
        try
        {
            FileReader fr = new FileReader(fichero);
            BufferedReader br = new BufferedReader(fr);

            numRegistros = Integer.valueOf(br.readLine());

            for (i = 0; i < numRegistros; i++)
            {
                nombre = br.readLine();
                edad = Integer.valueOf(br.readLine());
                nota = Double.valueOf(br.readLine());

                Alumno a = new Alumno(nombre, edad, nota);

                listaAlumno.add(a);
            }

            br.close();
            fr.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    void  escribeFicheroCSV(String fichero)
    {
        try
        {
            FileWriter fw = new FileWriter(fichero);
            BufferedWriter bw = new BufferedWriter(fw);
            int i;
            for (i = 0; i < listaAlumno.size(); i++)
            {
                bw.write(listaAlumno.get(i).getNombre()+";");
                bw.write(listaAlumno.get(i).getEdad()+";");
                bw.write(listaAlumno.get(i).getEdad()+";");
                bw.newLine();
            }
            bw.close();
            bw.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    void leeFicheroCSV(String fichero)
    {
        String nombre, registros;
        int edad, i;
        double nota;
        String[]campos;
        try
        {
            FileReader fr = new FileReader(fichero);
            BufferedReader br = new BufferedReader(fr);

            registros=br.readLine();
            while (registros!=null)
            {
                campos=registros.split(";");
                nombre = campos[0];
                edad=Integer.valueOf(campos[1]);
                nota=Integer.valueOf(campos[2]);

                Alumno a = new Alumno(nombre, edad, nota);

                listaAlumno.add(a);
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

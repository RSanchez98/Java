package com.company;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Tribunal
{
    // ATRIBUTOS*********************************************************************************************************
    private List<Profesor> listaProfesores;
    Random r = new Random();

    // CONSTRUCORES******************************************************************************************************
    public Tribunal(String fichero)
    {
        listaProfesores = new ArrayList<>();

        try
        {
            FileInputStream fis = new FileInputStream(fichero);
            DataInputStream dis = new DataInputStream(fis);

            while (dis.available() != 0)
            {
                String nombre, dni;
                TipoGenero genero = TipoGenero.Hombre;
                int generoi;

                nombre = dis.readUTF();
                dni = dis.readUTF();
                generoi = dis.readInt();


                if (generoi == 0)
                {
                    genero = TipoGenero.Hombre;
                }
                else
                {
                    if (generoi == 1)
                    {
                        genero = TipoGenero.Mujer;
                    }
                }
                Profesor p = new Profesor(nombre, dni, genero);
                listaProfesores.add(p);
            }


            dis.close();
            fis.close();

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    // PORPIEDADES*******************************************************************************************************
    // METODOS***********************************************************************************************************
    public void eligeTribunal()
    {
        int i;
        System.out.println("LISTA DE PROFESORES");
        for (i = 0; i < listaProfesores.size(); i++)
        {
            System.out.print(i + 1);
            System.out.println(listaProfesores.get(i).toString());
        }

        Random r = new Random();

        int num = r.nextInt(listaProfesores.size() - 1) + 1;

        List<Profesor> elegidos = new ArrayList<>();
        int hombres = 0;
        int mujeres = 0;
        num--;
        while (elegidos.size() < 4)
        {

            if (listaProfesores.get(num).getGenero() == TipoGenero.Hombre && hombres < 2)
            {
                elegidos.add(listaProfesores.get(num));
                hombres++;
            }
            if (listaProfesores.get(num).getGenero() == TipoGenero.Mujer && mujeres < 2)
            {
                elegidos.add(listaProfesores.get(num));
                mujeres++;
            }

            num++;

            if (num == listaProfesores.size())
            {
                num = 0;
            }
        }

        System.out.println();
        System.out.println("Los elegidos son: ");
        for (i = 0; i < elegidos.size(); i++)
        {
            System.out.println(elegidos.get(i).toString());
        }
    }
}

package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca
{
    // ATRIBUTOS*********************************************************************************************************
    List<Libro> listaLibros;
    // CONSTRUCTORES*****************************************************************************************************
    public Biblioteca()
    {
        listaLibros = new ArrayList<>();
    }
    // PROPIEDADES*******************************************************************************************************
    // METODOS***********************************************************************************************************
    public boolean insertaLibro(Libro l)
    {
        boolean comprueba = false;
        for (int i = 0; i < listaLibros.size(); i++)
        {
            if ((listaLibros.get(i).getIsbn().equals(l.getIsbn())))
            {
                comprueba = true;
            }
        }
        if (!comprueba)
        {
            listaLibros.add(l);
        }
        return comprueba;
    }

    public void leeFicheroLibros(String fichero)
    {
        int numeroLibros, numeroPaginas;
        String isbn, titulo, autor;
        boolean leido;

       try
        {
            FileInputStream fis = new FileInputStream(fichero);
            DataInputStream dis = new DataInputStream(fis);

            numeroLibros = dis.readInt();
            while (dis.available()>0)
            {

                isbn = dis.readUTF();
                titulo = dis.readUTF();
                autor = dis.readUTF();
                numeroPaginas = dis.readInt();
                leido = dis.readBoolean();
                Libro l = new Libro(isbn, titulo, autor, numeroPaginas, leido);
                listaLibros.add(l);
            }

            dis.close();
            fis.close();
        }

       catch (Exception e)
       {
           e.printStackTrace();
       }
    }

    public void ordenaPorPaginasDesc()
    {
        List<Libro> listaOrdenada = new ArrayList<>();

        while(listaLibros.size() > 0)
        {
            int peque = listaLibros.get(0).getNumeroPaginas();
            int posicion = 0;

            for (int i = 1; i < listaLibros.size(); ++i)
            {
                int siguienteNum = listaLibros.get(i).getNumeroPaginas();
                if (siguienteNum < peque)
                {
                    peque = siguienteNum;
                    posicion = i;
                }
            }

            listaOrdenada.add(0, listaLibros.get(posicion));

            listaLibros.remove(posicion);
        }

        listaLibros.addAll(listaOrdenada);
    }

    @Override
    public String toString()
    {
        return "Biblioteca{" +
                "listaLibros=" + listaLibros +
                '}';
    }

   /*public String toString()
   {
       String cadenaNombre ="";
       String cadenaTitulo ="";
       String cadena ="";

       for (int i = 0; i < listaLibros.size(); i++)
       {
           cadenaNombre = listaLibros.get(i).getAutor();
           cadenaTitulo = listaLibros.get(i).getTitulo();
       }
       cadena = cadenaTitulo+ cadenaNombre;
       return cadena;
   }*/
}

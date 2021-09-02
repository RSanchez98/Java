package com.company;

import java.util.ArrayList;
import java.util.List;

public class Coleccion
{
    //ATRIBUTOS*********************************************************************************************************
    List<Videojuego> listaColeccion/* = new ArrayList<>()*/;

    //CONSTRUCORES******************************************************************************************************
    public Coleccion() //constructor vacio
    {
        listaColeccion = new ArrayList<>();
    }

    //PORPIEDADES*******************************************************************************************************
    //METODOS***********************************************************************************************************
    public void insertaVideojuego(Videojuego v)
    {
        listaColeccion.add(v);
    }
    public void eliminaVideojuego(int posicion)
    {
        int i, cont = 1;
        for (i = 0; i < listaColeccion.size(); i++)
        {
            if (cont==posicion)
            {
                listaColeccion.remove(i);
            }
            cont++;
        }
    }

    Videojuego getVideojuego(int posicion)
    {
        return listaColeccion.get(posicion);
    }


    public String toStringNum()
    {
        int i;
        String cadena="";
        for (i = 0; i < listaColeccion.size(); i++)
        {
            cadena = cadena + ((i+1)+"- "+listaColeccion.get(i).getNombre()) + "\n";
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
    public static String repiteCaracter(char caracter, int num)
    {
        int i;
        String result = "";

        for (i = 1; i <= num; i++)
        {
            result = result + caracter;
        }

        return result;
    }

    @Override
    public String toString()
    {
        int i;
        String cadena = "";
        String cadenaNombre;
        String cadenaAnno;
        String cadenaPlataforma;
        String cadenaTipoJuego;
        String cadenaValoracion;
        String titulo = padRight("Titulo", 30)+padRight("Anno", 10)+padRight("Plataforma", 20)+padRight("Tipo de jugo", 20)+padRight("Val.", 3);

        cadena = cadena + titulo+"\n";
        cadena = cadena +
        repiteCaracter('-',titulo.length())+"\n";


        for ( i = 0; i < listaColeccion.size(); i++)
        {
            cadenaNombre = listaColeccion.get(i).getNombre();
            cadenaAnno = String.valueOf(listaColeccion.get(i).getAnno());
            cadenaPlataforma = String.valueOf(listaColeccion.get(i).getPlataforma());
            cadenaTipoJuego = String.valueOf(listaColeccion.get(i).getTipoJuego());
            cadenaValoracion = String.valueOf(listaColeccion.get(i).getValoracion());
            cadena = cadena + padRight(cadenaNombre, 30) + padRight(cadenaAnno, 10)+padRight(cadenaPlataforma, 20)+padRight(cadenaTipoJuego, 20)+padRight(cadenaValoracion, 3)+"\n";
        }
        return cadena;

    }
}

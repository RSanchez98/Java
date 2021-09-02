package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BuscaTexto
{
    // ATRIBUTOS*********************************************************************************************************
    private String texto;
    private int puntero;

    // CONSTRUCORES******************************************************************************************************
    public BuscaTexto()
    {
        this.texto = "";
        this.puntero = 0;
    }
    public BuscaTexto(String cadena)
    {
        this.texto = cadena;
        this.puntero = 0;
    }
    // PORPIEDADES*******************************************************************************************************

    public int getPuntero()
    {
        return puntero;
    }

    public void setPuntero(int puntero)
    {
        int largoTexto = this.texto.length();
        if (puntero < 0)
        {
            puntero =  0;
        }
        else
        {
            if (puntero > largoTexto)
            {
                puntero = largoTexto;
            }
        }
        this.puntero = puntero;
    }

    public String getTexto()
    {
        return texto;
    }

    // METODOS***********************************************************************************************************
    public void cargaFichero(String fichero)
    {
        String textoFichero="";
        try
        {
            FileReader fr = new FileReader(fichero);
            BufferedReader br = new BufferedReader(fr);

            String linea = br.readLine();

            while (linea!=null)
            {
                textoFichero = textoFichero + linea + "\n";
                linea = br.readLine();
            }

            br.close();
            fr.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        this.texto = textoFichero;
    }

    public void reinicia()
    {
        this.puntero = 0;
    }

    public boolean busca(String cadena)
    {
        String texto = this.texto;
        int buscador = texto.indexOf(cadena);

        if (buscador == 0)
        {
            return false;
        }
        else
        {
            this.puntero = buscador;
            return true;
        }
    }

    public boolean buscaSiguiente(String cadena)
    {
        String texto = this.texto;
        int buscador = texto.indexOf(cadena, this.puntero);

        if (buscador == 0)
        {
            return false;
        }
        else
        {
            this.puntero = buscador;
            return  true;
        }
    }

    public String extraeCadena(String delimi1, String delimi2)
    {
        String devuelve = null;
        if (this.buscaSiguiente(delimi1))
        {
            int principio = this.puntero+delimi1.length();

            if (this.buscaSiguiente(delimi2))
            {
                int fin = this.puntero;
                devuelve = this.texto.substring(principio, fin);
            }
        }
        return devuelve;
    }

    public String extraeCadenaConDelim(String delimi1, String delimi2)
    {
        String devuelve = null;

        if (this.buscaSiguiente(delimi1))
        {
            int principio = this.puntero;

            if (this.buscaSiguiente(delimi2))
            {
                int fin = this.puntero+delimi2.length();
                devuelve = this.texto.substring(principio, fin);
            }
        }
        return devuelve;
    }

}

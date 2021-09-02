package com.company;

import javax.imageio.metadata.IIOMetadataNode;
import java.io.IOException;
import java.security.InvalidParameterException;

public class Libro
{
    // ATRIBUTOS*********************************************************************************************************
    private String isbn, titulo, autor;
    private int numeroPaginas;
    private boolean leido;

    // CONSTRUCTORES*****************************************************************************************************
   public Libro(String isbn, String titulo, String autor, int numeroPaginas, boolean leido)
    {
        if(compruebaISBN(isbn))
        {
            this.isbn = isbn;
        }
        else
        {
            throw new InvalidParameterException("El ISBN es incorrecto");
        }

        if (numeroPaginas<=0)
        {
            throw new InvalidParameterException("El libro no puede tener 0 o menos paginas");
        }
        else
        {
            this.numeroPaginas = numeroPaginas;
        }

        this.titulo = titulo;
        this.autor = autor;
        this.leido = leido;
    }


    // PROPIEDADES*******************************************************************************************************

    public String getIsbn()
    {
        return isbn;
    }

    public String getTitulo()
    {
        return titulo;
    }

    public String getAutor()
    {
        return autor;
    }

    public int getNumeroPaginas()
    {
        return numeroPaginas;
    }

    public boolean isLeido()
    {
        return leido;
    }

    public void setLeido(boolean leido)
    {
        this.leido = leido;
    }

    // METODOS***********************************************************************************************************

    public static boolean esNumero(String isbn)
    {
        try
        {
            Integer.parseInt(isbn);
            return true;
        }
        catch (NumberFormatException e)
        {
            return false;
        }
    }
    public boolean compruebaISBN(String isbn) //PENDIENTE
    {
        boolean esISBN = false;
        String[] partes = isbn.split("-");

        if (isbn.isEmpty())
        {
            esISBN = false;
        }
        else
        {
            if (partes[0].length() == 3 && esNumero(partes[0]))
            {
                if (partes[1].length() == 2 && esNumero(partes[1]))
                {
                    if (partes[2].length() == 4 && esNumero(partes[2]))
                    {
                        if (partes[3].length() == 3 && esNumero(partes[3]))
                        {
                            if (partes[4].length() == 1 && esNumero(partes[4]))
                            {
                                esISBN = true;
                            }
                        }
                    }
                }
            }
        }

        return esISBN;
    }

    @Override
    public String toString()
    {
        String cadena;
        cadena = "'"+titulo+"' de "+autor+'\n';
        return  cadena;
    }
}

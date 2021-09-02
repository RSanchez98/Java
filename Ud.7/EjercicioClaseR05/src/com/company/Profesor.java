package com.company;

import java.security.InvalidParameterException;

public class Profesor
{
    // ATRIBUTOS*********************************************************************************************************
    String nombre;
    String dni;
    TipoGenero genero;
    // CONSTRUCORES******************************************************************************************************
    public Profesor (String nombre, String dni, TipoGenero genero)
    {
        if (nombre.equals(" "))
        {
            throw new  InvalidParameterException("El nombre no puede estar vacio");
        }
        else
        {
            this.nombre=nombre;
        }

        if (dni.length()!=9)
        {
            throw new  InvalidParameterException("El DNI tiene que tener 9 caracteres obligatoriamente");
        }
        else
        {
            this.dni=dni;
        }

        if (genero == null)
        {
            throw new InvalidParameterException("El genero no puede estar vacio");
        }
        else
        {
            this.genero=genero;
        }
    }
    // PORPIEDADES*******************************************************************************************************

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getDni()
    {
        return dni;
    }

    public void setDni(String dni)
    {
        this.dni = dni;
    }

    public TipoGenero getGenero()
    {
        return genero;
    }

    public void setGenero(TipoGenero genero)
    {
        this.genero = genero;
    }

    // METODOS***********************************************************************************************************

    @Override
    public String toString()
    {
        return  ". [Nombre = " + nombre + "]" +
                " [DNI = " + dni + "]";
    }
}

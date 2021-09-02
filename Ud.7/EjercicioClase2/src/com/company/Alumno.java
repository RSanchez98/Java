package com.company;

import java.security.InvalidParameterException;

public class Alumno
{
    //ATRIBUTOS*********************************************************************************************************
    private String nombre;
    private int edad;
    private double nota;

    //CONSTRUCTORES*****************************************************************************************************
    public Alumno(String nombre, int edad, double nota)
    {
        if (nombre.equals(""))
        {
            throw new InvalidParameterException("No puede estar el nombre vacio");
        }
        else
        {
            this.nombre = nombre;
        }
        if (edad <= 17 || edad >= 100)
        {
            throw new InvalidParameterException("La edad no puede ser menor de 17 o mayor de 100");
        }
        else
        {
            this.edad = edad;
        }
        if (nota<0.0||nota>10.0)
        {
            throw new InvalidParameterException("La nota no puede ser menor de 0 o mayor de 10");
        }
        else
        {
            this.nota = nota;
        }
    }

    //PROPIEDADES*******************************************************************************************************
    public String getNombre()
    {
        return this.nombre;
    }
    public int getEdad()
    {
        return this.edad;
    }
    public double getNota()
    {
        return this.nota;
    }

    @Override
    public String toString()
    {
        return "Alumno{" +
                "nombre= " + nombre + '\'' +
                ", edad= " + edad +
                ", nota= " + nota +
                '}';
    }

    public void setNombre(String nombre)
    {
        if (nombre.equals(""))
        {
            throw new InvalidParameterException("No puede estar el nombre vacio");
        }
        else
        {
            this.nombre = nombre;
        }
    }
    public void setEdad(int edad)
    {
        if (edad <= 17 || edad >= 100)
        {
            throw new InvalidParameterException("La edad no puede ser menor de 17 o mayor de 100");
        }
        else
        {
            this.edad = edad;
        }
    }
    public void setNota(double nota)
    {
        if (nota<0.0||nota>10.0)
        {
            throw new InvalidParameterException("La nota no puede ser menor de 0 o mayor de 10");
        }
        else
        {
            this.nota = nota;
        }
    }
}

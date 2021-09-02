package com.company;

import java.security.InvalidParameterException;

public class Alumno
{
    private String nombre;
    private int edad;
    private double calificacion;

    public Alumno(String nombre, int edad, double calificacion)
    {
        if (nombre.equals(" "))
        {
            throw new InvalidParameterException("El nombre no puede estar en blanco");
        }
        else
        {
            this.nombre = nombre;
        }

        if (edad<17||edad>100)
        {
            throw new InvalidParameterException("La edad es erronea");
        }
        else
        {
            this.edad=edad;
        }

        if (calificacion<0.0||calificacion>10.0)
        {
            throw new InvalidParameterException("La calificación es erronea");
        }
        else
        {
            this.calificacion = calificacion;
        }
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public int getEdad()
    {
        return edad;
    }

    public void setEdad(int edad)
    {
        this.edad = edad;
    }

    public double getCalificacion()
    {
        return calificacion;
    }

    public void setCalificacion(double calificacion)
    {
        this.calificacion = calificacion;
    }

    @Override
    public String toString()
    {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", calificacion=" + calificacion +
                '}';
    }
}

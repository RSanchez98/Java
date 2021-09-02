package com.company;

import java.security.InvalidParameterException;
import java.time.LocalDate;

public abstract class Animal
{
    //ATRIBUTOS*********************************************************************************************************
    protected String nombre;
    protected LocalDate fechaNacimiento;
    protected double peso;
    protected String comentarios;

    //CONSTRUCORES******************************************************************************************************
    public Animal (String nombre, LocalDate fechaNacimiento, double peso)
    {
        if (nombre.equals(""))
        {
            throw new InvalidParameterException("El nombre no puede estar vacio");
        }
        else
        {
            this.nombre = nombre;
        }
        //if (LocalDate.now().compareTo(fechaNacimiento) >= 0)
        if(!(fechaNacimiento.isBefore(LocalDate.now())))
        {
            throw new InvalidParameterException("La fecha no puede ser una posterior a la actutal");
        }
        else
        {
            this.fechaNacimiento = fechaNacimiento;
        }
        if (peso<=0)
        {
            throw new InvalidParameterException("El peso no puede ser 0 o menor");
        }
        else
        {
            this.peso = peso;
        }

    }

    //PORPIEDADES*******************************************************************************************************
    public String getNombre()
    {
        return nombre;
    }
    public LocalDate getFechaNacimiento()
    {
        return fechaNacimiento;
    }
    public double getPeso()
    {
        return peso;
    }
    public String getComentarios()
    {
        return comentarios;
    }

    public void setPeso(double peso)
    {
        this.peso = peso;
    }
    public void setComentarios(String comentarios)
    {
        this.comentarios = comentarios;
    }

    //METODOS***********************************************************************************************************
    //MetodoAbstracto
    @Override
    public abstract String toString();

}

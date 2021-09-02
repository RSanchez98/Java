package com.company;

import java.net.PortUnreachableException;
import java.security.InvalidParameterException;

public class Longitud
{
    // ATRIBUTOS*********************************************************************************************************
    private double cantidad;
    private UnidadDeLongitud unidad;

    // CONSTRUCORES******************************************************************************************************
    public Longitud(int numInt, UnidadDeLongitud unidad)
    {
        this.cantidad = numInt;
        this.unidad = unidad;
    }

    public Longitud(double numDou, UnidadDeLongitud unidad)
    {
        this.cantidad = numDou;
        this.unidad = unidad;
    }

    // PORPIEDADES*******************************************************************************************************

    public double getCantidad()
    {
        return cantidad;
    }

    public void setCantidad(double cantidad)
    {
        this.cantidad = cantidad;
    }

    public UnidadDeLongitud getUnidad()
    {
        return unidad;
    }

    public void setUnidad(UnidadDeLongitud unidad) {this.unidad = unidad; }

    // METODOS***********************************************************************************************************

    public double valorEnMetros()
    {
        double conversion = 0.0;
        switch (this.unidad)
        {
            case metros: conversion = cantidad; break;
            case pulgadas: conversion = cantidad * 0.0254; break;
            case pies: conversion = cantidad * 0.3048; break;
            case yardas: conversion = cantidad * 0.9144; break;
        }
        return conversion;
    }

    @Override
    public String toString()
    {
        String resultado= " ";

        switch (this.unidad)
        {
            case metros: resultado = this.cantidad+" m"; break;
            case pulgadas: resultado = this.cantidad+" in"; break;
            case pies: resultado = this.cantidad+" ft"; break;
            case yardas: resultado = this.cantidad+" yd"; break;
        }
        return resultado;
    }

    // OPERADORES ARITMETICOS********************************************************************************************
    public void add(Longitud l2)
    {
        if (!(this.unidad.equals(l2.unidad)))
        {
            this.cantidad = valorEnMetros()+l2.valorEnMetros();
            this.unidad = UnidadDeLongitud.metros;
            //l2.unidad = UnidadDeLongitud.metros;
        }
        else
        {
            this.cantidad = this.cantidad+l2.cantidad;
        }
    }

    public void substract(Longitud l2)
    {
        if (!(this.unidad.equals(l2.unidad)))
        {
            this.cantidad = valorEnMetros()-l2.valorEnMetros();
            this.unidad = UnidadDeLongitud.metros;
        }
        else
        {
            this.cantidad = this.cantidad-l2.cantidad;
        }

        if (this.cantidad<0)
        {
            this.cantidad=this.cantidad*-1.0;
        }
    }

    public void multiply(double n)
    {
        this.cantidad = this.cantidad * n;
    }

    public void  divide(double n)
    {
        if (n == 0)
        {
            throw new InvalidParameterException("No se puede dividir entre 0");
        }
        this.cantidad = this.cantidad / n;
    }

    // OPERADORES DE COMPROBACION****************************************************************************************
    public boolean equals(Longitud l2)
    {
        return valorEnMetros() == l2.valorEnMetros();
    }

    public int compareTo(Longitud l2)
    {
        int resultado = 0;

        if (this.cantidad<l2.cantidad)
        {
            resultado = -1;
        }
        else
        {
            if (this.cantidad>l2.cantidad)
            {
                resultado = 1;
            }
        }
        return resultado;
    }
}
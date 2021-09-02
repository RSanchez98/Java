package com.company;

import java.security.InvalidParameterException;

public class Coche
{
    // Atributos
    private String matricula;
    String marca;
    String modelo;
    private int cilindrada;
    private double precio;
    boolean nuevo;

    // Constructores
    public Coche(String matricula, String marca, String modelo,
                 int cilindrada, double precio, boolean nuevo)
    {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        if(cilindrada >= 50)
        {
            this.cilindrada = cilindrada;
        }
        else
        {
            throw new InvalidParameterException("Cilindrada no válida");
        }
        //this.precio = precio;
        setPrecio(precio);
        this.nuevo = nuevo;
    }

    public Coche()
    {

    }

    public Coche(String matricula, String marca, String modelo)
    {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.cilindrada = 0; // Valores por defecto
        this.precio = 0.0; // Valores por defecto
        this.nuevo = true; // Valores por defecto
    }

    // Métodos
    public double rebaja(double porcentaje)
    {
        double descuento = (this.precio * porcentaje) / 100.0;
        double precioFinal = this.precio - descuento;
        return precioFinal;
    }

    // Propiedades (en Java no existen)
    public double getPrecio() //mostrar
    {
        return this.precio;
    }

    public void setPrecio(double nuevoValor) //modificar
    {
        if(nuevoValor > 0)
        {
            this.precio = nuevoValor;
        }
        else
        {
            throw new InvalidParameterException("El precio no puede ser negativo");
        }
    }

    public double getCilindrada() // Propiedad de sólo lectura
    {
        return this.cilindrada;
    }

    public String getMatricula()
    {
        return matricula;
    }

    public void setMatricula(String matricula)
    {
        this.matricula = matricula;
    }

    @Override
    public String toString()
    {
        return this.marca + " " + this.modelo + ", matrícula " + matricula;
    }
}

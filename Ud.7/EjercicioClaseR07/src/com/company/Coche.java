package com.company;

import java.security.InvalidParameterException;
import java.time.LocalDate;

public class Coche
{

    // ATRIBUTOS*********************************************************************************************************
    private String matricula;
    private LocalDate fechaMatriculación;
    private String marca;
    private String modelo;
    private double precio;

    // CONSTRUCORES******************************************************************************************************
    public Coche(String matricula, LocalDate fechaMatriculación, String marca, String modelo, double precio)
    {
        if (!esMatricula(matricula))
        {
            throw new InvalidParameterException("La matricula no es valida");
        }
        else
        {
            this.matricula = matricula;
        }

        if (!fechaMatriculación.isBefore(LocalDate.now().minusYears(1)))
        {
            throw new InvalidParameterException("La fehca de matriculación es erronea o tiene menos de un año");
        }
        else
        {
            this.fechaMatriculación = fechaMatriculación;
        }

        if (marca.isEmpty())
        {
            throw new InvalidParameterException("La marca del coche no debe estar vacia");
        }
        else
        {
            this.marca = marca;
        }

        if (modelo.isEmpty())
        {
            throw new InvalidParameterException("El modelo del coche no debe estar vacio");
        }
        else
        {
            this.modelo = modelo;
        }

        if (precio<500)
        {
            throw new InvalidParameterException("El precio del coche no puede ser inferior a 500€");
        }
        else
        {
            this.precio = precio;
        }
    }
    // PORPIEDADES*******************************************************************************************************

    public String getMatricula()
    {
        return matricula;
    }

    public LocalDate getFechaMatriculación()
    {
        return fechaMatriculación;
    }

    public String getMarca()
    {
        return marca;
    }

    public String getModelo()
    {
        return modelo;
    }

    public double getPrecio()
    {
        return precio;
    }
    public void setPrecio(double precio)
    {
        this.precio = precio;
    }
    // METODOS***********************************************************************************************************

    @Override
    public String toString()
    {
        return "Coche: ["+matricula+"] ["+fechaMatriculación+"] ["+marca+"] ["+modelo+"] ["+precio+"]";
    }



    public static boolean esMatricula(String matricula)
    {
        int i, j;
        String cadenaLetras = "BCDFGHJKLMNPQRSTVWXYZ";
        boolean comprobacion = true;
        if (matricula.length()!=7)
        {
            comprobacion = false;
        }
        else
        {

            for (i = 0; i < 4; i++)
            {
                if (!Character.isDigit(matricula.charAt(i)))
                {
                    comprobacion = false;
                }
            }
            for (j = 4; j < 7; j++)
            {
                if (!cadenaLetras.contains(String.valueOf(matricula.charAt(i))))
                {
                    comprobacion = false;
                }
            }
        }

        return comprobacion;
    }

}

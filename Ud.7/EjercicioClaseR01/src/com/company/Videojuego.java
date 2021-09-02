package com.company;

import java.security.InvalidParameterException;

public class Videojuego
{
    //ATRIBUTOS*********************************************************************************************************
    private String nombre;
    private int anno;
    private Plataforma plataforma;
    private TipoJuego tipoJuego;
    private int valoracion;

    //CONSTRUCORES******************************************************************************************************
    public Videojuego (String nombre, int anno, Plataforma plataforma, TipoJuego tipoJuego, int valoracion)
    {
        this.nombre = nombre;
        this.anno = anno;
        this.plataforma = plataforma;
        this.tipoJuego = tipoJuego;
        this.valoracion = valoracion;
    }


    //PORPIEDADES*******************************************************************************************************
    public String getNombre()
    {
        return nombre;
    }
    public void setNombre(String nombre)
    {
        if (nombre.equals(""))
        {
            throw new InvalidParameterException("El nombre no puede estar en blanco");
        }
        else
        {
            this.nombre=nombre;
        }
    }
    public int getAnno()
    {
        return anno;
    }
    public void setAnno(int anno)
    {
        if (anno<1970||anno>2100)
        {
            throw new InvalidParameterException("El año no puede ser menor de 1970 ni mayor que 2100");
        }
        else
        {
            this.anno = anno;
        }
    }
    public Plataforma getPlataforma()
    {
        return plataforma;
    }
    public void setPlataforma(Plataforma plataforma)
    {
        this.plataforma = plataforma;
    }
    public TipoJuego getTipoJuego()
    {
        return tipoJuego;
    }
    public void setTipoJuego(TipoJuego tipoJuego)
    {
        this.tipoJuego = tipoJuego;
    }
    public int getValoracion()
    {
        return valoracion;
    }
    public void setValoracion(int valoracion)
    {
        if (valoracion<0||valoracion>100)
        {
            throw new InvalidParameterException("La valoracion debe ser un numero comprendido entre 0 y 100");
        }
        else
        {
            this.valoracion = valoracion;
        }
    }

    //METODOS***********************************************************************************************************
    @Override
    public String toString()
    {
        String cadena =this.nombre +" "+this.anno+" "+ this.plataforma+" "+ this.tipoJuego+" "+ this.valoracion;
                /*"*************************************"
                + "\n"+"Videojuego: "+this.nombre+"\n"
                + "Anno: "+this.anno+"\n"
                + "Plataforma: "+this.plataforma+"\n"
                + "Tipo de juego: "+this.tipoJuego+"\n"
                + "Valoracion: "+this.valoracion+"/100\n"
                +"*************************************\n";*/
        return cadena;
    }


}

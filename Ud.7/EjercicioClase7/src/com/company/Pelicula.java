package com.company;

public class Pelicula
{
    //atributos
    private int idPelicula;
    private String titulo;
    private int anno;
    private boolean tieneOscar;
    private double valoracion;

    //constructor
    public Pelicula (int idPelicula, String titulo, int anno, boolean tieneOscar, double valoracion)
    {
        this.idPelicula = idPelicula;
        this.titulo = titulo;
        this.anno=anno;
        this.tieneOscar=tieneOscar;
        this.valoracion=valoracion;
    }

    //propiedades

    public int getIdPelicula()
    {
        return idPelicula;
    }

    public void setIdPelicula(int idPelicula)
    {
        this.idPelicula = idPelicula;
    }

    public String getTitulo()
    {
        return titulo;
    }

    public void setTitulo(String titulo)
    {
        this.titulo = titulo;
    }

    public int getAnno()
    {
        return anno;
    }

    public void setAnno(int anno)
    {
        this.anno = anno;
    }

    public boolean isTieneOscar()
    {
        return tieneOscar;
    }

    public void setTieneOscar(boolean tieneOscar)
    {
        this.tieneOscar = tieneOscar;
    }

    public double getValoracion()
    {
        return valoracion;
    }

    public void setValoracion(double valoracion)
    {
        this.valoracion = valoracion;
    }
    //metodo

    @Override
    public String toString()
    {
        String cadena ="\n"+"Titulo: "+this.titulo+"\n"
                + "Anno: "+this.anno+"\n"
                + "Tiene oscar: "+this.tieneOscar+"\n"
                + "Valoracion: "+this.valoracion+"\n";
        return cadena;
    }
}

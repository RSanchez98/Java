package com.company;

public class Pokemon
{
    // ATRIBUTOS*********************************************************************************************************
    private int id;
    private String nombre;
    private String tipo;
    private int ataque;
    private int defensa;
    private int vida;
    private int ataqueespecial;
    private int defensaespecial;
    private int velocidad;
    private String habilidad;
    private boolean capturado;

    // CONSTRUCORES******************************************************************************************************
    public Pokemon()
    {

    }

    public Pokemon(int id, String nombre, String tipo, int ataque, int defensa, int vida, int ataqueespecial, int defensaespecial, int velocidad, String habilidad, boolean capturado)
    {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.ataque = ataque;
        this.defensa = defensa;
        this.vida = vida;
        this.ataqueespecial = ataqueespecial;
        this.defensaespecial = defensaespecial;
        this.velocidad = velocidad;
        this.habilidad = habilidad;
        this.capturado = capturado;
    }

    // PORPIEDADES*******************************************************************************************************

    public int getId()
    {
        return id;
    }

    public String getNombre()
    {
        return nombre;
    }

    public String getTipo()
    {
        return tipo;
    }

    public int getAtaque()
    {
        return ataque;
    }

    public int getDefensa()
    {
        return defensa;
    }

    public int getVida()
    {
        return vida;
    }

    public int getAtaqueespecial()
    {
        return ataqueespecial;
    }

    public int getDefensaespecial()
    {
        return defensaespecial;
    }

    public int getVelocidad()
    {
        return velocidad;
    }

    public String getHabilidad()
    {
        return habilidad;
    }

    public boolean getCapturado()
    {
        return capturado;
    }

    public void setCapturado(boolean capturado)
    {
        this.capturado = capturado;
    }

    // METODOS***********************************************************************************************************

    @Override
    public String toString()
    {
        return "Pokemon{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", tipo ='"+ tipo + '\'' +
                ", ataque=" + ataque +
                ", defensa=" + defensa +
                ", vida=" + vida +
                ", ataqueespecial=" + ataqueespecial +
                ", defensaespecial=" + defensaespecial +
                ", velocida=" + velocidad +
                ", habilidad='" + habilidad + '\'' +
                ", capturado=" + capturado +
                '}';
    }
}

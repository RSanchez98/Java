package com.company;

import java.time.LocalDate;

enum RazaGato
{
    Comun, Siames, Persa, Angora, ScottishFold
}
public class Gato extends Animal
{
    //ATRIBUTOS*********************************************************************************************************
    private RazaGato raza;
    private String microchip;

    //PORPIEDADES*******************************************************************************************************
    public RazaGato getRaza()
    {
        return raza;
    }
    public String getMicrochip()
    {
        return microchip;
    }



    //CONSTRUCORES******************************************************************************************************
    public Gato(String nombre, RazaGato raza, LocalDate fechaNacimiento, double peso,  String microchip)
    {
        super(nombre, fechaNacimiento, peso);
        this.raza = raza;
        this.microchip = microchip;
        this.comentarios = "";
    }

    //METODOS***********************************************************************************************************
    @Override
    public String toString()
    {
        String cadena;
        cadena = "FICHA DE GATO" + "\n" +
                "Nombre: "+ this.nombre + "\n"+
                "Raza: " + this.raza + "\n"+
                "Fecha de Nacimiento: "+ this.fechaNacimiento+"\n"+
                "Peso: "+this.peso+"\n"+
                "Microchip: "+this.microchip+"\n"+
                "Comentarios: "+this.comentarios+"\n";
        return cadena;
    }
}

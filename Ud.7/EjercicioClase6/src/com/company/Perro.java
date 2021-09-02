package com.company;

import java.time.LocalDate;

enum RazaPerro
{
    PastorAleman, Husky, FoxTerrier, Dalmata, SanBernardo
}
public class Perro extends Animal
{
    //ATRIBUTOS*********************************************************************************************************
    private RazaPerro raza;
    private String microchip;


    //PORPIEDADES*******************************************************************************************************
    public RazaPerro getRaza()
    {
        return raza;
    }
    public String getMicrochip()
    {
        return microchip;
    }



    //CONSTRUCORES******************************************************************************************************
    public Perro(String nombre, RazaPerro raza, LocalDate fechaNacimiento, double peso,  String microchip)
    {
        super(nombre, fechaNacimiento, peso);
        this.raza = raza;
        this.microchip = microchip;
        this.comentarios = "";
    }


    @Override
    public String toString()
    {
        String cadena;
        cadena = "FICHA DE PERRO" + "\n" +
                "Nombre: "+ this.nombre + "\n"+
                "Raza: " + this.raza + "\n"+
                "Fecha de Nacimiento: "+ this.fechaNacimiento+"\n"+
                "Peso: "+this.peso+"\n"+
                "Microchip: "+this.microchip+"\n"+
                "Comentarios: "+this.comentarios+"\n";
        return cadena;
    }
}

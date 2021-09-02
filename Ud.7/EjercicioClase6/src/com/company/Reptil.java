package com.company;


import java.time.LocalDate;

enum EspecieReptil
{
    Tortuga, Iguana, DragonDeComodo
}
public class Reptil extends Animal
{
    //ATRIBUTOS*********************************************************************************************************
    EspecieReptil especie;
    boolean venenoso;

    //PORPIEDADES*******************************************************************************************************
    public EspecieReptil getEspecie()
    {
        return especie;
    }
    public boolean getvenenoso()
    {
        return venenoso;
    }



    //CONSTRUCORES******************************************************************************************************
    public Reptil(String nombre, EspecieReptil especie, LocalDate fechaNacimiento, double peso, boolean venenoso)
    {
        super(nombre, fechaNacimiento, peso);
        this.especie = especie;
        this.venenoso = venenoso;
        this.comentarios = "";
    }

    //METODOS***********************************************************************************************************
    @Override
    public String toString()
    {
        String cadena;
        cadena = "FICHA DE REPTIL" + "\n" +
                "Nombre: "+ this.nombre + "\n"+
                "Especie: " + this.especie + "\n"+
                "Fecha de Nacimiento: "+ this.fechaNacimiento+"\n"+
                "Peso: "+this.peso+"\n"+
                "Venenoso: "+this.venenoso+"\n"+
                "Comentarios: "+this.comentarios+"\n";
        return cadena;
    }
}

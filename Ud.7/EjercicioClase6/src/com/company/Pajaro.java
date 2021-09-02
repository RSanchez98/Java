package com.company;

import java.time.LocalDate;

enum EspeciePajaro
{
    Canario, Periquito, Agapornis
}
public class Pajaro extends Animal
{
    //ATRIBUTOS*********************************************************************************************************
    private EspeciePajaro especie;
    private boolean cantor;

    //PORPIEDADES*******************************************************************************************************
    public EspeciePajaro getEspecie()
    {
        return especie;
    }
    public boolean getcantor()
    {
        return cantor;
    }



    //CONSTRUCORES******************************************************************************************************
    public Pajaro(String nombre, EspeciePajaro especie, LocalDate fechaNacimiento,  double peso, boolean cantor)
    {
        super(nombre, fechaNacimiento, peso);
        this.especie = especie;
        this.cantor = cantor;
        this.comentarios = "";
    }

    //METODOS***********************************************************************************************************
    @Override
    public String toString()
    {
        String cadena;
        cadena = "FICHA DE PAJARO" + "\n" +
                "Nombre: "+ this.nombre + "\n"+
                "Especie: " + this.especie + "\n"+
                "Fecha de Nacimiento: "+ this.fechaNacimiento+"\n"+
                "Peso: "+this.peso+"\n"+
                "Cantor: "+this.cantor+"\n"+
                "Comentarios: "+this.comentarios+"\n";
        return cadena;
    }
}

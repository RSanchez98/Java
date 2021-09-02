package com.company;

import java.time.LocalDate;

public class Actor
{
    private int idActor;
    private String actor;
    private LocalDate fechaNacimiento;

    public Actor(int idActor, String actor, LocalDate fechaNacimiento)
    {
        this.idActor=idActor;
        this.actor=actor;
        this.fechaNacimiento=fechaNacimiento;
    }

    public String getActor()
    {
        return actor;
    }

    public void setActor(String actor)
    {
        this.actor = actor;
    }

    public LocalDate getFechaNacimiento()
    {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento)
    {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString()
    {
        String cadena="\n"+"Id Actor: "+this.idActor+"\n"
                +"Nombre Actor: "+this.actor+"\n"
                +"Fehca de nacimiento: "+this.fechaNacimiento+"\n";
        return cadena;
    }
}


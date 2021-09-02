package com.company;

import java.time.LocalDate;

public class ActorPelicula {

    //ATRIBUTOS:
    private int id;
    private String nombre;
    private LocalDate fechaNacimiento;
    private boolean principal;

    //CONSTRUCTOR:
    public ActorPelicula(int id, String nombre, LocalDate fechaNacimiento, boolean principal)
    {
        this.id = id;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.principal = principal;
    }

    //PROPIEDADES
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public boolean isPrincipal() {
        return principal;
    }

    public void setPrincipal(boolean principal) {
        this.principal = principal;
    }

    //MÉTODOS:
    public String toString()
    {
        String cadena = "\n"+"Nombre: " + this.nombre + "\n"
                + "Fecha de nacimiento: " + this.fechaNacimiento+"\n";
        return cadena;
    }
}

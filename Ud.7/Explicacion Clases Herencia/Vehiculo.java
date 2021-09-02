package com.company;

public abstract class Vehiculo
{
    // Protected significa que se tiene acceso desde la propia clase y desde las
    // clases que heredan de esta
    // Con Private sólo se tendría acceso desde la propia clase pero no desde
    // las clases hijos
    protected String matricula;

    @Override
    public String toString()
    {
        return "Vehiculo{" +
                "matricula='" + matricula + '\'' +
                '}';
    }

    //public abstract boolean tieneMatricula();
}

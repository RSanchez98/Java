package com.company;

public class Moto extends Vehiculo
{
    public boolean tieneSidecar;

    @Override
    public String toString()
    {
        return "Moto{" +
                "tieneSidecar=" + tieneSidecar +
                ", matricula='" + matricula + '\'' +
                '}';
    }

    public boolean tieneMatricula()
    {
        return !this.matricula.equals("");
    }
}

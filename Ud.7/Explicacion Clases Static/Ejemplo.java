package com.company;

enum DiaSemana
{
    lunes, martes, miercoles, jueves, viernes, sabado, domingo
}

enum Palo
{
    oros, copas, espadas, bastos
}

enum TipoMoneda
{
    dolar, euro, yen, libra
}

enum TipoJuego
{
    jugadorVsJugador, pcVsJugador, jugadorVsPc, pcVsPc
}

public class Ejemplo
{
    int a;
    static int s;

    static
    {
        s = 1000;
    }

    public Ejemplo(int a)
    {
        this.a = a;
    }

    public void escribeS()
    {
        System.out.println(s);
    }

    public void incrementaS()
    {
        s = s + 1;
    }

    public static void incrementa100()
    {
        s = s + 100;
    }
}

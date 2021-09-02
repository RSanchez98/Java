package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main
{

    public static void main(String[] args)
    {
        //Los registros son un tipo de datos
        //Pueden tener dentro datos de diferentes tipos
        //Cada dato que va dentro tiene un nombre

        //En Java no existen los registros: struct

        CuentaBanco cb = new CuentaBanco();

        cb.numeroCuenta = "ES989898989898564654";
        cb.porpietario = "Antonio Garcia Rodriguez";
        cb.saldo = 14.5;
        cb.bloqueada = false;

        List<CuentaBanco> lista = new ArrayList<>();

        lista.add(cb);//añado a una lista

    }
}
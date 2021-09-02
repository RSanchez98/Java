package com.company;

public class Main
{

    public static void main(String[] args)
    {
        System.out.println(diaSemana(4));
    }
    public static String diaSemana(int dia)
    {
        String texto;
        switch (dia)
        {
            case 1: texto = "lunes"; break;
            case 2: texto = "martes"; break;
            case 3: texto = "miercoles"; break;
            case 4: texto = "jueves"; break;
            case 5: texto = "viernes"; break;
            case 6: texto = "sabado"; break;
            case 7: texto = "domingo"; break;
            default: texto = "error"; break;
        }
        return texto;
    }
}

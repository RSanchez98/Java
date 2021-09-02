package com.company;

public class Main
{

    public static void main(String[] args)
    {
        String cadena = "puede caer una bien buena";
        System.out.println("La frase <<"+cadena+">> tiene "+cuentaDiptongos(cadena)+" diptongo/s");
    }

    public static int cuentaDiptongos(String cadena)
    {
        int i,j;
        int cont = 0;
        String[]diptongos={"ai","ahi","ia","ü","au","ua","ue","eu","ou","uo","ui","iu","io","ió","oy","oi","ie","ei"};
        String[]arrayCadena=cadena.split(" ");

        for (i = 0; i<arrayCadena.length; i++)
        {
            for (j = 0; j< diptongos.length; j++)
            {
                int posicion=arrayCadena[i].indexOf(diptongos[j]);
                if (posicion!=-1)
                {
                    cont++;
                }
            }
        }
        return cont;
    }
}
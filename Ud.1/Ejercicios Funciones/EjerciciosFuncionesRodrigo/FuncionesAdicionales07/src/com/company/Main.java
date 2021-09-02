package com.company;

import java.util.Scanner;

public class Main
{
    public static boolean annoBisiesto(int anno)
    {
        boolean resultado;

        if(anno % 4 == 0)
        {
            if(anno % 100 == 0)
            {
                if(anno % 400 == 0)
                {
                    resultado = true;
                }
                else
                {
                    resultado = false;
                }
            }
            else
            {
                resultado = true;
            }
        }
        else
        {
            resultado = false;
        }
        return resultado;
    }

    public static int diasMes2(int mes, int anno)
    {
        int dias;
        boolean bisiesto;
        bisiesto = false;

        if(anno % 4 == 0 && anno % 100 != 0 || anno % 400 == 0)
        {
            bisiesto = true;
        }

        if(!bisiesto) //bisiesto == false
        {
            dias = diasMes(mes);
        }
        else
        {
            dias = diasMesBisiesto(mes);
        }

        return dias;
    }

    public static int diasMes(int mesNoBisiesto)
    {
        int texto;

        switch (mesNoBisiesto)
        {
            case 1: texto = 31; break;
            case 2: texto = 28; break;
            case 3: texto = 31; break;
            case 4: texto = 30; break;
            case 5: texto = 31; break;
            case 6: texto = 30; break;
            case 7: texto = 31; break;
            case 8: texto = 31; break;
            case 9: texto = 30; break;
            case 10: texto = 31; break;
            case 11: texto = 30; break;
            case 12: texto = 31; break;
            default: texto = 0;break;
        }
        return texto;
    }

    public static int diasMesBisiesto(int mesbisiesto)
    {
        int texto;

        switch (mesbisiesto)
        {
            case 1: texto = 31; break;
            case 2: texto = 29; break;
            case 3: texto = 31; break;
            case 4: texto = 30; break;
            case 5: texto = 31; break;
            case 6: texto = 30; break;
            case 7: texto = 31; break;
            case 8: texto = 31; break;
            case 9: texto = 30; break;
            case 10: texto = 31; break;
            case 11: texto = 30; break;
            case 12: texto = 31; break;
            default: texto = 0;break;
        }
        return texto;
    }

    public static String mesTexto (int numeroMes)
    {
        String mes;

        switch (numeroMes)
        {
            case 1 : mes = "ENERO"; break;
            case 2: mes = "FEBRERO"; break;
            case 3: mes = "MARZO"; break;
            case 4: mes = "ABRIL"; break;
            case 5: mes = "MAYO"; break;
            case 6: mes = "JUNIO"; break;
            case 7: mes = "JULIO"; break;
            case 8: mes = "AGOSTO"; break;
            case 9: mes = "SEPTIEMBRE"; break;
            case 10: mes = "OCTUBRE"; break;
            case 11: mes = "NOVIEMBRE"; break;
            case 12: mes = "DICIEMBRE"; break;
            default: mes = "ERROR"; break;
        }

        return mes;
    }

    public static String diaSemanaTexto(int diaSemana)
    {
        String texto;

        switch (diaSemana)
        {
            case 1: texto = "L"; break;
            case 2: texto = "M"; break;
            case 3: texto = "X"; break;
            case 4: texto = "J"; break;
            case 5: texto = "V"; break;
            case 6: texto = "S"; break;
            case 7: texto = "D"; break;
            default: texto = "¿?"; break;
        }
        return texto;
    }

    public static int diasTranscurridos (int dia, int mes, int anno)
    {
        int diasPasados, i;
        diasPasados = 0;
        if (annoBisiesto(anno))
        {
            for (i = 1; i < mes; i++)
            {
                diasPasados = diasPasados + diasMesBisiesto(i);
            }
            diasPasados = diasPasados + dia;
        }

        else
        {
            for (i = 1; i < mes; i++)
            {
                diasPasados = diasPasados + diasMes(i);
            }
            diasPasados = diasPasados + dia;
        }
        return diasPasados;
    }

    public static int diasTranscurridos1980 (int dia, int mes, int anno)
    {
        int i, diasPasados, annoInicio;
        annoInicio = 1980;
        diasPasados = 0;
        while (annoInicio < anno)
        {
            if(annoBisiesto(annoInicio))
            {
                for (i = 1; i <= 12; i++)
                {
                    diasPasados = diasPasados + diasMesBisiesto(i);
                }
            }
            else
            {
                for (i = 1; i <= 12; i++)
                {
                    diasPasados = diasPasados + diasMes(i);
                }
            }
            annoInicio++;
        }
        diasPasados = diasPasados + diasTranscurridos(dia, mes, anno);
        return diasPasados;
    }

    public static int diaSemanaFecha (int dia, int mes, int anno)
    {
        int diasSemana, diasTotales, i;
        int diaFinal;

        diasSemana = 2;
        diasTotales = diasTranscurridos1980(dia, mes, anno);


        for (i = 1; i < diasTotales; i++)
        {
            if (diasSemana < 7)
            {
                diasSemana++;
            }
            else
            {
                diasSemana = 1;
            }
        }
        diaFinal = diasSemana;
        return diaFinal;
    }



    public static void calendarioGrafico(int mes, int anno)
    {
        int diaSemana, diasMes, i;

        diaSemana = diaSemanaFecha(1, mes, anno); //diaSemanaFecha me dice si el dia es lunes, martes, miercoles....
        diasMes = diasMes2(mes, anno); //te dice cuantos dias tiene ese mes teniendo en cuenta los años bisiestos

        System.out.println(" L   M   X   J   V   S   D");

        for(i = 1; i < diaSemana; i++)
        {
            System.out.print("    "); //espacio que hay cuando hay un hueco vacio
        }

        for(i = 1; i <= diasMes; i++)
        {
            if(i < 10)
            {
                System.out.print(" "); // espacio cuando el numero es de una cifra
            }
            System.out.print(i + "  "); //separación entre numeros
            diaSemana++;

            if(diaSemana == 8)
            {
                diaSemana = 1;
                System.out.println();
            }
        }
    }

    /*public static void calendarioGrafico(int mes, int anno)
    {
        int diaSemana, diasDelMes, i, j, contador;

        contador = diaSemanaFecha(1, mes, anno);

        for (diaSemana = 1; diaSemana <= 7; diaSemana++)
        {
            System.out.print(" " + diaSemanaTexto(diaSemana) + " ");
        }
        System.out.println();

        diasDelMes = diasMes2(mes, anno);

        for (i = 1; i <= diasDelMes; i++)
        {
            if (contador < 7)
            {
                System.out.println();
                contador = 1;
            }
            if (i == 1)
            {
                for (j = 1; j < contador; j++)
                {
                    System.out.print("  ");
                }
                System.out.print(" " + i + " ");
                contador++;
            }
            else
            {
                if (i < 10)
                {
                    System.out.print(" " + i + " ");
                }
                else
                {
                    System.out.print(i + " ");
                }
            }
        }
    }*/

    public static void main(String[] args)
    {
        int mes, anno;
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduce el mes");
        mes = sc.nextInt();
        System.out.println("Introduce el año");
        anno = sc.nextInt();

        System.out.println(" - "+mesTexto(mes)+" - ");
        calendarioGrafico(mes, anno);
    }
}
//Escribe la función calendarioGrafico a la que le pasas dos parámetros: el mes y el año.
//La función nos escribirá por pantalla un calendario del mes indicado.
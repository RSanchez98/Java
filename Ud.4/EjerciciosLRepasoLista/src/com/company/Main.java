package com.company;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        int ejercicio;
        System.out.println("********MENÚ********");
        System.out.println();
        System.out.println("Ejercicio 1");
        System.out.println("Ejercicio 2");
        System.out.println("Ejercicio 3");
        System.out.println("Ejercicio 5");
        System.out.println("Ejercicio 6");
        System.out.println("Ejercicio 7");
        System.out.println("Ejercicio 8");
        System.out.println("Ejercicio 9");
        System.out.println("Ejercicio 10");
        System.out.println("Ejercicio 11");
        System.out.println("Ejercicio 12");
        System.out.println("Ejercicio 13");
        System.out.println("Ejercicio 14");
        System.out.println("Ejercicio 15");
        System.out.println("Ejercicio 16");
        System.out.println("Ejercicio 17");
        System.out.println("Ejercicio 18");
        System.out.println();
        System.out.print("Elige un ejercicio: ");
        ejercicio = sc.nextInt();
        System.out.println();
        System.out.println("******** EJERCICIO " + ejercicio + " ********");

        switch (ejercicio)
        {
            case 1: //leeLista
            {
                List<Integer> lista = new ArrayList<>();
                leeLista(lista);
                System.out.println(lista);
            }
            break;
            case 2: //leeListaN
            {
                List<Integer> lista = new ArrayList<>();
                int longitud;
                System.out.print("Longitud: ");
                longitud = sc.nextInt();
                leeListaN(lista, longitud);
                System.out.println(lista);

            }
            break;
            case 3: //escribeLista
            {
                List<Integer> lista = new ArrayList<>();
                int longitud;
                System.out.print("Longitud: ");
                longitud = sc.nextInt();
                leeListaN(lista, longitud);
                escribeLista(lista);
            }
            break;
            case 4: //eliminaNegativos
            {
                List<Integer> lista = new ArrayList<>();
                int longitud;
                System.out.print("Longitud: ");
                longitud = sc.nextInt();
                leeListaN(lista, longitud);
                escribeLista(lista);
                System.out.println();
                eliminaNegativos(lista);
                escribeLista(lista);
            }
            break;
            case 5: //clasificaNumeros
            {
                List<Integer> positivos = new ArrayList<>();
                List<Integer> negativos = new ArrayList<>();
                List<Integer> lista = new ArrayList<>();
                int longitud;
                System.out.print("Longitud: ");
                longitud=sc.nextInt();
                leeListaN(lista, longitud);
                System.out.print("Original: ");
                escribeLista(lista);

                clasificaNumeros(lista, positivos, negativos);
                System.out.println();
                System.out.print("Positivos: ");
                escribeLista(positivos);

                System.out.println();
                System.out.print("Negativos: ");
                escribeLista(negativos);
            }
            break;
            case 6: //eliminaRepetidos
            {
                List<Integer> lista = new ArrayList<>();
                List<Integer> clear = new ArrayList<>();
                int longitud;
                System.out.print("Longitud: ");
                longitud = sc.nextInt();
                leeListaN(lista, longitud);
                System.out.print("Lista original: ");
                escribeLista(lista);
                System.out.println();

                eliminaRepetidos(lista, clear);
                System.out.print("Lista limpia: ");
                escribeLista(clear);
            }
            break;
            case 7: //ordenaListaSeleccion
            {
                List<Integer> lista = new ArrayList<>();
                int longitud;
                System.out.print("Longitud: ");
                longitud = sc.nextInt();
                leeListaN(lista, longitud);
                escribeLista(lista);
                System.out.println();
                ordenaListaSeleccion(lista);
                escribeLista(lista);
            }
            break;
            case 8: //ordenaListaInsercion
            {

            }
            break;
            case 9: //ordenaListaPalabras
            {

            }
            break;
            case 10: //ordenaListaPalabras2
            {

            }
            break;
            case 11: //insertaArrayEnArrayPro
            {


            }
            break;
            case 12:
            {

            }
            break;
            case 13:
            {

            }
            break;
            case 14:
            {

            }
            break;
            case 15:
            {

            }
            break;
            case 16:
            {

            }
            break;
            case 17:
            {

            }
            break;
            case 18:
            {

            }
            break;
        }
    }

    private static void ordenaListaSeleccion(List<Integer> lista)
    {
        List<Integer> resultado = new ArrayList<>();
        int i, peque, siguiente, posicion;

        while (lista.size()>0)
        {
            peque = lista.get(0);
            posicion = 0;

            for (i = 1; i < lista.size(); i++)
            {
                siguiente = lista.get(i);

                if (siguiente<peque)
                {
                    peque=siguiente;
                    posicion = i;
                }
            }
            resultado.add(peque);
            lista.remove(posicion);
        }
        lista.addAll(resultado);
    }

    private static void eliminaRepetidos(List<Integer> lista, List<Integer> clear)
    {
        int i;

        for (i = 0; i < lista.size(); i++)
        {
            if (!(clear.contains(lista.get(i))))
            {
                clear.add(lista.get(i));
            }
        }
    }

    private static void clasificaNumeros(List<Integer> lista, List<Integer> positivos, List<Integer> negativos)
    {
        int i;
        for (i = 0; i < lista.size(); i++)
        {
            if (lista.get(i)>=0)
            {
                positivos.add(lista.get(i));

            }
            else
            {
                negativos.add(lista.get(i));
            }
        }
    }

    private static void eliminaNegativos(List<Integer> lista)
    {
        int i;
        for (i = 0; i < lista.size(); i++)
        {
            if (lista.get(i)<0)
            {
                lista.remove(i);
            }
        }
    }

    private static void escribeLista(List<Integer> lista)
    {
        int i;
        System.out.print("<");
        for (i=0; i<lista.size(); i++)
        {
            if (i<lista.size()-1)
            {
                System.out.print(lista.get(i)+", ");
            }
            else
            {
                System.out.print(lista.get(i));
            }
        }
        System.out.print(">");
    }

    private static void leeListaN(List<Integer> lista, int longitud)
    {
        Scanner sc = new Scanner(System.in);
        int i, num, cont = 1;
        System.out.print("Valor de "+cont+": ");
        num = sc.nextInt();
        lista.add(num);
        cont++;
        for (i = 0; i < longitud-1; i++)
        {
            System.out.print("Valor de "+cont+": ");
            num = sc.nextInt();
            lista.add(num);
            cont++;
        }
    }

    private static void leeLista(List<Integer> lista)
    {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Introduce un numero: ");
        num = sc.nextInt();
        lista.add(num);

        while (num!=-1)
        {
            System.out.print("Introduce un numero: ");
            num = sc.nextInt();
            lista.add(num);
        }
        lista.remove(lista.size()-1);
    }



}

package com.company;

import java.util.Arrays;

public class Main
{

    public static void main(String[] args)
    {
        //Definicions array bidimensional
        int[][] array;             //el numero de corchetes indica el numero de dimensiones
        array = new int[2][3];     //array de 2 x 3 (2 filas 3 columnas)
        array[0][0] = 5;
        array[0][1] = 7;
        array[0][2] = 9;
        array[1][0] = -5;
        array[1][1] = -7;
        array[1][2] = -9;
        System.out.println(Arrays.toString(array[0]));
        System.out.println(Arrays.toString(array[1]));
        System.out.println("**************************");

        //Recorriendo un array bidimensional
        int i, j;
        for (i = 0; i < 2; i++) //recorre las filas
        {
            for (j = 0; j < 3; j++) //recorre las columnas
            {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Hay " + cuentaPositivos(array) + " positivos");

        System.out.println("*****************");


        //Inicializando el array con valores
        int [][] b = {{1,2,3},{4,5,6}};     //dos filas y tres columnas
        int[][] c = {{1,2},{3,4},{5,6}};    //tres filas y dos columnas

        int [][]d={{1,2,3},{4,5}};          //NOOOOOOOOOOOOOOOOOOOOOOO

        String[][]e= {{"tomate","pepino"},{"naranja","manzana"}};
        System.out.println(Arrays.toString(b[0]));
        System.out.println(Arrays.toString(b[1]));

        System.out.println(Arrays.toString(c[0]));
        System.out.println(Arrays.toString(c[1]));

        System.out.println(Arrays.toString(e[0]));
        System.out.println(Arrays.toString(e[1]));
        System.out.println("*******************");

    }

    public static int cuentaPositivos(int[][] a)
    {
        int cont = 0, i, j;
        for (i = 0; i < a.length; i++) //a.length = nº de filas
        {
            for (j = 0; j < a[i].length; j++) //a[x].length = nº de columnas
            {
                if (a[i][j] > 0)
                {
                    cont++;
                }
            }
        }
        return  cont;
    }
}
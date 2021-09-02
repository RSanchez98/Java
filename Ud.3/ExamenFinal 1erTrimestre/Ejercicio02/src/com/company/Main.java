package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        int[]array={4,-5,1,2,-1};
        escribeArray(separaNegativosPostivos(array));
    }

    public static void escribeArray (int[] array)
    {
        int i;
        System.out.print("[");
        for (i = 0; i < array.length -1 ; i++)
        {
            System.out.print(array[i]+", ");
        }
        System.out.print(array[i] + "]");
    }

    public static int[]separaNegativosPostivos(int[]array)
    {
        int[] arrayFin = new int[array.length];
        int contPositivo = 0;
        int contNegativo = 0;
        int i, j, k;

        for (i = 0; i < array.length; i++)
        {
            if (array[i] < 0)
            {
                contNegativo++;
            }
            else
            {
                contPositivo++;
            }
        }

        int[] arrayPos = new int[contPositivo];
        int[] arrayNeg = new int[contNegativo];

        for (i = 0; i < arrayNeg.length; i++)
        {
            for (j = 0; j < array.length; j++)
            {
                if (array[j] < 0)
                {
                    arrayNeg[i] = array[j];
                    i++;
                }
            }
        }
        for (i = 0; i<arrayPos.length; i++)
        {
            for (j = 0; j <array.length; j++)
            {
                if (array[j]>=0)
                {
                    arrayPos[i]=array[j];
                    i++;
                }
            }
        }
        //concatena las array
        int indice= 0;
        while (indice<arrayFin.length)
        {
            for(i = 0; i < arrayNeg.length; i++)
            {
                arrayFin[indice]=arrayNeg[i];
                indice++;
            }
            for (i = 0; i<arrayPos.length; i++)
            {
                arrayFin[indice]=arrayPos[i];
                indice++;
            }
        }
        return arrayFin;
    }
}
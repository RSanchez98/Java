package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int[]array={4,8,9,1,5};
        graficaBarras(array);
    }
    public static void graficaBarras(int[]array)
    {
        int valor = 0, i;

        for (i = 0; i < array.length; i++)
        {
            if (array[i]<0||array[i]>9)
            {
                valor++;
            }
        }

        if (valor==0)
        {
            int horizontal, vertical;

             for (vertical = 9; vertical>0;vertical--)
             {
                 for (horizontal=0;horizontal<array.length;horizontal++)
                 {
                     if (array[horizontal]!=vertical)
                     {
                         System.out.print("·");
                         System.out.print(" ");
                     }
                     else
                     {
                         System.out.print("█");
                         System.out.print(" ");
                         array[horizontal]=array[horizontal]-1;
                     }
                 }
                 System.out.println();
             }
        }
        else
        {
            System.out.println("ERROR");
        }
    }
}

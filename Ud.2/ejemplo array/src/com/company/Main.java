package com.company;

public class Main
{

    public static void main(String[] args)
    {
         //definición de la variable array

        a = new int[5]; //inicializacion del array

        int[] b = new int[5]; //definición e inicialización

        a[0] = 1; //guardamos el 1 en la posición 0 del array
        a[1] = 5;
        a[2] = 9;
        a[3] = 2;
        a[4] = 7;
        int[] a2 = {1,5,9,2,7}; //lo mismo de arriba

        System.out.println(a[0]); //escribimos por pantalla lo que haya en la posición 0
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]);
        System.out.println(a[4]);

        System.out.println("**************");
        int i;

        for (i = 0; i < 5; i++)
        {
            System.out.println(a[i]);
        }

        System.out.println("**************");
        for (i = 0; i < a.length; i++) //a.length --> hasta la longitud del array
        {
            System.out.println(a[i]);
        }

        System.out.println("**************");
        escribeArray(a);

        System.out.println("**************");
        int[]c=new int[5];
        leeArray(c);
    }

    public static void escribeArray(int[] a)
    {
        int i;

        for (i=0;i < a.length; i++)
        {
            System.out.println(a[i]);
        }
    }
    public static void leeArray(int[] a)
    {

    }
}

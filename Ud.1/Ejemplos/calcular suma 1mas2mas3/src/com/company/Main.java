package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int i, suma;
        i = 1;
        suma= 0;

        while (i<=10)
        {
            suma = suma + i;
            i = i + 1;
        }
        System.out.println("La suma es " + suma);
    }
}
package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int i, suma;
        i = 2;
        suma = 0;

        while (i <= 1000)
        {
            suma = suma + i;
            System.out.println(i);
            i = i + 2;
        }
        System.out.println("***********");
        System.out.println(suma);
    }
}
//Calcular la suma de todos los números pares entre 1 y 1000. Es decir, 2 + 4 + 6 + ... + 998
//+ 1000
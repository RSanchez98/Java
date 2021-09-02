package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int i, j;
        j = 0;

        for (i = 0; i <= 1000; i = i + 2)
        {
            System.out.println(i);
            j = j + i;

            if (i == 1000)
            {
                System.out.println("********");
                System.out.println(j);
            }
        }
    }
}
//Calcular la suma de todos los números pares entre 1 y 1000. Es decir, 2 + 4 + 6 + ... + 998
//+ 1000.
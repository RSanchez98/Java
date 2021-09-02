package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int i, n;
        n = 1;

        for (i = 1; i<=10; i++)
        {
            if (n % 2 != 0 && n % 3 != 0)
            {
                System.out.println(n);
            }
            else
            {
                i--;
            }
            n++;
        }
    }
}
//Escribe un programa que nos escriba los 10 primeros números que no sean múltiplos ni
//de 2 ni de 3.
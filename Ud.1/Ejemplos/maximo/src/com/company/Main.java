package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int i, n1, max;

        System.out.println("dime un numero");
        n1 = sc.nextInt();
        max = n1;

        i = 2;

        while (i <= 5)
        {
            System.out.println("dime otro numero");
            n1 = sc.nextInt();
            if (n1 > max)
            {
                max = n1;
            }
        }
        System.out.println("el maximo es "+max);

        /*System.out.println("dime otro numero");
        n2 = sc.nextInt();

        if (n2> n1)
        {
            max = n2;
        }

        System.out.println("Dime el tercero");
        n3 = sc.nextInt();

        if (n3>max)
        {
            max=n3;
        }*/
    }
}


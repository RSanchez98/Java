package com.company;

public class Main
{
    public static boolean bisiesto(int anno)
    {
        if(anno % 4 == 0 && anno != 100 || anno % 400 == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void bisiestosXXI()
    {
        int i;
        for (i = 2001; i < 2100; i++)
        {
            if (bisiesto(i)==true)
            {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args)
    {
        bisiestosXXI();
    }
}
//Escribe una función bisiestosXXI que nos escriba por pantalla todos los años bisiestos
//del siglo XXI.
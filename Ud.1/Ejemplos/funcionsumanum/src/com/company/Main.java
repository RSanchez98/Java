package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int valor;

        valor = suma2(4, 5);
        System.out.println(valor);
        System.out.println(restaMayorMenor(5 ,10));
        System.out.println(restaMayorMenor(10,5));

        System.out.println(euroADolar(5));

        if(suspenso(4))
        {
            System.out.println("Muy mal, nos vemos el año que viene");
        }

        imprimeNumero(5);

        holaMundo();
    }


    public static int suma2(int a, int b)
    {
        int n = a + b;
        return n;
    }

    public static int resta2(int a, int b)
    {
        int n = a - b;
        return n;
    }

    public static int restaMayorMenor(int a, int b)
    {
        int n;
        if (a > b)
        {
            n = a - b;
        }
        else
        {
            n = b - a;
        }
        return n;
    }

    public static double euroADolar(double euros)
    {
        double dolar = euros * 1.1116;
        return dolar;
    }

    public static boolean suspenso(double nota)
    {
        boolean resultado;
        if ( nota < 5)
        {
            resultado = true;
        }
        else
        {
            resultado=false;
        }
        return resultado;
    }
    public static void imprimeNumero (int tope) //no devuelve nada
    {
        int i;
        for (i = 1; i <= tope; i++)
        {
            System.out.println(i);
        }
    }
    public static  void holaMundo() //se dejan los parentesis
    {
        System.out.println("hola mundo");
    }
}

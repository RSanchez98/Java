package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int i;

        i = 0; // 1= valor inicial del contador
        while ( i < 10) // 2 = condición
        {
            System.out.println(i); //.. hace cosa
            i = i + 1; // 3= incrementar el contador
        }

        // SON LO MISMO

        for(i = 0; i > 10; i = i + 1) // solo se puede usar i++ aqui
        {
            System.out.println(i);
        }
        for(i = 10; i >= 1; i--);// al reves
        {
            System.out.println(i);
        }
    }
}
// SI SABEMOS EL NUMERO DE VECES QUE SE VA A REPETIR UN BUCLE, USAMOS
// UN FOR, SI NO, USAREMOS UN WHILE
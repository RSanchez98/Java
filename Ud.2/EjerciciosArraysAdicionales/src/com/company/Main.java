package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int ejercicio;
        System.out.println("********MENÚ********");
        System.out.println();
        System.out.println("Ejercicio 1");
        System.out.println("Ejercicio 2");
        System.out.println("Ejercicio 3");
        System.out.println("Ejercicio 5");
        System.out.println("Ejercicio 6");
        System.out.println("Ejercicio 7");
        System.out.println("Ejercicio 8");
        System.out.println("Ejercicio 9");
        System.out.println("Ejercicio 10");
        System.out.println("Ejercicio 11");
        System.out.println("Ejercicio 12");
        System.out.println("Ejercicio 13");
        System.out.println("Ejercicio 14");
        System.out.println("Ejercicio 15");
        System.out.println("Ejercicio 16");
        System.out.println();
        System.out.print("Elige un ejercicio: ");
        ejercicio = sc.nextInt();
        System.out.println();
        System.out.println("******** EJERCICIO "+ejercicio+" ********");

        switch (ejercicio)
        {
            /*case 1://intercambiaParImpar
                int[]n={1,2,3,4,5,6};
                System.out.println(intercambiaParImpar(n));
                break;*/
            case 2:
            {
                int[] n = {4, 9, 2, 9, 9, 9, 6, 8, 6, 1, 5, 0, 1, 7, 5, 6};
                if (compruebaTarjeta(n))
                {
                    System.out.println("Es valida");
                }
                else
                {
                    System.out.println("No es valida");
                }
            }
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
        }
    }
    public static void leeArray5 (int[] n)
    {
        Scanner sc = new Scanner(System.in);
        int i, num;
        for (i = 0; i < 5; i++)
        {
            System.out.print(i + 1 + ". Introduce un numero: ");
            num = sc.nextInt();
            n[i] = num;
        }
    }
    public static void escribeArray (int[] n)
    {
        int i;
        System.out.print("[");
        for (i = 0; i < n.length -1 ; i++)
        {
            System.out.print(n[i]+", ");
        }
        System.out.print(n[i] + "]");
    }
    /*1.*//*Escribe la función intercambiaParImpar. A esta función le pasaremos un array de
enteros por parámetro y en ese mismo array intercambiará los elementos de las
posiciones pares por los elementos de las posiciones impares: el elemento de la posición
0 se intercambiará con el de la posición 1, el de la posición 2 con el de la posición 3, etc.
El array tendrá que tener un número par de elementos (2, 4, 6, etc.). De no ser así, la
función mostrará un mensaje de error y dejará el array como estaba.*/
    /*public static int[] intercambiaParImpar(int[]n)
    {
        int i, array2;
        for (i = 1; i<n.length-1;i++)
        {
            if (i % 2 != 0)
            {
                array2=n[i];
                n[i]=n[i+1];
                n[i+1]=array2;
            }
            else
            {
                array2=n[i];
                n[i]=n[i-1];
                n[i-1]=array2;
            }
        }
        return n;
    }*/

    /*2.*//*Escribe la función compruebaTarjeta. A esta función le pasaremos un array de enteros
con los 16 números de una tarjeta de crédito. La función nos devolverá un boolean que
será true si el número de tarjeta es correcto y false si no lo es. Para averiguar si un
número de tarjeta de crédito es correcto utilizaremos el siguiente algoritmo:
1. Multiplicar por dos los valores que estén en las posiciones pares del array (0, 2, …).
2. Si algún valor es mayor que 10, restarle 9 a ese valor.
3. Sumar todos los valores. Si el resultado es múltiplo de 10, la tarjeta es buena.
Ejemplos de tarjetas válidas: 5565 8666 4522 7307, 4929 9968 6150 1756
Nota: No os carguéis el array inicial. Si el array no tiene 16 elementos, devolver false
directamente.*/
    public static boolean compruebaTarjeta(int[]n)
    {
        int i, valor, valorFinal = 0;
        boolean validacion = true;
        if (n.length<16)
        {
            validacion = false;
        }
        else
        {
            for (i = 0; i<n.length;i=i+2)
            {
                valor = n[i]*2;
                if (valor>=10)
                {
                    valor = valor - 9;
                    valorFinal = valorFinal + valor;
                }
                else
                {
                    valorFinal = valorFinal + valor;
                }
            }
            for ( i=1; i<n.length; i = i + 2)
            {
                valorFinal = valorFinal + n[i];
            }
            if (valorFinal%10!=0)
            {
                validacion = false;
            }
        }
        return validacion;
    }
}

package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        char neko = '猫';
        System.out.println(neko);

        char c = 'a';
        String s = "hola";
        String s1 = "a";
        String s0 = "";

        //Como copiar una cadena

        String scopia = s;
        s = "patata";

        // Operaciones con cadenas

        String s2 = "hola" + "adios";
        s2 = "El resultado es " + 5;
        s2 = "cadena" + 'a' + "cadena";

        String s3 = "hola";
        s3 = s3 + "adios"; // no se "suma"adios, sino que se modifica s3 para que a partir de ahora sea "hola adios"

        // Para recorres una cadena con un for

        String s4 = "patata";
        int i;
        for (i = 0; i < s4.length(); i++)
        {
            System.out.println(s4.charAt(i)); //devuleve el caracter que hay en una posición. Es lo mismo que s4[i]
        }
        // Contar el numero de veces que aparece "a" en la cadena
        int cont = 0;
        for (i = 0; i < s4.length(); i++)
        {
            if (s4.charAt(i) == 'a')
            {
                cont++;
            }
        }

        //Quita el caracter "a" de una cadena

        String s5 = ""; //cadena vacía pq es DONDE se copia la cadena
        for (i = 0; i < s4.length(); i++)
        {
            if (s4.charAt(i) != 'a')
            {
                s5 = s5 + s4.charAt(i); // copia una cadena a la otra
            }
            System.out.println(s5);
        }

        //Como se lee una cadena del teclado

        //Scanner sc = new Scanner(System.in);
        //String s6 = sc.nextLine();
        //s6 = sc.next(); //solo lee hasta el siguiente seprarador

        //int n = sc.nextInt();
        //sc.nextLine(); //limpiar el buffer antes de leer una cadena

        //Funciones de cadenas
        String s7 = "patata";

        if (s5.equals(s7)) //comparar cadenas
        {
            System.out.println("Son iguales");
        }
        /*if (!s5.equals(s7))*/  //son distintos

        //s7.compareTo() //Compara dos cadenas alfabeticamente
        //Devuelve 0 si son iguales
        //Devuelve <0 si la primera es mas pequeña y >0 al contrario

        //s7.contains() //nos dice si la cadena contiene algo
        if (s7.contains("pa"))
        {
        }

        //s7.indexOf('a') //nos dice la posición de algo
        //devuelve -1 si no está
        int pos = s7.indexOf('a');
        int pos2 = s7.indexOf('a', pos + 1);

        //para ver si la cadena está vacia
        if (s7.isEmpty())
        {
        }

        // para ver si una cadena empeiza por o acaba por
        if (s7.startsWith("<html>"))
        {
        }
        if (s7.endsWith(".ese"))
        {
        }

        //para convertir una cadena a mayusculas o minusculas
        s7="Patata";
        System.out.println(s7.toUpperCase());
        System.out.println(s7.toLowerCase());

        char c1= 'a';
        char cMay = Character.toUpperCase(c1);
        char cMin = Character.toLowerCase(c1);

        //funciones de caracteres para ver que tipo de caracter es
        if (Character.isLetter(c1))
        {}
        if (Character.isDigit(c1))
        {}
        if (Character.isUpperCase(c1))
        {}
        if (Character.isLowerCase(c1))
        {}

        //una funcion muy chula que NO HAY QUE USAR = replace
        String s8 = "hola----adios--goodbye";
        s8 = s8.replace("--", "-");
        s8 = s8.replace('a', 'u');
        System.out.println(s8);

        // Trim = quita espacioes de delante y detras
        String s9 ="    hola    ";
        s9 = s9.trim();
        System.out.println(">"+s9+"<");


        // convertir cadena en array y viceversa
        // no se usa

        String s10 = "hola que tal";
        char[]array=s10.toCharArray();
        array[0]='H';
        s10 = new String(array); //array a cadena
        System.out.println(s10);

        //SubString = recorta una subcadena
        String s11 = "holiwi que tal";
        String s12 = s11.substring(0,4); //ulitma no incluida
        System.out.println(s12);
        //String s13 = s11.substring(9, s11.length());
        String s13 = s11.substring(9); //desde el 9 hasta el final
        System.out.println(s13);

        //cambiar la q por una X
        String s14 = s11.substring(0,7)+"X"+s11.substring(8);
        System.out.println(s14);

        //Split y Join = trocear una cadena y pegarla de nuevo
        String s15 ="Hola que tal";
        String[] palabras = s15.split(" ");// crea 3 cadenas porque cada vez que encuentra un espacio, corta

        //Escribe la primer a letra de la ultima palabra
        System.out.println(palabras[2].charAt(0)); // de la plabra 2 = tal, me muestras la primera letra 0=t
        String ultimaPalabra = palabras[2];
        char primeraLetra = ultimaPalabra.charAt(0);

        // cambio que por QUE
        palabras[1] = "QUE";

        // recomopnemos la cadena
        String s16 = String.join(" ", palabras);
        System.out.println(s16);
    }
}
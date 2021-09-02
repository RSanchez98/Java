package com.company;

import java.util.Scanner;

public class Main
{
    public static void resolucionCamara(double megapixel)
    {
        double x, y, resultado;
        double pixel = megapixel * 1000000;
        x = Math.sqrt(pixel * (16.0/9.0));
        y = Math.sqrt(pixel * (9.0/16.0));

        System.out.println("x equivale a "+x);
        System.out.println("y equivale a "+y);
    }

    public static void main(String[] args)
    {
        double megapixel, resultado;
        Scanner sc = new Scanner(System.in);
        System.out.println("Vamos a calcular la resolucion de tu cacara");
        System.out.println("Introduce los pixels que tiene");
        megapixel = sc.nextDouble();

        resolucionCamara(megapixel);
    }
}
//Escribe una función “resolucionCamara” a la que le pasas el número de MegaPixels
//que tiene una cámara digital (puede ser un double) y nos dice cuál es la resolución
//máxima de las fotos que hace la cámara. Como no podemos devolver dos valores (la
//altura y la anchura de la imagen), los escribiremos por pantalla.
package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String palabra;
        double euros, pesetas;

        System.out.println("¿Euro o peseta?");
        palabra = sc.nextLine();

        if (palabra.equals("euro")){
            System.out.println("¿Cuántos euros?");
            euros = sc.nextDouble();
            pesetas = euros * 166.386;
            System.out.println(euros + " euros equivale a " + pesetas + " pesetas");
        }
        else {
            if(palabra.equals("peseta")){
                System.out.println("¿Cuántas pesetas?");
                pesetas = sc.nextDouble();
                euros = pesetas / 166.386;
                System.out.println(pesetas + " pesetas equivale a " + euros + " euros");
            }
            else
            {
                System.out.println("Esa moneda no la reconozco");
            }
        }
    }
}
//Leer un número real y un tipo de moneda, que puede ser "euro" o "peseta". Convertir
//la cantidad al tipo de moneda indicado, suponiendo que está expresada en la otra. Por
//ejemplo, si la cantidad es 15 y la moneda es "peseta", se supondrá que se trata de 15 €
//y que hay que convertirlos a pesetas y, por lo tanto, el resultado debe ser 2495.
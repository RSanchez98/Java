package com.company;

import java.util.Scanner;

public class Main {
    public static int eligeOpcion()
    {
        Scanner sc = new Scanner(System.in);
        int opcion;

        System.out.println("1. simplificar");
        System.out.println("2. toString");
        System.out.println("3. negate");
        System.out.println("4. add");
        System.out.println("5. substract");
        System.out.println("6. multiply");
        System.out.println("7. divide");
        System.out.println("8. equals");
        System.out.println("9. compateTo");
        System.out.println();
        System.out.print("Elige una opcion: ");
        opcion = sc.nextInt();
        return opcion;

    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int numerador, denominador;

        int opcion = eligeOpcion();
        System.out.println();
        System.out.println("***********************************");

        System.out.print("Introduzca el numerador: ");
        numerador = sc.nextInt();
        System.out.print("Introducza el denominador: ");
        denominador = sc.nextInt();
        System.out.println();

        Fraccion f = new Fraccion(numerador, denominador);

        switch (opcion)
        {

            case 1:
            {
                System.out.print("Fraccion original: "+f.toString());
                System.out.println();
                f.simplificar();
                System.out.print("Fraccion simplificada: "+f.toString());
            }
            break;
            case 2:
            {
                System.out.println("La fraccion con la que está trabajando es: "+f.toString());
            }
            break;
            case 3:
            {
                System.out.print("Fraccion original: "+f.toString());
                System.out.println();
                f.negate();
                System.out.print("Fraccion negativa: "+f.toString());
            }
            break;
            case 4:
            {
                int numerador2, denominador2;
                System.out.println("La fraccion con la que está trabajando es: "+f.toString());
                System.out.println("A continuacion escriba la fraccion que quiera sumar");
                System.out.print("Numerador: ");
                numerador2 = sc.nextInt();
                System.out.print("Denominador: ");
                denominador2 = sc.nextInt();
                Fraccion f2 = new Fraccion(numerador2, denominador2);
                System.out.println(f.toString()+" + "+f2.toString()+" = "+f.add(f2));
            }
            break;
            case 5:
            {
                int numerador2, denominador2;
                System.out.println("La fraccion con la que está trabajando es: "+f.toString());
                System.out.println("A continuacion escriba la fraccion que quiera restar");
                System.out.print("Numerador: ");
                numerador2 = sc.nextInt();
                System.out.print("Denominador: ");
                denominador2 = sc.nextInt();
                Fraccion f2 = new Fraccion(numerador2, denominador2);
                System.out.println(f.toString()+" - "+f2.toString()+" = "+f.substract(f2));
            }
            break;
            case 6:
            {
                int numerador2, denominador2;
                System.out.println("La fraccion con la que está trabajando es: "+f.toString());
                System.out.println("A continuacion escriba la fraccion que quiera multiplicar");
                System.out.print("Numerador: ");
                numerador2 = sc.nextInt();
                System.out.print("Denominador: ");
                denominador2 = sc.nextInt();
                Fraccion f2 = new Fraccion(numerador2, denominador2);
                System.out.println(f.toString()+" * "+f2.toString()+" = "+f.multiply(f2));
            }
            break;
            case 7:
            {
                int numerador2, denominador2;
                System.out.println("La fraccion con la que está trabajando es: "+f.toString());
                System.out.println("A continuacion escriba la fraccion que quiera dividir");
                System.out.print("Numerador: ");
                numerador2 = sc.nextInt();
                System.out.print("Denominador: ");
                denominador2 = sc.nextInt();
                Fraccion f2 = new Fraccion(numerador2, denominador2);
                System.out.println(f.toString()+" ÷ "+f2.toString()+" = "+f.divide(f2));
            }
            break;
            case 8:
            {
                int numerador2, denominador2;
                System.out.println("La fraccion con la que está trabajando es: "+f.toString());
                System.out.println("A continuacion escriba la fraccion que quiera comparar");
                System.out.print("Numerador: ");
                numerador2 = sc.nextInt();
                System.out.print("Denominador: ");
                denominador2 = sc.nextInt();
                System.out.println();
                Fraccion f2 = new Fraccion(numerador2, denominador2);
                System.out.print("Las fracciones introducidas ");
                if (f.equals(f2)==true)
                {
                    System.out.println("son iguales");
                }
                else
                {
                    System.out.println("son distintas");
                }
            }
            break;
            case 9:
            {
                int numerador2, denominador2;
                System.out.println("La fraccion con la que está trabajando es: "+f.toString());
                System.out.println("A continuacion escriba la fraccion que quiera comparar");
                System.out.print("Numerador: ");
                numerador2 = sc.nextInt();
                System.out.print("Denominador: ");
                denominador2 = sc.nextInt();
                System.out.println();
                Fraccion f2 = new Fraccion(numerador2, denominador2);
                if (f.compareTo(f2)==-1)
                {
                    System.out.println("La fraccion original es menor");
                }
                else
                {
                    if (f.compareTo(f2)==1)
                    {
                        System.out.println("La fraccion original es mayor");
                    }
                    else
                    {
                        System.out.println("Las fracciones son iguales");
                    }
                }
            }
            break;
            default:
            {
                System.out.println("Debe elegir un numero entre 1 y 9");
            }
        }
    }
}

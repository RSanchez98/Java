package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main
{
    public static int eligeOpcion()
    {
        Scanner sc = new Scanner(System.in);
        int opcion;

        System.out.println("1. add");
        System.out.println("2. substract");
        System.out.println("3. multiply");
        System.out.println("4. divide");
        System.out.println("5. negate");
        System.out.println("6. equals");
        System.out.println("7. compareTo");
        System.out.println();
        System.out.print("Elige una opcion: ");
        opcion = sc.nextInt();
        System.out.println();
        return opcion;
    }

    public static TipoMoneda elegirMoneda (String tipo)
    {
        tipo = tipo.toLowerCase();
        switch (tipo)
        {
            case "euro": return TipoMoneda.euro;
            case "dolar": return TipoMoneda.dolar;
            case "yen": return TipoMoneda.yen;
        }
        return null;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        int opcion = eligeOpcion();
        double cantidadDinero;
        String tipoDinero;
        System.out.print("Tipo de moneda: ");
        tipoDinero = sc.next();
        System.out.print("Cantidad de dinero: ");
        cantidadDinero = sc.nextDouble();

        Dinero d1 = new Dinero(cantidadDinero, elegirMoneda(tipoDinero));

        switch (opcion)
        {
            case 1:
            {
                double cantidad;
                String tipo;

                System.out.println("¿Cuál es el tipo de moneda a sumar?");
                tipo = sc.next();
                System.out.println("¿Cuanto le quieres sumar?");
                cantidad = sc.nextDouble();
                System.out.println();

                Dinero d2 = new Dinero(cantidad, elegirMoneda(tipo));
                System.out.println("La suma de "+d1+" + "+d2+" = "+d1.add(d2));
                System.out.println();


            }
            break;
            case 2:
            {
                double cantidad;
                String tipo;

                System.out.println("¿Cuál es el tipo de moneda a restar?");
                tipo = sc.next();
                System.out.println("¿Cuanto le quieres restar?");
                cantidad = sc.nextDouble();
                System.out.println();

                Dinero d2 = new Dinero(cantidad, elegirMoneda(tipo));
                System.out.println("La resta de "+d1+" - "+d2+" = "+d1.substract(d2));
                System.out.println();
            }
            break;
            case 3:
            {
                double cantidad;

                System.out.println("¿Por cuanto lo quieres multipilicar?");
                cantidad = sc.nextDouble();
                System.out.println();


                System.out.println("La multiplicacion de "+d1+" * "+cantidad+" = "+d1.multiply(cantidad));
                System.out.println();
            }
            break;
            case 4:
            {
                double cantidad;

                System.out.println("¿Por cuanto lo quieres dividir?");
                cantidad = sc.nextDouble();
                System.out.println();

                System.out.println("La multiplicacion de "+d1+" ÷ "+cantidad+" = "+d1.divide(cantidad));
                System.out.println();
            }
            break;
            case 5:
            {
                System.out.println(d1+ " en negativo es "+d1.negate());
            }
            break;
            case 6:
            {
                double cantidad;
                String tipo;

                System.out.println("¿Cuál es el tipo de moneda a comparar?");
                tipo = sc.next();
                System.out.println("¿Con cuanto lo quieres comparar?");
                cantidad = sc.nextDouble();
                System.out.println();

                Dinero d2 = new Dinero(cantidad, elegirMoneda(tipo));
                if (d1.equals(d2)==true)
                {
                    System.out.println(d1+" es igual que "+d2);
                }
                else
                {
                    System.out.println(d1+" es distinto de "+d2);
                }
                System.out.println();
            }
            break;
            case 7:
            {
                double cantidad;
                String tipo;

                System.out.println("¿Cuál es el tipo de moneda a comparar?");
                tipo = sc.next();
                System.out.println("¿Con cuanto lo quieres comparar?");
                cantidad = sc.nextDouble();
                System.out.println();

                Dinero d2 = new Dinero(cantidad, elegirMoneda(tipo));
                if (d1.compareTo(d2)==0)
                {
                    System.out.println(d1+" es igual que "+d2);
                }
                else
                {
                    if (d1.compareTo(d2)==1)
                    {
                        System.out.println(d1+" es mayor que "+d2);
                    }
                    else
                    {
                        System.out.println(d1+" es menor que "+d2);
                    }
                }
            }
            break;
            default:
            {
                System.out.println("Esa opcion no es valida o no existe");
            }
        }

    }
}
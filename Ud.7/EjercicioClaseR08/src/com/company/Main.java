package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Longitud l;
        int opcion = -1;
        while (opcion != 0)
        {
            System.out.println();
            System.out.println("BIENVENIDO");
            System.out.println();
            System.out.println("¿Que fucnion quiere ejecutar?");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. ¿Iguales?");
            System.out.println("6. Comparar");
            System.out.println();
            System.out.print("Elige una opcion: ");
            opcion = sc.nextInt();

            switch (opcion)
            {
                case 1:
                {
                    Longitud suma = crearUni();
                    l = crearUni();

                    System.out.print(suma.toString()+" + "+l.toString()+" = ");
                    l.add(suma);
                    System.out.print(l);
                }
                break;
                case 2:
                {
                    Longitud resta = crearUni();
                    l = crearUni();

                    System.out.print(resta.toString()+" - "+l.toString()+" = ");
                    l.substract(resta);
                    System.out.print(l);
                }
                break;
                case 3:
                {
                    Longitud mult = crearUni();
                    System.out.println("Por cuanto lo quieres multiplicar: ");
                    int num = sc.nextInt();

                    System.out.print(mult.toString()+" x "+num+" = ");
                    mult.multiply(num);
                    System.out.print(mult);
                }
                break;
                case 4:
                {
                    Longitud div = crearUni();
                    System.out.println("Entre cuanto lo quieres dividir: ");
                    int num = sc.nextInt();

                    System.out.print(div.toString()+" ÷ "+num+" = ");
                    div.divide(num);
                    System.out.print(div);
                }
                break;
                case 5:
                {
                    Longitud l1 = crearUni();
                    Longitud l2 = crearUni();

                    if (l1.equals(l2))
                    {
                        System.out.println(l1+" y "+l2+ " son iguales");
                    }
                    else
                    {
                        System.out.println(l1+" y "+l2+ " son distintas");

                    }
                }
                break;
                case 6:
                {
                    Longitud l1 = crearUni();
                    Longitud l2 = crearUni();

                    if (l1.compareTo(l2)==0)
                    {
                        System.out.println(l1+" y "+l2+ " son iguales");
                    }
                    else
                    {
                        if (l1.compareTo(l2)==-1)
                        {
                            System.out.println(l1+" es menor que "+l2);
                        }
                        else
                        {
                            System.out.println(l1+" es mayor que "+l2);

                        }
                    }
                }
                break;
            }
        }
    }

    private static Longitud crearUni()
    {
        Scanner sc = new Scanner(System.in);
        Longitud l = new Longitud(0.0, UnidadDeLongitud.metros);
        double num;
        String unidad;
        System.out.println("Introduzca la cantidad");
        num = sc.nextDouble();
        sc.nextLine();
        System.out.println("Indique una unidad de medida ([m]: metros ·· [in]: pulgadas ·· [ft]: pies ·· [yr]: yardas)");
        unidad = sc.nextLine();
        l.setCantidad(num);

        while (true)
        {
            if (unidad.equals("m"))
            {
                l.setUnidad(UnidadDeLongitud.metros);
                return l;
            }
            else
            {
                if (unidad.equals("in"))
                {
                    l.setUnidad(UnidadDeLongitud.pulgadas);
                    return l;
                }
                else
                {
                    if (unidad.equals("ft"))
                    {
                        l.setUnidad(UnidadDeLongitud.pies);
                        return l;
                    }
                    else
                    {
                        if (unidad.equals("yr"))
                        {
                            l.setUnidad(UnidadDeLongitud.yardas);
                            return l;
                        }
                        else
                        {
                            System.out.println("Has introducido mal la unidad de medida");
                        }
                    }
                }
            }
        }
    }
}

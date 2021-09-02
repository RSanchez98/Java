package com.company;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.Scanner;

public class Main
{
    public static int eligeOpcion()
    {
        Scanner sc = new Scanner(System.in);
        int opcion;
        System.out.println("BIENVENIDO A LA CLINICA VETERINARIA");
        System.out.println("¿Qué opcion desea ejecutar?");
        System.out.println();
        System.out.println("1. Añadir Animal");
        System.out.println("2. Modificar comentario");
        System.out.println("3. Mostrar lista de animales");
        System.out.println("0. SALIR");
        System.out.println();
        System.out.print("Eligue una opcion: ");
        opcion = sc.nextInt();
        System.out.println();
        return opcion;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        ClinicaVeterinaria cv = new ClinicaVeterinaria();

        int opcion;
        opcion = eligeOpcion();

        while (opcion!=0)
        {
            switch (opcion)
            {
                case 1:
                {
                    System.out.println();
                    System.out.println("USTED ELIGIO 'AÑADIR ANIMAL'");
                    System.out.println("****************************");
                    int tipoAnimal;
                    System.out.println("¿Qué tipo de animal quieres añadir?");
                    System.out.println(" 1.Perro \n 2.Gato \n 3.Pajaro \n 4.Reptil");
                    System.out.print("Introduzca la opcion: ");
                    tipoAnimal = sc.nextInt();
                    sc.nextLine();
                    System.out.println();

                    String nombre, comentario;
                    LocalDate fdn;
                    double peso;
                    switch (tipoAnimal)
                    {
                        case 1:
                        {
                            RazaPerro raza;
                            String microchip;

                            System.out.println();
                            System.out.print("Nombre del perro: ");
                            nombre = sc.nextLine();
                            System.out.print("Raza del perro (PastorAleman, Husky, FoxTerrier, Dalmata, SanBernardo): ");
                            raza = RazaPerro.valueOf(sc.nextLine());
                            System.out.print("Fecha de nacimiento (AAAA-MM-DD): ");
                            fdn = LocalDate.parse(sc.nextLine());
                            System.out.print("Peso del perro (XX,X): ");
                            peso = sc.nextDouble();
                            sc.nextLine(); //parta limpiar el salto de linea
                            System.out.print("Microchip del perro: ");
                            microchip = sc.nextLine();
                            System.out.print("Comentario: ");
                            comentario = sc.nextLine();

                            Perro p = new Perro(nombre, raza, fdn, peso, microchip);
                            p.setComentarios(comentario);
                            cv.insertaAimal(p);
                        }
                        break;
                        case 2:
                        {
                            RazaGato raza;
                            String microchip;

                            System.out.println();
                            System.out.print("Nombre del gato: ");
                            nombre = sc.nextLine();
                            System.out.print("Raza del gato (Comun, Siames, Persa, Angora, ScottishFold): ");
                            raza = RazaGato.valueOf(sc.nextLine());
                            System.out.println("Fecha de nacimiento (AAAA-MM-DD): ");
                            fdn = LocalDate.parse(sc.nextLine());
                            System.out.print("Peso del gato (XX,X): ");
                            peso= sc.nextDouble();
                            sc.nextLine();
                            System.out.print("Microchip del gato: ");
                            microchip = sc.nextLine();
                            System.out.print("Comentario: ");
                            comentario = sc.nextLine();

                            Gato g = new Gato(nombre, raza, fdn, peso, microchip);
                            g.setComentarios(comentario);
                            cv.insertaAimal(g);
                        }
                        break;
                        case 3:
                        {
                            EspeciePajaro especie;
                            boolean cantor;

                            System.out.println();
                            System.out.print("Nombre del pajaro: ");
                            nombre = sc.nextLine();
                            System.out.print("Especie del pajaro (Canario, Periquito, Agapornis): ");
                            especie = EspeciePajaro.valueOf(sc.nextLine());
                            System.out.println("Fecha de nacimiento (AAAA-MM-DD): ");
                            fdn = LocalDate.parse(sc.nextLine());
                            System.out.print("Peso del pajaro (XX,X): ");
                            peso= sc.nextDouble();
                            sc.nextLine();
                            System.out.print("Cantor (si o no): ");
                            cantor = sc.nextBoolean();
                            System.out.print("Comentario: ");
                            comentario = sc.nextLine();

                            Pajaro p = new Pajaro(nombre, especie, fdn, peso, cantor);
                            p.setComentarios(comentario);
                            cv.insertaAimal(p);
                        }
                        break;
                        case 4:
                        {
                            EspecieReptil especie;
                            boolean venenoso;

                            System.out.println();
                            System.out.print("Nombre del reptil: ");
                            nombre = sc.nextLine();
                            System.out.print("Especie del reptil (Tortuga, Iguana, DragonDeComodo): ");
                            especie =EspecieReptil.valueOf(sc.nextLine());
                            System.out.println("Fecha de nacimiento (AAAA-MM-DD): ");
                            fdn = LocalDate.parse(sc.nextLine());
                            System.out.print("Peso del Reptil (XX,X): ");
                            peso= sc.nextDouble();
                            sc.nextLine();
                            System.out.print("Venenoso (si o no): ");
                            venenoso = sc.nextBoolean();
                            System.out.print("Comentario: ");
                            comentario = sc.nextLine();

                            Reptil r = new Reptil(nombre, especie, fdn, peso, venenoso);
                            r.setComentarios(comentario);
                            cv.insertaAimal(r);
                        }
                        break;
                    }
                }
                break;
                case 2:
                {
                    String nombre, comentario;
                    System.out.println();
                    System.out.println("USTED ELIGIO 'MODIFICAR COMENTARIO'");
                    System.out.println("***********************************");
                    System.out.println("¿Cual es el nombre del animal?");
                    nombre = sc.nextLine();
                    System.out.println("A continuacion, escriba el comentario sobre ese animal");
                    comentario = sc.nextLine();

                    cv.modificaComentarioAnimal(nombre, comentario);
                }
                break;
                case 3:
                {
                    System.out.println();
                    System.out.println("USTED ELIGIO 'MOSTRAR LISTA DE ANIMALES'");
                    System.out.println("*****************************************");
                    System.out.println(cv.toString());
                }
                break;
                default:
                {
                    System.out.println("Introduzaca un numero del 1 al 3 por favor");
                }
            }
            opcion = eligeOpcion();
        }
    }
}

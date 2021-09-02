package com.company;

import java.sql.SQLOutput;
import java.util.*;

public class Main
{
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_RESET = "\u001B[0m";
//    public static void main(String[] args)
//    {
//        /*Carta c = new Carta(9,0);
//
//        System.out.println(c.getNumero());
//        System.out.println(c.getPalo());
//        System.out.println(c.nombreNumero());
//        System.out.println(c.nombrePalo());
//        System.out.println(c.nombreCarta());
//        System.out.println("******");
//        System.out.print("TUTE: "+c.valorTute());
//        System.out.println();
//        System.out.print("MUSE: "+c.valorMus());
//        System.out.println();
//        System.out.println("7yMEDIA: "+c.valor7yMedia());
//        System.out.println("******************************************");
//    }
    public static void juego7Media()
    {


        Scanner sc = new Scanner(System.in);

        List<String>listaDeCartas = new ArrayList<>();
        int tipo, opcion;
        double puntuacion;
        boolean barajar = true;

        System.out.println(ANSI_BLACK+"JUEGO DE LAS 7 Y MEDIA"+ANSI_RESET);
        System.out.println("LET'S GO!");
        System.out.println();
        System.out.println("¿De qué tipo quieres tu baraja? 1=40 cartas, 2=80 cartas ");
        tipo = sc.nextInt();


        Baraja b = new Baraja(tipo, barajar);
        Carta c = b.robar();
        puntuacion = c.valor7yMedia();
        listaDeCartas.add(c.nombreCarta());

        System.out.println("Tu carta es "+ANSI_BLUE+c.nombreCarta()+ANSI_RESET+" y vale "+ANSI_BLUE+c.valor7yMedia()+ANSI_RESET);
        System.out.println();
        System.out.println("¿Que quieres hacer ahora?");
        System.out.println("1. Robar");
        System.out.println("2. Plantarte");
        opcion = sc.nextInt();

        boolean seguir = true;

        while (seguir)
        {
            if (opcion == 1)
            {
                Carta d = b.robar();
                puntuacion = puntuacion + d.valor7yMedia();
                listaDeCartas.add(d.nombreCarta());
                if (puntuacion<=7.5)
                {
                    System.out.println();
                    System.out.println("Tu carta "+ANSI_BLUE+d.nombreCarta()+ANSI_RESET+" tiene un valor de "+ANSI_BLUE+d.valor7yMedia()+ANSI_RESET);
                    System.out.println();
                    System.out.println("En total tienes "+ANSI_CYAN+puntuacion+ANSI_WHITE+" puntos");
                    System.out.println("Y tus cartas actuales son: "+ANSI_PURPLE+listaDeCartas+ANSI_RESET);
                    System.out.println();
                    System.out.println("¿Que quieres hacer ahora?");
                    System.out.println("1. Robar");
                    System.out.println("2. Plantarte");
                    opcion = sc.nextInt();
                }
                else
                {
                    System.out.println();
                    System.out.println(ANSI_RED+"Lastima, has sacado un "+ANSI_BLUE+d.nombreCarta()+ANSI_RESET+" que tiene un valor de "+ANSI_BLUE+d.valor7yMedia()+ANSI_RESET);
                    System.out.println();
                    System.out.println("Tus cartas han sido: "+ANSI_PURPLE+listaDeCartas+ANSI_RESET);
                    System.out.println("Y desgraciadamente has sacado "+ANSI_CYAN+puntuacion+ANSI_WHITE+" puntos, pasandote de 7'5");
                    System.out.println(ANSI_PURPLE+"GAME OVER"+ANSI_RESET);
                    seguir = false;
                }
            }
            else
            {
                if (opcion == 2)
                {
                    System.out.println();
                    System.out.println("Tienes "+ANSI_CYAN+puntuacion+ANSI_WHITE+" puntos con esta listas de cartas: "+ANSI_PURPLE+listaDeCartas+ANSI_RESET);
                    System.out.println(ANSI_GREEN+"ENHORABUENA, tienes menos de 7'5 puntos"+ANSI_RESET);
                    seguir = false;
                }
            }
            while (opcion!=1&&opcion!=2)
            {
                System.out.println("ERROR AL INTORDUCIR UN NUMERO");
                System.out.println("ELIGE: ");
                System.out.println("1. Robar");
                System.out.println("2. palntarte");
                opcion = sc.nextInt();
            }
        }
    }

    public static void juegoBurro()
    {
        Scanner sc = new Scanner(System.in);
        List<String> listaDeCartas = new ArrayList<>();
        List<String> listaDeDescarte = new ArrayList<>();
        System.out.println("BIENVENIDO AL JUEGO DEL BURRO");
        System.out.println("Las normas son: ");
        System.out.println("    - Para ganar debes tener las 4 cartas DEL MISMO PALO");
        System.out.println("    - Debes plantarte cuando lo consigas, si no, perderás ");
        System.out.println("      la oportunidad de ganar por despistado");
        System.out.println("    - La unica forma de perder es quedadote sin cartas en la pila de extracción");
        System.out.println();
        System.out.println("Por ahora vas a jugar solo, ya lo siento pero es lo que hay");
        System.out.println("Te recomiendo que te compres un amigo con nuestro DLC 'Pay to lose'");
        System.out.println();
        System.out.println("EMPECEMOS...");
        System.out.println();
        int tipo;
        boolean barajar = true;
        System.out.println("¿Con cuantas cartas quieres jugar? 1=40 2=80");
        tipo = sc.nextInt();

        Baraja b = new Baraja(tipo, barajar);
        Carta c1 = b.robar();
        listaDeCartas.add(c1.nombreCarta());
        Carta c2 = b.robar();
        listaDeCartas.add(c2.nombreCarta());
        Carta c3 = b.robar();
        listaDeCartas.add(c3.nombreCarta());
        Carta c4 = b.robar();
        listaDeCartas.add(c4.nombreCarta());


        int descarte, opcion;
        System.out.println("Tus cartas ahora mismo son: " + ANSI_PURPLE + listaDeCartas + ANSI_RESET);
        System.out.println();
        System.out.println("¿Que quieres hacer ahora?");
        System.out.println(ANSI_RED + "1. Robar" + ANSI_RESET);
        System.out.println(ANSI_GREEN + "2. Plantarte" + ANSI_RESET);
        opcion = sc.nextInt();
        System.out.println();

        while (opcion == 1)
        {

            System.out.println("¿Cual de ellas quieres descartar? (1, 2, 3, 4)");
            descarte = sc.nextInt();
            System.out.println("Has descartado la carta en la posicion " + descarte);
            listaDeCartas.remove(descarte - 1);
            Carta c5 = b.robar();
            listaDeCartas.add(c5.nombreCarta());
            System.out.println();
            System.out.println("Has robado: " + ANSI_CYAN + c5.nombreCarta() + ANSI_RESET);
            System.out.println("Tus cartas son: " + ANSI_PURPLE + listaDeCartas + ANSI_RESET);
            System.out.println();
            System.out.println("¿Que quieres hacer ahora?");
            System.out.println(ANSI_RED + "1. Robar" + ANSI_RESET);
            System.out.println(ANSI_GREEN + "2. Plantarte" + ANSI_RESET);
            opcion = sc.nextInt();

            if (opcion == 2)
            {
                System.out.println(ANSI_YELLOW + "ENHORABUENA, HAS GANADO" + ANSI_RESET);
                System.out.println("Tus cartas han sido: " + ANSI_PURPLE + listaDeCartas + ANSI_RESET);
            }
        }
    }



    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int juego;
        System.out.println("¿A que juego quieres jugar? ");
        System.out.println("1. 7 y media");
        System.out.println("2. Burro (mi versión)");
        System.out.print("ELIGE: ");
        juego = sc.nextInt();

        switch (juego)
        {
            case 1:
            {
                juego7Media();
            }
            break;
            case 2:
            {
                juegoBurro();
            }
            break;
            default:
            {
                System.out.println("Ese juego no existe");
            }
        }
    }
}
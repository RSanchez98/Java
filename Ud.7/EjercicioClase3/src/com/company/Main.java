package com.company;

import java.util.Scanner;

public class Main
{
    public static int eligeOpcion()
    {
        Scanner sc = new Scanner(System.in);
        int opcion;
        System.out.println("Elige entre una de estas opciones: ");
        System.out.println("1. PvP");
        System.out.println("2. Player vs PC");
        System.out.println("3. PC vs Player");
        System.out.println("4. PC vs PC");
        System.out.println("5. Player vs IA");
        System.out.print("¿A que modalidad quieres jugar? ");
        opcion = sc.nextInt();

        return opcion;
    }

    public static void PvP()
    {
        Scanner sc = new Scanner(System.in);
        TresEnRaya t = new TresEnRaya();
        int player1 = 1, player2 = 2;
        int posicion;
        boolean jugador = true; // true j1 false j2
        t.dibujaTablero();
        while (t.quedanMovimientos() && !t.ganaJugador(player1) && !t.ganaJugador(player2))
        {
            if (jugador == true)
            {
                System.out.print("Elige una posición Player1: ");
                posicion = sc.nextInt();
                while (!t.movimintoValido(posicion))
                {
                    System.out.println("La casilla "+posicion+" está ocupada, debes elegir otra.");
                    System.out.print("Introduce de nuevo la casilla deseada: ");
                    posicion = sc.nextInt();
                }
                t.mueveJugador1(posicion);
                t.dibujaTablero();
                jugador = false;
            }
            else
            {
                System.out.print("Elige una posición Player2: ");
                posicion = sc.nextInt();
                while (!t.movimintoValido(posicion))
                {
                    System.out.println("La casilla "+posicion+" está ocupada, debes elegir otra.");
                    System.out.print("Introduce de nuevo la casilla deseada: ");
                    posicion = sc.nextInt();
                }
                t.mueveJugador2(posicion);
                t.dibujaTablero();
                jugador = true;

                //t.mueveJugador2(posicion);
            }
        }
        if (t.ganaJugador(player1))
        {
            System.out.println("Ha ganado PLAYER1, enhorabuena!");
        }
        else
        {
            if (t.ganaJugador(player2))
            {
                System.out.println("Ha ganado PLAYER2, enhorabuena!");
            }
            else
            {
                System.out.println("EMPATE...");
            }
        }
    }
    public static void PlayerVsPC()
    {
        Scanner sc = new Scanner(System.in);
        TresEnRaya t = new TresEnRaya();
        int posicion;
        int player= 1, ordenador = 2;
        boolean turno = true; //true jugador false pc
        t.dibujaTablero();
        while (t.quedanMovimientos()&&!t.ganaJugador(player)&&!t.ganaJugador(ordenador))
        {
            if (turno == true)
            {
                System.out.print("Jugador, elige una posicion: ");
                posicion = sc.nextInt();
                if (!t.movimintoValido(posicion))
                {
                    System.out.println("La posicion elegida no es valida, jugador");
                    System.out.print("Elige una posición: " );
                    posicion = sc.nextInt();
                }
                t.mueveJugador1(posicion);
                t.dibujaTablero();
                turno=false;
            }
            else
            {
                t.mueveOrdenador2(ordenador);
                t.dibujaTablero();
                turno = true;
            }
        }
        if (t.ganaJugador(player))
        {
            System.out.println("Enhorabuena, ganaste al ordenador");
        }
        else
        {
            if (t.ganaJugador(ordenador))
            {
                System.out.println("Ganó el ordenaor");
                System.out.println("GAME OVER");
            }
            else
            {
                System.out.println("Empate...");
            }
        }
    }
    public static void PCVsPlayer()
    {
        Scanner sc = new Scanner(System.in);
        TresEnRaya t = new TresEnRaya();
        int posicion;
        int player= 1, ordenador = 2;
        boolean turno = false; //true jugador false pc
        t.dibujaTablero();
        while (t.quedanMovimientos()&&!t.ganaJugador(player)&&!t.ganaJugador(ordenador))
        {
            if (turno == false)
            {
                t.mueveOrdenador2(ordenador);
                t.dibujaTablero();
                turno = true;
            }
            else
            {
                System.out.print("Jugador, elige una posicion: ");
                posicion = sc.nextInt();
                if (!t.movimintoValido(posicion))
                {
                    System.out.println("La posicion elegida no es valida, jugador");
                    System.out.print("Elige una posición: " );
                    posicion = sc.nextInt();
                }
                t.mueveJugador1(posicion);
                t.dibujaTablero();
                turno=false;
            }
        }
        if (t.ganaJugador(player))
        {
            System.out.println("Enhorabuena, ganaste al ordenador");
        }
        else
        {
            if (t.ganaJugador(ordenador))
            {
                System.out.println("Ganó el ordenaor");
                System.out.println("GAME OVER");
            }
            else
            {
                System.out.println("Empate...");
            }
        }
    }
    public static void PCVsPC()
    {
        Scanner sc = new Scanner(System.in);
        TresEnRaya t = new TresEnRaya();
        int ordenador1 = 1, ordenador2 = 2;
        boolean turno = false; //true pc1 false pc2
        String tecla="";

        while (t.quedanMovimientos()&&!t.ganaJugador(ordenador1)&&!t.ganaJugador(ordenador2))
        {
            if (turno == true)
            {
                t.mueveOrdenador1(ordenador1);
                t.dibujaTablero();
                System.out.println("Pulse cualquier tecla para pasar al siguiente turno");
                tecla = sc.nextLine();
                turno = false;
            }
            else
            {
                t.mueveOrdenador2(ordenador2);
                t.dibujaTablero();
                System.out.println("Pulse cualquier tecla para pasar al siguiente turno");
                tecla = sc.nextLine();
                turno = true;
            }
        }
        if (t.ganaJugador(ordenador1))
        {
            System.out.println("Ha ganado el ordenador 1 'X'");
        }
        else
        {
            if (t.ganaJugador(ordenador2))
            {
                System.out.println("Ha ganado el ordenador 2 'O'");
            }
            else
            {
                System.out.println("Empate...");
            }
        }
    }
    public static void PlayerVsIA()
    {

    }

    public static void main(String[] args)
    {
        int opcion = eligeOpcion();
        switch (opcion)
        {
            case 1:{PvP();}break;
            case 2:{PlayerVsPC();}break;
            case 3:{PCVsPlayer();}break;
            case 4:{PCVsPC();}break;
            case 5:{PlayerVsIA();}break;
        }


    }
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
}

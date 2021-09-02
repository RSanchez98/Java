package com.company;

import java.security.InvalidParameterException;
import java.util.Random;

public class TresEnRaya
{
    //ATRIBUTOS*********************************************************************************************************
    private int[][] tablero;

    //CONSTRUCORES******************************************************************************************************
    public TresEnRaya()
    {
        this.tablero = new int[3][3];

        int i, j;
        for (i = 0; i < 3; i++)
        {
            for (j = 0; j < 3; j++)
            {
                tablero[i][j]=0;
            }
        }
    }

    //PORPIEDADES*******************************************************************************************************

    //METODOS***********************************************************************************************************
    public void mueveJugador1(int pos)
    {
        if (pos < 1 || pos > 9)
        {
            throw new InvalidParameterException("La posición debe estar entre 1 y 9");
        }
        else
        {
            int x = posicionX(pos);
            int y = posicionY(pos);
        }
        tablero[posicionY(pos)][posicionX(pos)]=1;
    }
    public void mueveJugador2(int pos)
    {
        if (pos < 1 || pos > 9)
        {
            throw new InvalidParameterException("La posición debe estar entre 1 y 9");
        }
        else
        {
            int x = posicionX(pos);
            int y = posicionY(pos);
        }
        tablero[posicionY(pos)][posicionX(pos)]=2;
    }
    public boolean movimintoValido(int pos)
    {
        if (tablero[posicionY(pos)][posicionX(pos)]==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public void mueveOrdenador1(int ordenador)
    {
        Random r = new Random();
        int posAleatoria;
        posAleatoria = r.nextInt(9) + 1;
        while (!movimintoValido(posAleatoria))
        {
            posAleatoria = r.nextInt(9) + 1;
        }
        tablero[posicionY(posAleatoria)][posicionX(posAleatoria)] = 1;
    }
    public void mueveOrdenador2(int ordenador)
    {
        Random r = new Random();
        int posAleatoria;
        posAleatoria = r.nextInt(9) + 1;
        while (!movimintoValido(posAleatoria))
        {
            posAleatoria = r.nextInt(9) + 1;
        }
        tablero[posicionY(posAleatoria)][posicionX(posAleatoria)] = 2;
    }
    public void iniciar()
    {
        int i, j;
        for (i = 0; i < 3; i++)
        {
            for (j = 0; j < 3; j++)
            {
                tablero[i][j]=0;
            }
        }
    }

    public int posicionX(int pos)
    {
        int x = 0;
        switch (pos)
        {
            case 1 : x = 0; break;
            case 2 : x = 1; break;
            case 3 : x = 2; break;

            case 4 : x = 0; break;
            case 5 : x = 1; break;
            case 6 : x = 2; break;

            case 7 : x = 0; break;
            case 8 : x = 1; break;
            case 9 : x = 2; break;
            default:
                System.out.println("Error, la posicion de la X no es correcta");
        }
        return x;
    }
    public int posicionY(int pos)
    {
        int y = 0;
        switch (pos)
        {
            case 1 : y = 2; break;
            case 2 : y = 2; break;
            case 3 : y = 2; break;

            case 4 : y = 1; break;
            case 5 : y = 1; break;
            case 6 : y = 1; break;

            case 7 : y = 0; break;
            case 8 : y = 0; break;
            case 9 : y = 0; break;

            default:
                System.out.println("Error, la posicion de la Y no es correcta");
        }
        return y;
    }

    public boolean quedanMovimientos()
    {
        boolean quedan = false;
        int i, j;
        for (i = 0; i<3; i++)
        {
            for (j = 0; j<3; j++)
            {
                if (tablero[i][j]==0)
                {
                    quedan = true;
                }
            }
        }
        return quedan;
    }

    public boolean ganaJugador1()
    {
        return ganaJugador(1);
    }
    public boolean ganaJugador2()
    {
        return ganaJugador(2);
    }
    public boolean ganaJugador(int jugador)
    {
        int i, j, cont;
        boolean ganador = false;

        for (i = 0; i < 3; i++)
        {
            cont = 0;

            for (j = 0; j < 3; j++)
            {
                if(tablero[i][j]==jugador)
                {
                    cont++;
                }
            }

            if (cont==3)
            {
                ganador = true;
            }
        }

        if(!ganador)
        {
            for (j = 0; j<3; j++)
            {
                cont=0;
                for (i = 0; i < 3;i++)
                {
                    if (tablero[i][j]==jugador)
                    {
                        cont++;
                    }
                }
                if (cont==3)
                {
                    ganador = true;
                }
            }

            if (!ganador)
            {
                if (tablero[0][0] == jugador && tablero[1][1] == jugador && tablero[2][2] == jugador)
                {
                    ganador = true;
                }
            }
            if(!ganador)
            {
                if (tablero[2][0] == jugador && tablero[1][1] == jugador && tablero[0][2] ==  jugador)
                {
                    ganador = true;
                }
            }
        }
    return ganador;
    }
    public void dibujaTablero()
    {
        int i, j;
        int[] columna = {1, 2, 3};
        int[] fila = {1, 2, 3};

        System.out.println();
        /*for (i = 0; i < columna.length; i++)
        {
            *//*System.out.print("    " *//**//*+ columna[i]*//**//*);*//*
        }
        System.out.println();*/

        for (i = 0; i < tablero.length; i++)
        {
            //System.out.print(fila[i]+" ");
            for (j = 0; j < tablero[i].length; j++)
            {
                if (tablero[i][j] == 0)
                {
                    System.out.print(ANSI_BLACK+"| · |"+ANSI_RESET);

                }

                if (tablero[i][j] == 1)
                {
                    System.out.print(ANSI_BLACK+"|"+ANSI_RESET+ANSI_GREEN+" X "+ANSI_RESET+ANSI_BLACK+"|"+ANSI_RESET);
                }

                if (tablero[i][j] == 2)
                {
                    System.out.print(ANSI_BLACK+"|"+ANSI_RESET+ANSI_RED+" O "+ANSI_RESET+ANSI_BLACK+"|"+ANSI_RESET);
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("*****************");
    }
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_RESET = "\u001B[0m";
}

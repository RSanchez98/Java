package com.company;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static int[][] pideValoresUsuario ()
    {
        Scanner sc = new Scanner(System.in);
        int filasArrays, columnasArrays, valor, i, j, columna = 1, fila = 0;

        System.out.println("¿Cuántas filas quieres que tenga su array multidimensional?");
        filasArrays = sc.nextInt();

        System.out.println("¿Cuántas columnas quieres que tenga su array multidimensional?");
        columnasArrays = sc.nextInt();

        int[] [] arrayUsuario = new int[filasArrays][columnasArrays];

        for(i = 0; i < arrayUsuario.length; i++)
        {
            fila++;
            columna = 1;
            for(j = 0; j < arrayUsuario[i].length; j++)
            {
                System.out.println("Escriba el valor " + columna + " del array número " + fila + ":");
                valor = sc.nextInt();
                arrayUsuario[i][j] = valor;
                columna++;
            }
        }

        return arrayUsuario;
    }

    public static void escribeArrayBi (int[][] arrayBidimensional)
    {
        int i, j;

        for(i = 0; i < arrayBidimensional.length; i++)
        {
            for(j = 0; j < arrayBidimensional[i].length; j++)
            {
                if(j < arrayBidimensional[i].length - 1)
                {
                    System.out.print(arrayBidimensional[i][j] + ", ");
                }
                else
                {
                    System.out.print(arrayBidimensional[i][j]);
                }

            }
            System.out.println();
        }
    }

public static int[][]  invierteBi (int [][] arrayMultiCuadrado)
{
    int i, j = 0, fila, columna;
    fila = arrayMultiCuadrado.length;
    columna = arrayMultiCuadrado[0].length;

    int [][] arrayInvertido = new int[fila][columna];

    for(i = 0; i < arrayMultiCuadrado.length; i++)
    {
        for(j = 0; j < arrayMultiCuadrado[i].length; j++)
        {
            arrayInvertido[i][j] = arrayMultiCuadrado[j][i];
        }
    }

    return arrayInvertido;
}

    public static double calculaDeterminante (int[][] arrayDeterminante)
    {
        double determinante;

        determinante = arrayDeterminante[0][0] * arrayDeterminante[1][1] * arrayDeterminante[2][2] + arrayDeterminante[0][1] * arrayDeterminante[1][2] * arrayDeterminante[2][0] + arrayDeterminante[0][2] * arrayDeterminante[1][0] * arrayDeterminante[2][1] -
                arrayDeterminante[0][2] * arrayDeterminante[1][1] * arrayDeterminante[2][0] - arrayDeterminante[0][1] * arrayDeterminante[1][0] * arrayDeterminante[2][2] - arrayDeterminante[0][0] * arrayDeterminante[1][2] * arrayDeterminante[2][1];

        return determinante;
    }

    public static boolean cuadradoMagico (int[][] arrayMagico)
    {
        boolean esMagico = false;
        int i, j, k, primeraDiagonal = 0, segundaDiagonal = 0;

        for(i = 0; i < arrayMagico.length; i++)
        {
            k = arrayMagico[i].length-1;
            for(j = 0; j < arrayMagico[i].length; j++)
            {
                if(j == i)
                {
                    primeraDiagonal = primeraDiagonal + arrayMagico[i][j];
                    segundaDiagonal = segundaDiagonal + arrayMagico[i][k];
                }
                k--;
            }
        }

        if(primeraDiagonal == segundaDiagonal)
        {
            esMagico = true;
        }

        return esMagico;
    }

    public static boolean compruebaArray19 (int [] enteros1a9)
    {
        boolean estanTodos = false;
        List<Integer> numeros = new LinkedList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));

        int i, j = 1, contador = 0;

        for(i = 0; i < enteros1a9.length; i++)
        {
            for(j = 0; j < numeros.size(); j++)
            {
                if(enteros1a9[i] == numeros.get(j))
                {
                    contador++;
                    numeros.remove(Integer.valueOf(numeros.get(j)));
                    j = numeros.size();
                }
            }
        }

        if(contador == enteros1a9.length)
        {
            estanTodos = true;
        }
        return estanTodos;
    }

    public static boolean compruebaSudoku (int [][] arrayMultiSudoku)
    {
        boolean correcto = true;

        int i, j, k, l, contador;

        for(i = 0; i < arrayMultiSudoku.length; i++)
        {
            if(!compruebaArray19(arrayMultiSudoku[i]))
            {
                correcto = false;
                i = arrayMultiSudoku.length;
            }
        }

        int [][] arrayTraspuesto = invierteBi(arrayMultiSudoku);

        for(i = 0; i < arrayMultiSudoku.length; i++)
        {
            if(!compruebaArray19(arrayMultiSudoku[i]))
            {
                correcto = false;
                i = arrayMultiSudoku.length;
            }
        }

        int[] arrayNuevo = new int[9];

        for(i = 0; i < arrayMultiSudoku.length; i = i + 3)
        {
            for(j = 0; j < arrayMultiSudoku.length; j = j + 3)
            {
                contador = 0;
                for(k = i; k < i + 3; k++)
                {
                    for(l = j; l < j + 3; l++)
                    {
                        arrayNuevo[contador] = arrayMultiSudoku[k][l];
                        contador++;
                    }
                }
                if(!compruebaArray19(arrayNuevo))
                    {
                        correcto = false;
                        i = arrayMultiSudoku.length;
                        j = 9;
                    }
            }
        }

        return correcto;
    }

    public static void muestraTablero (int [][] array)
    {
        int i, j;
        int [] columnasTablero = {1,2,3,4,5,6,7,8};
        String filasTablero = "ABCDEFGH";
        String [] arrayLetras = filasTablero.split("");

        for(i = 0; i < columnasTablero.length; i++)
        {
            System.out.print("   " + columnasTablero[i]);
        }
        System.out.println();

        for(i = 0; i < array.length; i++)
        {
            System.out.print(arrayLetras[i]);
            for(j = 0; j < array[i].length; j++)
            {
                if(array[i][j] < 100)
                {
                    System.out.print("  · ");
                }
                if(array[i][j] == 100)
                {
                    System.out.print("  ~ ");
                }
                if(array[i][j] > 100)
                {
                    System.out.print("  B ");
                }
            }
            System.out.println();
        }
    }

    public static boolean quedaBarco(int [][] arrayMultiEscenario)
    {
        boolean quedaAlgunBarco = false;
        int i, j, k;
        for(i = 0; i < arrayMultiEscenario.length; i++)
        {
            for(j = 0; j < arrayMultiEscenario[i].length; j++)
            {
                if(arrayMultiEscenario[i][j] > 0 && arrayMultiEscenario[i][j] < 100)
                {
                    quedaAlgunBarco = true;
                    i = arrayMultiEscenario.length-1;
                }
            }
        }
        return quedaAlgunBarco;
    }
    public static boolean meQuedanBarcos(int posibleBarco, int[][] arrayMultiEscenario)
    {
        boolean aunHayBarco = false;
        int i, j;

        for(i = 0; i < arrayMultiEscenario.length; i++)
        {
            for(j = 0; j < arrayMultiEscenario[i].length; j++)
            {
                if(arrayMultiEscenario[i][j] == posibleBarco)
                {
                    return true;
                }
            }
        }
        return aunHayBarco;
    }

    public static void hundirLaFlota ()
    {
        Scanner sc = new Scanner(System.in);

        int [][] arrayMultiEscenario = {
                {0,1,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0},
                {0,2,2,0,0,0,0,0},
                {0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0},
                {0,0,0,3,3,3,0,0},
                {0,0,0,0,0,0,0,0},
                {0,0,4,4,4,4,0,0}
        };

        String numeros = "12345678";
        String letra = "ABCDEFGH";
        int columna, fila;
        String letraUsuaria;

        while(quedaBarco(arrayMultiEscenario))
        {
            muestraTablero(arrayMultiEscenario);

            System.out.println("Escriba qué fila quiere (de la A a la H)");
            letraUsuaria = sc.next();
            letraUsuaria = letraUsuaria.toUpperCase();
            System.out.println("Escriba qué columna quiere (del 1 al 8)");
            columna = sc.nextInt();

            fila = letra.indexOf(letraUsuaria);
            columna = numeros.indexOf((numeros.charAt(columna)));

            int valor;
            if(arrayMultiEscenario[fila][columna-1] < 100)
            {
                valor = arrayMultiEscenario[fila][columna-1];
                arrayMultiEscenario[fila][columna-1] = valor + 100;

                if(arrayMultiEscenario[fila][columna-1] > 100)
                {
                    if(meQuedanBarcos(valor, arrayMultiEscenario))
                    {
                        System.out.println("¡BARCO TOCADO!");
                    }
                    else
                    {
                        System.out.println("¡TOCADO Y HUNDIDO!");
                    }
                }
                else
                {
                    System.out.println("¡MOSQUIS! ¡AQUÍ HAY AGUA!");
                }
            }
            else
            {
                System.out.println("AQUÍ YA HAS PROBADO SUERTE ANTES.");
            }
        }
    }
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	int opcion;

        System.out.println("---MENÚ---");

        System.out.println("1. Escribe la función invierteBi a la que le pasas un array bidimensional cuadrado (es decir, igual de alto que de ancho) y te lo invierte.");
        System.out.println("2. Escribe la función calculaDeterminante que te calcule el valor de un determinante de 3x3 y te lo devuelva. Si no sabéis cómo se calcula un determinante de 3x3, lo buscáis en el internete.");
        System.out.println("3. Escribe la función cuadradoMagico a la que le pasas un array de 3x3 y te dice si es un cuadrado mágico o no. Un cuadrado mágico es un array bidimensional cuadrado en el cual la suma de cada una de las filas y de cada una de las columnas y de las dos diagonales principales es igual.");
        System.out.println("4. Escribe la función compruebaSudoku a la que le pasas un array de 9x9 enteros y te dice si el array contiene un sudoku correcto (devuelve un Boolean que será true si es correcto). Un sudoku será correcto si en cada fila, en cada columna y en cada submatriz de 3x3 aparecen todos los números del 1 al 9 y una sola vez cada uno.\n" +
                "Se recomienda crear la función compruebaArray19 al que le pasas un array de 9 enteros y te dice si en él se encuentran todos los números del 1 al 9 una sola vez.\n" +
                "Con esta función, sólo tendréis que pasar cada fila, columna y submatriz a un array de 9 enteros y pasárselo a esta función para comprobar si está bien.");
        System.out.println("5. Escribe la función hundirLaFlota que simula el clásico juego de hundir la flota pero en versión solitario (para hacerlo más simple). Para guardar los datos del juego, usaremos un array de 8x8 enteros que contendrá los datos de los barcos y las casillas ya bombardeadas. En este array, colocaremos antes de jugar los barcos usando los siguientes valores para cada casilla:\n" +
                "[0]: Agua\n" +
                "[1]: Barco. Podemos usar diferentes valores (2, 3, etc.) para diferentes barcos; así podremos saber si hemos hundido cada barco o sólo lo hemos tocado.\n" +
                "[100]: Agua ya bombardeada.\n" +
                "[101]: Barco ya bombardeado.\n" +
                "Una vez rellenada la matriz con valores 0 y 1 (y 2, 3, 4, etc., si queremos marcar cada barco de manera independiente), le iremos pidiendo al jugador las coordenadas que quiere bombardear, mostrándole el tablero después de cada jugada. Cuando el jugador elige una casilla, esa casilla se marca como bombardeada (se le suma 100) y se le muestra el resultado de ese bombardeo. El juego termina cuando no quede ningún barco por bombardear.");
        System.out.println("Elija una de las opciones anteriores:");
        opcion = sc.nextInt();


        switch (opcion)
        {
            case 1:
            {
                int[][] arrayBidimensional = pideValoresUsuario();
                escribeArrayBi(invierteBi(arrayBidimensional));
            }
            break;
            case 2:
            {
                int [][] arrayDeterminante = pideValoresUsuario();

                double valorDeterminante;

                valorDeterminante = calculaDeterminante(arrayDeterminante);

                System.out.println("El valor del determinante es: " + valorDeterminante);
            }
            break;
            case 3:
            {
                int [][] arrayMagico = pideValoresUsuario();
                if(cuadradoMagico(arrayMagico))
                {
                    System.out.println("Es un cuadrado mágico.");
                }
                else
                {
                    System.out.println("No es un cuadrado mágico.");
                }
            }
            break;
            case 4:
            {
                int [] enteros1a9 = {1,2,3,4,5,5,6,7,8,9};

                if(compruebaArray19(enteros1a9))
                {
                    System.out.println("Están todos los números del 1 al 9 una sola vez");
                }
                else
                {
                    System.out.println("incorrecto");
                }
            }
            break;
            case 5:
            {
                int [][] arrayMultiSudoku = {{9,6,3,1,7,4,2,5,8},{1,7,8,3,2,5,6,4,9},{2,5,4,6,8,9,7,3,1},{8,2,1,4,3,7,5,9,6},{4,9,6,8,5,2,3,1,7},{7,3,5,9,6,1,8,2,4},{5,8,9,7,1,3,4,6,2},{3,1,7,2,4,6,9,8,5},{6,4,2,5,9,8,1,7,3}};

                if(compruebaSudoku(arrayMultiSudoku))
                {
                    System.out.println("Es correcto el sudoku.");
                }
                else
                {
                    System.out.println("No es correcto el sudoku.");
                }
            }
            break;
            case 6:
            {
                int [][] arrayHundirFlota = new int[8][8];
                int i, j;

                // arrayHundirFlota = hundirLaFlota(arrayHundirFlota);

                for (i = 0; i < arrayHundirFlota.length; i++)
                {
                    for (j = 0; j < arrayHundirFlota[i].length; j++)
                    {
                        System.out.print(arrayHundirFlota[i][j] + " ");
                    }
                    System.out.println();
                }
            }
            case 7:
            {
                int [] enteros1a9 = {1,2,3,4,5,5,6,7,8,9};
                hundirLaFlota();
            }
            break;
            default:
            {
                System.out.println("Ha elegido una opción no válida.");
            }
        }
    }
}

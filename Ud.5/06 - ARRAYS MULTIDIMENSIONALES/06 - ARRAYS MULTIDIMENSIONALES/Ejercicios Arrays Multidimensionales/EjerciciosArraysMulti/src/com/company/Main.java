package com.company;

import java.util.Random;
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

    public static void escribeArray3x3 (int[][] arrayBidimensional)
    {
        int i, j;

        for(i = 0; i < 3; i++)
        {
            for(j = 0; j < 3; j++)
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

    public static void rellena3x3 (int[][] arrayBidimensional)
    {
        int i, j, numeros = 1;

        for(i = 0; i < 3; i++)
        {
            for(j = 0; j < 3; j++)
            {
                    arrayBidimensional[i][j] = numeros;
                    numeros++;
            }
        }
    }

    public static void RellenaAleatorio3x3(int[][] arrayBidimensional)
    {
        Random r = new Random();
        int i, j, aleatorio;

        for(i = 0; i < arrayBidimensional.length; i++)
        {
            for(j = 0; j < arrayBidimensional[i].length; j++)
            {

                aleatorio = r.nextInt(999)+1;
                arrayBidimensional[i][j] = aleatorio;
            }
        }
    }

    public static int sumaArray3x3 (int[][] arrayBidimensional)
    {
        int suma = 0, i, j;

        for(i = 0; i < 3; i++)
        {
            for(j = 0; j < 3; j++)
            {

                suma = suma + arrayBidimensional[i][j];
            }
        }

        return suma;
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

    public static void RellenaAleatorioBi(int[][] arrayBidimensional)
    {
        Random r = new Random();
        int i, j, aleatorio;

        for(i = 0; i < arrayBidimensional.length; i++)
        {
            for(j = 0; j < arrayBidimensional[i].length; j++)
            {

                aleatorio = r.nextInt(999)+1;
                arrayBidimensional[i][j] = aleatorio;
            }
        }
    }

    public static void rellenaEnOrdenbi (int[][] arrayBidimensional)
    {
        int i, j, numeros = 1;

        for(i = 0; i < arrayBidimensional.length; i++)
        {
            for(j = 0; j < arrayBidimensional[i].length; j++)
            {
                arrayBidimensional[i][j] = numeros;
                numeros++;
            }
        }
    }

    public static int sumaArrayBi (int[][] arrayBidimensional)
    {
        int suma = 0, i, j;

        for(i = 0; i < arrayBidimensional.length; i++)
        {
            for(j = 0; j < arrayBidimensional[i].length; j++)
            {

                suma = suma + arrayBidimensional[i][j];
            }
        }

        return suma;
    }

    public static boolean compruebaTamano (int[][] arrayBidimensionalUno, int[][] arrayBidimensionalDos)
    {
        boolean mismotamano;
        int filasUno, filasDos, columnasUno = 0, columnasDos = 0, i;
        filasUno = arrayBidimensionalUno.length;
        filasDos = arrayBidimensionalDos.length;

        for(i = 0; i < arrayBidimensionalUno.length; i++)
        {
            columnasUno = arrayBidimensionalUno[i].length;
        }

        for(i = 0; i < arrayBidimensionalDos.length; i++)
        {
            columnasDos = arrayBidimensionalDos[i].length;
        }

        if(filasUno == filasDos && columnasUno == columnasDos)
        {
            mismotamano = true;
        }
        else
        {
            mismotamano = false;
        }

        return mismotamano;
    }
    public static void suma2ArrayBi (int[][] arrayBidimensionalUno, int[][] arrayBidimensionalDos, int[][] arrayBidimensionalVacio)
    {
        int i, j;

        if(!compruebaTamano(arrayBidimensionalUno,arrayBidimensionalDos) || !compruebaTamano(arrayBidimensionalDos,arrayBidimensionalVacio))
        {
            System.out.println("¡ERROR! Los hay arrays no tienen el mismo tamaño.");
        }
        else
        {
            for(i = 0; i < arrayBidimensionalVacio.length; i++)
            {
                for(j = 0; j < arrayBidimensionalVacio[i].length; j++)
                {
                    arrayBidimensionalVacio[i][j] = arrayBidimensionalUno[i][j] + arrayBidimensionalDos[i][j];
                }
            }
        }
    }

    public static void copiaArrayBi (int[][] arrayMultiUno, int [][] arrayMultiVacio)
    {
        int i, j;
        for(i = 0; i < arrayMultiUno.length; i++)
        {
            for(j = 0; j < arrayMultiUno[i].length; j++)
            {
                arrayMultiVacio[i][j] = arrayMultiUno[i][j];
            }
        }
    }

    public static int[][] copiaArrayBiPro (int[][] arrayMultiUno)
    {
        int[][] arrayMultiVacio = new int[arrayMultiUno.length][arrayMultiUno[0].length];
        int i, j;
        for(i = 0; i < arrayMultiUno.length; i++)
        {
            for(j = 0; j < arrayMultiUno[i].length; j++)
            {
                arrayMultiVacio[i][j] = arrayMultiUno[i][j];
            }
        }

        return arrayMultiVacio;
    }

    public static void rellenaArrayAjedrez (int[][] arrayMultiAjedrez)
    {
        int i, j, contador = 1;
        for(i = 0; i < arrayMultiAjedrez.length; i++)
        {
            for(j = 0; j < arrayMultiAjedrez[i].length; j++)
            {
                if(contador % 2 == 0)
                {
                    arrayMultiAjedrez[i][j] = 1;
                }
                if(contador % 2 != 0)
                {
                    arrayMultiAjedrez[i][j] = 0;
                }
                contador++;
            }
            contador++;
        }
    }


    public static void rellenaDiagonal (int[][] arrayMultiDiagonal)
    {
       int i = 0, j, uno = 0;

       while(i < arrayMultiDiagonal.length)
       {
           arrayMultiDiagonal[i][uno] = 1;
           for(j = 0; j < arrayMultiDiagonal[i].length-1; j++)
           {
               if(j < uno)
               {
                  arrayMultiDiagonal[i][j] = 3;
               }
               else
               {
                  arrayMultiDiagonal[i][j+1] = 2;
               }
           }
           i++;
           uno++;
       }
    }

    public static void rellenaX (int[][] arrayMultiDiagonal)
    {
        int i = 0, j, primeraDiagonal = 0, segundaDiagonal = arrayMultiDiagonal.length;

        while(i < arrayMultiDiagonal.length)
        {
            for(j = 0; j < arrayMultiDiagonal[i].length; j++)
            {
             arrayMultiDiagonal[i][j] = 2;
            }
            arrayMultiDiagonal[i][primeraDiagonal] = 1;
            arrayMultiDiagonal[i][segundaDiagonal-1] = 1;
            i++;
            primeraDiagonal++;
            segundaDiagonal--;
        }
    }

    public static void rellenaCuadros (int[][] arrayMultiCuadrado)
    {
        int i, j, k, contadorFilas = 0, contadorColumnas = 0, auxiliar = 0;

        for(i = 0; i < arrayMultiCuadrado.length; i++)
        {
            if(contadorFilas < arrayMultiCuadrado.length/2)
            {
                for(j = 0; j < arrayMultiCuadrado[i].length; j++)
                {
                    if(contadorColumnas < arrayMultiCuadrado.length/2)
                    {
                        arrayMultiCuadrado[i][j] = 1;
                        contadorColumnas++;
                    }
                    else
                    {
                        arrayMultiCuadrado[i][j] = 2;
                        contadorColumnas++;
                    }
                }
                contadorColumnas = 0;
            }
            else
            {
                for(j = 0; j < arrayMultiCuadrado[i].length; j++)
                {
                    if(contadorColumnas < arrayMultiCuadrado.length/2)
                    {
                        arrayMultiCuadrado[i][j] = 3;
                        contadorColumnas++;
                    }
                    else
                    {
                        arrayMultiCuadrado[i][j] = 4;
                        contadorColumnas++;
                    }
                }
                contadorColumnas = 0;
            }
            contadorFilas++;
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcion;

        System.out.println("----MENÚ----");
        System.out.println("1. Escribe la función escribeArray3x3 a la que le pasas un array bidimensional de tamaño 3x3 y te lo imprime por pantalla (que quede bonito).");
        System.out.println("2. Escribe la función rellena3x3 a la que le pasas un array bidimensional de 3x3 y te lo rellena con los números del 1 al 9. ");
        System.out.println("3. Escribe la función RellenaAleatorio3x3 a la que le pasas un array bidimensional de tamaño 3x3 y te lo rellena con números aleatorios. ");
        System.out.println("4. Escribe la función sumaArray3x3 a la que le pasas un array de 3x3 y te suma todos los números. Te devuelve un entero con el resultado.");
        System.out.println("5. Escribe la función escribeArrayBi a la que le pasas un array bidimensional de cualquier tamaño y te lo imprime por pantalla. ");
        System.out.println("6. Escribe la función rellenaAleatorioBi a la que le pasas un array bidimensional de cualquier tamaño y te lo rellena con números aleatorios. ");
        System.out.println("7. Escribe la función rellenaEnordenBi a la que le pasas un array bidimensional de cualquier tamaño y te lo rellena con los números a partir del 1 en orden. ");
        System.out.println("8. Escribe la función sumaArrayBi a la que le pasas un array bidimensional y te suma todos los números. Te devuelve un entero con el resultado. ");
        System.out.println("9. Escribe la función suma2ArraysBi que hace lo mismo, pero con tres arrays bidimensionales de cualquier tamaño (siempre y cuando todos tengan las mismas dimensiones). ");
        System.out.println("10. Escribe la función copiaArrayBi a la que le pasas dos arrays, uno con datos y otro vacío, y te copia el contenido del primero al segundo. ");
        System.out.println("11. Escribe la función copiaArrayBiPro a la que le pasas un array y te devuelve otro del mismo tamaño y con los mismos datos. ");
        System.out.println("12. Escribe la función rellenaArrayAjedrez que te rellena un array de 8x8 con la forma de un tablero de ajedrez, usando el valor 1 para las casillas blancas y 0 para las negras. ");
        System.out.println("13. Escribe la función rellenaDiagonal que te rellena un array cuadrado con el número ‘1’ en la diagonal principal, el número ‘2’ en el triángulo que queda por encima y el ‘3’ en el triángulo que queda por debajo. ");
        System.out.println("14. Escribe la función rellenaX que te rellena un array cuadrado con el número ‘1’ en las dos diagonales y el ‘2’ en el resto. ");
        System.out.println("15. Escribe la función rellenaCuadros que te rellena un array cuadrado de lado par (o sea, 2x2, 4x4, 6x6, etc.) en cuatro cuadros. El cuadro superior izquierdo lo rellena con ‘1’, el superior derecho, con ‘2’, el inferior izquierdo con ‘3’ y el inferior derecho con ‘4’.  ");
        System.out.println("Elige una de las opciones anteriores:");
        opcion = sc.nextInt();

        switch (opcion)
        {
            case 1:
            {
                //int[][] arrayBidimensional = pideValoresUsuario();
                //int[][] arrayBidimensional = {{1,2,3},{4,5,6},{7,8,9}};

                //escribeArray3x3(arrayBidimensional);
                escribeArray3x3(pideValoresUsuario());
            }
            break;
            case 2:
            {
                int[][] arrayBidimensional = new int[3][3];
                rellena3x3(arrayBidimensional);
                escribeArray3x3(arrayBidimensional);
            }
            break;
            case 3:
            {
                int[][] arrayBidimensional = new int[3][3];
                RellenaAleatorio3x3(arrayBidimensional);
                escribeArray3x3(arrayBidimensional);
            }
            break;
            case 4:
            {
                int[][] arrayBidimensional = new int[3][3];
                int suma;
                rellena3x3(arrayBidimensional);
                suma = sumaArray3x3(arrayBidimensional);
                System.out.println("El valor total de la suma de todos los elementos del array multidimensional es: " + suma);
            }
            break;
            case 5:
            {
                escribeArrayBi(pideValoresUsuario());
            }
            break;
            case 6:
            {
                int filas, columnas;
                System.out.println("¿Cuántas filas quieres que tenga su array?");
                filas = sc.nextInt();

                System.out.println("¿Cuántas columnas quieres que tenga su array?");
                columnas = sc.nextInt();
                int[][] arrayBidimensional = new int[filas][columnas];

                RellenaAleatorioBi(arrayBidimensional);
                escribeArrayBi(arrayBidimensional);
            }
            break;
            case 7:
            {
                int filas, columnas;
                System.out.println("¿Cuántas filas quieres que tenga su array?");
                filas = sc.nextInt();

                System.out.println("¿Cuántas columnas quieres que tenga su array?");
                columnas = sc.nextInt();
                int[][] arrayBidimensional = new int[filas][columnas];

                rellenaEnOrdenbi(arrayBidimensional);
                escribeArrayBi(arrayBidimensional);
            }
            break;
            case 8:
            {
                int suma;
                //int[][] arrayBidimensional = pideValoresUsuario();
                //suma = sumaArrayBi(arrayBidimensional);

                suma = sumaArrayBi(pideValoresUsuario());

                System.out.println("El valor total de la suma de todos los elementos del array multidimensional es: " + suma);

            }
            break;
            case 9:
            {
                int[][] arrayBidimensionalUno = pideValoresUsuario();
                int[][] arrayBidimensionalDos = pideValoresUsuario();

                int filas, columnas;
                System.out.println("¿Cuántas filas quieres que tenga su array?");
                filas = sc.nextInt();

                System.out.println("¿Cuántas columnas quieres que tenga su array?");
                columnas = sc.nextInt();
                int[][] arrayBidimensionalVacio = new int[filas][columnas];

                suma2ArrayBi(arrayBidimensionalUno,arrayBidimensionalDos,arrayBidimensionalVacio);
                if(compruebaTamano(arrayBidimensionalUno,arrayBidimensionalDos) && compruebaTamano(arrayBidimensionalDos,arrayBidimensionalVacio))
                {
                    escribeArrayBi(arrayBidimensionalVacio);
                }
            }
            break;
            case 10:
            {
                int[][] arrayMultiUno = pideValoresUsuario();
                int[][] arrayMultiVacio = new int[arrayMultiUno.length][arrayMultiUno[0].length];

                copiaArrayBi(arrayMultiUno,arrayMultiVacio);
                escribeArrayBi(arrayMultiVacio);
            }
            break;
            case 11:
            {
                int[][] arrayMultiUno = pideValoresUsuario();

                escribeArrayBi(copiaArrayBiPro(arrayMultiUno));
            }
            break;
            case 12:
            {
                int[][] arrayMultiAjedrez = new int[8][8];

                rellenaArrayAjedrez(arrayMultiAjedrez);

                escribeArrayBi(arrayMultiAjedrez);
            }
            break;
            case 13:
            {
                int[][] arrayMultiDiagonal = new int[7][7];

                rellenaDiagonal(arrayMultiDiagonal);

                escribeArrayBi(arrayMultiDiagonal);
            }
            break;
            case 14:
            {
                int[][] arrayMultiDiagonal = new int[7][7];

                rellenaX(arrayMultiDiagonal);

                escribeArrayBi(arrayMultiDiagonal);

                System.out.println();
            }
            break;
            case 15:
            {
                int[][] arrayMultiDiagonal = new int[8][8];

                rellenaCuadros(arrayMultiDiagonal);

                escribeArrayBi(arrayMultiDiagonal);

                System.out.println();
            }
            break;
            default:
            {
                System.out.println("Ha elegido un número incorrecto.");
            }
            break;
        }


    }
}

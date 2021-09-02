package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int ejercicio;
        System.out.println("********MENÚ********");
        System.out.println();
        System.out.println("Ejercicio 1");
        System.out.println("Ejercicio 2");
        System.out.println("Ejercicio 3");
        System.out.println("Ejercicio 5");
        System.out.println("Ejercicio 6");
        System.out.println("Ejercicio 7");
        System.out.println("Ejercicio 8");
        System.out.println("Ejercicio 9");
        System.out.println("Ejercicio 10");
        System.out.println("Ejercicio 11");
        System.out.println("Ejercicio 12");
        System.out.println("Ejercicio 13");
        System.out.println("Ejercicio 14");
        System.out.println("Ejercicio 15");
        System.out.println();
        System.out.print("Elige un ejercicio: ");
        ejercicio = sc.nextInt();
        System.out.println();
        System.out.println("******** EJERCICIO "+ejercicio+" ********");

        switch (ejercicio)
        {
            case 1: //escribeArray3x3
            {
                int [][] a = {{56,2522,3},{-111,-52,3},{-1,62,-3}};
                escribeArray3x3(a);
            }
            break;
            case 2: //rellena3x3
            {
                int[][]a= new int[3][3]; //array 3x3 vacío
                rellena3x3(a);
                escribeArray3x3(a);
            }
            break;
            case 3: //rellenaAleatorio3x3
            {
                int[][]a=new int[3][3];
                rellenaAleatorio3x3(a);
                escribeArray3x3(a);
            }
            break;
            case 4: // sumaArray3x3
            {
                int[][]a={{2,2,2},{8,8,8},{5,5,5}};
                escribeArray3x3(a);
                System.out.print("La suma es: "+sumaArray3x3(a));
            }
            break;
            case 5: //escribeArrayBi
            {
                escribeArrayBi(pideValor());
            }
            break;
            case 6: //rellenaAleatorioBi
            {
                int fila, columna;
                System.out.print("¿De cuantas filas quieres que sea el array? ");
                fila = sc.nextInt();
                System.out.print("¿De cuantas columnas quieres que sea el array? ");
                columna = sc.nextInt();
                int[][]a=new int [fila][columna];
                rellenaAleatorioBi(a);
                escribeArrayBi(a);
            }
            break;
            case 7: //rellenaEnOrdenBi
            {
                int fila, columna;
                System.out.print("¿De cuantas filas quieres que sea el array? ");
                fila = sc.nextInt();
                System.out.print("¿De cuantas columnas quieres que sea el array? ");
                columna = sc.nextInt();
                int[][]a=new int [fila][columna];
                rellenaEnOrdenBi(a);
                escribeArrayBi(a);
            }
            break;
            case 8: //sumaArrayBi
            {
                int suma;
                suma = sumaArrayBi(pideValor());
                System.out.print("El resultado de la suma es: "+suma);
            }
            break;
            case 9: //suma2ArrayBi
            {
                int suma1, suma2, suma3, sumaFin;
                suma1 = suma2ArrayBi(pideValor());
                suma2 = suma2ArrayBi(pideValor());
                suma3 = suma2ArrayBi(pideValor());
                sumaFin = suma1+suma2+suma3;
                System.out.print("El resulado de la suma es: "+sumaFin);
            }
            break;
            case 10: //copiaArrayBi
            {
                int[][]a=pideValor();
                int[][]b=new int [a.length][a[0].length];
                copiaArrayBi(a, b);
                escribeArrayBi(b);

            }
            break;
            case 11: //copiaArrayBiPro
            {
                int[][]a=pideValor();
                escribeArrayBi(copiaArrayBiPro(a));
            }
            break;
            case 12: //rellenaArrayAjedrez
            {
                int [][]a= new int[8][8];
                rellenaArrayAjedrez(a);
                escribeArrayBi(a);
            }
            break;
            case 13: //rellenaDiagonal
            {
                int [][]a=new int[8][8];
                rellenaDiagonal(a);
                escribeArrayBi(a);
            }
            break;
            case 14: //rellenaX
            {
                int[][]a=new int[5][5];
                rellenaX(a);
                escribeArrayBi(a);
            }
            break;
            case 15: //rellenaCuadros
            {
                int[][]a=new int[8][8];
                rellenaCuadros(a);
                escribeArrayBi(a);
            }
            break;
        }
    }

    public static int[][]pideValor()
    {
        Scanner sc = new Scanner(System.in);
        int fila, columna, i, j, valor;
        System.out.print("¿De cuantas filas quieres que sea el array? ");
        fila = sc.nextInt();
        System.out.print("¿De cuantas columnas quieres que sea el array? ");
        columna = sc.nextInt();

        int[][] numero = new int[fila][columna];
        fila = 0;
        for (i = 0; i < numero.length; i++)
        {
            fila++;
            columna=1;
            for (j = 0; j <numero[i].length; j++)
            {
                System.out.print("Escribe el valor "+columna+" del array nº "+fila+": ");
                valor = sc.nextInt();
                numero[i][j]=valor;
                columna++;
            }
        }
        return numero;
    }

    /*1.*//*Escribe la función escribeArray3x3 a la que le pasas un array
    bidimensional de tamaño3x3 y te lo imprime por pantalla
    (que quede bonito).*/
    public static void escribeArray3x3(int[][]a)
    {
        int i, j, n;
        String num;

        for (i = 0; i < 3; i++) //filas
        {
            System.out.print("[ ");
            for (j = 0; j < 3; j++) //columnas
            {
                n = a[i][j];
                num = String.valueOf(n);

                if (num.length() == 1)
                {
                    num = "   " + num;
                }
                else
                {
                    if (num.length() == 2)
                    {
                        num = "  " + num;
                    }
                    else
                    {
                        if (num.length() == 3)
                        {
                            num = " " + num;
                        }
                    }
                }

                if (j<2)
                {
                    System.out.print(num+", ");
                }
                else
                {
                    System.out.print(num);
                }

            }
            System.out.print(" ]");
            System.out.println();
        }
    }

    /*2.*//*Escribe la función rellena3x3 a la que le pasas un array
    bidimensional de 3x3 y te lo rellena con los números del 1 al 9.*/
    private static void rellena3x3(int[][] a)
    {
        int i, j, cont = 1;

        for (i = 0; i < 3; i++) //FILA
        {
            for (j = 0; j < 3; j++) //COLUMNA
            {
                a[i][j] = cont;
                cont++;
            }
        }
    }

    /*3.*//*Escribe la función RellenaAleatorio3x3 a la que le pasas un
    array bidimensional de tamaño 3x3 y te lo rellena con números aleatorios.*/
    private static void rellenaAleatorio3x3(int[][] a)
    {
        int i, j, num;
        Random r = new Random();

        for (i = 0; i < 3; i++) //FILA
        {
            for (j = 0; j < 3; j++) //COLUMNA
            {
                num = r.nextInt(9);
                a[i][j] = num;
            }
        }
    }

    /*4.*//*Escribe la función sumaArray3x3 a la que le pasas un array de 3x3
    y te suma todos los números. Te devuelve un entero con el resultado.*/
    private static int sumaArray3x3(int[][] a)
    {
        int i, j, suma=0;
        for (i = 0; i < 3; i++)
        {
            for (j = 0; j < 3; j++)
            {
                suma = suma + a[i][j];
            }
        }
        return suma;
    }

    /*5.*//*Escribe la función escribeArrayBi a la que le pasas un array bidimensional
    de cualquier tamaño y te lo imprime por pantalla.*/
    private static void escribeArrayBi(int[][] a)
    {
        int i, j, n;
        String num;

        for (i = 0; i < a.length; i++) //filas
        {
            System.out.print("[ ");
            for (j = 0; j < a[i].length; j++) //columnas
            {
                n = a[i][j];
                num = String.valueOf(n);

                if (num.length() == 1)
                {
                    num = "   " + num;
                }
                else
                {
                    if (num.length() == 2)
                    {
                        num = "  " + num;
                    }
                    else
                    {
                        if (num.length() == 3)
                        {
                            num = " " + num;
                        }
                    }
                }

                if (j<a[i].length-1)
                {
                    System.out.print(num+", ");
                }
                else
                {
                    System.out.print(num);
                }

            }
            System.out.print(" ]");
            System.out.println();
        }
    }

    /*6.*//*Escribe la función rellenaAleatorioBi a la que le pasas un array
    bidimensional de cualquier tamaño y te lo rellena con números aleatorios.*/
    private static void rellenaAleatorioBi(int[][]a)
    {
        Random r = new Random();
        int i, j, num;
        for (i = 0; i < a.length; i++)
        {
            for (j = 0; j< a[i].length; j++)
            {
                num = r.nextInt(999);
                a[i][j]=num;
            }
        }
    }

    /*7.*//*Escribe la función rellenaEnordenBi a la que le pasas un array bidimensional
    de cualquier tamaño y te lo rellena con los números a partir del 1 en orden.*/
    private static void rellenaEnOrdenBi(int[][] a)
    {
        int i, j, cont = 1;
        for (i = 0; i < a.length; i++)
        {
            for (j = 0; j < a[i].length; j++)
            {
                a[j][i]=cont;
                cont++;
            }
        }
    }

    /*8.*//*Escribe la función sumaArrayBi a la que le pasas un array bidimensional
    y te suma todos los números. Te devuelve un entero con el resultado.*/
    private static int sumaArrayBi(int[][] a)
    {
        int i, j, suma=0;
        for (i = 0; i < a.length; i++)
        {
            for (j = 0; j<a[i].length; j++)
            {
                suma = suma + a[i][j];
            }
        }
        return suma;
    }

    /*9.*//*Escribe la función suma2ArraysBi que hace lo mismo, pero con tres arrays
    bidimensionales de cualquier tamaño (siempre y cuando todos tengan las mismas
    dimensiones).*/
    private static int suma2ArrayBi(int[][] a)
    {
        int i, j, suma=0;
        for (i = 0; i < a.length; i++)
        {
            for (j = 0; j<a[i].length; j++)
            {
                suma = suma + a[i][j];
            }
        }
        return suma;
    }

    /*10.*//*Escribe la función copiaArrayBi a la que le pasas dos arrays, uno con
    datos y otro vacío, y te copia el contenido del primero al segundo.*/
    private static void copiaArrayBi(int[][] a, int[][] b)
    {
        int i, j;
        for (i = 0; i < a.length; i++)
        {
            for (j = 0; j < a[i].length; j++)
            {
                b[i][j]=a[i][j];
            }
        }
    }

    /*11.*//*Escribe la función copiaArrayBiPro a la que le pasas un array y te
    devuelve otro del mismo tamaño y con los mismos datos.*/
    private static int[][] copiaArrayBiPro(int[][] a)
    {
        int[][]b=new int[a.length][a[0].length];
        int i, j;
        for (i = 0; i < a.length; i++)
        {
            for (j = 0; j < a[i].length; j++)
            {
                b[i][j]=a[i][j];
            }
        }
        return b;
    }

    /*12.*//*Escribe la función rellenaArrayAjedrez que te rellena un array de 8x8
    con la forma de un tablero de ajedrez, usando el valor 1 para las casillas
    blancas y 0 para las negras.*/
    private static void rellenaArrayAjedrez(int[][] a)
    {
        int i, j, cont=1;
        for (i = 0; i < a.length; i ++)
        {
            for (j = 0; j < a[i].length; j++)
            {
                if (cont % 2 == 0)
                {
                    a[i][j]=1;
                }
                else
                {
                    if (cont % 2 != 0)
                    {
                        a[i][j]=0;
                    }
                }
                cont++;
            }
            cont++;
        }
    }

    /*13.*//*Escribe la función rellenaDiagonal que te rellena un array cuadrado con
    el número ‘1’ en la diagonal principal, el número ‘2’ en el triángulo que queda por
    encima y el ‘3’ en el triángulo que queda por debajo*/
    private static void rellenaDiagonal(int[][] a)
    {
        int i, j;
        for (i = 0; i < a.length; i++)
        {
            for (j = 0; j < a[i].length; j++)
            {
                if (i==j)
                {
                    a[i][j]=1;
                }
                else
                {
                    if (i < j)
                    {
                        a[i][j] = 2;
                    }
                    else
                    {
                        if (i > j)
                        {
                            a[i][j]=3;
                        }
                    }
                }
            }
        }
    }

    /*14.*//*Escribe la función rellenaX que te rellena un array cuadrado con el número
     ‘1’ en las dos diagonales y el ‘2’ en el resto.*/
    private static void rellenaX(int[][] a)
    {
        int i, j;
        for (i = 0; i < a.length; i++)
        {
            for (j =0; j < a[i].length; j++)
            {
                if ((i==j)||(i+j==a.length-1))
                {
                    a[i][j]=1;
                }
                else
                {
                    a[i][j]=2;
                }
            }
        }
    }

    /*15.*//*Escribe la función rellenaCuadros que te rellena un array cuadrado de lado
    par (o sea, 2x2, 4x4, 6x6, etc.) en cuatro cuadros. El cuadro superior izquierdo .
    lo rellena con ‘1’, el superior derecho, con ‘2’, el inferior izquierdo con ‘3’ y
    el inferior derecho con ‘4’.*/
    private static void rellenaCuadros(int[][] a)
    {
        int i, j;
        int mitad=a.length/2;
        for (i = 0; i < a.length; i++)
        {
            for (j = 0; j < a[i].length; j++)
            {
                if ((i<mitad)&&(j<mitad))
                {
                    a[i][j]=1;
                }
                else
                {
                    if ((i<mitad)&&(j>=mitad))
                    {
                        a[i][j]=2;
                    }
                    else
                    {
                        if ((i>=mitad)&&(j<mitad))
                        {
                            a[i][j]=3;
                        }
                        else
                        {
                            if ((i>=mitad)&&(j>=mitad))
                            {
                                a[i][j]=4;
                            }
                        }
                    }
                }
            }
        }
    }
}
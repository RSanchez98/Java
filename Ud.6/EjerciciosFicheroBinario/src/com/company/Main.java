package com.company;

import javax.swing.*;
import java.io.*;
import java.util.*;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int ejercicio;
        System.out.println("********MENÚ********");
        System.out.println();
        System.out.println("Ejercicio 11");
        System.out.println("Ejercicio 12");
        System.out.println("Ejercicio 13");
        System.out.println("Ejercicio 13");
        System.out.println("Ejercicio 15");
        System.out.println("Ejercicio 16");
        System.out.println("Ejercicio 17");
        System.out.println("Ejercicio 18");
        System.out.println("Ejercicio 19");
        System.out.println("Ejercicio 20");
        System.out.println("Ejercicio 21");
        System.out.println();
        System.out.print("Elige un ejercicio: ");
        ejercicio = sc.nextInt();
        System.out.println();
        System.out.println("******** EJERCICIO "+ejercicio+" ********");

        switch (ejercicio)
        {
            case 11: //escribeFichero1_100
            {
                escribeFichero1_100("escribeFichero1_100.bin");
            }
            break;
            case 12: //leeFicheroInt100
            {
                leeFicheroInt100("escribeFichero1_100.bin");
            }
            break;
            case 13: //escribeFicheroIntAleatorio
            {
                int num;
                System.out.print("¿Cuántos numeros aleatorios quieres que te muestre? (1-100) ");
                num = sc.nextInt();
                escribeFicheroIntAleatorio("escribeFicheroIntAleatorio.bin", num);
            }
            break;
            case 14: //escribeFicheroIntAleatorioPro ***NO INCLUYE LOS NUMEROS MIN Y MAX
            {
                int numValores, min, max;
                System.out.print("¿Cuántos valores quieres que se generen? ");
                numValores = sc.nextInt();
                System.out.print("¿Cuál quieres que sea el valor minimo? ");
                min = sc.nextInt();
                System.out.print("¿Cuál quieres que sea el valor máximo? ");
                max = sc.nextInt();
                escribeFicheroIntAleatorioPro("escribeFicheroIntAleatorioPro.bin", numValores, min, max);
            }
            break;
            case 15: //leeFicheroInt *** AL FINAL SALE UN ERROR PERO EL PROGRAGAM FUNCIONA
            {
                leeFicheroInt("escribeFicheroIntAleatorioPro.bin");
            }
            break;
            case 16: //sumaFicheroInt
            {
                String nombreFichero = "escribeFicheroIntAleatorio.bin";
                int sumaFinal;
                leeFicheroInt(nombreFichero);
                sumaFinal = sumaFicheroInt(nombreFichero);
                System.out.println();
                System.out.print("La suma de todos los numeros es: "+sumaFinal);
            }
            break;
            case 17: //leeFicheroIntLista
            {
                System.out.println(leeFicheroIntLista("escribeFicheroIntAleatorio.bin"));
            }
            break;
            case 18: //escribeFicheroIntLista
            {
                List<Integer> lista = leeFicheroIntLista("escribeFicheroIntAleatorio.bin");
                System.out.println(leeFicheroIntLista("escribeFicheroIntAleatorio.bin"));
                escribeFicheroIntLista("escribeFicheroIntLista.bin", lista);
            }
            break;
            case 19: //ordenaFicheroInt
            {
                ordenaFicheroInt("escribeFicheroIntAleatorio.bin");

            }
            break;
            case 20: //
            {
                leeFicheroInt("escribeFicheroIntAleatorioPro.bin");
                separaFicheroInt("escribeFicheroIntAleatorioPro.bin");
                System.out.println();
                leeFicheroInt("escribeFicheroIntAleatorio.binpos");
                System.out.println();
                leeFicheroInt("escribeFicheroIntAleatorio.binneg");
            }
            break;
            case 21: //
            {
                leeFicheroInt("escribeFicheroIntAleatorio.bin");
                invierteFicheroInt("escribeFicheroIntAleatorio.bin");
                System.out.println();
                leeFicheroInt("escribeFicheroIntAleatorio.bin");
            }
            break;
        }
    }



    /*11.*//*Escribe una función escribeFichero1_100 que te escriba en
    un fichero binario cuyo nombre le pasas por parámetro (p.ej.:
    “datos01.bin”) los valores enteros desde 1 hasta 100.*/
    private static void escribeFichero1_100(String fichero)
    {
        int i;
        try
        {
            FileOutputStream fos = new FileOutputStream(fichero);
            DataOutputStream dos = new DataOutputStream(fos);

            for (i = 1; i <= 100; i++)
            {
                dos.writeInt(i);
            }

            dos.close();
            fos.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }

    /*12.*//*Escribe una función leeFicheroInt100 que te lea del fichero
    que le pasas por parámetro los 100 primeros valores enteros.*/
    private static void leeFicheroInt100(String fichero)
    {
        try
        {
            FileInputStream fis = new FileInputStream(fichero);
            DataInputStream dis = new DataInputStream(fis);

            int i, n;

            for (i = 0; i<100; i++)
            {
                n = dis.readInt();
                System.out.println(n);
            }

            dis.close();
            fis.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    /*13.*//*Escribe una función escribeFicheroIntAleatorio a la que le
    pasas el nombre del fichero y cuántos números aleatorios queremos escribir
    en el mismo. Los números aleatorios serán entre 1 y 100 y serán de
    tipo int.*/
    private static void escribeFicheroIntAleatorio(String fichero, int num)
    {
        try
        {
            FileOutputStream fos = new FileOutputStream(fichero);
            DataOutputStream dos = new DataOutputStream(fos);

            Random r = new Random();
            int i;
            for (i = 1; i <= num; i++)
            {
               dos.writeInt(r.nextInt(101));
            }


            dos.close();
            fos.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    /*14.*//*Escribe una función escribeFicheroIntAleatorioPro a la que le
    pasas lo siguiente: el nombre del fichero, número de valores que se van a
    generar, el valor mínimo y el valor máximo. Así,
    escribeFicheroIntAleatorioPro(“datos.bin”, 10, -5, 5) nos escribirá diez
    valores aleatorios entre -5 y 5 en el fichero datos.bin.*/
    private static void escribeFicheroIntAleatorioPro(String fichero, int numValores, int min, int max)
    {
        try
        {
            FileOutputStream fos = new FileOutputStream(fichero);
            DataOutputStream dos = new DataOutputStream(fos);

            Random r = new Random();
            int aleatorio, i;
            for (i = 0; i<numValores; i++)
            {
                aleatorio = r.nextInt(max-min+1)+min; //
                dos.writeInt(aleatorio);
            }

            dos.close();
            fos.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    /*15.*//*Escribe una función leeFicheroInt que te lea del fichero que
    le pasas por parámetro todos los valores enteros que haya en él.*/
    private static void leeFicheroInt(String fichero)
    {
        try
        {
            FileInputStream fis = new FileInputStream(fichero);
            DataInputStream dis = new DataInputStream(fis);

            int n;

            while (dis.available() > 0)
            {
                n = dis.readInt();
                System.out.print(n+" ");
            }

            dis.close();
            dis.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    /*16.*//*Escribe una función sumaFicheroInt que te lea de un fichero
    todos los valores enteros, los sume y te devuelva el resultado.*/
    private static int sumaFicheroInt(String fichero)
    {
        int n, suma=0;
        try
        {
            FileInputStream fis = new FileInputStream(fichero);
            DataInputStream dis = new  DataInputStream(fis);

            while (dis.available()>0)
            {
                n = dis.readInt();
                suma = suma + n;
            }

            dis.close();
            fis.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return suma;
    }

    /*17.*//*Escribe una función leeFicheroIntLista que te lea de un
    fichero todos los valores enteros. Los valores los irá almacenando
    en una lista de enteros que devolverá. El prototipo de la función
    será: List<Integer> LeeFicheroIntLista(String nombre_fichero).*/
    private static List<Integer> leeFicheroIntLista(String fichero)
    {
        List<Integer>lista=new LinkedList<>();
        int n;
        try
        {
            FileInputStream fis = new FileInputStream(fichero);
            DataInputStream dis = new DataInputStream(fis);

            while (dis.available()>0)
            {
              n = dis.readInt();
              lista.add(n);
            }

            dis.close();
            fis.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return lista;
    }

    /*18.*//*Escribe una función escribeFicheroIntLista que te escriba
    en un fichero todos los valores enteros de la lista que le pasamos
    por parámetro. El prototipo de la función será:
    void LeeFicheroIntLista(String nombre_fichero, List<Integer> lista).*/
    private static void escribeFicheroIntLista(String fichero, List<Integer> lista)
    {
        try
        {
            FileOutputStream fos = new FileOutputStream(fichero);
            DataOutputStream dos = new DataOutputStream(fos);

            int i;

            for (i = 0; i < lista.size(); i++)
            {
                dos.writeInt(lista.get(i));
            }

            dos.close();
            fos.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    /*19.*//*Escribe una función ordenaFicheroInt que te lea de un
    fichero los valores enteros que haya, los ordene y vuelva a escribir
    en el mismo fichero los valores ya ordenados.*/
    private static void ordenaFicheroInt(String fichero)
    {
        List<Integer> listaNum = leeFicheroIntLista(fichero);
        int i;
        try
        {
            Collections.sort(listaNum);

            FileOutputStream fos = new FileOutputStream(fichero);
            DataOutputStream dos = new DataOutputStream(fos);

            for ( i = 0; i < listaNum.size(); i++)
            {
                dos.writeInt(listaNum.get(i));
            }

            dos.close();
            fos.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    /*20.*//*Escribe una función separaFicheroInt a la que le pasaremos el
    nombre del fichero que queremos separar. La función nos creará dos ficheros
    que tendrán el mismo nombre que el de origen pero añadiéndole “positivos”
    o “negativos” detrás (ej.: “datos.bin” -> “datos.binpositivos”,
    “datos.binnegativos”). En un fichero guardaremos todos los números positivos
    que haya en el primer fichero y en el otro los negativos.*/
    private static void separaFicheroInt(String fichero)
    {
        int num;
        try
        {
            FileOutputStream fosPos = new FileOutputStream(fichero+"pos");
            DataOutputStream dosPos = new DataOutputStream(fosPos);

            FileOutputStream fosNeg = new FileOutputStream(fichero+"neg");
            DataOutputStream dosNeg = new DataOutputStream(fosNeg);

            FileInputStream fis = new FileInputStream(fichero);
            DataInputStream dis = new DataInputStream(fis);

            num=dis.readInt();

            while (dis.available()>0)
            {
                if (num>=0)
                {
                    dosPos.writeInt(num);
                }
                else
                {
                    dosNeg.writeInt(num);
                }
            }

            dis.close();
            fis.close();
            dosNeg.close();
            fosNeg.close();
            dosPos.close();
            fosPos.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    /*21.*//*Escribe una función invierteFicheroInt a la que le pasaremos un
    fichero que contiene enteros e invertirá la posición de los valores dentro
    del fichero, es decir, lo escribirá de atrás para delante.*/
    private static void invierteFicheroInt(String fichero)
    {
        List<Integer> listaNum = leeFicheroIntLista(fichero);
        int i;

        try
        {
            Collections.reverse(listaNum);
            FileOutputStream fos = new FileOutputStream(fichero);
            DataOutputStream dos = new DataOutputStream(fos);

            for (i = 0; i < listaNum.size(); i++)
            {
                dos.writeInt(listaNum.get(i));
            }

            dos.close();
            fos.close();

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
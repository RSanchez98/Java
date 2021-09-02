package com.company;

import java.io.*;
import java.util.*;

public class Main {

    public static int eligeFuncion(){
        Scanner sc = new Scanner(System.in);
        int opcion;

        System.out.println("*****************************************************************************");
        System.out.println("*                EJERCICIOS FICHEROS DE TEXTO Y BINARIOS                    *");
        System.out.println("*****************************************************************************");
        System.out.println("*         FICHEROS DE TEXTO      *             FICHEROS BINARIOS            *");
        System.out.println("*****************************************************************************");
        System.out.println("* 1.- escribeFicheroNumRandom10  |    11.- escribeFichero1_100            | *");
        System.out.println("* 2.- sumaFicheroInt10           |    12.- leeFicheroInt100               | *");
        System.out.println("* 3.- escribeFicheroNumRandom    |    13.- escribeFicheroIntAleatorio     | *");
        System.out.println("* 4.- sumaFicheroInt             |    14.- escribeFicheroIntAleatorioPro  | *");
        System.out.println("* 5.- escribeFicheroTexto        |    15.- leeFicheroInt                  | *");
        System.out.println("* 6.- leeFicheroTexto            |    16.- sumaFicheroInt                 | *");
        System.out.println("* 7.- copiaFicheroTexto          |    17.- leeFicheroIntLista             | *");
        System.out.println("* 8.- invierteLineasFichero      |    18.- escribeFicheroIntLista         | *");
        System.out.println("* 9.- invierteFicheroTexto       |    19.- ordenaFicheroInt               | *");
        System.out.println("* 10.- separaPalabrasFichero     |    20.- separaFicheroInt               | *");
        System.out.println("*                                |    21.- invierteFicheroInt             | *");
        System.out.println("*****************************************************************************");
        System.out.println();
        System.out.print("¿Qué función quieres ejecutar? ");
        opcion = sc.nextInt();

        return opcion;
    }

    public static void escribeFicheroNumRandom10 (String nombreFichero)
    {
        int i = 0, numeroAleatorio;
        Random r = new Random();
        try
        {
            FileWriter ficheroUsuario = new FileWriter(nombreFichero + ".txt");
            BufferedWriter dentroFichero = new BufferedWriter(ficheroUsuario);
            while(i < 10)
            {
                numeroAleatorio = r.nextInt(99)+1;
                //Escribe dicho número aleatorio dentro del fichero
                dentroFichero.write(String.valueOf(numeroAleatorio));
                dentroFichero.newLine();
                i++;
            }

            dentroFichero.close();
            ficheroUsuario.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static int sumaFicheroInt10 ()
    {
        int i = 0, suma = 0;
        String elemento;
        try
        {
            FileReader archivoALeer = new FileReader("numerosAleatorios.txt");
            BufferedReader leyendoArchivo = new BufferedReader(archivoALeer);

            while (i < 10)
            {
                elemento = leyendoArchivo.readLine();
                suma = suma + Integer.valueOf(elemento);
                i++;
            }


            leyendoArchivo.close();
            archivoALeer.close();

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return suma;
    }

    public static void escribeFicheroNumRandom(String nombreFichero, int numeroDeElementos)
    {
        int i = 0, numeroAleatorio;
        Random r = new Random();

        try
        {
            FileWriter ficheroUsuario = new FileWriter(nombreFichero + ".txt");
            BufferedWriter dentroFichero = new BufferedWriter(ficheroUsuario);

            while (i < numeroDeElementos)
            {
                numeroAleatorio = r.nextInt(99)+1;
                dentroFichero.write(String.valueOf(numeroAleatorio));
                dentroFichero.newLine();
                i++;
            }

            dentroFichero.close();
            ficheroUsuario.close();

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static int sumaFicheroInt()
    {
        String elemento;
        int suma = 0;
        try
        {
            FileReader archivoALeer = new FileReader("numerosAleatoriosPro.txt");
            BufferedReader leyendoArchivo = new BufferedReader(archivoALeer);


            elemento = leyendoArchivo.readLine();
            while(elemento != null)
            {
                suma = suma + Integer.valueOf(elemento);
                elemento = leyendoArchivo.readLine();
            }

            leyendoArchivo.close();
            archivoALeer.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return suma;
    }

    public static void escribeFicheroTexto(String nombreFichero)
    {
        String cadenaUsuario = " ";
        Scanner sc = new Scanner(System.in);
        try
        {
            FileWriter ficheroUsuario = new FileWriter(nombreFichero + ".txt");
            BufferedWriter dentroFichero = new BufferedWriter(ficheroUsuario);

            while (!cadenaUsuario.equals(""))
            {
                System.out.println("Escriba una línea.");
                cadenaUsuario = sc.nextLine();
                cadenaUsuario = cadenaUsuario.trim();
                dentroFichero.write(cadenaUsuario);
                dentroFichero.newLine();
            }

            dentroFichero.close();
            ficheroUsuario.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void leeFicheroTexto(String nombreFichero)
    {
        String cadenaTexto;
        try
        {
            FileReader archivoALeer = new FileReader(nombreFichero + ".txt");
            BufferedReader leyendoArchivo = new BufferedReader(archivoALeer);

            cadenaTexto = leyendoArchivo.readLine();
            while(cadenaTexto != null)
            {
                System.out.println(cadenaTexto);
                cadenaTexto = leyendoArchivo.readLine();
            }

            leyendoArchivo.close();
            archivoALeer.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void copiaFicheroTexto(String ficheroOriginal, String ficheroNuevo)
    {
        String cadenaTexto;
        try
        {
            //LEO EL ARCHIVO QUE YA ESTÁ CREADO Y QUE QUIERO COPIAR EN EL NUEVO FICHERO
            FileReader archivoALeer = new FileReader(ficheroOriginal + ".txt");
            BufferedReader leyendoArchivo = new BufferedReader(archivoALeer);

            //CREO EL NUEVO FICHERO DONDE VOY A COPIAR EL TEXTO
            FileWriter ficheroUsuario = new FileWriter(ficheroNuevo + ".txt");
            BufferedWriter dentroFichero = new BufferedWriter(ficheroUsuario);

            cadenaTexto = leyendoArchivo.readLine();
            while (cadenaTexto != null)
            {
                dentroFichero.write(cadenaTexto);
                dentroFichero.newLine();
                cadenaTexto = leyendoArchivo.readLine();
            }

            dentroFichero.close();
            ficheroUsuario.close();

            leyendoArchivo.close();
            archivoALeer.close();

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static String invierteCadena (String cadena)
    {
        int i;
        String cadenaDos = "";

        for(i = cadena.length() - 1; i >= 0; i--)
        {
            cadenaDos = cadenaDos + cadena.charAt(i);
        }
        return cadenaDos;
    }

    public static void invierteLineasTexto(String ficheroUno, String ficheroDos)
    {
        String cadenaTexto;
        try
        {
            //CREO NUEVO FICHERO QUE CONTRENDRÁ CADA LÍNEA DE CADENAS INVERTIDA:
            FileWriter ficheroUsuario = new FileWriter(ficheroDos + ".txt");
            BufferedWriter dentroFichero = new BufferedWriter(ficheroUsuario);

            //LEO EL FICHERO QUE CONTIENE LAS CADENAS DE TEXTO A LAS QUE QUIERO DARLES LA VUELTA:
            FileReader archivoALeer = new FileReader(ficheroUno + ".txt");
            BufferedReader leyendoArchivo = new BufferedReader(archivoALeer);

            cadenaTexto = leyendoArchivo.readLine();

            while (cadenaTexto != null)
            {
                cadenaTexto = invierteCadena(cadenaTexto);
                dentroFichero.write(cadenaTexto);
                dentroFichero.newLine();
                cadenaTexto = leyendoArchivo.readLine();
            }

            leyendoArchivo.close();
            archivoALeer.close();
            dentroFichero.close();
            ficheroUsuario.close();

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void invierteFicheroTexto(String nombreFichero)
    {
        List<String> textoDelFichero = new LinkedList<>();

        String cadenaTexto;
        int i;

        try
        {
            FileReader archivoALeer = new FileReader(nombreFichero + ".txt");
            BufferedReader leyendoArchivo = new BufferedReader(archivoALeer);

            cadenaTexto = leyendoArchivo.readLine();
            while (cadenaTexto != null)
            {
                textoDelFichero.add(cadenaTexto);
                cadenaTexto = leyendoArchivo.readLine();
            }
            Collections.reverse(textoDelFichero);
            leyendoArchivo.close();
            archivoALeer.close();

            FileWriter ficheroUsuario = new FileWriter(nombreFichero + ".txt");
            BufferedWriter dentroFichero = new BufferedWriter(ficheroUsuario);

            for(i = 0; i < textoDelFichero.size(); i++)
            {
                cadenaTexto = textoDelFichero.get(i);
                dentroFichero.write(cadenaTexto);
                dentroFichero.newLine();
            }

            dentroFichero.close();
            ficheroUsuario.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void separaPalabrasFichero(String ficheroUno, String ficheroDos)
    {
        String cadenaTexto;
        String [] arrayPalabras;
        int i;

        try
        {
            //CREO NUEVO FICHERO QUE CONTRENDRÁ CADA PALABRA EN UNA LÍNEA NUEVA:
            FileWriter ficheroUsuario = new FileWriter(ficheroDos + ".txt");
            BufferedWriter dentroFichero = new BufferedWriter(ficheroUsuario);

            //LEO EL FICHERO QUE CONTIENE LAS CADENAS DE TEXTO A LAS QUE QUIERO SEPARAR CADA PALABRA PARA PONER CADA UNA EN UNA LÍNEA NUEVA:
            FileReader archivoALeer = new FileReader(ficheroUno + ".txt");
            BufferedReader leyendoArchivo = new BufferedReader(archivoALeer);

            cadenaTexto = leyendoArchivo.readLine();

            while (cadenaTexto != null)
            {
                arrayPalabras = cadenaTexto.split(" ");
                for(i = 0; i < arrayPalabras.length; i++)
                {
                    dentroFichero.write(arrayPalabras[i]);
                    dentroFichero.newLine();
                }
                cadenaTexto = leyendoArchivo.readLine();
            }

            leyendoArchivo.close();
            archivoALeer.close();
            dentroFichero.close();
            ficheroUsuario.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void escribeFichero1_100(String ficheroBinario)
    {
        int i = 1;
        try
        {
            FileOutputStream fos = new FileOutputStream(ficheroBinario + ".bin");
            DataOutputStream dos = new DataOutputStream(fos);
            while (i <= 100)
            {
                dos.writeInt(i);
                i++;
            }

            dos.close();
            fos.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void leeFicheroInt100(String nombreFichero)
    {
        int i = 0, numero;

        try
        {
            FileInputStream fis = new FileInputStream(nombreFichero + ".bin");
            DataInputStream dis = new DataInputStream(fis);

            while (i < 100)
            {
                numero = dis.readInt();
                if(numero < 100)
                {
                    System.out.print(numero + ", ");
                }
                else
                {
                    System.out.print(numero);
                }
                i++;
            }

            dis.close();
            fis.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void escribeFicheroIntAleatorio(String nombreFichero, int cuantosNumerosAleatorios)
    {
        Random r = new Random();
        int i = 0, numeroAleatorio;

        try
        {
           FileOutputStream fos = new FileOutputStream(nombreFichero + ".bin");
           DataOutputStream dos = new DataOutputStream(fos);

           while(i < cuantosNumerosAleatorios)
           {
               numeroAleatorio = r.nextInt(99)+1;
               dos.writeInt(numeroAleatorio);
               i++;
           }

           dos.close();
           fos.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void escribeFicheroIntAleatorioPro(String nombreFichero, int cuantosNumerosAleatorios, int valorMinimo, int valorMaximo)
    {
        Random r = new Random();
        int i = 0,
        try numeroAleatorio;

        {
            FileOutputStream fos = new FileOutputStream(nombreFichero + ".bin");
            DataOutputStream dos = new DataOutputStream(fos);

            while(i < cuantosNumerosAleatorios)
            {
                numeroAleatorio = (int)(Math.random()*(valorMinimo-valorMaximo+1)+valorMaximo);
                dos.writeInt(numeroAleatorio);
                i++;
            }

            dos.close();
            fos.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void leeFicheroInt(String nombreFichero)
    {
        int numero;

        try
        {
            FileInputStream fis = new FileInputStream(nombreFichero + ".bin");
            DataInputStream dis = new DataInputStream(fis);

            while (dis.available() > 0)
            {
                numero = dis.readInt();
                if(dis.available() > 1)
                {
                    System.out.print(numero + ", ");
                }
                else
                {
                    System.out.print(numero);
                }
            }

            dis.close();
            fis.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static int sumaFicheroInt (String nombreFichero)
    {
        int numero, suma = 0;

        try
        {
            FileInputStream fis = new FileInputStream(nombreFichero + ".bin");
            DataInputStream dis = new DataInputStream(fis);

            while (dis.available() > 0)
            {
                numero = dis.readInt();
                suma = suma + numero;
            }

            dis.close();
            fis.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return suma;
    }

    public static List<Integer> leeFicheroIntLista(String nombreFichero)
    {
        List<Integer> listaEnteros = new LinkedList<>();
        int numero;

        try
        {
            FileInputStream fis = new FileInputStream(nombreFichero + ".bin");
            DataInputStream dis = new DataInputStream(fis);

            while (dis.available() > 0)
            {
              numero = dis.readInt();
              listaEnteros.add(numero);
            }
            dis.close();
            fis.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return listaEnteros;
    }

    public static void escribeFicheroIntLista(String nombreFichero, List<Integer> nombreLista)
    {
        int i;

        try
        {
            FileOutputStream fos = new FileOutputStream(nombreFichero + ".bin");
            DataOutputStream dos = new DataOutputStream(fos);

            for(i = 0; i < nombreLista.size(); i++)
            {
                dos.writeInt(nombreLista.get(i));
            }

            dos.close();
            fos.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void ordenaFicheroInt(String nombreFichero)
    {
        List<Integer> listaNumeros = leeFicheroIntLista(nombreFichero);
        int i = 0;
        try
        {
           Collections.sort(listaNumeros);

            FileOutputStream fos = new FileOutputStream(nombreFichero + ".bin");
            DataOutputStream dos = new DataOutputStream(fos);

            while (i < listaNumeros.size())
            {
                dos.writeInt(listaNumeros.get(i));
                i++;
            }
            dos.close();
            fos.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void separaFicheroInt(String nombreFichero)
    {
        int numero;
        try
        {
            FileOutputStream fosPositivos = new FileOutputStream(nombreFichero + ".binpositivos");
            DataOutputStream dosPositivos = new DataOutputStream(fosPositivos);

            FileOutputStream fosNegativos = new FileOutputStream(nombreFichero + ".binnegativos");
            DataOutputStream dosNegativos = new DataOutputStream(fosNegativos);

            FileInputStream fis = new FileInputStream(nombreFichero + ".bin");
            DataInputStream dis = new DataInputStream(fis);

            while (dis.available() > 0)
            {
                numero = dis.readInt();
                if(numero >= 0)
                {
                    dosPositivos.writeInt(numero);
                }
                else
                {
                    dosNegativos.writeInt(numero);
                }
            }

            dis.close();
            fis.close();
            dosNegativos.close();
            fosNegativos.close();
            dosPositivos.close();
            fosPositivos.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void invierteFicheroInt(String nombreFichero)
    {
        List<Integer> listaNumeros = leeFicheroIntLista(nombreFichero);
        int i, numero;

        try
        {
            Collections.reverse(listaNumeros);
            FileOutputStream fos = new FileOutputStream(nombreFichero + ".bin");
            DataOutputStream dos = new DataOutputStream(fos);

            for(i = 0; i < listaNumeros.size(); i++)
            {
                numero = listaNumeros.get(i);
                dos.writeInt(numero);
            }

            dos.close();
            fos.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcion;

        opcion = eligeFuncion();
        switch (opcion)
        {
            case 1:
            {
                String cadena = "numerosAleatorios";
                escribeFicheroNumRandom10(cadena);

            }
            break;
            case 2:
            {
                String cadena = "numerosAleatoriosSuma";
                escribeFicheroNumRandom10(cadena);

                int sumaTotal;

                sumaTotal = sumaFicheroInt10();
                System.out.println(sumaTotal);
            }
            break;
            case 3:
            {
                String cadena = "numerosAleatoriosPro";
                int numero = 5;
                escribeFicheroNumRandom(cadena,numero);
            }
            break;
            case 4:
            {
                String cadena = "numerosAleatoriosPro";
                int numero = 5;
                escribeFicheroNumRandom(cadena,numero);

                int sumaTotal;

                sumaTotal = sumaFicheroInt();
                System.out.println(sumaTotal);
            }
            break;
            case 5:
            {
                String cadena = "escribeFicheroTexto";

                escribeFicheroTexto(cadena);
            }
            break;
            case 6:
            {
                String cadena = "escribeFicheroTexto";
                leeFicheroTexto(cadena);
            }
            break;
            case 7:
            {
                String ficheroOriginal = "escribeFicheroTexto";
                String ficheroNuevo = "ficheroNuevo";
                copiaFicheroTexto(ficheroOriginal,ficheroNuevo);

                leeFicheroTexto(ficheroNuevo);
            }
            break;
            case 8:
            {
                String ficheroOriginal = "escribeFicheroTexto";
                String ficheroDos = "nuevoFichero";

                invierteLineasTexto(ficheroOriginal,ficheroDos);

                leeFicheroTexto(ficheroDos);
            }
            break;
            case 9:
            {
                String ficheroOriginal = "escribeFicheroTexto";

                invierteFicheroTexto(ficheroOriginal);

                leeFicheroTexto(ficheroOriginal);
            }
            break;
            case 10:
            {
                String ficheroOriginal = "escribeFicheroTexto";
                String ficheroDos = "nuevoFichero";

                separaPalabrasFichero(ficheroOriginal, ficheroDos);

                leeFicheroTexto(ficheroDos);
            }
            break;
            case 11:
            {
                String cadena = "datos01";
                escribeFichero1_100(cadena);
            }
            break;
            case 12:
            {
                String nombreFichero = "datos01";
                leeFicheroInt100(nombreFichero);
            }
            break;
            case 13:
            {
                String nombreFichero = "datos02";
                int cuantosNumerosAleatorios = 5;
                escribeFicheroIntAleatorio(nombreFichero,cuantosNumerosAleatorios);
            }
            break;
            case 14:
            {
                String nombreFichero = "datos03";
                int cuantosNumerosAleatorios = 10, valorMinimo = -10, valorMaximo = 10;
                escribeFicheroIntAleatorioPro(nombreFichero,cuantosNumerosAleatorios,valorMinimo,valorMaximo);
            }
            break;
            case 15:
            {
                String nombreFichero = "datos03";
                leeFicheroInt(nombreFichero);
            }
            break;
            case 16:
            {
                String nombreFichero = "datos02";
                int sumaTotal;
                leeFicheroInt(nombreFichero);
                sumaTotal = sumaFicheroInt(nombreFichero);
                System.out.println();
                System.out.println("La suma total de los número del fichero binario es: " + sumaTotal);
            }
            break;
            case 17:
            {
                String nombreFichero = "datos02";
                System.out.println(leeFicheroIntLista(nombreFichero));

            }
            break;
            case 18:
            {
                String nombreFichero = "datos02";
                List<Integer> listaEnteros = leeFicheroIntLista(nombreFichero);
                System.out.println(listaEnteros);
                String nombreFicheroNuevo = "datos04";
                escribeFicheroIntLista(nombreFicheroNuevo,listaEnteros);
            }
            break;
            case 19:
            {
                String nombreFichero = "datos02";
                System.out.println(leeFicheroIntLista(nombreFichero));

                ordenaFicheroInt(nombreFichero);

                System.out.println(leeFicheroIntLista(nombreFichero));
            }
            break;
            case 20:
            {
                String nombreFichero = "datos03";
                separaFicheroInt(nombreFichero);
            }
            break;
            case 21:
            {
                String nombreFichero = "datos03";
                leeFicheroInt(nombreFichero);
                invierteFicheroInt(nombreFichero);
                System.out.println();
                leeFicheroInt(nombreFichero);
            }
            break;
            default:
                System.out.println("Ha elegido un número no valido.");
        }
    }
}

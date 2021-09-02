package com.company;

import java.io.*;
import java.lang.reflect.Field;
import java.util.*;

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
        System.out.println();
        System.out.print("Elige un ejercicio: ");
        ejercicio = sc.nextInt();
        System.out.println();
        System.out.println("******** EJERCICIO "+ejercicio+" ********");

        switch (ejercicio)
        {
            case 1: //escribeFicheroNumRandom10
            {
                escribeFicheroNumRandom10("escribeFicheroNumRandom10.txt");
            }
            break;
            case 2: //sumaFicheroInt10
            {
                System.out.println(sumaFicheroInt10("escribeFicheroNumRandom10.txt"));
            }
            break;
            case 3: //escribeFicheroNumRandom
            {
                int numero;
                System.out.print("¿Cuántos numeros aleatorios quieres que te genere? ");
                numero = sc.nextInt();
                escribeFicheroNumRandom("escribeFicheroNumRandom.txt", numero);
            }
            break;
            case 4: //sumaFicheroInt
            {
                System.out.println(sumaFicheroInt("escribeFicheroNumRandom.txt"));
            }
            break;
            case 5: //escribeFicheroText
            {

                escribeFicheroText("escribeFicheroText.txt");
            }
            break;
            case 6: //leeFicheroTexto
            {
                leeFicheroTexto("escribeFicheroText.txt");
            }
            break;
            case 7: //copiaFicheroTexto
            {
                copiaFicheroTexto("escribeFicheroText.txt","escribeFicheroTextCopia.txt");
                leeFicheroTexto("escribeFicheroText.txt");
                System.out.println("****COPIA****");
                leeFicheroTexto("escribeFicheroTextCopia.txt");
            }
            break;
            case 8: //invierteLineasFichero
            {
                invierteLineasFichero("escribeFicheroText.txt", "escribeFicheroTextInvertido.txt");
                leeFicheroTexto("escribeFicheroText.txt");
                System.out.println("****COPIA INVERTIDA****");
                leeFicheroTexto("escribeFicheroTextInvertido.txt");
            }
            break;
            case 9: //invierteFicheroTexto
            {
                invierteFicheroTexto("escribeFicheroText.txt");
                leeFicheroTexto("escribeFicheroText.txt");
            }
            break;
            case 10: //separaPalabrasFichero
            {
                separaPalabrasFichero("escribeFicheroText.txt","escribeFicheroTextPalabras.txt");
                leeFicheroTexto("escribeFicheroTextPalabras.txt");
            }
            break;
            case 11: //elQuijote
            {

                separaPalabrasFichero("elQuijote.txt", "elQuijotePalabra.txt");
                leeFicheroTexto("elQuijotePalabra.txt");
                System.out.println("*************");
                /*elQuijote("elQuijotePalabra.txt");*/

                /*elQuijote("elQuijotePalabra.txt");*/
            }
            break;

        }
    }

    public static String invierteCadena(String cadena)
    {
        int i;
        String cadenaInvertida = "";
        for (i = cadena.length() - 1; i >= 0; i--)
        {
            cadenaInvertida = cadenaInvertida + cadena.charAt(i);
        }
        return cadenaInvertida;
    }

    /*1.*//*Escribe una función escribeFicheroNumRandom10 a la que le pasas
    un nombre de fichero y te crea un fichero con ese nombre que contiene
    10 números aleatorios en diferentes líneas.*/
    private static void escribeFicheroNumRandom10(String fichero)
    {
        try
        {
            Random r = new Random();
            FileWriter fw = new FileWriter(fichero);
            BufferedWriter bw = new BufferedWriter(fw);

            int i;
            for (i = 1; i <=10; i++ )
            {
                bw.write(r.nextInt(10)+System.lineSeparator());
            }

            bw.close();
            fw.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    /*2.*//*Escribe una función sumaFicheroInt10 a la que le pasas un fichero
    con 10 líneas (que debe contener enteros en diferentes líneas, como el del
    ejercicio anterior) y te devuelve la suma de todos los números contenidos
    en el fichero.*/
    private static int sumaFicheroInt10(String fichero)
    {
        int n, suma =0;
        try
        {
            FileReader fr = new FileReader(fichero);
            BufferedReader br = new BufferedReader(fr);

            String linea = br.readLine();
            while (linea!=null)
            {
                n=Integer.valueOf(linea); //transforma el valor de texto LINEA a un valor N
                suma = suma + n;
                linea=br.readLine();
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
         return suma;
    }

    /*3.*//*Escribe una función escribeFicheroNumRandom a la que le pasas un
    nombre de fichero y un entero y te escribe tantos números aleatorios como
    le hayas dicho en un fichero de texto.*/
    private static void escribeFicheroNumRandom(String fichero, int numero)
    {
        try
        {
            Random r = new Random();
            FileWriter fw = new FileWriter(fichero);
            BufferedWriter bw = new BufferedWriter(fw);

            int i;
            for (i = 0; i < numero; i++)
            {
                bw.write(r.nextInt(50)+System.lineSeparator());
            }

            bw.close();
            fw.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    /*4.*//*Escribe una función sumaFicheroInt a la que le pasas un nombre
    de fichero y te devuelve un entero resultante de sumar todos los números
    contenidos en el fichero (que puede tener tantas líneas como haga falta).*/
    private static int sumaFicheroInt(String fichero)
    {
        int n, suma =0;
        try
        {
            FileReader fr = new FileReader(fichero);
            BufferedReader br = new BufferedReader(fr);

            String linea = br.readLine();
            while (linea!=null)
            {
                n=Integer.valueOf(linea); //transforma el alor de texto LINEA a un valor N
                suma = suma + n;
                linea=br.readLine();
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return suma;
    }

    /*5*//*Escribe una función escribeFicheroTexto a la que le pasas un nombre
    de fichero. La función ira pidiendo al usuario que escriba líneas de texto,
    que se irán guardando en el fichero, hasta que introduzca una línea
    en blanco (“”).*/
    private static void escribeFicheroText(String fichero)
    {
        Scanner sc = new Scanner(System.in);
        int cont= 1;
        String linea;
        try
        {
            FileWriter fw = new FileWriter(fichero);
            BufferedWriter bw = new BufferedWriter(fw);

            System.out.print("Escribe la linea nº"+cont+": ");
            linea = sc.nextLine();
            cont++;

            while (!linea.equals(""))
            {
                fw.write(linea+System.lineSeparator());

                System.out.print("Escribe la linea nº"+cont+": ");
                linea = sc.nextLine();
                cont++;
            }

            bw.close();
            fw.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }

    /*6.*//*Escribe la función leeFicheroTexto a la que le pasas un nombre de
    fichero y te pone el contenido de fichero por pantalla.*/
    private static void leeFicheroTexto(String fichero)
    {
        try
        {
            FileReader fr = new FileReader(fichero);
            BufferedReader br = new BufferedReader(fr);

            String linea = br.readLine();
            while (linea!=null)
            {
                System.out.println(linea);
                linea=br.readLine();
            }

            br.close();
            fr.close();

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    /*7.*//*Escribe la función copiaFicheroTexto a la que le pasas dos nombres
    de fichero y copias el contenido del primer fichero en el segundo*/
    private static void copiaFicheroTexto(String fichero, String ficheroCopia)
    {
        String linea;
        try
        {
            FileReader fr = new FileReader(fichero);
            BufferedReader br = new BufferedReader(fr);

            FileWriter fw = new FileWriter(ficheroCopia);
            BufferedWriter bw = new BufferedWriter(fw);

            linea = br.readLine();
            while (linea!=null)
            {
                bw.write(linea);
                bw.newLine();
                linea = br.readLine();
            }

            bw.close();
            fw.close();
            br.close();
            fr.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    /*8.*//*Escribe la función invierteLineasFichero a las que la pasas dos
    nombres de fichero y te copia las líneas del primer fichero al segundo
    fichero, pero invertidas (con el primer carácter al final y el último al
    principio, etc.). Podéis usar la función de invertir cadenas que ya tenéis hecha.*/
    private static void invierteLineasFichero(String fichero, String ficheroInvertido)
    {
        String linea;
        try
        {
            FileReader fr = new FileReader(fichero);
            BufferedReader br = new BufferedReader(fr);

            FileWriter fw = new FileWriter(ficheroInvertido);
            BufferedWriter bw = new BufferedWriter(fw);

            linea = br.readLine();

            while (linea!=null)
            {
                linea=invierteCadena(linea);
                bw.write(linea);
                bw.newLine();
                linea=br.readLine();
            }

            bw.close();
            fw.close();
            br.close();
            fr.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    /*9.*//*Escribe la función invierteFicheroTexto a la que le pasas un nombre de
    fichero y te invierte el contenido del fichero, es decir, la primera línea la pone
    la última, la segunda la pone la penúltima, etc. Hay varias formas de hacerlo; la
    más fácil es con una lista de cadenas.*/
    private static void invierteFicheroTexto(String fichero)
    {
        String linea;
        List<String> cadenaTexto = new LinkedList<>();
        try
        {
            FileReader fr = new FileReader(fichero);
            BufferedReader br = new BufferedReader(fr);

            linea = br.readLine();

            //AÑADIR EL TEXTO A LA CADENA
            while (linea != null)
            {
                cadenaTexto.add(linea);
                linea = br.readLine();
            }
            //INVIERTO EL ORDEN DE LA CADENA
            Collections.reverse(cadenaTexto);

            fr.close();
            br.close();

            FileWriter fw = new FileWriter(fichero);
            BufferedWriter bw = new BufferedWriter(fw);

            for (int i = 0; i < cadenaTexto.size(); i++)
            {
                linea = cadenaTexto.get(i);
                bw.write(linea);
                bw.newLine();
            }
            bw.close();
            fw.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    /*10.*//*Escribe la función separaPalabrasFichero a la que le pasas dos
    nombres de fichero. Te cogerá el primer fichero (que contendrá frases) y
    te separará las palabras, que escribirá en el segundo fichero (que tendrá
    una palabra en cada línea).*/
    private static void separaPalabrasFichero(String fichero, String ficheroPalabras)
    {
        String linea;
        String[]palabra;
        try
        {
            FileReader fr = new FileReader(fichero);
            BufferedReader br = new BufferedReader(fr);

            FileWriter fw = new FileWriter(ficheroPalabras);
            BufferedWriter bw = new BufferedWriter(fw);

            linea=br.readLine();
            while (linea!=null)
            {
                palabra = linea.split(" ");
                for (int i=0; i < palabra.length; i++)
                {
                    bw.write(palabra[i]);
                    bw.newLine();
                }
                linea = br.readLine();
            }

            br.close();
            fr.close();
            bw.close();
            fw.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    /*11.*//*EJERICICO ADICIONAL. Escribe la palabra que mas veces se repita
    en el fichero elQuijote*/
    /*private static String elQuijote(String fichero)
    {
        int cont=0, i;
        List<String> listaPalabra = new LinkedList<>();
        String leeLinea;
        try
        {
            FileReader fr = new FileReader(fichero);
            BufferedReader br = new BufferedReader(fr);

            leeLinea = br.readLine();

            while (leeLinea!=null)
            {

            }

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }*/

}

package com.company;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
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
        System.out.println("Ejercicio 11");
        System.out.println("Ejercicio 12");
        System.out.println("Ejercicio 13");
        System.out.println("Ejercicio 14");
        System.out.println("Ejercicio 15");
        System.out.println("Ejercicio 16");
        System.out.println("Ejercicio 17");
        System.out.println("Ejercicio 18");
        System.out.println();
        System.out.print("Elige un ejercicio: ");
        ejercicio = sc.nextInt();
        System.out.println();
        System.out.println("******** EJERCICIO "+ejercicio+" ********");

        switch (ejercicio)
        {
            case 1: //leeLista
            {
                List<Integer> listaNumero = new ArrayList<>();
                leeLista(listaNumero);
                System.out.println(listaNumero);
            }
            break;
            case 2: //leeListaN
            {
                List<Integer> lista = new ArrayList<>();
                int longitud;
                System.out.print("¿Cómo de largo quieres que sea la lista? ");
                longitud =sc.nextInt();
                leeListaN(lista,longitud);
                System.out.println(lista);
            }
            break;
            case 3: //escribeLista
            {
                List<Integer> lista = new ArrayList<>();
                int longitud;
                System.out.print("¿Cómo de largo quieres que sea la lista? ");
                longitud=sc.nextInt();
                leeListaN(lista, longitud);
                escribeLista(lista);
            }
            break;
            case 4: //eliminaNegativos
            {
                List<Integer> lista = new ArrayList<>();
                int longitud;
                System.out.print("¿Cómo de largo quieres que sea la lista? ");
                longitud=sc.nextInt();
                leeListaN(lista, longitud);
                eliminaNegativos(lista);
                escribeLista(lista);
            }
            break;
            case 5: //clasificaNumeros
            {
                List<Integer> lista = new ArrayList<>();
                List<Integer> listaPositivos = new ArrayList<>();
                List<Integer> listaNegativos = new ArrayList<>();
                int longitud;
                System.out.print("¿Cómo de largo quieres que sea la lista? ");
                longitud = sc.nextInt();
                leeListaN(lista,longitud);
                clasificaNumeros(lista, listaNegativos, listaPositivos);
                System.out.print("· Lista original: ");
                escribeLista(lista);
                System.out.println();
                System.out.print("+ Lista de positivos: ");
                escribeLista(listaPositivos);
                System.out.println();
                System.out.print("- Lista de negativos: ");
                escribeLista(listaNegativos);

            }
            break;
            case 6: //eliminaRepetidos
            {
                List<Integer> lista = new ArrayList<>();
                int longitud;
                System.out.print("¿Cómo de largo quieres que sea la lista? ");
                longitud=sc.nextInt();
                leeListaN(lista, longitud);
                System.out.print("· Lista original: ");
                escribeLista(lista);
                eliminaRepetidos(lista);
                System.out.print("· Lista limpia: ");
                escribeLista(lista);
            }
            break;
            case 7: //ordenaListaSeleccion
            {
                List<Integer> lista = new ArrayList<>();
                int longitud;
                System.out.print("¿Cómo de largo quieres que sea la lista? ");
                longitud=sc.nextInt();
                leeListaN(lista, longitud);
                ordenaListaSeleccion(lista);
                escribeLista(lista);
            }
            break;
            case 8: //ordenaListaInsercion
            {
                List<Integer> lista = new ArrayList<>();
                int longitud;
                System.out.print("¿Cómo de largo quieres que sea la lista? ");
                longitud=sc.nextInt();
                leeListaN(lista, longitud);
                escribeLista(lista);
                System.out.println();
                ordenaListaInsercion(lista);
                escribeLista(lista);
            }
            break;
            case 9: //ordenaListaPalabras
            {
                List<String> lista = new ArrayList<>();
                int longitud;
                System.out.print("¿Cómo de largo quieres que sea la lista? ");
                longitud=sc.nextInt();

                leeListaString(lista, longitud);
                ordenalistaPalabras(lista);
                escribeLista(lista);
            }
            break;
            case 10: //ordenaListaPalabras2
            {
                List<String> lista = new ArrayList<>();
                int longitud;
                System.out.print("¿Cómo de largo quieres que sea la lista? ");
                longitud=sc.nextInt();

                leeListaString(lista, longitud);
                ordenalistaPalabras2(lista);
                escribeLista(lista);
            }
            break;
            case 11: //insertaArrayEnArrayPro
            {
                Integer[]array1 = new Integer[4];
                Integer posicion = 2;
                Integer[]array2 = new Integer[3];
                System.out.println("Array 1: ");
                leeArray(array1);
                System.out.println();
                System.out.println("Array 2: ");
                leeArray(array2);

                escribeArray(escribeArrayEnArrayPro(array1, array2, posicion));

            }
            break;
            case 12:
            {
                System.out.println(sorteoBonoloto());
            }
            break;
            case 13: //eliminaRepetidosArray
            {
                int longitud;
                System.out.print("¿Cómo de largo quieres que sea la lista? ");
                longitud = sc.nextInt();

                Integer[] lista = new Integer[longitud];

                leeArray(lista);
                escribeArray(eliminaRepetidosArray(lista));
            }
            break;
            case 14: //unionListas
            {
                int longitud1, longitud2;
                List<Integer> primeraLista = new ArrayList<>();
                List<Integer> segundaLista = new ArrayList<>();

                System.out.print("¿Cómo de larga es la primera lista? ");
                longitud1 = sc.nextInt();
                leeListaN(primeraLista, longitud1);
                System.out.println("********");
                System.out.print("¿Cómo de larga es la segunda lista? ");
                longitud2 = sc.nextInt();
                leeListaN(segundaLista, longitud2);
                System.out.println("********");
                System.out.println();
                System.out.print("Primera lista: ");
                escribeLista(primeraLista);
                System.out.println();
                System.out.print("Segunda lista: ");
                escribeLista(segundaLista);
                System.out.println();
                System.out.print("Union de ambas listas: ");
                escribeLista(unionListas(primeraLista, segundaLista));
            }
            break;
            case 15: //interseccionLista
            {
                int longitud1, longitud2;
                List<Integer> primeraLista = new ArrayList<>();
                List<Integer> segundaLista = new ArrayList<>();

                System.out.print("¿Cómo de larga es la primera lista? ");
                longitud1 = sc.nextInt();
                leeListaN(primeraLista, longitud1);
                System.out.println("********");
                System.out.print("¿Cómo de larga es la segunda lista? ");
                longitud2 = sc.nextInt();
                leeListaN(segundaLista, longitud2);
                System.out.println("********");
                System.out.println();
                System.out.print("Primera lista: ");
                escribeLista(primeraLista);
                System.out.println();
                System.out.print("Segunda lista: ");
                escribeLista(segundaLista);
                System.out.println();
                System.out.print("Interseccion de ambas listas: ");
                escribeLista(interseccionLista(primeraLista, segundaLista));
            }
            break;
            case 16: //desordenaLista
            {
                List<Integer> lista = new ArrayList<>();
                int longitud;
                System.out.print("¿Cómo de largo quieres que sea la lista? ");
                longitud = sc.nextInt();
                leeListaN(lista, longitud);
                System.out.print("Lista original: ");
                escribeLista(lista);
                System.out.println();
                System.out.print("Lista loca: ");
                escribeLista(desordenaLista(lista));
            }
            break;
            case 17: //modaLista
            {
                List<Integer> lista = new ArrayList<>();
                int longitud;
                System.out.print("¿Cómo de largo quieres que sea la lista? ");
                longitud = sc.nextInt();
                leeListaN(lista, longitud);
                System.out.print("Lista: ");
                escribeLista(lista);
                System.out.println();
                System.out.print("El valor que se repite mas veces en la lista es: ");
                System.out.print(modaLista(lista));
            }
            break;
            case 18:
            {
                int notaFinal=0, longitud = 7;
                List<Integer> lista = new ArrayList<>();
                leeListaN(lista, longitud);
                System.out.println();
                System.out.print("Lista con las 7 notas del saltador: ");
                escribeLista(lista);
                System.out.println();
                System.out.println();
                System.out.println("**************************");
                System.out.print("<<<Eliminación de puntos>>>");
                System.out.println();
                notaFinal=puntuacionesTrampolin(lista);
                System.out.println();
                System.out.println("**************************");
                System.out.println();
                System.out.print("La nota del saltador es: "+notaFinal);
            }
            break;
        }
    }

    public static void leeArray(Integer[] a)
    {
        Scanner sc = new Scanner(System.in);
        Integer i, numeroUsuario;
        for(i = 0; i < a.length; i++)
        {
            System.out.print("Escriba un número:");
            numeroUsuario = sc.nextInt();
            a[i] = numeroUsuario;
        }
    }

    public static void escribeArray(Integer[] a)
    {
        Integer i, limite;
        limite = a.length - 1;
        System.out.print("[");
        for(i = 0; i < a.length;i++)
        {
            if(i != limite)
            {
                System.out.print(a[i] + ", ");
            }
            else
            {
                System.out.print(a[i] + "]");
            }
        }
    }

    public static void leeListaString (List lista, int longitud)
    {
        Scanner sc = new Scanner(System.in);
        int cont = 1;
        String palabra;

        System.out.print(cont+". Introduce la palabra numero "+cont+": ");
        palabra=sc.nextLine();
        lista.add(palabra);
        cont++;

        while (cont<=longitud)
        {
            System.out.print(cont+". Introduce la palabra numero "+cont+": ");
            palabra=sc.nextLine();
            lista.add(palabra);
            cont++;
        }
    }

    /*1.*//*Escribe la función leeLista que va leyendo enteros desde el teclado y los va metiendo en
    una lista. La función ira leyendo valores hasta que escribamos un -1. La lista la pasamos
    por parámetro.*/
    public static void leeLista (List<Integer> listaNumero)
    {
        Scanner sc = new Scanner(System.in);
        int cont = 1, num;

        System.out.print("Dime el valor que quieres dar a "+cont+" : ");
        num = sc.nextInt();
        listaNumero.add(num);
        cont++;

        while (num!=-1)
        {
            System.out.print("Dime el valor que quieres dar a "+cont+" : ");
            num = sc.nextInt();
            listaNumero.add(num);
            cont++;
        }
        listaNumero.remove(listaNumero.size()-1);
    }

    /*2.*//*Escribe la función leeListaN que lee desde el teclado el número de enteros que le
    digamos. Para ello, le pasaremos dos parámetros: la lista y un entero.*/
    public static void leeListaN (List lista, Integer longitud)
    {
        Scanner sc = new Scanner(System.in);
        int cont, num;
        cont = 1;

        System.out.print("Dime el valor que quieres dar a "+cont+" : ");
        num = sc.nextInt();
        lista.add(num);
        cont++;
        while (cont<=longitud)
        {
            System.out.print("Dime el valor que quieres dar a "+cont+" : ");
            num = sc.nextInt();
            lista.add(num);
            cont++;
        }
    }

    /*3.*//*Escribe la función escribeLista a la que le pasas una lista y te escribe su contenido por
    pantalla. Para diferenciarla de los arrays, usaremos angulos para delimitarla.*/
    private static void  escribeLista(List lista)
    {
        int i;
        System.out.print("<");
        for (i = 0; i < lista.size(); i++)
        {
            if (i < lista.size()-1)
            {
                System.out.print(lista.get(i)+", ");
            }
            else
            {
                System.out.print(lista.get(i));
            }
        }
        System.out.print(">");
    }

    /*4.*//*Escribe la función eliminaNegativos que elimine todos los números negativos de una
    lista de enteros.*/ //SI EL NEGATIVO QUE AÑADO ESTA EN EL ULTIMO LUGAR, NO LO BORRA
    private static void eliminaNegativos(List<Integer> lista)
    {
        int i;

        for (i = 0; i < lista.size(); i++)
        {
            if (lista.get(i)<0)
            {
                lista.remove(i);
                i--;
            }
        }
    }

    /*5.*//*Escribe la función clasificaNumeros a la que le pasamos tres listas. La primera contiene
    un montón de números positivos y negativos. Habrá que copiar los positivos en la
    primera lista y los negativos en la segunda lista, y después ordenar las dos listas.*/
    private static void clasificaNumeros(List<Integer> lista, List<Integer> listaNegativos, List<Integer> listaPositivos)
    {
        int i, longitud = lista.size();
        for (i = 0; i < longitud; i++)
        {
            if (lista.get(i)>= 0)
            {
                listaPositivos.add(lista.get(i));
            }
            else
            {
                listaNegativos.add(lista.get(i));
            }
        }

    }

    /*6.*//*Escribe la función eliminaRepetidos a la que le pasas una lista y te elimina los elementos
    repetidos, dejando sólo uno de cada (ej.: <1,2,3,1> = <1,2,3>). La forma más fácil es ir
    copiando de una lista a otra sólo los elementos que no estén ya introducidos (p.ej.,
    usando contains).*/
    private static void eliminaRepetidos(List<Integer> lista)
    {
        List<Integer> listaLimpia = new ArrayList<>();
        int i;
        for (i = 0; i < lista.size(); i++)
        {
            if (!(listaLimpia.contains(lista.get(i))))
            {
                listaLimpia.add(lista.get(i));
            }
        }
        lista.clear();
        lista.addAll(listaLimpia);
    }


    /*7.*//*Escribe la función ordenaListaSeleccion a la que le pasas una lista de enteros
    desordenada y te la ordena mediante el algoritmo de selección.
    La ordenación por selección funciona de la siguiente forma:
        - Buscamos el elemento más pequeño de nuestra lista.
        - Lo metemos en otra lista resultado.
        - Lo eliminamos de nuestra lista.
        - Repetimos hasta que nuestra lista se quede vacía y todos los elementos hayan
          pasado a la lista resultado en orden.*/
    private static void ordenaListaSeleccion(List<Integer> lista)
    {
        int i, peque, siguienteNum, posicion;
        List<Integer> listaOrdenada = new ArrayList<>();

        while (lista.size() > 0)
        {
            peque= lista.get(0);
            posicion = 0;

            for (i = 1; i < lista.size(); i++)
            {
                siguienteNum = lista.get(i);
                if (siguienteNum<peque)
                {
                    peque = siguienteNum;
                    posicion = i;
                }
            }
            listaOrdenada.add(peque);
            lista.remove(posicion);
        }

        lista.addAll(listaOrdenada);
    }
    /*8.*//*Escribe la función ordenaListaInsercion a la que le pasas una lista de enteros
    desordenada y te la ordena mediante el algoritmo de inserción.
    La ordenación por inserción funciona de la siguiente forma:
        - Cogemos cada elemento en orden de nuestra lista.
        - A la hora de meterlo en la lista resultado lo metemos de manera que la lista
          resultado se quede ordenada. Para ello, vamos pasando por la lista resultado hasta
          que encontremos un valor mayor e insertamos nuestro número delante.
        - Repetimos hasta que nuestra lista se quede vacía y todos los elementos hayan
          pasado a la lista resultado en orden.*/
    private static void ordenaListaInsercion(List<Integer> lista)
    {
        int i;
        List<Integer> resultado = new ArrayList<>();
        resultado.add(lista.get(0));

        for (i = 1; i < lista.size(); i++)
        {
            int numero, posicion, j;

            numero = lista.get(i);
            posicion = resultado.size();

            for (j = 0; j <resultado.size(); j++)
            {
                if (numero < resultado.get(j))
                {
                    posicion= j;
                    j = resultado.size();
                }
            }
            resultado.add(posicion,numero);
        }
        lista.clear();
        lista.addAll(resultado);
    }

    /*9.*//*Escribe la función ordenaListaPalabras a la que le pasas una lista de cadenas que
    contiene palabras y te las ordena alfabéticamente.*/
    private static void ordenalistaPalabras(List<String> lista)
    {
        int i, valor;
        List<String> resultado = new ArrayList<>();
        String peque;

        while (lista.size()>0)
        {
            peque = lista.get(0);
            for (i = 1; i < lista.size(); i++)
            {
                valor=peque.compareTo(lista.get(i));

                if (valor>0)
                {
                    peque=lista.get(i);
                }
            }
            resultado.add(peque);
            lista.remove(peque);
        }
        lista.addAll(resultado);
    }


    /*10.*//*Escribe la función ordenaListaPalabras2 a la que le pasas una lista de cadenas que
    contiene palabras y te las ordena por tamaño (la más pequeña el principio).*/
    private static void ordenalistaPalabras2(List<String> lista)
    {
        List<String>resultado = new ArrayList<>();
        int i;
        String peque;

        while (lista.size()>0)
        {
            peque=lista.get(0);
            for (i = 1; i < lista.size(); i++)
            {
                if (lista.get(i).length() < peque.length())
                {
                    peque=lista.get(i);
                }
            }
            resultado.add(peque);
            lista.remove(peque);
        }
        lista.addAll(resultado);
    }

    /*11.*//*Escribe la función insertaArrayEnArrayPro a la que le pasamos tres parámetros: un
    array de enteros, una posición en ese array y otro array de enteros. La función insertará
    en el primer array, a partir de la posición indicada, to-do el contenido del segundo array,
    y nos devolverá otro array con el resultado. Para ello, usaremos una lista como paso
    intermedio: copiamos el array a la lista, realizamos la inserción en la lista y luego
    convertiremos la lista en un array y lo devolveremos.*/
    public static Integer[]escribeArrayEnArrayPro(Integer[]array1, Integer[]array2, Integer posicion)
    {
        List<Integer>lista = new ArrayList<>(Arrays.asList(array1)); //.asList añade muchos datos a una lista
        lista.addAll(posicion, Arrays.asList(array2)); //addAll añada una lista o array a otra lista
        Integer[]resultado =  lista.toArray(new Integer[0]); //.toArray convertir a array
        return resultado;
    }

    /*12*//*Escribe la función sorteoBonoloto que nos da los 6 números que van a tocar en el
    próximo sorteo. Para ello, meteremos en una lista los 49 números, elegiremos una
    posición al azar, guardaremos el número en otra lista y lo eliminaremos de la primera
    (para que no pueda volver a salir). Al terminar de sortear los 6 números, devolveremos
    una lista que contenga el resultado.*/
    public static List sorteoBonoloto()
    {
        /*LISTA CON LOS 49 NUMEROS*/
        List<Integer> lista49Numeros = new ArrayList<>();
        int i;
        for (i = 1; i<50; i++)
        {
            lista49Numeros.add(i);
        }
        System.out.print("Lista de numeros = "+lista49Numeros);
        System.out.println();

        /*LISTA DE LOS NUMEROS ALEATORIOS*/
        List<Integer> listaResultado = new ArrayList<>();

        Random r = new Random();
        int j, indice, numero, cont = 1;
        for (j = 1; j<=6; j++)
        {
            System.out.println("*************Vuelta nº"+cont+"*************");
            indice=r.nextInt(lista49Numeros.size());
            System.out.println("Indice = "+indice);
            System.out.println();
            numero = lista49Numeros.get(indice);
            System.out.println("Numero = "+numero);
            System.out.println();
            listaResultado.add(numero);
            System.out.println("Añadido a resultado = "+listaResultado);
            System.out.println();
            lista49Numeros.remove(Integer.valueOf(numero));
            System.out.println("Borrado = "+lista49Numeros);
            System.out.println();
            cont++;
        }
        System.out.println("·····················································");
        System.out.print("Los 6 numeros aleatorios son: ");
        return listaResultado;
    }

    /*13.*//*Escribe la función eliminaRepetidos a la que le pasamos un array (en el que
    puede que aparezcan elementos repetidos) y nos devuelve otro array en el que no hay
    repetidos. Podemos usar listas para que sea más sencillo.*/
    private static Integer[] eliminaRepetidosArray(Integer[] lista)
    {
        List<Integer> arrayLimpia = new ArrayList<>(Arrays.asList(lista));
        eliminaRepetidos(arrayLimpia);
        Integer[] reslutado = arrayLimpia.toArray(new  Integer[0]);

        return reslutado;
    }

    /*14.*//*Escribe la función unionListas a la que le pasas dos listas (que representan
    conjuntos) y que te devuelve otra lista que representará la unión de ambos conjuntos. Esto es, los
    elementos que estén o en la primera lista o en la segunda (si están en las dos, sólo hay
    que meterlos una vez).*/
    private static List unionListas(List<Integer> primeraLista, List<Integer> segundaLista)
    {
        List<Integer> listaFinal = new ArrayList<>();
        listaFinal.addAll(primeraLista);
        listaFinal.addAll(segundaLista);
        eliminaRepetidos(listaFinal);
        return listaFinal;
    }

    /*15.*//*Escribe la función interseccionListas a la que le pasas dos listas (que
    representan conjuntos) y que te devuelve otra lista que representará la
    intersección de ambos conjuntos. Esto es, los elementos que estén tanto en la primera lista
    como en la segunda*/
    private static List interseccionLista(List<Integer> primeraLista, List<Integer> segundaLista)
    {
        List<Integer> listaFinal = new ArrayList<>();
        int i, j;
        for (i = 0; i < primeraLista.size(); i++)
        {
            for (j = 0; j < segundaLista.size(); j++)
            {
                if (primeraLista.get(i).equals(segundaLista.get(j)))
                {
                    listaFinal.add(primeraLista.get(i));
                }
            }
        }
        return listaFinal;
    }

    /*16.*//*Escribe la función desordenaLista a la que le pasas una lista y te la desordena.
    Para ello, iremos cogiendo al azar elementos de la lista y poniéndolos en otra lista (quitándolos
    de la primera). La segunda lista, contendrá los elementos al azar.*/
    private static List desordenaLista(List<Integer> lista)
    {
        Random r = new Random();
        int indicador, numero;
        List<Integer> listaLoca = new ArrayList<>();
        while (lista.size()>0)
        {
            indicador = r.nextInt(lista.size()); //me INDICA un numero entero aleatorio de to.do el largo de mi lista
            numero = lista.get(indicador); // cojo el numero que me indica el indicador de la lista
            listaLoca.add(numero); //añado ese numero a la nueva lista
            lista.remove(Integer.valueOf(numero)); //borro el valor del numero que esta en la lista original
        }
        return listaLoca;
    }

    /*17.*//*Escribe la función modaLista que nos devuelva la moda (el valor que más veces se repite)
    de una lista de enteros.*/
    private static Integer modaLista(List<Integer> lista)
    {
        int i, j, contAux=0,cont=0, masRepetido=0;
        for (i = 0; i < lista.size(); i++) //cojo el primer numero de la lista, y lo voy comparando con todos los demas en el siguiente FOR
        {
            for (j = 0; j < lista.size(); j++) //comparo I con J
            {
                if (lista.get(i)==lista.get(j)) //si el numero I es igual que el J
                {
                    contAux++; //aumenta un contador auxiliar
                }
            }
            if (contAux>cont) //si el auxiliar es mayor que el contador principal:
            {
                masRepetido=lista.get(i); //el numero mas repetido lo guardo ahi
                cont=contAux; //el contador pasa a ser  el valor que guardé en el contador auxiliar
                contAux=0; //y reseteo el contador auxiliar, para que guarde el siguiente numero en la siguiente vuelta del FOR
            }
            else //si el auxiliar no es mayor que el contador principal
            {
                contAux=0;//reseteo el auxiliar para la siguiente vuelta
            }
        }
        return masRepetido;
    }

    /*18.*//*Escribe la función puntuacionesTrampolin. La función recibirá una lista con siete
    números reales que se corresponderán a las notas obtenidas por un saltador de
    trampolín de 3 metros. En este deporte, para calcular la nota final, se eliminan las dos
    notas más altas y las dos más bajas, sumándose las tres que quedan. Por tanto, nuestra
    función eliminará los dos valores más altos y los dos más bajos del la lista y, además,
    devolverá un real que será la suma de los tres valores que quedan*/

    private static Integer puntuacionesTrampolin(List<Integer> lista)
    {
       int i, j, mayor, menor, cont=0, nota=0;
       for (j = 0; j < 2; j++)
       {
           mayor = lista.get(0);
           menor = lista.get(0);
           for (i = 1; i < lista.size(); i++)
           {
               if (menor>lista.get(i))
               {
                   menor=lista.get(i);
               }
               else
               {
                   if (mayor<lista.get(i))
                   {
                       mayor=lista.get(i);
                   }
               }
           }
           lista.remove(Integer.valueOf(menor));
           lista.remove(Integer.valueOf(mayor));
           escribeLista(lista);
       }
       for (i = 0; i < lista.size(); i++)
       {
           nota = nota + lista.get(i);
       }
       return nota;
    }

}

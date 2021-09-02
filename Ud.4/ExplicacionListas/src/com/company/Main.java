package com.company;

import java.awt.event.ItemEvent;
import java.util.*;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        //DEFINIR UNA LISTA
        List<Integer> li;           //Integer es parecido a int



        //CREAMOS LA LISTA
        li = new ArrayList<>();     //Lista dentro de array. Es mas rapida para recorrer la lista (con un for)
        li = new LinkedList<>();    //Lista enlazada. Es mas rapida para añadir o instertar elementos


        //AÑADIR ELEMENTOS A UNA LISTA (2 maneras)
        //1.
        li.add(1);
        li.add(2);
        li.add(3);
        //2.
        int i;
        for (i=4;i<=6;i++)
        {
            li.add(i);
        }



        //SUMARLE UNO A CADA POSICION
        int valor;
        for (i=0;i<=li.size();i++)      //.size es la longitud de la lista
        {
            valor=li.get(i);            //Leer un valor de una posicion i-> valor=li[i]
            li.set(i, valor+1);         //Modifica el valor de la posición i -> li[i]=valor+1
            //li.set(i, li.get(i)+1);   //de una sola vez -> l[i]++;
        }



        //ESCRIBIR TODOS LOS ELEMENTOS DE UNA LISTA E IRLOS BORRANOD
        while (li.size()>0)
        {
            System.out.println(li.get(0));
            li.remove(0);
        }



        //MAS FUNCIONES DE LISTA
        //insertar
        li.add(5);           //añade un elemento al final
        li.add(0,5);    //añade un elemento al principio
        li.add(3,5);    //añade el 5 en la posicion 3 (si no existe la posición, peta)

        //borrar por posicion
        li.remove(0);               //borra el primer elemento (peta si no hay nada)
        li.remove(li.size()-1);     //borra el ultimo elemento (peta si no hay nada)

        //borrar por elemento
        Integer ele=5;
        li.remove(ele);                     //borra el elemento '5' (si hay mas de uno, quita el primero) (devuelve true si está, si no false)
        li.remove(Integer.valueOf(ele));    //otra manera

        //contains
        //li.contains();    // igual que el de cadenas

        //indexOf
        //li.indexOf();     // igual que el de cadenas (indica la posición de algo)

        //sublist
        //li.subList(3,6); //igual que el de SubString

        //añadir muchos datos a una lista
        List<Integer> l2 = new LinkedList<>(Arrays.asList(1,2,3,4)) ;
        List<Integer> l3 = new LinkedList<>(Arrays.asList(11,12,13,14));

        //addall añade una lista (o una array) en otra
        l2.addAll(l3);
        System.out.println(l2);
        Integer[]array={99,98,97};
        l2.addAll(Arrays.asList(array));
        System.out.println(l2);

        //clear
        //li.clear(); //deja vacia la lista

        //IsEmpty
        //if(li.isEmpty());

        //Resto de funciones chulas estan en Collections
        System.out.println("min = "+ Collections.min(l2));
        System.out.println("max = "+ Collections.max(l2));
        Collections.reverse(l2);
        System.out.println("al reves = "+l2);
        Collections.sort(l2);
        System.out.println("ordenada = "+l2);
        Collections.shuffle(l2);
        System.out.println("desordenada= "+l2);

        //tambien existe insertall

        //.compareTo --> compara secuencialmente las letras
    }
}

package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main
{

    public static void main(String[] args)
    {
        /*int i; //variable (primera en minuscula)
        String s = "patata"; //objeto (primera en mayuscula)

        List<Integer> lista = new ArrayList<>(); //new es un contructor. llamar al constructor

        String s2 = s + "patata"; // + es un operador*/

        //CLASE
        //-Atributos (cosas donde podemos guardar datos)        ->      variables
        //-Métodos                                              ->      funciones
        //-Constructores                                        ->      funciones para inicializar los objetos
        //-Propiedades                                          ->      hibrido entre variable y funcion
        //-Operadores                                           ->      funcion que usa operadores per ose llama como operadores aritméticos

        //-Ocultadion/Encapsulamiento       -> private (solo se puede usar dentro de la clase) y public ()
        //-Polimorfismo                     -> crear varios metodos con el mismo nombre
        //-Herencia

        Coche c = new Coche();

        c.setMatricula("8743KGB");
        c.marca = "Seat";
        c.modelo = "Panda";
        //c.cilindrada = 99;
        c.setPrecio(1000);
        c.nuevo = false;

        Coche c2 = new Coche("4567FFF", "Audi", "A4", 2488, 7500, false);

        c.setPrecio(1000);

        System.out.println(c2.getMatricula());

        System.out.println("Precio = " + c2.getPrecio());
        System.out.println("Rebajado(-20%) = " + c2.rebaja(20));

        System.out.println(c2.toString());

        //Usos de clases
        List<Coche> list = new ArrayList<>();

    }
}

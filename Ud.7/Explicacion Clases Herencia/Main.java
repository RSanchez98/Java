package com.company;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main
{

    public static void main(String[] args)
    {
        // Clase padre = List
        // Clases hijos = ArrayList y LinkedList
//        List<String> l = new ArrayList<>();
//        List<String> l2 = new LinkedList<>();
//        List<String> l3 = new List<String>();

//        Vehiculo v = new Vehiculo();
//        v.matricula = "vehiculo-1234";

        Moto m = new Moto();
        m.matricula = "moto-1234";
        m.tieneSidecar = false;

        Coche c = new Coche();
        c.matricula = "coche-1234";

        List<Vehiculo> lista = new ArrayList<>();
//        lista.add(v);
        lista.add(m);
        lista.add(c);

        int i;
        for(i = 0; i < lista.size(); i++)
        {
            System.out.println(lista.get(i).toString());

            if(lista.get(i) instanceof Moto)
            //if(lista.get(i).getClass() == Moto.class)
            {
                Moto m2 = (Moto)lista.get(i);
                System.out.println("Tiene sidecar = " + m2.tieneSidecar);
            }
        }

        // FECHAS ---------------------------------------------------------------

        //LocalDate d = new LocalDate(2020, 03, 10);
        LocalDate d = LocalDate.of(2020, 3, 10);
        d = d.plusDays(5);
        System.out.println(d.toString());

        String fechaBonita = d.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println(fechaBonita);

        LocalDate hoy = LocalDate.now();
    }
}

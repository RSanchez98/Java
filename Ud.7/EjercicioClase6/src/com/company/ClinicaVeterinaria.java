package com.company;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;

public class ClinicaVeterinaria
{
    //ATRIBUTOS*********************************************************************************************************
    private List<Animal> listaAnimales;

    //CONSTRUCORES******************************************************************************************************
    public ClinicaVeterinaria ()
    {
        listaAnimales = new ArrayList<>();
    }

    //METODOS***********************************************************************************************************
    public void insertaAimal(Animal a)
    {
        listaAnimales.add(a);
    }
    public Animal buscaAnimal (String a)
    {
        int i;
        for (i = 0; i < listaAnimales.size(); i++)
        {
            if (listaAnimales.get(i).getNombre().equals(a));
            {
                return listaAnimales.get(i);
            }
        }
        throw new InvalidParameterException("El animal buscado no se encuentra en nuestra lista");
    }
    public void modificaComentarioAnimal(String nombreAnimal, String comentarioNuevo)
    {
        Animal a = buscaAnimal(nombreAnimal);
        a.comentarios = comentarioNuevo;
    }
    public String toString()
    {
        String cadena="";
        int i;
        for ( i = 0; i< listaAnimales.size(); i++)
        {
            cadena = cadena + listaAnimales.get(i).toString()+'\n';
        }
        return cadena;
    }
}

package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pokedex
{
    // ATRIBUTOS*********************************************************************************************************
    private List<Pokemon> listPokemon;

    // CONSTRUCORES******************************************************************************************************
    public Pokedex(String nombrefichero)
    {
        listPokemon = new ArrayList<>();
        leeCSV(nombrefichero);
    }
    // PORPIEDADES*******************************************************************************************************

    private void leeCSV(String fichero)
    {
        int id, ataque, defensa, vida, ataqueespecial, defensaespecial, velocidad;
        String nombre, tipo, habilidad;
        boolean capturado;
        try
        {
            FileReader fr = new FileReader(fichero);
            BufferedReader br = new BufferedReader(fr);

            String texto= br.readLine();
            //System.out.println(texto);
            while (texto!=null)
            {
                String[] partes;
                partes = texto.split(",");
                //System.out.println(Arrays.toString(partes));
                if (partes.length>1)
                {
                    id = Integer.valueOf(partes[0]);
                    nombre = partes[1];
                    tipo = partes[2];
                    ataque = Integer.valueOf(partes[3]);
                    defensa = Integer.valueOf(partes[4]);
                    vida = Integer.valueOf(partes[5]);
                    ataqueespecial = Integer.valueOf(partes[6]);
                    defensaespecial = Integer.valueOf(partes[7]);
                    velocidad = Integer.valueOf(partes[8]);
                    habilidad = partes[9];
                    if (partes[10].equals("true"))
                    {
                        capturado = true;
                    }
                    else
                    {
                        capturado = false;
                    }

                    Pokemon pokemon = new Pokemon(id, nombre, tipo, ataque, defensa, vida, ataqueespecial, defensaespecial, velocidad, habilidad, capturado);
                    //System.out.println(pokemon);
                    listPokemon.add(pokemon);
                }
                texto = br.readLine();
            }
            br.close();
            fr.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public void guardaCSV(String fichero)
    {
        try
        {
            FileWriter fw = new FileWriter(fichero);
            BufferedWriter bw = new BufferedWriter(fw);

            int i;
            for (i = 0; i <listPokemon.size(); i++)
            {
                bw.write(listPokemon.get(i).getId()+",");
                bw.write(listPokemon.get(i).getNombre()+",");
                bw.write(listPokemon.get(i).getTipo()+",");
                bw.write(listPokemon.get(i).getAtaque()+",");
                bw.write(listPokemon.get(i).getDefensa()+",");
                bw.write(listPokemon.get(i).getVida()+",");
                bw.write(listPokemon.get(i).getAtaqueespecial()+",");
                bw.write(listPokemon.get(i).getDefensaespecial()+",");
                bw.write(listPokemon.get(i).getVelocidad()+",");
                bw.write(listPokemon.get(i).getHabilidad()+",");

                if (listPokemon.get(i).getCapturado())
                {
                    bw.write("true");
                }
                else
                {
                    bw.write("false");
                }
                bw.write(System.lineSeparator());

            }

            bw.close();
            fw.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public boolean capturaPokemon(String nombrePokemon)
    {
        int i;
        boolean captura = false;
        for ( i = 0; i < listPokemon.size(); i++)
        {
            if (listPokemon.get(i).getNombre().equals(nombrePokemon))
            {
                listPokemon.get(i).setCapturado(true);
                captura = true;
            }
        }
        return captura;
    }

    public double porcentajeCaptura ()
    {
        double porcentaje, total = 0, captrurado = 0;
        int i;
        for ( i = 0; i < listPokemon.size(); i++)
        {
            total++;
            if (listPokemon.get(i).getCapturado())
            {
                captrurado++;
            }
        }
        porcentaje =(captrurado*100)/total;
        return porcentaje;
    }

    public Pokemon buscaPokemonId(int id)
    {
        int i;
        for (i = 0; i < listPokemon.size(); i++)
        {
            if (listPokemon.get(i).getId() == id)
            {
                return listPokemon.get(i);
            }
        }
        return  null;
    }

    public Pokemon buscaPokemonNombre(String nombre)
    {
        int i;
        for (i = 0; i < listPokemon.size(); i++)
        {
            if (listPokemon.get(i).getNombre().equals(nombre))
            {
                return listPokemon.get(i);
            }
        }
        return  null;
    }

    public String listadoPokemon()
    {
        int i;
        String lista = "";
        for ( i = 0; i < listPokemon.size(); i++)
        {
            lista = lista +"[ID: "+listPokemon.get(i).getId()+"] ";
            lista = lista +"[Name: "+listPokemon.get(i).getNombre()+"] ";
            lista = lista +"[Type:"+listPokemon.get(i).getTipo()+"] ";
            if (listPokemon.get(i).getCapturado())
            {
                lista = lista + "[֍ Capturado ֍]"+'\n';
            }
            else
            {
                lista = lista + "[҉ NO capturado ҉]"+'\n';
            }
        }
        return lista;
    }

    public String listadoPokemonCapturados()
    {
        int i;
        String lista = "";

        for ( i = 0; i < listPokemon.size(); i++)
        {
            if (listPokemon.get(i).getCapturado())
            {
                lista = lista +"[ID: "+listPokemon.get(i).getId()+"] ";
                lista = lista +"[Name: "+listPokemon.get(i).getNombre()+"] ";
                lista = lista +"[Type: "+listPokemon.get(i).getTipo()+"] "+'\n';
            }
        }
        return lista;
    }

    public String listadoPokemonTipo (String tipo)
    {
        int i;
        String lista = "";
        for ( i = 0; i < listPokemon.size(); i++)
        {
            if (listPokemon.get(i).getTipo().equals(tipo))
            {
                lista = lista +"[ID: "+listPokemon.get(i).getId()+"] ";
                lista = lista +"[Name: "+listPokemon.get(i).getNombre()+"] ";
                lista = lista +"[Type: "+listPokemon.get(i).getTipo()+"] ";
                if (listPokemon.get(i).getCapturado())
                {
                    lista = lista + "[֍ Capturado ֍]"+'\n';
                }
                else
                {
                    lista = lista + "[҉ NO capturado ҉]"+'\n';
                }
            }
        }
        return lista;
    }

    public String listadoPokemonCapturadosTipo(String tipo)
    {
        int i;
        String lista="";
        for (i = 0; i < listPokemon.size(); i++)
        {
            if (listPokemon.get(i).getCapturado()==true)
            {
                if (listPokemon.get(i).getTipo().equals(tipo))
                {
                    lista = lista +"[ID: "+listPokemon.get(i).getId()+"] ";
                    lista = lista +"[Name: "+listPokemon.get(i).getNombre()+"] ";
                    lista = lista +"[Type: "+listPokemon.get(i).getTipo()+"] "+'\n';
                }
            }
        }
        return lista;
    }

    // METODOS***********************************************************************************************************
}

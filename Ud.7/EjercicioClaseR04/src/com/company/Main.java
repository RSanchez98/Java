package com.company;

import javax.print.DocFlavor;
import java.io.PipedOutputStream;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Pokemon p = new Pokemon();
        Pokedex x = new Pokedex("pokemon.csv");
        Scanner sc = new Scanner(System.in);
        String opcion = "";
        while (!opcion.equals("0"))
        {
            System.out.println("Bienvenido al menu de la Pokdedex");
            System.out.println("--Elige una opcion--");
            System.out.println("1. Mostrar la lista de los Pokemons");
            System.out.println("2. Porcentaje de captura");
            System.out.println("3. Buscar Pokemon por su Id");
            System.out.println("4. Buscar Pokemon por su nombre");
            System.out.println("5. Capturar un Pokemon");
            System.out.println("6. Lista de Pokemons capturados");
            System.out.println("7. Lista de Pokemons por su tipo");
            System.out.println("8. LIsta de Pokemons capturados por su tipo");
            System.out.println();
            System.out.print("Elige: ");
            opcion = sc.nextLine();
            System.out.println();


            switch (opcion)
            {
                case "1":
                {
                    System.out.println();
                    System.out.println(x.listadoPokemon());
                    System.out.println();
                }
                break;
                case "2":
                {
                    System.out.println();
                    System.out.println("Tienes un " + x.porcentajeCaptura() + "% de los pokemones capturados");
                    System.out.println();
                }
                break;
                case "3":
                {
                    System.out.println();
                    int id;
                    System.out.print("Insterta el numero Id del Pokemon: ");
                    id = sc.nextInt();
                    System.out.println("El pokemon que buscas es " + x.buscaPokemonId(id).getNombre());
                    System.out.println();
                }
                break;
                case "4":
                {
                    System.out.println();

                    String nombre;
                    System.out.print("Inserta el nombre del pokemon: ");
                    nombre = sc.nextLine();
                    System.out.print("[ID: " + x.buscaPokemonNombre(nombre).getId() + "] ");
                    System.out.print("[Nombre: " + x.buscaPokemonNombre(nombre).getNombre() + "] ");
                    System.out.print("[Tipo: " + x.buscaPokemonNombre(nombre).getTipo() + "] ");
                    System.out.print("[Capturado: " + x.buscaPokemonNombre(nombre).getCapturado() + "]");
                    System.out.println();

                }
                break;
                case "5":
                {
                    System.out.println();
                    String nombre;
                    System.out.print("Pokemon que quieres caputrar: ");
                    nombre = sc.nextLine();
                    x.capturaPokemon(nombre);
                    if (x.capturaPokemon(nombre) == true)
                    {
                        System.out.println("El pokemon " + nombre + " ha sido capturado!!");
                    }
                    else
                    {
                        System.out.println("No ha podido ser... " + nombre + " se te ha escapado");
                    }
                    System.out.println();
                }
                break;
                case "6":
                {
                    System.out.println();
                    System.out.println(x.listadoPokemonCapturados());
                    System.out.println();

                }
                break;
                case "7":
                {   System.out.println();
                    String tipo;
                    System.out.print("Tipo del pokemon: ");
                    tipo = sc.nextLine();
                    System.out.println(x.listadoPokemonTipo(tipo));
                    System.out.println();

                }
                break;
                case "8":
                {
                    System.out.println();
                    String tipo;
                    System.out.print("Tipo del pokemon: ");
                    tipo = sc.nextLine();
                    System.out.println(x.listadoPokemonCapturadosTipo(tipo));
                    System.out.println();

                }
                break;
            }
            x.guardaCSV("pokemon.csv");
        }
    }
}
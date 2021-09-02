package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args)
    {
        //ESCRIBIR EN UN FUCHERO DE TEXTO
	    //FileWriter y BufferWriter
        //FileReader y BufferReader
        /*try //si en el try hay una excepcion...
        {
            FileWriter fw = new FileWriter("fichero.txt");
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write("Hola mundo"+System.lineSeparator());
            //bw.write("Hola mundo\r\n"); para windows
            //bw.write("Hola mundo\n)"; para linux
            //bw.write("Hola mundo\r)"; para mac
            bw.write("Adios mundo");

            bw.close();
            fw.close();
        }//... se ejecuta en el catch
        catch (IOException e) //por si hay algun problema con alguna excepcion
        {
            e.printStackTrace(); //pone el error pero se sigue ejecutando
        }*/



        //LEER DE UN FICHERO
       /* try
        {
            FileReader fr = new FileReader("fichero.txt");
            BufferedReader br = new BufferedReader(fr);

            String linea = br.readLine();
            System.out.println(linea);

            br.close();
            fr.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }*/



        try
        {
            FileReader fr = new FileReader("fichero.txt");
            BufferedReader br = new BufferedReader(fr);

            String linea = br.readLine();
            while (linea!=null)
            {
                System.out.println(linea);
                linea = br.readLine();
            }

            br.close();
            fr.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}

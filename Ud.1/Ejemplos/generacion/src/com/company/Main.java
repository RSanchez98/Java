package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int anno;
        System.out.println("Dime de que año eress para decirte tu generación");

        anno = sc.nextInt();

        if (anno >= 1994) {
            System.out.println("Eres de la generación Z porque nacieste en el " + anno);
        }
        else  {
            if(anno <= 1980) {
                System.out.println("Eres de la generación Barrio Sesamno porque nacienste en el " + anno);
            }
            else {
                System.out.println("Eres de la generación Milenial porque nacieste en el año "+ anno);
            }
        }

    }
}

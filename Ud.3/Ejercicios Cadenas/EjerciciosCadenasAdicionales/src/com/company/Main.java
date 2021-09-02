package com.company;

import java.net.PortUnreachableException;
import java.sql.SQLOutput;
import java.util.Scanner;

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
        System.out.println("******** EJERCICIO " + ejercicio + " ********");

        switch (ejercicio)
        {
            case 1: //marcaSubCadena
            {
                String cadena1, cadema2;
                cadena1 = "La verdad y el terror Koji puede dominar con el y su robot Mazinger";
                cadema2 = "Koji puede dominar";
                System.out.println(marcaSubCadena(cadena1, cadema2));

            }
            break;
            case 2: //escribeNombres
            {
                String cadena = "Sanchez Valle Rodrigo Vega Garcia Mario Lobato Dominguez Blanca";
                escribeNombres(cadena);
            }
            break;
            case 3: //cuentaLetras
            {
                String cadena = "Estaba el Señor DON GATO sentadito en SU TEJADO marrama MIAU MIAU miau";
                System.out.println("********VERSÓN N00B********");
                System.out.println("[A, B, C, D, E]");
                escribeArray(cuentaLetras(cadena));
                System.out.println();
                System.out.println("********VERSÓN PRO********");
                System.out.println("[A, B, C, D, E, F, G, H, I, J, K, L, M, N, Ñ, O, P, Q, R, S, T, U, V, W, X, Y, Z]");
                escribeArray(cuentaLetrasPro(cadena));
            }
            break;
            case 4: //mayusculasMinusculas
            {
                String cadena = "Hola Don Pepito, hola Don José. le dijo Pepito a José";
                int num;
                System.out.println("************ MENÚ ************");
                System.out.println("1. Todas las letras en minúsculas.");
                System.out.println("2. Todas las letras en mayúsculas.");
                System.out.println("3. La primera letra de cada palabra en mayúsculas y el resto en minúsculas.");
                System.out.println("4. La primera letra de cada frase (separada por un '.') en mayúsculas y el resto en minúsculas.");
                System.out.println();
                System.out.print("¿Qué función quieres ejecutar? --> ");
                num = sc.nextInt();

                switch (num)
                {
                    case 1:
                        System.out.println(mayusculasMinusculas(cadena,num));
                    break;
                    case 2:
                        System.out.println(mayusculasMinusculas(cadena,num));
                    break;
                    case 3:
                        System.out.println(mayusculasMinusculas(cadena,num));
                    break;
                    case 4:
                        System.out.println(mayusculasMinusculas(cadena,num));
                    break;
                }
            }
            break;
            case 5: //eliminaTags
            {
                String cadena ="<p>Esto es texto normal <b>y esto es texto en negrita</b>.</p>";
                System.out.println(eliminaTags(cadena));
            }
            break;
            case 6: //ordenaPalabrasComa INCOMPLETA
            {
                String cadena =" hola,don,pepito,pasó,usted,ya,por,casa";
                System.out.println(ordenaPalabrasComa(cadena));
            }
            break;
            case 7: //acentosHTML
            {
                String cadena ="<Sábes que se lo dije> Le dijo el pingüino al ñandú";
                System.out.println(acentosHTML(cadena));
            }
            break;
            case 8: //palabrasMismaLetra
            {
                String cadena="Amanda tiene tres serpientes";
                System.out.println(palabrasMismaLetra(cadena));
            }
            break;
            case 9: //
            {

            }
            break;
            case 10: //
            {

            }
            break;
        }
    }
    public static void escribeArray (int[] n)
    {
        int i;
        System.out.print("[");
        for (i = 0; i < n.length -1 ; i++)
        {
            System.out.print(n[i]+", ");
        }
        System.out.print(n[i] + "]");
    }
    public static void leeArray (int[] n)
    {
        Scanner sc = new Scanner(System.in);
        int i, num;
        for (i = 0; i < n.length; i++)
        {
            System.out.print(i + 1+". Introduce un numero: ");
            num = sc.nextInt();
            n[i]= num;
        }
    }
    public static String preguntaCadena()
    {
        String cadena;
        Scanner sc = new Scanner(System.in);

        System.out.print("Escribe la cadena: ");
        cadena = sc.nextLine();

        return cadena;
    }


    /*1.*//*Escribe una función marcaSubCadena a la que le pasamos dos cadenasç
     y nos busca la segunda cadena dentro de la primera. Nos devolverá otra
     cadena igual que la primera, pero en la que se cambiará la primera letra
     de cada vez que aparece la subcadena por un asterisco.*/
    public static String marcaSubCadena (String cadena1, String cadena2)
    {
        int i;
        String finalCadena ="";
        for (i = 0; i < cadena1.length(); i++)
        {
            if (cadena1.charAt(i)==cadena2.charAt(0))
            {
                String subcadena = cadena1.substring(i, i+cadena2.length());
                if (subcadena.equals(cadena2))
                {
                    finalCadena = finalCadena + "*";
                }
                else
                {
                    finalCadena = finalCadena + cadena1.charAt(i);
                }
            }
            else
            {
                finalCadena = finalCadena + cadena1.charAt(i);
            }
        }
        return finalCadena;
    }

    /*2.*//*Escribe la función escribeNombres a la que le pasamos una cadena
    por parámetro y nos la escribe por la pantalla (con println) con el
    siguiente formato: la cadena contendrá varias palabras separadas por
    espacios, con el siguiente formato: “apellido1 apellido2 nombre apellido1
    apellido2 nombre (…)” y deberemos escribirla por pantalla de la siguiente
    forma:
    nombre apellido1 apellido2
    nombre apellido1 apellido2
    (…)*/
    public static void escribeNombres(String cadena)
    {
        int i;
        String cadenaFinal="";
        String[] palabras = cadena.split(" ");
        for (i = 0; i <palabras.length; i = i + 3)
        {
            System.out.println(palabras[i+2]+" "+palabras[i]+" "+palabras[i+1]);
        }
    }

    /*3.*//*Escribe la función cuentaLetras a la que le pasas una cadena por
    parámetro y te devuelve un array de enteros. El tamaño del array será 5
     y el contenido será el número de veces que aparecen las letras
     “a”, “b”, “c”, “d” y “e”, respectivamente, en la cadena que le hemos
     pasado (independientemente de si son mayúsculas o minúsculas).
    Ej.: cadena = “patata camaleón batata”, resultado: [8, 1, 1, 0, 1]*/
    public static int[]cuentaLetras (String cadena)
    {
        int[]contador = new int[5];
        int i, j;
        cadena = cadena.toLowerCase();
        String letras = "abcde";

        for (i = 0; i<letras.length(); i++)
        {
            for (j = 0; j<cadena.length(); j++)
            {
                if (letras.charAt(i)==cadena.charAt(j))
                {
                    contador[i]=contador[i]+1;
                }
            }
        }
        return contador;
    }
    public static int[]cuentaLetrasPro (String cadena)
    {
        int[]contador = new int[27];
        int i, j;
        cadena = cadena.toLowerCase();
        String letras = "abcdefghijklmnñopqrstuvwxyz";

        for (i = 0; i<letras.length(); i++)
        {
            for (j = 0; j<cadena.length(); j++)
            {
                if (letras.charAt(i)==cadena.charAt(j))
                {
                    contador[i]=contador[i]+1;
                }
            }
        }
        return contador;
    }

    /*4.*//*Escribe la función mayusculasMinusculas que recibirá dos
    parámetros: una cadena (que podrá contener saltos de línea) y un número
    entre 1 y 4. Dependiendo del número que le pasemos, la función nos
    devolverá otra cadena con las siguientes características:
    • 1 = Todas las letras en minúsculas.
    • 2 = Todas las letras en mayúsculas.
    • 3 = La primera letra de cada palabra en mayúsculas y el resto en minúsculas.
    • 4 = La primera letra de cada frase en mayúsculas y el resto en minúsculas.
    Escribir también un pequeño menú en el programa principal para probar
    las diferentes opciones.*/
    public static String mayusculasMinusculas(String cadena, int num)
    {
        int i;
        String cadenaFin ="";

        switch (num)
        {
            case 1:
            cadenaFin = cadena.toLowerCase();
                break;

            case 2:
                cadenaFin = cadena.toUpperCase();
                break;

            case 3:
                cadenaFin = mayusculasPrimera(cadena);
                break;

            case 4:
                cadenaFin = mayusculasCadaFrase(cadena);
                break;
        }
        return cadenaFin;
    }
    public static String mayusculasPrimera(String cadena)
    {
        int i;
        String cadenaFin="";

        String[]palabras=cadena.split(" ");
        for (i = 0; i < palabras.length; i++)
        {
            if (palabras[i].length()>0)
            {
                palabras[i] = palabras[i].substring(0,1).toUpperCase()+palabras[i].substring(1);
            }
        }
        cadenaFin = String.join(" ", palabras);
        return cadenaFin;
    }
    public static String mayusculasCadaFrase(String cadena)
    {
        int i;
        String cadenaFin="";
        boolean punto= true;

        for (i=0;i<cadena.length();i++)
        {
            if (cadena.charAt(i)=='.')
            {
                cadenaFin = cadenaFin + cadena.charAt(i);
                punto = true;
            }
            else
            {
                if (punto==true&&Character.isLetter(cadena.charAt(i)))
                {
                    cadenaFin = cadenaFin + Character.toUpperCase(cadena.charAt(i));
                    punto = false;
                }
                else
                {
                    cadenaFin = cadenaFin + cadena.charAt(i);
                }
            }
        }
        return cadenaFin;
    }

    /*5.*//*Escribe la función eliminaTags a la que le pasamos una cadena que
    contiene tags (como los de XML) y los elimina dejando sólo el texto (nos
    devuelve una cadena con el resultado).
    Ej.: <p>Esto es texto normal <b>y esto es texto en negrita</b>.</p>
    Nos devolvería: Esto es texto normal y esto es texto en negrita.*/
    public static String eliminaTags(String cadena)
    {
        int i;
        String cadenaFin ="";

        for (i = 0; i < cadena.length(); i++)
        {
            if (cadena.charAt(i)=='<')
            {
                while (cadena.charAt(i)!='>')
                {
                    i++;
                }
            }
            else
            {
                cadenaFin = cadenaFin + cadena.charAt(i);
            }
        }
    return cadenaFin;
    }

    /*6.*//*Escribe la función ordenaPalabrasComas a la que le pasamos una
    cadena que contiene varias palabras separadas por comas y nos devuelve
    otra cadena con las mismas palabras separadas por comas, pero ordenadas
    en orden alfabético.
    Ej.: “ hola,don,pepito,pasó,usted,ya,por,casa ”
    Devolvería: “ casa,don,hola,pasó,pepito,por,usted,ya ”*/
    public static String ordenaPalabrasComa(String cadena) //INCOMPLETA
    {
        int i, posicionLetra;
        String cadenaFin="";
        String abcd="abcdefghijklmnñopqrstuvwxyz";
        int [] posicion=new int[cadena.length()];

        for (i = 0; i < abcd.length(); i++)
        {
            posicionLetra=cadena.indexOf(abcd.charAt(i));

        }



        return cadenaFin;
    }

    /*7.*//*Escribe la función acentosHTML que te sustituye los caracteres
    acentuados que le paséis por el código HTML correspondiente. La función
    recibirá una cadena por parámetro y nos devolverá otra cadena con el
    resultado. Aquí tenéis una tabla con las equivalencias:*/
    public static String acentosHTML(String cadena)
    {
        int i, pos;
        String cadenaFin = "";
        String caracter = "<>&\"áÁéÉíÍóÓúÚñÑüÜ";
        String[] traduccion = {"&lt;", "&gt;", "&amp;", "&quot;", "&aacute;",
                "&Aacute;", "&aecute;", "&Eacute;", "&iacute;", "&Iacute;",
                "&oacute;", "&Oacute;", "&uacute;", "&Uacute;", "&ntilde;",
                "&Ntilde;", "&uuml;", "&Uuml;"};

        for (i = 0; i < cadena.length(); i++)
        {
            pos = caracter.indexOf(cadena.charAt(i));
            //en que posicion de la cadena se encuentra el caracter
            if (pos != -1)
            {
                cadenaFin = cadenaFin + traduccion[pos];
            }
            else
            {
                cadenaFin = cadenaFin + cadena.charAt(i);
            }
        }
        return cadenaFin;
    }

    /*8.*//*Escribe la función palabrasMismaLetra a la que le pasamos una
    cadena y nos devolverá un array de cadenas que contendrá las palabras
    que empiezan y acaban por la misma letra. A la hora de contar las palabras,
    habrá que ignorar los símbolos de puntuación y las mayúsculas y minúsculas.
    Ej.: “ Amanda tiene tres serpientes. ” devolvería { amanda, serpientes }*/
    public static String palabrasMismaLetra(String cadena)
    {
        int i;
        String cadenaFin="";
        String cadenaNueva = quitaSignosPuntuacion(cadena);
        cadenaNueva = cadenaNueva.toLowerCase();

        String[]palabra = cadenaNueva.split(" ");
    }
    public static String quitaSignosPuntuacion(String cadena)
    {
        int i;
        String cadenaFinal = "";

        for(i = 0; i < cadena.length();i++)
        {
            if(Character.isLetter(cadena.charAt(i)) || cadena.charAt(i) == ' ')
            {
                cadenaFinal = cadenaFinal + cadena.charAt(i);
            }
        }
        return cadenaFinal;
    }
}

package com.company;

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
        System.out.println("Ejercicio 11");
        System.out.println("Ejercicio 12");
        System.out.println("Ejercicio 13");
        System.out.println("Ejercicio 14");
        System.out.println("Ejercicio 15");
        System.out.println("Ejercicio 16");
        System.out.println("Ejercicio 17");
        System.out.println("Ejercicio 18");
        System.out.println("Ejercicio 19");
        System.out.println("Ejercicio 20");
        System.out.println();
        System.out.print("Elige un ejercicio: ");
        ejercicio = sc.nextInt();
        System.out.println();
        System.out.println("******** EJERCICIO " + ejercicio + " ********");

        switch (ejercicio)
        {
            case 1: //numeroEspacios
            {
                String mama;
                mama = " Mi mamá me   mima";
                System.out.println(mama);
                System.out.println("La frase tiene " + numeroEspacios(mama) + " espacio/s");
            }
            break;
            case 2: //numeroVocales
            {
                String pototo;
                pototo = "El pototo tiene la cara Amarilla y Oscura";
                System.out.println(pototo);
                System.out.println("La frase tiene " + numeroVocales(pototo) + " vocal/es");

            }
            break;
            case 3: //esPalindromo
            {
                String palabra;
                palabra = "Oso oSo";
                System.out.println(esPalindromo(palabra));
            }
            break;
            case 4: //contiene
            {
                String cadena = "Hola que tal Antonio";
                char caracter = 'q';

                /*System.out.println("Introduce una palabra o frase");
                cadena = sc.nextLine();
                System.out.println("Ahora introduce un caracter cualquiera");
                caracter = sc.next().charAt(caracter);*/
                if (contiene(cadena, caracter))
                {
                    System.out.println("La cadena que ha introducido contiene el carácter: " + caracter);
                }
                else
                {
                    System.out.println("La cadena que ha introducido NO contiene el carácter: " + caracter);
                }
            }
            break;
            case 5: //repiteCaracter
            {
                int num = 4;
                char caracter = 'r';
                repiteCaracter(caracter, num);
            }
            break;
            case 6: //padLeft & padRight
            {
                int numLeft = 10, numRight = 12;
                String cadena = "patata";
                padLeft(cadena, numLeft);
                System.out.println();
                padRight(cadena, numRight);
            }
            break;
            case 7: //quitaEspacios
            {
                String cadena;
                cadena = preguntaCadena();
                System.out.println(quitaEspacios(cadena));
            }
            break;
            case 8: //quitaEspaciosTrim
            {
                String cadena;
                cadena = preguntaCadena();
                System.out.println(quitaEspaciosTrim(cadena));
            }
            break;
            case 9: //sustituyeCaracter
            {
                String cadena, cadenaNueva;
                char originalCaracter, sustitutoCaracter;
                originalCaracter = 'a';
                sustitutoCaracter = 'x';
                cadena = preguntaCadena();
                cadenaNueva = sustituyeCaracter(cadena, sustitutoCaracter, originalCaracter);
                System.out.println(cadenaNueva);
            }
            break;
            case 10: //cuentaPalabras
            {
                String cadena;
                cadena = preguntaCadena();
                System.out.println("La frase <<" + cadena + ">> tiene " + cuentaPalabras(cadena) + " palabra/s");
            }
            break;
            case 11: //esNumero
            {
                String cadena;
                cadena = preguntaCadena();
                System.out.println(esNumero(cadena));
            }
            break;
            case 12: //quitaCaracter
            {
                String cadena;
                char caracter = 'a';
                cadena = preguntaCadena();
                System.out.println(quitaCaracter(cadena, caracter));
            }
            break;
            case 13: //quitaAcentos
            {
                String cadena = preguntaCadena();
                System.out.println(quitaAcentos(cadena));
            }
            break;
            case 14: //invierteCadena
            {
                String cadena = preguntaCadena();
                System.out.println(invierteCadena(cadena));
            }
            break;
            case 15: //vecesCaracter
            {
                String cadena = preguntaCadena();
                char caracter = 'a';
                System.out.println("En la cadena <<" + cadena + ">>, el caracter '" + caracter + "' se repite " + vecesCaracter(cadena, caracter) + " vez/veces");
            }
            break;
            case 16: //vecesPalabra
            {
                System.out.println("*FRASE*");
                String cadena1 = preguntaCadena();
                System.out.println("*PALABRA*");
                String cadena2 = preguntaCadena();
                System.out.println("En la frase <<" + cadena1 + ">>, la cadena <<" + cadena2 + " se repite " + vecesPalabra(cadena1, cadena2) + " vez/veces");
            }
            break;
            case 17: //mayusculasPrimera
            {
                String cadena = preguntaCadena();
                System.out.println(mayusculasPrimera(cadena));
            }
            break;
            case 18: //sustituyePalabra
            {
                System.out.println("*FRASE*");
                String cadena = preguntaCadena();
                System.out.println("*PALABRA A SUSTITUIR*");
                String palabraoriginal = preguntaCadena();
                System.out.println("*PALABRA SUSTITUTA*");
                String palabranueva = preguntaCadena();
                System.out.println(sustituyePalabra(cadena, palabraoriginal, palabranueva));
            }
            break;
            case 19: //inviertePalabra
            {
                String cadena = preguntaCadena();
                System.out.println(inviertePalabra(cadena));
            }
            break;
            case 20: //quitaEspaciosSobratnes
            {
                String cadena = preguntaCadena();
                System.out.println(quitaEspaciosSobratnes(cadena));
            }
            break;
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

    /*1.*//*Escribe la función “numeroEspacios” a la que le pasamos una
    cadena y nos devuelve el     número de espacios que contiene esa
    cadena (tanto al principio y al final como intercalados).*/
    public static int numeroEspacios(String mama)
    {
        int i, cont = 0;
        for (i = 0; i < mama.length(); i++)
        {
            if (mama.charAt(i) == ' ')
            {
                cont++;
            }
        }
        return cont;
    }

    /*2.*//*Escribe la función “numeroVocales” a la que le pasamos una cadena
    y nos devuelve el número de vocales que hay en la cadena.*/
    public static int numeroVocales(String pototo)
    {
        int cont = 0, i;
        for (i = 0; i < pototo.length(); i++)
        {
            if (pototo.charAt(i) == 'a' || pototo.charAt(i) == 'e' || pototo.charAt(i) == 'i' || pototo.charAt(i) == 'o' || pototo.charAt(i) == 'u' || pototo.charAt(i) == 'A' || pototo.charAt(i) == 'E' || pototo.charAt(i) == 'I' || pototo.charAt(i) == 'O' || pototo.charAt(i) == 'U')
            {
                cont++;
            }
        }
        return cont;
    }

    /*3.*//*Escribe la función “esPalindromo” a la que le pasamos una
    cadena y nos dice si la cadena es un palíndromo (true) o no (false).
    Un palíndromo es una palabra o frase que se lee igual al revés que al derecho.*/
    public static boolean esPalindromo(String palabra)
    {
        boolean palindromo = true;
        int inicio, fin;
        palabra = palabra.toLowerCase();
        inicio = 0;
        fin = palabra.length() - 1;

        while (inicio < fin)
        {
            if (palabra.charAt(inicio) != palabra.charAt(fin))
            {
                palindromo = false;
            }
            inicio++;
            fin--;
        }
        if (palindromo)
        {
            System.out.println("La palabra " + palabra + " es un palindromo");
        }
        else
        {
            System.out.println("La palabra " + palabra + " no es un palindromo");
        }
        return palindromo;
    }

    /*4.*//*Escribe la función “contiene” a la que le pasamos una
    cadena y un carácter por parámetro y nos dice si el carácter
    aparece en la cadena o no. Es igual que la función contains.
    Evidentemente, no podéis usar esta función para hacer la vuestra.*/
    public static boolean contiene(String cadena, char caracter)
    {
        boolean siEsta = false;
        int i;
        cadena = cadena.toLowerCase();
        for (i = 0; i < cadena.length(); i++)
        {
            if (cadena.charAt(i) == caracter)
            {
                siEsta = true;
            }
        }
        return siEsta;
    }

    /*5.*//*Escribe la función “repiteCaracter” a la que le pasamos dos
    parámetros: un carácter y un entero. La función nos devolverá una cadena
    que contendrá el carácter repetido tantas veces como indique el entero.
    Ej.: repiteCaracter(‘A’, 5) = “AAAAA”.*/
    public static void repiteCaracter(char caracter, int num)
    {
        int i;
        for (i = 0; i < num; i++)
        {
            System.out.print(caracter);
        }
    }


    /*6.*//*Escribe las funciones “padLeft” y “padRight” a las que le pasaremos
    una cadena y una longitud final. Ambas funciones nos añadirán espacios delante
    (padLeft) o detrás (padRight) de nuestra cadena hasta que el tamaño de nuestra
    cadena llega a la longitud que le hemos pasado.*/
    public static void padLeft(String cadena, int numLeft)
    {
        int i;
        int longCadena = cadena.length();
        int lonfFinal = numLeft - longCadena;
        for (i = 0; i < lonfFinal; i++)
        {
            System.out.print("·");
        }
        System.out.print(cadena);
    }

    public static void padRight(String cadena, int numRight)
    {
        int i;
        int longCadena = cadena.length();
        int longFinal = numRight - longCadena;
        System.out.print(cadena);
        for (i = 0; i < longFinal; i++)
        {
            System.out.print("·");
        }
    }

    /*7.*//*Escribe la función “quitaEspacios” a la que le pasamos una cadena y nos
    devuelve la misma cadena, pero con todos los espacios quitados (tanto los del
    principio como los del final como los intermedios).*/
    public static String quitaEspacios(String cadena)
    {
        int i;
        String cadenaFinal;
        cadenaFinal = "";
        for (i = 0; i < cadena.length(); i++)
        {
            if (cadena.charAt(i) != ' ')
            {
                cadenaFinal = cadenaFinal + cadena.charAt(i);
            }
        }
        return cadenaFinal;
    }

    /*8.*//*Escribe la función “quitaEspaciosTrim” a la que le pasamos una cadena
    y nos devuelve otra cadena igual que la primera en la que se han eliminado los
    espacios que haya al principio y al final. No se puede utilizar trim, obviamente.*/
    public static String quitaEspaciosTrim(String cadena)
    {
        int i, longCadena;
        i = 0;
        longCadena = cadena.length();
        String cadenaFin;

        while (cadena.charAt(i) == ' ')
        {
            i++;
        }
        while (cadena.charAt(longCadena - 1) == ' ')
        {
            longCadena--;
        }
        cadenaFin = cadena.substring(i, longCadena);

        return cadenaFin;
    }

    /*9.*//*Escribe la función “sustituyeCaracter” a la que le pasamos una
    cadena, un carácter y otro carácter y nos devuelve otra cadena igual que
    la primera en la que se ha sustituido el primer carácter por el segundo
    carácter. Ojo, en las cadenas, al contrario que en los arrays, no podemos
    modificar directamente un valor al estilo de cadena[2] = ‘A’ (los
    corchetes sólo sirven para leer el valor, no para modificarlo).*/
    public static String sustituyeCaracter(String cadena, char originalCaracter, char sustitutoCaracter)
    {
        int i;
        String cadenaNueva = "";
        for (i = 0; i < cadena.length(); i++)
        {
            if (cadena.charAt(i) != originalCaracter)
            {
                cadenaNueva = cadenaNueva + cadena.charAt(i);
            }
            else
            {
                cadenaNueva = cadenaNueva + sustitutoCaracter;
            }
        }
        return cadenaNueva;
    }

    /*10.*//*Escribe la función “cuentaPalabras” a la que le pasamos una
    cadena que contiene una frase y nos devuelve el número de palabras
    que hay en la misma.*/
    public static int cuentaPalabras(String cadena)
    {
        int i, num = 1;
        String nuevaCadena;
        nuevaCadena = quitaEspaciosTrim(cadena);
        for (i = 0; i < nuevaCadena.length(); i++)
        {
            if (nuevaCadena.charAt(i) == ' ')
            {
                num++;
            }
        }
        return num;
    }

    /*11.*//*Escribe la función “esNumero”, a la que le pasamos una cadena
    y nos dice si está formada enteramente por números o no. Esta función
    es muy interesante para evitarnos errores a la hora de hacer un Scanner.nextInt().
    Si queremos leer un número del teclado, lo más correcto es leerlo con un Scanner.next()
    como si fuera una cadena, después comprobar con la función esNumero si está formado
    completamente por dígitos y después convertirlo a entero con, por ejemplo,
    un Integer.parseInt().*/
    public static boolean esNumero(String cadena)
    {
        int i;
        boolean numero = true;
        for (i = 0; i < cadena.length(); i++)
        {
            if (!Character.isDigit(cadena.charAt(i)))
            {
                numero = false;
            }
        }
        return numero;
    }

    /*12.*//*Escribe la función “quitaCaracter” a la que le pasamos una cadena y un
    carácter y nos devuelve la cadena, pero con todas las ocurrencias de ese
    carácter quitadas.*/
    public static String quitaCaracter(String cadena, char caracter)
    {
        int i;
        String empty = "";
        for (i = 0; i < cadena.length(); i++)
        {
            if (cadena.charAt(i) != caracter)
            {
                empty = empty + cadena.charAt(i);
            }
        }
        return empty;
    }

    /*13.*//*Escribe la función “quitaAcentos” a la que le pasas una cadena
    con caracteres acentuados y te devuelve la cadena con los acentos quitados
    (esto se hace para algunos programas que no se enteran de los acentos).*/
    public static String quitaAcentos(String cadena)
    {
        int i, posicion;
        char caracter;
        String acentuadas = "áéíóúüÁÉÍÓÚÜ";
        String normal = "aeiouuAEIOUU";
        String cadenaFinal = "";

        for (i = 0; i < cadena.length(); i++)
        {
            caracter = cadena.charAt(i);
            posicion = acentuadas.indexOf(caracter);

            if (posicion != -1)
            {
                cadenaFinal = cadenaFinal + normal.charAt(posicion);
            }
            else
            {
                cadenaFinal = cadenaFinal + caracter;
            }
        }
        return cadenaFinal;
    }

    /*14.*//*Escribe la función “invierteCadena” a la que le pasamos una cadena
    y nos la devuelve invertida (de detrás para delante, vamos).*/
    public static String invierteCadena(String cadena)
    {
        int i;
        String cadenaInvertida = "";
        for (i = cadena.length() - 1; i >= 0; i--)
        {
            cadenaInvertida = cadenaInvertida + cadena.charAt(i);
        }
        return cadenaInvertida;
    }

    /*15.*//*Escribe la función “vecesCaracter” a la que le pasamos una cadena
    y un carácter y nos dice cuántas veces se repite ese carácter.*/
    public static int vecesCaracter(String cadena, char caracter)
    {
        int i;
        int rep = 0;
        String cadenaTwo;
        for (i = 0; i < cadena.length(); i++)
        {
            if (cadena.charAt(i) == caracter)
            {
                rep++;
            }
        }
        return rep;
    }

    /*16.*//*Escribe la función “vecesPalabra” a la que le pasamos una cadena
    y una palabra (otra cadena) y nos dice cuántas veces se repite esa palabra
    en la cadena.*/
    public static int vecesPalabra(String cadena1, String cadena2)
    {
        int i, rep = 0;
        cadena1 = cadena1.toLowerCase();
        String[] palabras = cadena1.split(" ");
        for (i = 0; i < palabras.length; i++)
        {
            if (palabras[i].equals(cadena2))
            {
                rep++;
            }
        }
        return rep;
    }

    /*17.*//*Escribe la función “mayusculasPrimera” a la que le pasas una cadena
    y te devuelve la cadena con la primera letra de cada palabra puesta en
    mayúsculas.*/
    public static String mayusculasPrimera(String cadena)
    {
        int i;
        String cadenaFin;
        String[] palabra = cadena.split(" ");
        for (i = 0; i < palabra.length; i++)
        {
            if (palabra[i].length() > 0)
            {
                palabra[i] = palabra[i].substring(0, 1).toUpperCase() + palabra[i].substring(1);
            }
        }
        cadenaFin = String.join(" ", palabra);
        return cadenaFin;
    }

    /*18.*//*Escribe la función “sustituyePalabra” a la que le pasamos una cadena
    y dos palabras y nos devuelve otra cadena en la que haya que sustituir la
    primera por la segunda.*/
    public static String sustituyePalabra(String cadena, String palabraoriginal, String palabranueva)
    {
        int i;
        String cadenaFin;
        String[] palabra = cadena.split(" ");
        for (i = 0; i < palabra.length; i++)
        {
            if (palabra[i].equals(palabraoriginal))
            {
                palabra[i] = palabranueva;
            }
        }
        cadenaFin = String.join(" ", palabra);
        return cadenaFin;
    }

    /*19.*//*Escribe una función “inviertePalabras” a la que la pasamos una cadena
    y nos devuelve otra en la que están invertidas todas las palabras (no la cadena
    entera, sino cada palabra independientemente).*/
    public static String inviertePalabra(String cadena)
    {
        int i;
        String cadenaFin;
        String[] palabras = cadena.split(" ");
        for (i = 0; i < palabras.length; i++)
        {
            palabras[i] = invierteCadena(palabras[i]);
        }
        cadenaFin = cadena.join(" ", palabras);
        return cadenaFin;
    }

    /*20.*//*Escribe la función “quitaEspaciosSobrantes” a la que le pasamos
    una cadena por parámetro y nos devuelve otra. La cadena que le pasamos
    podrá tener espacios delante y detrás, además de espacios entre las
    palabras. Para obtener la cadena resultado, tendremos que quitar los
    espacios de delante y de detrás y si entre dos palabras hay más de un
    espacio, deberemos dejar sólo uno.
    Ej.: “~~~Mi~~mamá~~~~me~mima~~” -> “Mi~mamá~me~mima” (~ = espacio)*/
    public static String quitaEspaciosSobratnes(String cadena)
    {
        int i, j;
        String cadena2 = quitaEspaciosTrim(cadena);
        String cadena3 = "";

        for (i = 0; i < cadena2.length(); i++)
        {
            if(cadena2.charAt(i) == ' ')
            {
                cadena3 = cadena3 + cadena2.charAt(i);
                while(cadena2.charAt(i+1) == ' ')
                {
                    i++;
                }
            }
            else
            {
                cadena3 = cadena3 + cadena2.charAt(i);
            }
        }

        return cadena3;
    }
}
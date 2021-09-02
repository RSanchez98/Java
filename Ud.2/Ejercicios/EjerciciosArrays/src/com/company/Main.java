package com.company;


import java.util.Random;
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
        System.out.println("Ejercicio 21");
        System.out.println("Ejercicio 22");
        System.out.println("Ejercicio 23");
        System.out.println("Ejercicio 24");
        System.out.println("Ejercicio 25");
        System.out.println("Ejercicio 26");
        System.out.println("Ejercicio 27");
        System.out.println("Ejercicio 28");
        System.out.println("Ejercicio 29");
        System.out.println("Ejercicio 30");
        System.out.println("Ejercicio 31");
        System.out.println("Ejercicio 32");
        System.out.println("Ejercicio 33");
        System.out.println("Ejercicio 34");
        System.out.println("Ejercicio 35");
        System.out.println("Ejercicio 36");
        System.out.println("Ejercicio 37");
        System.out.println("Ejercicio 38");
        System.out.println("Ejercicio 39");
        System.out.println("Ejercicio 40");
        System.out.println();
        System.out.print("Elige un ejercicio: ");
        ejercicio = sc.nextInt();
        System.out.println();
        System.out.println("******** EJERCICIO "+ejercicio+" ********");

        switch (ejercicio)
        {
            case 1: //escribeArray5
            {
                int[] a = {23, 43, 1, -3, 6};
                escribeArray5(a);
            }
            break;
            case 2: //escribeArray
            {
                int[] a = {1, 2, 3, 4, 5};
                int[] b = {1, 2, 3, 4, 5, 6, 7, 8};
                escribeArray(a);
                System.out.println();
                escribeArray(b);

            }
            break;
            case 3: //leeArray5
            {
                int[] n = new int[5];

                leeArray5(n);
                escribeArray5(n);
            }
            break;
            case 4: //leeArray
            {
                int[] n = new int[3];
                leeArray(n);
                escribeArray(n);
            }
            break;
            case 5: //ponCeros5
            {
                int[] n = new int[5];
                leeArray5(n);
                escribeArray5(n);
                System.out.println();
                ponCeros5(n);
                escribeArray5(n);
            }
            break;
            case 6: //ponCeros
            {
                int[] n= new int[8];
                leeArray(n);
                System.out.print("Has introducido: ");
                escribeArray(n);
                System.out.println();
                ponCeros(n);
                System.out.print("Y se convierte en: ");
                escribeArray(n);
            }
            break;
            case 7: //sumaArray5
            {
                int[] n = new int[5];
                leeArray5(n);
                int suma = sumaArray5(n);
                System.out.print("El resultado es: "+suma);
                //System.out.println(sumaArray5(n)); --> otra forma de mostrar el resultado (la mia)
            }
            break;
            case 8: //sumaArray
            {
                int[] n = new int[8];
                leeArray(n);
                int suma = sumaArray(n);
                System.out.print("El resultado es: "+suma);
            }
            break;
            case 9: //mediaArray5
            {
                int[] n= new int[5];
                leeArray(n);
                double media = mediaArray5(n);
                System.out.print("El resultado es: "+media);
            }
            break;
            case 10: //mediaArray
            {
                int[] n = new int[6];
                leeArray(n);
                double media = mediaArray(n);
                System.out.println("El resultado es: "+media);
            }
            break;
            case 11: //rellenaEnOrden
            {
                int[] n = new int[10];
                rellenaEnORden(n);
                escribeArray(n);
            }
            break;
            case 12: //rellenaEnOrdenDesc
            {
                int[] n = new int[15];
                rellenaEnOrdenDesc(n);
                escribeArray(n);
            }
            break;
            case 13: //rellenaAleatorio
            {
                int[] n = new int[10];
                rellenaAleatorio(n);
                escribeArray(n);
            }
            break;
            case 14: //estaOrdenado
            {
                int [] n = new int[4];
                leeArray(n);
                if (estaOrdenado(n))
                {
                    System.out.print("Está ordenado --> ");
                }
                else
                {
                    System.out.println("No está ordenado, observe: ");
                }
                escribeArray(n);
            }
            break;
            case 15: //numeroImpar
            {
                int[]n = new int[4];
                leeArray(n);
                escribeArray(n);
                System.out.println(" --> Hay "+numeroImpares(n)+" numero/s impar/es");
            }
            break;
            case 16: //minArray
            {
                int[] n = new int[5];
                leeArray(n);
                escribeArray(n);
                System.out.println();
                System.out.println("El numero mas pequeño es "+minArray(n));
            }
            break;
            case 17: //maxArray
            {
                int[] n = new int[3];
                leeArray(n);
                escribeArray(n);
                System.out.println();
                System.out.println("El numero más grande es "+maxArray(n));
            }
            break;
            case 18: //numeroAprobados
            {
                int[] n = new int[5];
                leeArray(n);
                System.out.print("Las notas son: ");
                escribeArray(n);
                System.out.println();
                System.out.println("En total hay " +numeroAprobados(n)+ " aprobados");
            }
            break;
            case 19: //porEncimaDe
            {
                int[] n = new int[8];
                int limite;
                System.out.println("Escribe el limite");
                limite = sc.nextInt();
                leeArray(n);
                escribeArray(n);
                System.out.println();
                System.out.println("El limite es de "+limite+" y por encima de ese limite hay "+porEncimaDe(n, limite)+" numeros/s");
            }
            break;
            case 20: //cuantosCeros
            {
                int[]n = new int [4];
                leeArray(n);
                escribeArray(n);
                System.out.println();
                System.out.println("Tiene "+cuantosCeros(n)+" ceros");
            }
            break;
            case 21: //copiaArray
            {
                int[]array1 = {8,4,3,5};
                int[]array2 = new int[4];
                copiaArray(array1, array2);
            }
            break;
            case 22: //copiaArrayInvertido
            {
                int[] array1 = new int[4];
                leeArray(array1);
                int[]array2 = new int[4];
                copiaArrayInvertido(array1, array2);
            }
            break;
            case 23: //sumaArrays
            {
                int[] array1 = new int[3];
                int[] array2 = new int[3];
                int[] arrayResultado = new int[3];
                leeArray(array1);
                System.out.println("*************");
                leeArray(array2);
                escribeArray(array1);
                System.out.print(" + ");
                escribeArray(array2);
                System.out.print(" = ");
                sumaArrays(array1, array2, arrayResultado);
            }
            break;
            case 24: //restaArrays multiplicaArrays divideArrays
            {
                int[] arrayResta1 = {6,7,8,9};
                int[] arrayResta2 = {5,4,3,2};
                int[] resutladoRestaArrays = new int[4];
                System.out.println("La resta es: ");
                escribeArray(arrayResta1);
                System.out.print(" - ");
                escribeArray(arrayResta2);
                System.out.print(" = ");
                restaArrays(arrayResta1, arrayResta2, resutladoRestaArrays);
                System.out.println();
                System.out.println("**********************");

                int[] arrayMult1 = {14,54,24,36};
                int[] arrayMult2 = {2,3,4,8};
                int[] resutladoMultArrays = new int[4];
                System.out.println("La multiplicación es: ");
                escribeArray(arrayMult1);
                System.out.print(" x ");
                escribeArray(arrayMult2);
                System.out.print(" = ");
                multiplicaArrays(arrayMult1, arrayMult2,resutladoMultArrays);
                System.out.println();
                System.out.println("**********************");

                int[] arrayDiv1 = {105, 148, 211, 263};
                int[] arrayDiv2 = {12,15,64,57};
                int[] resutladoDivArrays = new int[4];
                System.out.println("La división es: ");
                escribeArray(arrayDiv1);
                System.out.print(" / ");
                escribeArray(arrayDiv2);
                System.out.print(" = ");
                divideArrays(arrayDiv1, arrayDiv2, resutladoDivArrays);
                System.out.println();
                System.out.println("**********************");
            }
            break;
            case 25: //invierteArray
            {
                int [] n = new int[4];
                leeArray(n);
                escribeArray(n);
                System.out.print(" --> ");
                invierteArray(n);
            }
            break;
            case 26: //comparaArrays
            {
                int[] array1 = new int[4];
                leeArray(array1);
                System.out.println("**************");
                int[] array2 = new int[4];
                leeArray(array2);
                if (comparaArrays(array1, array2))
                {
                    System.out.print("Los arrays son los mismos, tanto los numeros como su tamaño --> ");
                    escribeArray(array1);
                    System.out.print(" # ");
                    escribeArray(array2);
                }
                else
                {
                    System.out.print("Los arrays NO son iguales en los numerosy/o en su tamaño --> ");
                    escribeArray(array1);
                    System.out.print(" # ");
                    escribeArray(array2);
                }
            }
            break;
            case 27: //ponNotasArray
            {
                double[]notaArray = {1.0, 2.5, 5.6, 8.4, 7.1, 3.4};
                boolean[]booleanArray= new boolean[6];
                int i, contador;
                contador = 1;
                ponNotasArray(notaArray, booleanArray);
                for (i = 0; i < booleanArray.length; i++)
                {
                    if (booleanArray[i])
                    {
                        System.out.println("El alumno "+contador+" está aprobado");
                    }
                    else
                    {
                        System.out.println("El alumno "+contador+" está suspenso");
                    }
                    contador++;
                }
            }
            break;
            case 28: //concatenaArrays55
            {
                int[]n1 = new int[5];
                int[]n2 = new int[5];
                int[]n3 = new int[10];
                leeArray5(n1);
                escribeArray5(n1);
                System.out.println();
                System.out.println("***********");
                leeArray5(n2);
                escribeArray5(n2);
                System.out.println();
                System.out.println("***********");
                System.out.println("Las dos arrays concatenadas se verian de la siguiente manera: ");
                escribeArray5(n1);
                System.out.print(" & ");
                escribeArray5(n2);
                System.out.print(" = ");
                concatenaArrays55(n1, n2, n3);
            }
            break;
            case 29: //concatenaArrays
            {
                int[]n1 = new int[4];
                int[]n2 = new int[4];
                int[]n3 = new int[8];
                leeArray(n1);
                escribeArray(n1);
                System.out.println();
                System.out.println("***********");
                leeArray(n2);
                escribeArray(n2);
                System.out.println();
                System.out.println("***********");
                System.out.println("Las dos arrays concatenadas se verian de la siguiente manera: ");
                escribeArray(n1);
                System.out.print(" & ");
                escribeArray(n2);
                System.out.print(" = ");
                concatenaArrays(n1, n2, n3);
            }
            break;
            case 30: //contiene
            {
                int[] n = {1,2,3,4,5};
                int numero;
                System.out.print("Escribe un numero para decirte si está en nuestra Array o no: ");
                numero = sc.nextInt();
                if (contiene(n, numero))
                {
                    System.out.println("Nuestro Array contiene el numero "+numero);
                }
                else
                {
                    System.out.println("Nuestro Array NO contiene el numero "+numero);
                }
            }
            break;
            case 31: //concatenaArraysPro
            {
                int[]n1 = new int[5];
                int[]n2 = new int[4];
                int[]n3;
                leeArray(n1);
                escribeArray(n1);
                System.out.println();
                System.out.println("**************");
                leeArray(n2);
                escribeArray(n2);
                System.out.println();
                System.out.println("**************");
                System.out.println("Las dos arrays concatenadas se verian de la siguiente manera: ");
                escribeArray(n1);
                System.out.print(" & ");
                escribeArray(n2);
                System.out.print(" = ");
                escribeArray(concatenaArraysPro(n1, n2));
            }
            break;
            case 32: //copiaArrayPro
            {
                int[]n1 = new int[4];
                int[]n2;
                leeArray(n1);
                System.out.print("La primera array es --> ");
                escribeArray(n1);
                System.out.println();
                System.out.print("Y su copia en la segunda array es --> ");
                escribeArray(copiaArrayPro(n1));
            }
            break;
            case 33: //insertaEnArray
            {
                int[]n = new int[4];
                int num, pos;
                leeArray(n);
                escribeArray(n);
                System.out.println();
                System.out.print("Dime un numero: ");
                num = sc.nextInt();
                System.out.print("Dime una posición del 1 al 4: ");
                pos = sc.nextInt();
                while (pos < 1|| pos > 4)
                {
                    System.out.println("Te he dicho que tiene que ser entre 1 y 4");
                    System.out.print("Dime una posición del 1 al 4");
                    pos = sc.nextInt();
                }
                escribeArray(insertaEnArray(n, pos, num));
            }
            break;
            case 34: //borraDeArray
            {
                int[]n = new int[6];
                int pos;
                leeArray(n);
                escribeArray(n);
                System.out.println();
                System.out.print("Escribe una posición para eliminar un numero: ");
                pos = sc.nextInt();
                System.out.println();
                escribeArray(borraDeArray(n, pos));
            }
            break;
            case 35: //elimina1ElementoArray
            {
                int[]n = new int[5];
                int num;
                leeArray(n);
                escribeArray(n);
                System.out.println();
                System.out.print("¿Qué numero quieres borrar del array? ");
                num= sc.nextInt();
                escribeArray(elimina1ElementoArray(n, num));
            }
            break;
            case 36: //eliminaElementosArray
            {
                int[]n = new int[5];
                int num;
                leeArray(n);
                escribeArray(n);
                System.out.println();
                System.out.print("¿Qué numero quieres borrar del array? ");
                num= sc.nextInt();
                escribeArray(eliminaElemenotsArray(n, num));
            }
            break;
            case 37: //insertaArrayEnArray
            {
                int[]n1= new int[4];
                int[]n2= new int[3];
                int pos;
                leeArray(n1);
                escribeArray(n1);
                System.out.println();
                System.out.println("¿En que posición quieres añadir la segunda array?");
                pos = sc.nextInt();
                System.out.println();
                leeArray(n2);
                escribeArray(n2);
                System.out.println();
                System.out.println("*****************");
                escribeArray(insertaArrayEnArray(n1, n2, pos));

            }
            break;
            case 38: //subArray
            {
                int[]n = new int[5];
                int pos1, pos2;
                leeArray(n);
                escribeArray(n);
                System.out.println();
                System.out.print("Escribe la primera posición: ");
                pos1 = sc.nextInt();
                System.out.print("Escribe la segunda posición: ");
                pos2 = sc.nextInt();
                System.out.println();
                System.out.println("*********************");
                escribeArray(subArray(n, pos1,pos2));

            }
            break;
            case 39: //recortaArray
            {
                int[]n = new int[5];
                int pos1, pos2;
                leeArray(n);
                escribeArray(n);
                System.out.println();
                System.out.print("Escribe la primera posición: ");
                pos1 = sc.nextInt();
                System.out.print("Escribe la segunda posición: ");
                pos2 = sc.nextInt();
                System.out.println();
                System.out.println("*********************");
                escribeArray(recortaArray(n, pos1,pos2));
            }
            break;
            case 40:
            {
                int[]n = new int[6];
                leeArray(n);
                escribeArray(n);
                System.out.println();
                System.out.println("*******************");
                ordenaBurbuja(n);
                escribeArray(n);
            }
            break;

            default:
                System.out.println("Ese ejercicio no existe o aún no lo tengo");
                break;
        }

    }

    /*1.*//*Escribe una función “escribeArray5” a la que le pasamos
    un array de tipo entero de cinco elementos y lo escribe por
    pantalla de la siguiente forma: [23, 43, 1, -3, 6]*/
    public static void escribeArray5 (int[] a)
    {
        int i;

        System.out.print("[");
        for (i = 0; i < 5 - 1; i++)
        {
            System.out.print(a[i] + ", ");
        }
        System.out.print(a[i] + "]");
    }

    /*2.*//*Escribe una función “escribeArray” a la que le pasamos
    un array de enteros del tamaño que sea y lo escribe por pantalla
    de la misma forma. Tendremos que usar la función “length” para
    saber el tamaño del array desde dentro de la función.*/
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

    /*3.*//*Escribe una función “leeArray5” que lea un array de enteros de
    5 elementos. Habrá que pasarle el array ya definido y él lo rellenará
    pidiéndole los valores al usuario por consola.*/
    public static void leeArray5 (int[] n)
    {
        Scanner sc = new Scanner(System.in);
        int i, num;
        for (i = 0; i < 5; i++)
        {
            System.out.print(i + 1 + ". Introduce un numero: ");
            num = sc.nextInt();
            n[i] = num;
        }
    }

    /*4.*//*Escribe una función “leeArray” que lea un array de enteros
    de cualquier tamaño. El array lo crearemos fuera de la función y
    dentro de la función usaremos la función “length” para saber cuál
    es el tamaño y cuántos datos debemos leer.*/
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

    /*5.*//*Escribe una función “ponCeros5” que modifique
    el contenido de un array de enteros de cinco elementos
    y ponga en todas las posiciones un 0.*/
    public static void ponCeros5 (int [] n)
    {
        int i;
        for (i = 0; i < 5; i++)
        {
            n[i]= 0;
        }
    }

    /*6.*//*Escribe una función “ponCero” que haga lo mismo
    para un array de enteros de cualquier tamaño*/
    public static void ponCeros (int [] n)
    {
        int i;
        for (i = 0; i < n.length; i++)
        {
            n[i]= 0;
        }
    }

    /*7.*//*Escribe una función “sumaArray5” que sume todas
    las posiciones de un array de enteros de cinco elementos
    y nos devuelva el resultado.*/
    public static int sumaArray5 (int[] n)
    {
        int suma = 0, i;
        for (i = 0; i < 5; i++)
        {
            suma = suma + n[i];
        }

        return suma;
    }

    /*8.*//*Escriba una función “sumaArray” que haga lo mismo
    para un array de enteros de cualquier tamaño.*/
    public static int sumaArray(int[] n)
    {
        int i, suma = 0;
        for (i = 0; i < n.length; i++)
        {
            suma = suma + n[i];
        }
        return suma;
    }

    /*9.*//*Escribe una función “mediaArray5” que nos calcule
    el valor medio de los elementos de un array de enteros de tamaño 5*/
    public static double mediaArray5(int[] n)
    {
        int i;
        double media = 0;
        for (i = 0; i < 5; i++)
        {
            media = sumaArray5(n) / 5.0;
        }
        return media;
    }
    /*10.*//*Escribe una función “mediaArray” que haga
    lo mismo para un array de enteros de cualquier tamaño.*/
    public static double mediaArray(int[]n)
    {
        int i;
        double suma = 0.0, media;
        for ( i = 0; i < n.length; i++)
        {
            suma = suma + n[i];
        }
        media = suma / n.length;
        return media;
    }

    /*11.*//*Escribe una función “rellenaEnOrden” que nos rellena un array
    de enteros con los números desde el 1 en adelante (1, 2, 3, 4...
    hasta el tamaño del array).*/
    public static void rellenaEnORden(int [] n)
    {
        int i;
        for (i = 0; i < n.length; i++)
        {
            n[i] = i + 1;
        }
    }

    /*12.*//*Escribe una función “rellenaEnOrdenDesc” que nos rellena
    un array con los valores siguientes: tamaño del array, tamaño
    del array-1, etc., 3, 2, 1.*/
    public static void rellenaEnOrdenDesc(int [] n)
    {
        int i, mayor;
        mayor = n.length;
        for (i = 0; i < n.length; i++)
        {
            n[i] = mayor;
            mayor--;
        }
    }

    /*13.*//*Escribe una función “rellenaAleatorio” a la que le
    pasamos un array de enteros y nos lo rellena de valores
    aleatorios entre 1 y 10.*/
    public static void rellenaAleatorio(int [] n)
    {
        int i, num;
        Random r = new Random();
        for (i = 0; i < 10; i++)
        {
            num = r.nextInt(10)+1;
            n[i] = num;
        }
    }

    /*14.*//*Escribe una función “estaOrdenado” a la que le pasas
    un array de enteros y te devuelve un booleano que será verdadero
    si los elementos del array se encuentran en orden ascendente.*/
    public static boolean estaOrdenado(int [] n)
    {
        int i, comparar;
        boolean ordenado = true;
        comparar = n[0];
        for (i = 1; i < n.length; i++)
        {
            if (comparar < n[i])
            {
                comparar = n[i];
            }
            else
            {
                ordenado = false;
            }
        }
        return ordenado;
    }

    /*15.*//*Escribe una función “numeroImpares” a la que le pasas un array
    de enteros y te devuelve un entero que corresponde a la cantidad de
    números impares que tenemos en el array.*/
    public static int numeroImpares(int [] n)
    {
        int i, impar = 0;
        for (i = 0; i < n.length; i++)
        {
            if (n[i] % 2 != 0)
            {
                impar++;
            }
        }
        return impar;
    }

    /*16.*//*Escribe una función “minArray” a la que le pasas un
    array y te devuelve el valor más pequeño de los contenidos
    en dicho array.*/
    public static int minArray(int [] n)
    {
        int min, i;
        min = n[0];
        for (i = 0; i < n.length; i++)
        {
            if (n[i] < min)
            {
                min = n[i];
            }
        }
        return min;
    }

    /*17.*//*Escribe una función “maxArray” que te
        devuelve el más grande*/
    public static int maxArray(int[] n)
    {
        int i, max;
        max = n[0];
        for (i = 0; i < n.length; i++)
        {
            if (n[i]>max)
            {
                max = n[i];
            }
        }
        return max;
    }

    /*18.*//*Escribe una función “numeroAprobados” a la que se
    le pasa un array de enteros y, suponiendo que son notas,
    nos devuelve el número de aprobados (valores entre 5 y 10).*/
    public static int numeroAprobados(int[]n)
    {
        int i, aprobados;
        aprobados = 0;
        for (i = 0; i < n.length; i++)
        {
            if (n[i] >= 5 && n[i] <= 10)
            {
                aprobados++;
            }
        }
        return aprobados;
    }

    /*19.*//*Escribe una función “porEncimaDe” a la que le pasamos
    un valor “limite” y nos devuelve cuántos elementos del array
    son iguales o mayores que ese límite. Por ejemplo, le pasamos el
    valor 10 y nos dice cuántos elementos son 10 o más.*/
    public static int porEncimaDe(int [] n, int limite)
    {
        int i, num = 0;
        for (i = 0; i < n.length; i++)
        {
            if (n[i] >= limite)
            {
                num++;
            }
        }
        return num;
    }

    /*20.*//*Escribe una función “cuantosCeros” a la que le pasamos
    un array y nos devuelve un entero que nos dice cuántos elementos
    tienen el valor 0.*/
    public static int cuantosCeros(int [] n)
    {
        int i, cero;
        cero = 0;
        for (i = 0; i < n.length; i++)
        {
            if (n[i] == 0)
            {
                cero++;
            }
        }
        return cero;
    }

    /*21.*//*Escribe una función “copiaArray” a la que le pasas dos .
    arrays por parámetro (array1 y array2, por ejemplo) del mismo tamaño
    (se debería comprobar dentro de la función). La función copiara el
    contenido del primer array al segundo array.*/
    public static void copiaArray(int[]array1, int[]array2)
    {
        int i;
        if (array1.length == array2.length)
        {
            for (i = 0; i < array1.length; i++ )
            {
                array2[i] = array1[i];
            }
            escribeArray(array2);
        }
        else
        {
            System.out.println("Los arrays no tienen la misma longitud");
        }
    }

    /*22.*//*Escribe una función “copiaArrayInvertido” a la que le
    pasas dos arrays por parámetro y te copia el contenido del primer
    array al segundo array pero en orden inverso (Ej.: si el primero es
    [5,6,7,8,9], en el segundo se copiará [9,8,7,6,5]).*/
    public static void copiaArrayInvertido(int[]array1, int[]array2)
    {
        int i, array1menos1 ;
        array1menos1 = array1.length - 1;
        if (array1.length == array2.length)
        {
            for (i = 0; i < array1.length; i++)
            {
                array2[i]=array1[array1menos1 - i];
            }
            escribeArray(array2);
        }
        else
        {
            System.out.println("Las arrays no son del mismo tamaño");
        }
    }

    /*23.*//* Escribe una función “sumaArrays” a la que le pasamos tres
    arrays. Los dos primeros contendrán los datos que hay que sumar y
    en el tercero guardaremos el resultado (Ej.:[1,2,3] + [8, 6, 8] = [9, 8, 11]).*/
    public static void sumaArrays(int[]array1, int[]array2, int[]arrayResultado)
    {
        int i;
        if ((array1.length == array2.length)&&(array1.length == arrayResultado.length))
        {
            for (i = 0; i < array1.length; i++)
            {
                arrayResultado[i] = array1[i] + array2[i];
            }
            escribeArray(arrayResultado);
        }
        else
        {
            System.out.println("Los arrays son de distinto tamaño");
        }
    }

    /*24.*//*Escribe también las funciones “restaArrays”,
    “multiplicaArrays” y “divideArrays”.*/
    public static void restaArrays(int[]arrayResta1, int[]arrayResta2, int[]resutladoRestaArrays)
    {
        int i;
        if (arrayResta1.length == arrayResta2.length && (arrayResta1.length == resutladoRestaArrays.length))
        {
            for (i = 0; i < arrayResta1.length; i++)
            {
                resutladoRestaArrays[i] = arrayResta1[i] - arrayResta2[i];
            }
            escribeArray(resutladoRestaArrays);
        }
        else
        {
            System.out.println("Las arrays no son del mismo tamaño");
        }
    }
    public static void multiplicaArrays(int[]arrayMult1, int[]arrayMult2, int[]resutladoMultArrays)
    {
        int i;
        if (arrayMult1.length == arrayMult2.length && (arrayMult1.length == resutladoMultArrays.length))
        {
            for (i = 0; i < arrayMult2.length; i++)
            {
                resutladoMultArrays[i] = arrayMult2[i] * arrayMult1[i];
            }
            escribeArray(resutladoMultArrays);
        }
        else
        {
            System.out.println("Las arrays no son del mismo tamaño");
        }
    }
    public static void divideArrays(int[]arrayDiv1, int[]arrayDiv2, int[]resutladoDivArrays)
    {
        int i;
        if (arrayDiv1.length == arrayDiv2.length && (arrayDiv1.length == resutladoDivArrays.length))
        {
            for (i = 0; i < arrayDiv1.length; i++)
            {
                resutladoDivArrays[i] = arrayDiv1[i] - arrayDiv2[i];
            }
            escribeArray(resutladoDivArrays);
        }
        else
        {
            System.out.println("Las arrays no son del mismo tamaño");
        }
    }

    /*25.*//*Escribe una función “invierteArray” a la que le pasamos un
    array de enteros y modifica su contenido invirtiendo la posición de
    sus elementos (Ej.: [1,2,3] -> [3,2,1])*/
    public static void invierteArray(int[]n)
    {
        int i, invertido, valornuevo;
        int [] b = new int[n.length];
        for (i = 0; i < n.length; i++)
        {
            b[i] = n[i];
        }
        invertido = n.length - 1;
        while (invertido >=0)
        {
            for (i = 0; i < n.length; i++)
            {
                valornuevo = b[invertido];
                n[i]=valornuevo;
                invertido--;
            }
        }
        escribeArray(n);
    }

    /*26.*//*Escribe una función “comparaArrays” a la que le
    pasamos dos arrays y nos devuelve un boolean que será verdadero
    si los dos arrays tienen el mismo tamaño y contienen los mismos datos.*/
    public static boolean comparaArrays(int[] array1, int[] array2)
    {
        int i;
        boolean igual = false;
        if (array1.length == array2.length)
        {
            for (i = 0; i < array1.length; i++)
            {
                if (array1[i] != array2[i])
                {
                    igual = false;
                    i = array1.length;
                }
                else
                {
                    igual = true;
                }
            }
        }
        return igual;
    }

    /*27.*//*Escribe una función “ponNotasArray” a la que le
    pasamos dos arrays del mismo tamaño. El primero será un array
    de reales (double) y contendrá las notas de los alumnos. El segundo
    será un array de booleanos en el que deberemos escribir en cada
    posición “true” si la nota es mayor o igual que 5 (aprobado) y
    “false” en caso contrario*/
    public static void ponNotasArray(double[]notaArray, boolean[]booleanArray)
    {
        int i;
        for (i = 0; i < notaArray.length; i++)
        {
            if (notaArray[i] < 5.0)
            {
                booleanArray[i] = false;
            }
            else
            {
                booleanArray[i] = true;
            }
        }
    }

    /*28.*//*Escribe una función “concatenaArrays55” a la que le pasamos
    tres arrays de enteros. Los dos primeros tendrán un tamaño de 5 y
     contendrán los datos que hay que copiar. El tercero tendrá un tamaño
     de 10 y en él copiaremos los datos del primer array y después los datos
     del segundo (Ej.: [4,5,6,7,8] & [1,1,2,2,3] = [4,5,6,7,8,1,1,2,2,3]).*/
    public static void concatenaArrays55(int[]n1, int[]n2, int[]n3)
    {
        int i, cont = 0;
        while (cont < n3.length)
        {
            for (i = 0; i < n1.length; i++)
            {
                n3[cont] = n1[i];
                cont++;
            }
            for (i = 0; i < n2.length; i++)
            {
                n3[cont] = n2[i];
                cont++;
            }
        }
        escribeArray(n3);
    }

    /*29.*//*Escribe una función “concatenaArrays” a la que pasamos tres
    arrays con la condición de que el tamaño del tercero sea igual a la suma
    del tamaño de los dos primeros. Hará lo mismo que la función anterior.*/
    public static void concatenaArrays(int[]n1, int[]n2, int[]n3)
    {
        if (n3.length == n1.length + n2.length)
        {
            int i, cont = 0;
            while (cont < n1.length)
            {
                for (i = 0; i < n1.length; i++)
                {
                    n3[cont] = n1[i];
                    cont++;
                }
                for (i = 0; i < n2.length; i++)
                {
                    n3[cont] = n2[i];
                    cont++;
                }
            }
            escribeArray(n3);
        }
        else
        {
            System.out.println("La suma del primer array mas el segundo array no es igual al tamaño del ultimo array");
        }
    }

    /*30.*//*Escribe una función “contiene” a la que le pasamos un array
    y un valor entero. La función nos devolverá “true” si el array
    contiene el número y “false” si no lo contiene.*/
    public static boolean contiene(int[]n, int numero)
    {
        int i;
        boolean loTiene = false;
        for (i = 0; i < n.length; i++)
        {
            if (n[i] == numero)
            {
                loTiene = true;
            }
        }
        return loTiene;
    }

    /*31.*//*Escribe una función “concatenaArraysPro” a la que le pasas
    dos arrays de enteros y te devuelve un array cuyo tamaño es la suma del tamaño
    de ambos y que contiene todos los elementos del primero y a continuación los del
    segundo. Esta función devolverá un array de enteros (int[]) el cuál se creará
    dentro de la propia función.*/
    public static int[] concatenaArraysPro(int[]n1, int[]n2)
    {
        int i, longitud, cont = 0;
        longitud = n1.length + n2.length;
        int[] n3 = new int[longitud];
        for (i = 0; i < n1.length; i++)
        {
            n3[cont] = n1[i];
            cont++;
        }
        for (i = 0; i < n2.length; i++)
        {
            n3[cont] = n2[i];
            cont++;
        }
        return n3;
    }

    /*32.*//* Escribe una función “copiaArrayPro” a la que le pasas un array y
    te devuelve un array del mismo tamaño y con los mismos datos.*/
    public static int[] copiaArrayPro(int[]n1)
    {
        int i;
        int[]n2 = new int[n1.length];
        for (i = 0; i < n1.length; i++)
        {
            n2[i]=n1[i];
        }
        return n2;
    }

    /*33.*//*Escribe una función “insertaEnArray” a la que le pasas tres parámetros:
    un array de enteros, un valor entero y una posición. La función insertará el valor
    en la posición indicada, desplazando el resto de valores para hacerle hueco.
    La función nos devolverá un array con el resultado. Ej.: Si tenemos el array [1,2,3,4,5]
    y queremos insertar el valor “26” en la posición “2”, el resultado será: [1,2,26,3,4,5].*/
    public static int[] insertaEnArray(int[]n, int pos, int num)
    {
        int i;
        int[] a = new int[n.length+1];
        for (i = 0; i <pos; i++)
        {
            a[i] = n[i];
        }

        a[pos] = num;

        for (i = pos; i < n.length; i++)
        {
            a[i+1] = n[i];
        }
        return a;
    }

    /*34.*//*Escribe una función “borraDeArray” a la que le pasas dos parámetros:
    un array de enteros y una posición. La función eliminará el elemento colocado
    en la posición indicada. La función nos devolverá un array con el resultado.
    Ej.: Si tenemos el array [5,7,2,8,1] y queremos eliminar la posición 1, el resultado
    será: [5,2,8,1].*/
    public static int[] borraDeArray(int[]n, int pos)
    {
        int i;
        int[]a = new int[n.length-1];
        for (i = 0; i < pos; i++)
        {
            a[i]=n[i];
        }
        for (i = pos; i <n.length; i++)
        {
            a[i-1]=n[i];
        }
        return a;
    }

    /*35.*//*Escribe una función “elimina1ElementoArray” a la que le pasas dos
    parámetros: un array de enteros y un valor entero. La función eliminará del
    array el valor entero independientemente de la posición en la que se encuentre.
    Si el valor se repite, se eliminará sólo la primera vez que aparece el valor.
    La función nos devolverá un array con el resultado.*/
    public static int[] elimina1ElementoArray(int[]n, int num)
    {
        int i = 0, pos = 0;
        int[]a = new int[n.length-1];

        while (n[i] != num)
        {
            a[i]=n[i];
            i++;
            pos = i;
        }
        while (pos < a.length)
        {
            a[pos]=n[pos + 1];
            pos++;
        }
        return a;
    }

    /*36.*//*Escribe una función “eliminaElementosArray” a la que le pasas dos parámetros: un
    array de enteros y un valor entero. La función eliminará del array el valor entero
    independientemente de la posición en la que se encuentre. Si el valor se repite, se
    eliminarán todas las veces que se repite. La función nos devolverá un array con el
    resultado.*/
    public static int[] eliminaElemenotsArray(int[] n, int num)
    {
        int i, longitud, iArrayNuevo;
        longitud = 0;
        iArrayNuevo = 0;
        for( i = 0; i < n.length; i++)
        {
            if (n[i] != num)
            {
                longitud++;
            }
        }

        int[] a = new int[longitud];
        for (i = 0; i< n.length; i++)
        {
            if (n[i] != num)
            {
                a[iArrayNuevo] = n[i];
                iArrayNuevo++;
            }
        }
        return a;
    }

    /*37.*//*Escribe una función “insertaArrayEnArray” a la que le pasas
    tres parámetros: un array de enteros, una posición de ese array, y otro
    array de enteros. La función insertará en el primer array, a partir de
    la posición indicada, to do el contenido del segundo array. La función nos
    devolverá un array con el resultado. Ej.: [6, 2, 1, 3], posición: 2, insertar:
    [12, 13], resultado = [6, 2, 12, 13, 1, 3].*/
    public static int[] insertaArrayEnArray(int[]n1, int[]n2, int pos)
    {
        int i, j = 0;
        int[] newArray = new int[n1.length+n2.length];

        for(i = 0; i < pos; i++)
        {
            newArray[j]=n1[i];
            j++;
        }
        for (i = 0; i < n2.length; i++)
        {
            newArray[j]=n2[i];
            j++;
        }
        for (i=pos; i < n1.length; i++)
        {
            newArray[j]=n1[i];
            j++;
        }
        return newArray;
    }

    /*38.*//*Escribe una función “subArray” a la que le pasas un array y dos
    posiciones. La función te devuelve otro array que contiene los datos
    comprendidos entre ambas posiciones (incluidas ambas dos). Ej.: [3, 6, 2, 8, 9],
    posiciones, 1 y 3, resultado = [6, 2, 8].*/
    public static int[]subArray(int[]n, int pos1, int pos2)
    {
        int i, j=0, longi;
        longi = (pos2-pos1)+1;
        int[]newArray = new int[longi];

        for (i = pos1; i <= pos2; i++)
        {
            newArray[j]=n[i];
            j++;
        }
        return newArray;
    }

    /*39.*//*Escribe una función “recortaArray” a la que le pasas un array y
    dos posiciones. La función te devuelve otro array que contiene los todos
    los datos menos los comprendidos entre ambas posiciones (incluidas ambas dos).
    Ej.: [3, 6, 2, 8, 9], posiciones, 1 y 3, resultado = [3, 9].*/
    public static int[]recortaArray(int[]n, int pos1, int pos2)
    {
        int i, longi, j=0;
        longi = n.length-pos2;
        int[]newArray = new int[longi];
        for (i=0; i<pos1; i++)
        {
            newArray[j]=n[i];
            j++;
        }
        for (i=pos2+1; i<n.length; i++)
        {
            newArray[j]=n[i];
            j++;
        }
        return newArray;
    }

    /*40.*//*Escribe la función “ordenaBurbuja” a la que le pasaremos un array
    de enteros y lo ordenará mediante la ordenación de la burbuja. La ordenación
    de la burbuja funciona de la siguiente forma:

    • Si el array tiene N elementos, se realizarán N-1 pasadas (por ejemplo, para un
    array de 5 elementos tendremos que realizar 4 pasadas para que quede ordenado).
    • En cada pasada, iremos recorriendo el array de principio a fin comprobando los
    números por parejas (por ejemplo: el primer y segundo número, el segundo y el
    tercero, etc.).
    • Si la pareja de números está en orden (o sea, el primero es menor que el segundo)
    la dejamos como está y si está desordenada, los intercambiamos.*/
    public static void ordenaBurbuja(int[] n)
    {
        int i, j = 0, cambio;
        while (j < n.length)
        {
            for (i = 0; i < n.length -1; i++)
            {
                if (n[i]>n[i+1])
                {
                    cambio = n[i];
                    n[i]=n[i+1];
                    n[i+1]=cambio;
                }
            }
            j++;
        }
    }
}
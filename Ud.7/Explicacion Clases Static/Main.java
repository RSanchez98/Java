package com.company;

//        Cosas Estáticas en POO
//        ======================
//
//        atributo normal <-> atributos estáticos
//        De los atributos estáticos hay una sola copia
//        para todos los objetos. Se accede con el nombre
//        de la clase en lugar de con el objeto.
//
//        método normal <-> métodos estáticos
//        Los métodos estáticos se ejecutan desde la clase
//        directamente.
//        Ventaja: no hay que crear objetos para ejecutar
//        los métodos estáticos.
//        Desventaja: no pueden acceder a los atributos que
//        no sean estáticos.
//
//        constructor normal <-> constructores estáticos
//        Los constructores estáticos (en Java: bloques
//        estáticos) son constructores que se ejecutan
//        automáticamente la primera vez que vas a usar una
//        clase. Sólo se ejecutan esa vez.
//        Sirven normalmente para inicializar los
//        atributos estáticos.


public class Main
{
    public static void main(String[] args)
    {
        Ejemplo e0 = new Ejemplo(0);
        e0.escribeS();
        //System.out.println(Ejemplo.s);

        Ejemplo.s = 100;

        Ejemplo e1 = new Ejemplo(10);
        //e1.s = 3; no funciona
        System.out.println(e1.a);
        e1.escribeS();
        e1.incrementaS();

        //Ejemplo.s = 200;

        Ejemplo e2 = new Ejemplo(20);
        System.out.println(e2.a);
        e2.escribeS();

        // Métodos estáticos
        Ejemplo.incrementa100();


        // Ejemplo ENUM

        DiaSemana d = DiaSemana.domingo;

        TipoMoneda t = TipoMoneda.libra;

        int n = TipoMoneda.libra.ordinal();
        System.out.println(n);

        //Dinero din = new Dinero(4, TipoMoneda.euro);

    }
}

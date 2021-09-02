package com.company;

import java.util.ArrayList;
import java.util.List;

public class Dinero
{
    //ATRIBUTOS*********************************************************************************************************
    //AtributoEstático
    private static List<Moneda> listaMonedas = new ArrayList<>();

    //AtributoNormal
    private double cantidad;
    private TipoMoneda tMoneda;

    //BloqueEstatico
    static
    {
        listaMonedas.add(new Moneda(TipoMoneda.euro,2,"€",1));
        listaMonedas.add(new Moneda(TipoMoneda.dolar, 2, "$", 1.11));
        listaMonedas.add(new Moneda(TipoMoneda.yen, 0, "¥", 119.62));
    }

    //CONSTRUCTORES*****************************************************************************************************
    public Dinero (double cantidad, TipoMoneda tMoneda)
    {
        this.cantidad = cantidad;
        this.tMoneda = tMoneda;
    }
    public Dinero (int cantidad, TipoMoneda tMoneda)
    {
        this.cantidad = cantidad;
        this.tMoneda = tMoneda;
    }

    //PROPIEDADES*******************************************************************************************************
    public double getCantidad()
    {
        return this.cantidad;
    }
    public void setCantidad(double cantidad)
    {
        this.cantidad = cantidad;
    }
    public TipoMoneda gettMoneda()
    {
        return this.tMoneda;
    }
    public void settMoneda(TipoMoneda tMoneda)
    {
        this.tMoneda = tMoneda;
    }

    //METODOS***********************************************************************************************************
    //MetodoEstatico
    public static void actualizaCambio(TipoMoneda t, double cambio)
    {
        int i;
        for (i = 0; i < listaMonedas.size(); i++)
        {
            if (listaMonedas.get(i).getTMoneda()==t)
            {
                listaMonedas.get(i).setCambioEuro(cambio);
                i = listaMonedas.size();
            }
        }
    }
    private static Moneda buscaMoneda(TipoMoneda t)
    {
        int i, num = 0;
        for (i = 0; i < listaMonedas.size(); i++)
        {
            if (listaMonedas.get(i).getTMoneda()==t)
            {
                num = i;
                i = listaMonedas.size();
            }
        }

        Moneda m = listaMonedas.get(num);

        return m;
    }

    //MetodoNormal
    public String toString()
    {
        Moneda m = buscaMoneda(tMoneda);

        int cant = (int)Math.pow(10,m.getDecimales());
        cantidad = cantidad * cant;
        cantidad = Math.round(cantidad);
        cantidad = cantidad /cant;

        String cadena = cantidad + m.getSimbolo();

        return cadena;
    }
    public double valorEn(TipoMoneda t)
    {
        double dinero, valorFinal;
        if (tMoneda != TipoMoneda.euro)
        {
            Moneda m = buscaMoneda(this.tMoneda);
            dinero = cantidad / m.getCambioEuro();
        }
        else
        {
            dinero = cantidad;
        }

        if (t != TipoMoneda.euro)
        {
            Moneda m2 = buscaMoneda(t);
            valorFinal = dinero * m2.getCambioEuro();
        }
        else
        {
            valorFinal = dinero;
        }
        return valorFinal;
    }
    public Dinero convierteEn(TipoMoneda t)
    {
        Dinero d = new Dinero(valorEn(t),t);
        return d;
    }
    public String toString(TipoMoneda t)
    {
        String cadena = convierteEn(t).toString();
        return cadena;
    }

    //MetodoOperadores
    public Dinero add (Dinero d)
    {
        double conversion, resultado;
        if (d.tMoneda != this.tMoneda)
        {
            conversion = valorEn(tMoneda);
        }
        else
        {
            conversion = d.cantidad;
        }
        resultado = this.cantidad + conversion;
        Dinero d2 = new Dinero(resultado, this.tMoneda);
        return d2;
    }
    public Dinero substract (Dinero d)
    {
        double conversion, resultado;
        if (d.tMoneda != this.tMoneda)
        {
            conversion = valorEn(tMoneda);
        }
        else
        {
            conversion = d.cantidad;
        }
        resultado = this.cantidad - conversion;
        Dinero d2 = new Dinero(resultado, this.tMoneda);
        return d2;
    }
    public Dinero multiply (double num)
    {
        double resultado;
        resultado = this.cantidad * num;
        Dinero d2 = new Dinero(resultado, this.tMoneda);
        return  d2;
    }
    public Dinero divide (double num)
    {
        double resultado;
        resultado = this.cantidad / num;
        Dinero d2 = new Dinero(resultado, this.tMoneda);
        return d2;
    }
    public Dinero negate ()
    {
        return new Dinero(-this.cantidad, this.tMoneda);
    }
    public boolean equals(Dinero d)
    {
        boolean igual = false;
        double valor;
        if (this.tMoneda != d.tMoneda)
        {
            valor = d.valorEn(tMoneda);
        }
        else
        {
            valor = d.cantidad;
        }

        if (valor==this.cantidad)
        {
            igual = true;
        }
        return igual;
    }
    public int compareTo(Dinero d)
    {
        double valor;
        int comparacion;
        if (tMoneda != d.tMoneda)
        {
            valor = valorEn(tMoneda);
        }
        else
        {
            valor = d.cantidad;
        }
        if (valor == this.cantidad)
        {
            comparacion = 0;
        }
        else
        {
            if (valor < this.cantidad)
            {
                comparacion = 1;
            }
            else
            {
                comparacion = -1;
            }
        }
        return comparacion;
    }
}

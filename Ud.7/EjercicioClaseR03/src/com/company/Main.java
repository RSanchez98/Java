package com.company;

public class Main
{

    public static void main(String[] args)
    {
        BuscaTexto texto = new BuscaTexto();
        texto.cargaFichero("cambio.html");
        //String resultado = texto.extraeCadena("<div id=\"cc-ratebox\" name=\"cc-ratebox\" aria-labelledby=\"elb\" tabindex=\"4\">", "</div>");
        texto.busca("cc-ratebox");
        texto.buscaSiguiente("tabindex");
        String resultado = texto.extraeCadena(">","<");
        System.out.println(resultado);
        texto.busca("tmc-cp-box");
        texto.buscaSiguiente("sumary");
        texto.buscaSiguiente("title");
        String resultTitulo = texto.extraeCadena(">","<");
        System.out.println(resultTitulo);

        texto.busca("/ES/USD/Tasa_de_cambio_Dolar_americano.aspx");
        texto.buscaSiguiente("table");
        String restulDescripcion = texto.extraeCadena("<p>","</p>");
        System.out.println(restulDescripcion);


       // String resultado2 = texto.extraeCadena("<table>","</table>");
        //System.out.println(resultado2);


    }
}

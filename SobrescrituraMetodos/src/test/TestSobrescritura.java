package test;

import domain.Gerente;

import java.util.Locale;

public class TestSobrescritura {

    public static void main(String[] args) {

        Gerente gerente1 = new Gerente(5000, "Gustavo", "Informatica");

        char[] letras = {'1', '2', '3', '4'};
        String detalle = gerente1.obtenerDetalles();

        System.out.println("detalle = " + detalle);
        double a = Double.valueOf(String.valueOf(letras));
        int b = Integer.parseInt(String.valueOf(letras));
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}

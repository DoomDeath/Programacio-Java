package test;

import enumeracion.Continentes;
import enumeracion.Dias;

public class TestEnumeraciones {

    public static void main(String[] args) {
        diasSemana(Dias.SABADO);

        System.out.println("Continentes.EUROPA = " + Continentes.EUROPA);
        System.out.println("Continentes.AMERICA.getPaises() = " + Continentes.AMERICA.getPaises());
        System.out.println("Continentes.AMERICA.getNombre() = " + Continentes.AMERICA.getNombre());


    }
    public static void diasSemana(Dias dias){

        switch (dias) {
            case LUNES:
                System.out.println("Primer Dia de la Semana");
                break;
            case MARTES:
                System.out.println("Segundo dia de la semana");
                break;
            case MIERCOLES:
                System.out.println("Tercer dia de las semana");
                break;
            case JUEVES:
                System.out.println("Cuarto Dia de la semana");
                break;
            case VIERNES:
                System.out.printf("Quinto dia de la semana");
                break;
            case SABADO:
                System.out.printf("Sexto dia de la semana");
                break;
            case DOMINGO:
                System.out.printf("Septimo dia de la semana");
                break;
        }


    }
}

package test;

import paquete1.Clase1;
import paquete2.Clase2;

public class TestModificadoresAcceso {

    public static void main(String[] args) {
        Clase1 clase1 =  new Clase1("Gustavo");

        System.out.println("Nombre = " + clase1.getNombre());

        Clase2 clase2 = new Clase2();

        clase2.setNombre("Gustavo");

        clase2.mostrarApellido("Paola");
    }
}

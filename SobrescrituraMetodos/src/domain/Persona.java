package domain;

public class Persona {

    protected double sueldo;
    protected String nombre;


    public Persona(double sueldo, String nombre) {
        this.sueldo = sueldo;
        this.nombre = nombre;
    }

    public String obtenerDetalles(){
        return " Nombre: " + this.nombre + ", " + "Sueldo: " + this.sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public Persona setSueldo(double sueldo) {
        this.sueldo = sueldo;
        return this;
    }

    public String getNombre() {
        return nombre;
    }

    public Persona setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }
}

package paquete1;

public class Clase1 {

    protected String nombre;

    public Clase1() {
    }

    public void mostrarApellido(String apellido){
        System.out.println("apellido = " + apellido);
    }

    public Clase1(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public Clase1 setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }
}

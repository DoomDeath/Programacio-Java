package domain;

public class Gerente extends Persona{

    private String departamento;


    public Gerente(double sueldo, String nombre, String departamento) {
        super(sueldo, nombre);
        this.departamento = departamento;
    }

    @Override
    public String obtenerDetalles() {
        return super.obtenerDetalles() + ", Departamento: " + this.departamento;
    }
}

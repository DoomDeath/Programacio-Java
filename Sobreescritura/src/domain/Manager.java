package domain;

public class Manager extends Empleado{

    private String centroCosto;


    public Manager(String nombre, double sueldo, String centroCosto) {
        super(nombre, sueldo);
        this.centroCosto = centroCosto;
    }

    @Override
    public String obtenerDetalles() {
        return super.obtenerDetalles() + ", Centro Costo: " + this.centroCosto;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "centroCosto='" + centroCosto + '\'' +
                '}';
    }
}

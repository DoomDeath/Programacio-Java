package domain;

public class Escritor extends Empleado{


    final TipoEscritura tipoEscritura;

    public Escritor(String nombre, double sueldo, TipoEscritura tipoEscritura) {
        super(nombre, sueldo);
        this.tipoEscritura = tipoEscritura;
    }

    @Override
    public String obtenerDetalles() {
        return super.obtenerDetalles() + ", tipo escritura: " + tipoEscritura.getDescripcion();
    }

    public TipoEscritura getTipoEscritura() {
        return tipoEscritura;
    }

    @Override
    public String toString() {
        return "Escritor{" +
                "nombre='" + nombre + '\'' +
                ", sueldo=" + sueldo +
                ", tipoEscritura=" + tipoEscritura +
                '}';
    }
}

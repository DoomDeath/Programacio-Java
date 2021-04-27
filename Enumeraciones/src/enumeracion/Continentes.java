package enumeracion;

public enum Continentes {

    EUROPA(52, "CONTINENTE EUROPEO"),
    ASIA(45, "CONTINENTE ASIATICO"),
    AMERICA(46, "CONTINENTE AMERICANO"),
    OCEANIA(23, "CONTINENTE OCEANICO"),
    AFRICA(56, "CONTINENTE AFRICANO");

    private final int paises;

    private final String nombre;

    Continentes(int paises, String nombre) {
        this.paises = paises;
        this.nombre = nombre;
    }


    public int getPaises() {
        return this.paises;
    }

    public String getNombre() {
        return nombre;
    }
}

package ClasesAbstractas.ej1;

public abstract class Figura {
    protected String Nombre;

    public Figura(String nombre) {
        Nombre = nombre;
    }

    public abstract double calcularArea();


}


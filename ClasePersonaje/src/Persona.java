public class Persona {
    public String nombre;
    private int edad;
    protected String pais;

    public Persona(String nombre, int edad, String pais) {
        this.nombre = nombre;
        this.edad = edad;
        this.pais = pais;
    }

    public int getEdad() {
        return edad;
    }

}

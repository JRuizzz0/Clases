package programacion;

public class MainAlumno {

    public static void main(String[] args) {
    Alumno alumno = new Alumno ("Jaime");

    alumno.añadirNota(10);
    alumno.añadirNota(5);

    alumno.calcularMedia();
    alumno.mostrarInfo();



    }
}

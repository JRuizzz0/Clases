package ClasesAbstractas.ej2;

public class Main {
    public static void main(String[] args) {

        EmpleadoPorHoras empleado1 = new EmpleadoPorHoras("Mario",11,7);

        System.out.println(empleado1.nombre);
        System.out.println(empleado1.calcularSalario());

    }
}

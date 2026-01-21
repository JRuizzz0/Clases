package ClasesAbstractas.ej2;

public class EmpleadoPorHoras extends Empleado {

    protected double salario;
    protected double horas;

    public EmpleadoPorHoras(String nombre, double salario, double horas) {
        super(nombre);
        this.salario=salario;
        this.horas=horas;
    }


    @Override
    public double calcularSalario() {
        return salario*horas;
    }
}

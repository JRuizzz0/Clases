//interface Administrador{
//    void admin();
//}
//
//interface Tecnico{
//    void tecnico();
//}
//
//public class Empleado2 implements Administrador,Tecnico{
//    private String nombre;
//    private int edad;
//    private double salario;
//    public Empleado2(String nombre, int edad, double salario) {
//        this.nombre = nombre;
//        this.edad = edad;
//        this.salario = salario;
//    }
//    public void mostrar(){
//        System.out.println("Nombre: "+nombre);
//        System.out.println("Edad: "+edad);
//        System.out.println("Salario: "+salario);
//    }
//
//    @Override
//    public void admin() {
//        System.out.println("Yo soy el administrador");
//    }
//    @Override
//    public void tecnico() {
//        System.out.println("Yo soy el tecnico");
//    }
//}
//
//
//class Main3{
//    public static void main(String[] args) {
//        Empleado2 empleado1 = new Empleado2("Juan",23,3000);
//        Empleado2 empleado2 = new Empleado2("Juan",28,4000);
//
//        empleado1.mostrar();
//        empleado1.admin();
//        empleado2.mostrar();
//        empleado2.tecnico();
//    }
//}

class Empleado2 {
    protected String nombre;
    protected int edad;
    protected double salario;

    public Empleado2(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Salario: " + salario);
    }
}


class Administrador extends Empleado {
    private String departamento;

    public Administrador(String nombre, int edad, double salario, String departamento) {
        super(nombre, edad, salario);
        this.departamento = departamento;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Departamento: " + departamento);
    }
}


class Tecnico extends Empleado {
    private String sector;

    public Tecnico(String nombre, int edad, double salario, String sector) {
        super(nombre, edad, salario);
        this.sector = sector;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Sector: " + sector);
    }
}

class Main3 {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Ruben", 21, 1000);
        Administrador admin = new Administrador("Jaime", 20, 300000, "Recursos Humanos");
        Tecnico tecnico = new Tecnico("Daniel", 21, 2000, "Soporte");

        System.out.println("Empleado");
        empleado.mostrarInformacion();

        System.out.println("Administrador");
        admin.mostrarInformacion();

        System.out.println("Técnico");
        tecnico.mostrarInformacion();
    }
}
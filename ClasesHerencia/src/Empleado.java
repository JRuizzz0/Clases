public class Empleado {
    private String nombre;
    private int edad;
    private double salario;

    public Empleado(String nombre, int edad, double salario) {
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
    class Gerente extends Empleado{
        private String departamento;
        public Gerente(String nombre, int edad, double salario , String departamento) {
            super(nombre, edad, salario);
            this.departamento = departamento;
        }


        public void mostrarInformacion(){
            super.mostrarInformacion();
            System.out.println("Departamento: " + departamento);

        }

    }

    class Admin extends Gerente{
    private String sector;
    public Admin(String nombre, int edad, double salario , String sector) {
        super(nombre, edad, salario, sector);
        this.sector = sector;
    }
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Sector: " + sector);
        }

    }





class Main {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Ruben", 21, 1000);
        empleado.mostrarInformacion();
        Gerente gerente = new Gerente("Daniel", 21, 2000, "Recursos");
        gerente.mostrarInformacion();
        Admin admin = new Admin("Jaime", 20, 300000, "Mineria de cryptos");
        admin.mostrarInformacion();
    }
}
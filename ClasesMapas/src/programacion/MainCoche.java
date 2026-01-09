package programacion;

public class MainCoche {

    public static void main(String[] args) {

    Coche coche1 = new Coche("BMW", "M8" , 100);

    coche1.acelerar();
    coche1.frenar();
    coche1.frenar();
    coche1.acelerar();
    coche1.frenar();

    coche1.mostrarDatos();

    }
}

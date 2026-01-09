package programacion;

public class MainBanco {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("Jaime", 1000);

        cuenta.ingresar(500);
        cuenta.retirar(5000);
        cuenta.retirar(250);
        cuenta.mostrarSaldo();
    }
}

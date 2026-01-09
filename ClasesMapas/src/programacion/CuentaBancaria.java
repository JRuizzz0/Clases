package programacion;

class CuentaBancaria {

    // atributos COMPLETAR
    private String titular;
    private static double saldo;


    static double saldoCajero = 0;
    // constructor COMPLETAR
    public CuentaBancaria (String titular, double saldo){
        this.titular= titular;
        this.saldo= saldo;
    }

    // método ingresar COMPLETAR
    public void ingresar(double saldoIngresar){

        if(saldoIngresar < 0){
            System.out.println("No tienes saldo para ingresar");
        }else{
            saldo = saldo + saldoIngresar;
            System.out.println("Has ingresado " + saldoIngresar + ", ahora tienes en el cajero " + saldo);
        }
    }

    // método retirar COMPLETAR

    public void retirar(double dineroRetiro){
        if(dineroRetiro > saldo){
            System.out.println("No tienes tanto dinero en el cajero");
        }else{
            saldo = saldo + dineroRetiro;
            System.out.println("Dinero retirado: "+ dineroRetiro + " y ahora tienes: " + saldo);
        }
    }



    // método mostrarSaldo COMPLETAR

    public void mostrarSaldo(){
        System.out.println("Saldo: " + saldo);
    }

}


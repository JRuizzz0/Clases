public class Vehiculo2 {
    private String marca;
    private int velocidadMaxima;

    public Vehiculo2(String marca, int velocidadMaxima) {
        this.marca = marca;
        this.velocidadMaxima = velocidadMaxima;

    }
    public void mostrarInformacion(){
        System.out.println("Marca: " + this.marca);
        System.out.println("Velocidad maxima: " + this.velocidadMaxima);
    }
    public static class Coche extends Vehiculo2 {
        private int numero_puertas;
        public Coche(String marca, int velocidadMaxima, int numero_puertas) {
            super(marca, velocidadMaxima);
            this.numero_puertas = numero_puertas;

        }
        public void mostrarInformacion(){
            super.mostrarInformacion();
            System.out.println("Numero de puertas: " + this.numero_puertas);
        }

    }

}
 class Main4{
    public static void main(String[] args){
        Vehiculo vehiculo = new Vehiculo("Bombin", 2000);
        Vehiculo2.Coche coche = new Vehiculo2.Coche("Renault", 160, 4);
        vehiculo.mostrarInformacion();
        coche.mostrarInformacion();
    }
}
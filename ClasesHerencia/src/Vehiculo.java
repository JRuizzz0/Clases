public class Vehiculo {
    private String marca;
    private int velocidadMaxima;

    public Vehiculo(String marca, int velocidadMaxima) {
        this.marca = marca;
        this.velocidadMaxima = velocidadMaxima;
    }

    public void mostrarInformacion() {
        System.out.println("Marca: " +marca);
        System.out.println("Velocidad maxima: " +velocidadMaxima);
    }
}

    class Coche extends Vehiculo {
        private String tipoCombustible;
        public Coche(String marca, int velocidadMaxima, String tipoCombustible) {
            super(marca, velocidadMaxima);
            this.tipoCombustible = tipoCombustible;
        }

        public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Tipo combustible: "+ tipoCombustible);

        }

    }

    class Main2{
    public static void main(String[] args) {
        Coche coche = new Coche("Renault", 150, "Diesel");
        coche.mostrarInformacion();

    }

    }
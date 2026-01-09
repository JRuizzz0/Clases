package programacion;

class Coche {
    private static String marca;
    private static String modelo;
    private static int velocidad;
    private static int velocidadActual;

    // Constructor COMPLETAR
    public Coche (String marca , String modelo, int velocidad){
        this.marca = marca ;
        this.modelo = modelo ;
        this.velocidad = velocidad;
    }

    // Método acelerar (suma +10) COMPLETAR
    public static void acelerar(){
        System.out.println("El coche va a acelerar...");
        velocidadActual = velocidad + 10;
        System.out.println("El " + marca + " " +  modelo + " va ahora a " +  velocidadActual + " km/h");
    }

    // Método frenar (resta -10 y nunca menor que 0) COMPLETAR

    public static int frenar(){
        velocidadActual= velocidadActual - 10;
        if (velocidad < 0){
            System.out.println("La velocidad no puede ser menor que 0");
            return velocidad;
        }else{
            System.out.println("La velocidad ha reducido en 10, " + "y ahora va a " +  velocidadActual +  "km/h");
        }
        return velocidadActual;
    }

    // Método mostrarDatos COMPLETAR
    public static void mostrarDatos(){
        System.out.println("\n Marca:" + marca +  "\n Modelo:" + modelo + "\n Velocidad:" + velocidadActual);
    }

}

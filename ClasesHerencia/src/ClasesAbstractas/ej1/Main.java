package ClasesAbstractas.ej1;

public class Main {
    public static void main(String[] args) {

        Triangulo triangulo = new Triangulo("Equilatero",20,10 );

        System.out.println(triangulo.Nombre);
        System.out.println(triangulo.calcularArea());

    }
}

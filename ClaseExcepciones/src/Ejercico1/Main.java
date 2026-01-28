package Ejercico1;

public class Main {
    public static void main(String[] args) throws PrecioInvalidoException {
        try {
            Productos producto = new Productos("Jamon");
            producto.setPrecio(-30);
            producto.mostarInformacion();
        }catch(PrecioInvalidoException e) {
            System.out.println(e.getMessage());
        }


    }
}

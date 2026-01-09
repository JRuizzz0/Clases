package programacion;

public class MainBiblioteca {

    public static void main(String[] args) {


    Biblioteca biblioteca = new Biblioteca();

   Libros libro1 = new Libros("LAlaland" , "KJ", "Si");
   Libros libro2 = new Libros("Harry" , "JK", "Si");
   Libros libro3 = new Libros("Vinland", "Thorfeen", "Si");

    biblioteca.añadirLibro(libro1);
    biblioteca.añadirLibro(libro2);
    biblioteca.añadirLibro(libro3);

    biblioteca.prestarLibro(libro1);

    biblioteca.devolverLibro(libro1);

    libro1.mostrarInfo();
    libro2.mostrarInfo();
    libro3.mostrarInfo();

    }
}

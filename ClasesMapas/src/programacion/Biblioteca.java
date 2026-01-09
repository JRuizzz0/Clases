package programacion;

import java.util.ArrayList;


class Biblioteca {

    // lista de libros COMPLETAR

    private ArrayList<Libros> libros;

    Biblioteca() {
        this.libros = new ArrayList<>();
    }

    public ArrayList<Libros> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<Libros> libros) {
        this.libros = libros;
    }

    // añadirLibro COMPLETAR

    public void añadirLibro(Libros libro) {
        libros.add(libro);
        System.out.println("Libro añadido correctamente: " + libro);


    }

    // prestarLibro COMPLETAR

    public void prestarLibro(Libros libro) {
        for (int i = 0; i < libros.size(); i++) {
            Libros l = libros.get(i);
            libros.remove(libro);
            System.out.println("Libro prestado correctamente: " + l);

        }

    }
        // devolverLibro COMPLETAR

    public void devolverLibro (Libros libro){
            libros.add(libro);
            System.out.println("Libro devuelto correctamente");



        }

    }

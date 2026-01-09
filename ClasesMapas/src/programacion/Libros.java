package programacion;

class Libros {

    // atributos COMPLETAR
    private String titulo;
    private String autor;
    private String disponible;


    // constructor COMPLETAR

    public Libros(String titulo, String autor, String disponible){
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = disponible;
    }

    // método mostrarInfo COMPLETAR

    public void mostrarInfo(){
        System.out.println("Titulo: " + titulo + "\nAutor: " + autor + "\nDisponible: " + disponible);
    }

}

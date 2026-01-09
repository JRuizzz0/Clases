package programacion;

import java.util.ArrayList;

class Alumno {
    private String nombre;
    private ArrayList<Double> notas;
    private double notaMedia;


    // Constructor COMPLETAR

    public Alumno(String nombre) {
        this.nombre = nombre;
        this.notas = new ArrayList<>();
        this.notaMedia = 0;

    }


    // Método añadirNota COMPLETAR

    public void añadirNota(double nota) {

            notas.add(nota);
            System.out.println("Nota añadida correctamente " + nota);



    }

    // Método calcularMedia COMPLETAR
    public void calcularMedia(){
        if (notas.isEmpty()) {
            this.notaMedia = 0.0;
            return;
        }
        double suma = 0.0;
        for(double nota: notas){
            suma += nota;
        }
        this.notaMedia = suma / notas.size();
        System.out.println("Nota media: " + notaMedia);
    }

    // Método mostrarInfo COMPLETAR
    public void mostrarInfo(){
        System.out.println("Nombre: " + nombre + "\nNotas: " + notas + "\nNota media: " + notaMedia);
    }

}

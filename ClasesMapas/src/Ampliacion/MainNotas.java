package Ampliacion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainNotas  {
    private static final MyScanner sc = new MyScanner();
   private static int cantidadAsignatura = 2;
   private static ArrayList<Notas> notas = new ArrayList<>();
    public static void main(String[] args) {
        pedirNotas();
        Map<String, Notas> mapa = new HashMap<>();
        for (Notas nota : notas) {
            mapa.put(nota.getAsignatura(), nota);
        }


    }
    public static Notas addNotas() {
        String nombre = sc.pedirSoloTexto("Introduce el nombre de la asignatura: ");
        double notas = sc.pedirDecimal("Introduce la nota: ");
        return new Notas(notas, nombre);
    }
    public static void pedirNotas() {
     for (int i = 0; i > cantidadAsignatura; i++ ) {
       notas.add(addNotas());
     }
    }

}
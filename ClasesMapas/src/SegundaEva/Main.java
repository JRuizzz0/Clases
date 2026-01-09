package SegundaEva;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        HashMap<Asignatura, Integer> notas = new LinkedHashMap<>();

        Asignatura programacion = new Asignatura("Programación","Java");
        Asignatura base_de_datos = new Asignatura("Base de Datos","SQL");

        notas.put(programacion,10);
        notas.put(base_de_datos,9);

        for (Map.Entry<Asignatura, Integer> entry : notas.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println("Nota: "+entry.getValue());
        }
    }
}

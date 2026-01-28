package programacion;

import java.awt.*;
import java.util.*;

public class Colecciones {

    public static void main(String[] args) {
        System.out.println("Colecciones");
        //Listas
        ArrayList<String> juegos = new ArrayList<>();
        juegos.add("Juego 1");
        juegos.add("Juego 2");
        //Listas y Queue
        LinkedList<String> juegos1 = new LinkedList<>();
        juegos1.add("Juego 1");
        juegos1.add("Juego 2");
        //Set
        HashSet<String> juegos2 = new HashSet<>();
        juegos2.add("Juego 1");
        juegos2.add("Juego 2");
        //Set
        TreeSet<String> juegos3 = new TreeSet<>();
        juegos3.add("Juego 1");
        juegos3.add("Juego 2");

        //Queue
        PriorityQueue<String> juegos4 = new PriorityQueue<>();
        juegos4.add("Juego 1");
        juegos4.add("Juego 2");
        //Mapas
        HashMap<String, String> juegos5 = new HashMap<>();
        juegos5.put("Codigo 1", "Juego 1");
        juegos5.put("Codigo 2", "Juego 2");

        //Mapas
        TreeMap<String, String> juegos6 = new TreeMap<>();
        juegos6.put("Codigo 1", "Juego 1");
        juegos6.put("Codigo 2", "Juego 2");

        }


}


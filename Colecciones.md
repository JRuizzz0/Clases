📚 Guía de Colecciones en Java💻 Implementación en CódigoJavapackage programacion;

import java.util.*;

public class Colecciones {
    public static void main(String[] args) {
        System.out.println("--- Ejemplos de Colecciones ---");

        // LISTAS: Ordenadas y con duplicados
        ArrayList<String> juegos = new ArrayList<>();
        juegos.add("Juego 1");
        
        LinkedList<String> juegos1 = new LinkedList<>();
        juegos1.add("Juego 1");

        // SETS: Únicos, sin duplicados
        HashSet<String> juegos2 = new HashSet<>();
        juegos2.add("Juego 1");
        
        TreeSet<String> juegos3 = new TreeSet<>();
        juegos3.add("Juego 1");

        // QUEUE: Prioridad y colas
        PriorityQueue<String> juegos4 = new PriorityQueue<>();
        juegos4.add("Juego 1");

        // MAPAS: Pares Clave-Valor
        HashMap<String, String> juegos5 = new HashMap<>();
        juegos5.put("Codigo 1", "Juego 1");
        
        TreeMap<String, String> juegos6 = new TreeMap<>();
        juegos6.put("Codigo 1", "Juego 1");
    }
}
📖 Teoría y Conceptos Clave1. Interfaz ListPermite colecciones dinámicas con orden de inserción y duplicados.ArrayList:Definición: Estructura dinámica que crece o se reduce automáticamente.Uso: Ideal para búsquedas rápidas por índice.LinkedList:Definición: Lista doblemente enlazada.Uso: Ideal para implementar Colas (FIFO) o Pilas (LIFO). Acceso secuencial lento (O(n)).2. Interfaz SetColecciones que garantizan la unicidad de sus elementos.HashSet:Basado en una tabla hash.Rendimiento: Muy rápido ($O(1)$) para búsqueda y añadir.Orden: No garantiza ningún orden.TreeSet:Basado en un árbol binario balanceado (Rojo-Negro).Orden: Automático (natural o por Comparator).Restricción: No permite elementos null.3. Interfaz QueueEstructuras para el procesamiento de elementos en un orden específico.PriorityQueue:Lógica: Procesa elementos según su prioridad, no por orden de llegada.Rendimiento: Inserción en $O(\log n)$.Importante: No permite valores nulos y no garantiza orden en el iterador.4. Interfaz MapAlmacena pares de Clave-Valor. Las claves son únicas.HashMap:Búsqueda y acceso muy rápidos.No mantiene orden y permite una clave null.TreeMap:Mantiene las claves ordenadas alfabética o numéricamente.Permite operaciones de navegación (encontrar el mayor, el menor, etc.).📊 Resumen ComparativoEstructuraPermite DuplicadosOrdenadoAcceso RápidoNotasArrayList✅ SíInserción✅ Sí (Índice)La más usada por defecto.HashSet❌ No❌ No✅ Sí (Hash)Ideal para listas de "únicos".TreeSet❌ No✅ Natural⚠️ MediaÚtil si necesitas orden constante.HashMap❌ (Claves)❌ No✅ Sí (Clave)Para diccionarios/búsquedas.

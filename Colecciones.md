# Colecciones
## Autor: Jaime


### Codigo
```Java
ppackage programacion;

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
```
#### Teoría: 

#### List
`ArrayList: Estructura de datos dinámica que permite almacenar colecciones de elementos de forma flexible, con capacidad de crecer o reducir automáticamente.  A diferencia de los arrays tradicionales, su tamaño no es fijo y se puede modificar durante la ejecución del programa.
LinkedList: Es una estructura de datos que implementa una lista doblemente enlazada, permitiendo almacenar elementos de forma dinámica y eficiente.
Características principales`
- Dinámico: Crecer o reducirse en tiempo de ejecución sin necesidad de predefinir un tamaño fijo. 
- Orden de inserción: Mantiene el orden en que se agregan los elementos. 
- Permite duplicados: Puede contener elementos repetidos. 
- No sincronizado: No es seguro para múltiples hilos; para uso concurrente, se debe envolver con Collections.synchronizedList(). 
- Acceso secuencial: El acceso por índice es lento (O(n)), ya que requiere recorrer la lista desde el inicio o el final.
  
`Es ideal para implementar colas (FIFO) y pilas (LIFO), ya que LinkedList implementa tanto la interfaz List como Deque.`

#### Set
`HashSet: Almacena elementos únicos sin mantener un orden específico.  Internamente, utiliza una tabla hash (HashMap) para almacenar sus elementos, lo que permite operaciones eficientes como añadir (add), eliminar (remove) y buscar (contains) en tiempo constante (O(1)) en promedio, siempre que la función de hash distribuya bien los elementos.
Características principales de HashSet:`

- No permite duplicados: Cada elemento debe ser único; si se intenta añadir uno ya existente, la operación falla y devuelve false. 
- No garantiza orden: Los elementos no se almacenan en el orden de inserción ni en orden ascendente. 
- Permite un valor null: Solo puede haber un elemento null en el conjunto. 
- No es sincronizado: No es seguro para uso concurrente sin sincronización externa. 
- Rendimiento eficiente: Ideal para casos donde se requiere unicidad y búsqueda rápida, sin importar el orden. 

`TreeSet: es una clase en Java que implementa la interfaz Set y se utiliza para almacenar elementos únicos y ordenados.  Es parte de la API de colecciones de Java y se basa en una estructura de datos llamada árbol binario balanceado (normalmente un árbol rojo-negro), lo que permite mantener los elementos en orden ascendente de forma automática.
Características: `

- Ordena automáticamente los elementos: Los elementos se almacenan en orden natural (por ejemplo, alfabético para cadenas, numérico para números) o según un Comparator personalizado que se le pase al constructor. 
- Evita duplicados: No permite elementos repetidos. Si intentas añadir un elemento ya existente, no se añade y el método add() devuelve false. 
- Operaciones eficientes: Las operaciones de inserción, eliminación y búsqueda tienen una complejidad de tiempo de O(log N), lo que las hace muy rápidas  para grandes conjuntos de datos. 
- No permite elementos nulos: Si se intenta añadir null, se lanza una excepción NullPointerException, a menos que se use un Comparator que acepte null.


#### Queue

 `PriorityQueue: Es una estructura de datos que implementa la interfaz Queue y se basa en un montículo de prioridad (heap).  A diferencia de una cola tradicional (FIFO), los elementos en una PriorityQueue se procesan según su prioridad, no según el orden de inserción.
 Características: `
 
- No permite valores nulos: Intentar añadir null lanza una NullPointerException. 
- No es segura para hilos concurrentes: Si se usa en múltiples hilos, debe reemplazarse por PriorityBlockingQueue. 
- No garantiza orden en iteradores: El método iterator() no recorre los elementos en orden de prioridad; para eso, se debe usar Arrays.sort(pq.toArray()). 
- Tamaño dinámico: Es una cola sin límites, con capacidad que crece automáticamente. 

#### Map

`
HashMap: HashMap es una estructura de datos en Java que almacena pares de clave-valor y permite acceder rápidamente a los valores mediante sus claves.  Es una implementación de la interfaz Map basada en tablas hash, lo que proporciona un rendimiento en tiempo constante para operaciones básicas como inserción, recuperación y eliminación de elementos, siempre que la función de hash distribuya bien las claves.
Características: `

- No ordenado: No garantiza el orden de inserción de los elementos. 
- No sincronizado: No es seguro para uso concurrente. Para acceso múltiple desde hilos, se recomienda usar ConcurrentHashMap. 
- Capacidad y factor de carga: Afectan el rendimiento. La capacidad inicial y el factor de carga determinan cuándo se redimensiona internamente la tabla hash. 

`TreeMap: TreeMap en Java es una colección que almacena pares clave-valor ordenados según el orden natural de las claves o según un comparador especificado.  Es parte del Java Collections Framework y implementa las interfaces NavigableMap y SortedMap, lo que permite operaciones avanzadas de navegación y acceso ordenado.`

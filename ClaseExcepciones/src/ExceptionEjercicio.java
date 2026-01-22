import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class ExceptionEjercicio {
    public static void main(String[] args) {
        // EJERCICIO 1
        try {
            int[] nums = new int[3];
            nums[5] = 10;
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error de Índice: Te saliste del rango de la lista o array.");
        }

        // EJERCICIO 2
        try {
            String texto = null;
            System.out.println(texto.length());
        } catch (NullPointerException e) {
            System.out.println("Error: Referencia Nula
        }

        // EJERCICIO 3
        try {
            int resultado = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Error Matemático: División por cero.");
        }

        // EJERCICIO 4
        try {
            String numero = "abc";
            int valor = Integer.parseInt(numero);
        } catch (NumberFormatException e) {
            System.out.println("Error de Formato: El string no es un número válido.");
        }

        // EJERCICIO 5
        try {
            Object obj = "Hola";
            Integer num = (Integer) obj;
        } catch (ClassCastException e) {
            System.out.println("Error de Casting: No puedes convertir este objeto a ese tipo.");
        }

        // EJERCICIO 6
        try {
            String str = "Java";
            char c = str.charAt(10);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Error de Índice: Te saliste del rango del string");
        }

        // EJERCICIO 7
        try {
            int[] arr = new int[-5];
        } catch (NegativeArraySizeException e) {
            System.out.println("No admite valores negativos");
        }

        // EJERCICIO 8
        try {
            String vacio = "";
            String sub = vacio.substring(2, 5);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Error de Índice: Te saliste del rango del string");
        }

        // EJERCICIO 9
        try {
            FileReader fr = new FileReader("no_existe.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Error: Archivo no encontrado");
        }

        // EJERCICIO 10
        try {
            List<String> lista = new ArrayList<>();
            lista.add("uno");
            String elem = lista.get(5);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error de Índice: Te saliste del rango del array.");
        }

        // EJERCICIO 11
        try {
            Thread.sleep(1000);
            Thread.currentThread().interrupt();
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Error de Hilo: La ejecución fue interrumpida.");

        }

        // EJERCICIO 12
        try {
            List<Integer> fija = Arrays.asList(1, 2, 3);
            fija.add(4);
        } catch (ConcurrentModificationException e) {
            System.out.println("Concurrencia: Modificaste una lista mientras la recorrías.");
        }

        // EJERCICIO 13
        try {
            Class<?> clase = Class.forName("Paquete.ClaseInexistente");
        } catch (ClassNotFoundException e) {
            System.out.println("Clase: No se encontró la definición de la clase solicitada.");
        }

        // EJERCICIO 14
        try {
            metodoRecursivo(0);
        } catch (StackOverflowError e) {
            System.out.println("Error: Stack Overflow");
        }

        // EJERCICIO 15
        try {
            ArrayList<Integer> lista = new ArrayList<>();
            while (true) {
                lista.add(999999999);
            }
        } catch (StackOverflowError e) {
            System.out.println("Error: Argumento ilegal o almacenamiento inválido.");
        }

        // EJERCICIO 16
        try {
            Map<String, String> mapa = new HashMap<>();
            mapa.put("clave1", "valor1");
            Iterator<String> it = mapa.keySet().iterator();
            mapa.put("clave2", "valor2");
            it.next();
        } catch (ConcurrentModificationException e) {
            System.out.println("se modifica HashMap mientras se está iterando sobre ella" +
                    ", y la modificación no se realiza a través del propio iterador.");

        }

        // EJERCICIO 17
        try {
            Stack<String> pila = new Stack<>();
            pila.pop();
        } catch (EmptyStackException e) {
            System.out.println("Error: Pila vacio");
        }

        // EJERCICIO 18
        try {
            String[] array = {"a", "b", "c"};
            Arrays.sort(array, null);
        } catch (NullPointerException e) {
            System.out.println("Error: Elemento nulo");
        }

        // EJERCICIO 19
        try {
            Object[] objArray = new String[5];
            objArray[0] = 123;
        } catch (ArrayStoreException e) {
            System.out.println("Error: Tipo invalido");
        }

        // EJERCICIO 20
        try {
            SecurityManager sm = new SecurityManager();
            System.setSecurityManager(sm);
            System.exit(0);
        } catch (UnsupportedOperationException e) {
            System.out.println("Error: No se puede establecer la operacion");
        }
    }

    static void metodoRecursivo(int n) {
        metodoRecursivo(n + 1);
    }
}
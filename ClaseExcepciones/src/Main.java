import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.DateTimeException;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeoutException;
import java.util.prefs.BackingStoreException;

public class Main {

    public static void main(String[] args) {

        try {
            // ... Aquí iría tu código peligroso ...
            // Ejemplo: Thread.sleep(1000); -> Lanza InterruptedException
            // Ejemplo: FileReader f = new FileReader("no_existe.txt"); -> Lanza FileNotFoundException
            // Ejemplo: int x = 10/0 --> Error Aritmético -> ArithmeticException

        } catch (ArithmeticException e) {
            System.out.println("Error Matemático: División por cero.");

        } catch (ClassCastException e) {
            // Muy común en polimorfismo mal aplicado
            System.out.println("Error de Casting: No puedes convertir este objeto a ese tipo.");

        } catch (IndexOutOfBoundsException e) {
            // Captura tanto errores de Array como de ArrayList o String
            System.out.println("Error de Índice: Te saliste del rango de la lista o array.");

        } catch (NoSuchElementException e) {
            // Común al usar Scanners o Iteradores
            System.out.println("Error: No hay más elementos para leer.");

        } catch (NullPointerException e) {
            System.out.println("Error: Referencia Nula (NullPointer).");

        } catch (NumberFormatException e) {
            System.out.println("Error de Formato: El string no es un número válido.");

        } catch (FileNotFoundException e) {
            // Debe ir ANTES de IOException por ser más específica
            System.out.println("Error Crítico: El archivo no se encuentra en la ruta especificada.");

        } catch (IOException e) {
            System.out.println("Error General de Entrada/Salida.");

        } catch (InterruptedException e) {
            //  Necesaria si usas hilos o pausas (Thread.sleep)
            System.out.println("Error de Hilo: La ejecución fue interrumpida.");

        } catch (IllegalArgumentException | ArrayStoreException e) {
            System.out.println("Error: Argumento ilegal o almacenamiento inválido.");

        } catch (IllegalAccessException | IllegalCallerException e) {
            System.out.println("Error de Seguridad/Acceso.");

        } catch (BackingStoreException | LayerInstantiationException | EnumConstantNotPresentException e) {
            System.out.println("Error de Sistema/Configuración.");

        } catch (Exception e) {
            // La red de seguridad final
            System.out.println("Error no identificado: " + e.getClass().getSimpleName());
        } catch (TimeoutException e){ //Se lanza cuando una operación no se completa dentro del tiempo permitido
            System.out.println("Error de Timeout: " + e.getMessage());
        }
        catch (ConcurrentModificationException e) {
            System.out.println("Concurrencia: Modificaste una lista mientras la recorrías.");
        }
        catch (ClassNotFoundException e) {
            System.out.println("Clase: No se encontró la definición de la clase solicitada.");
        }
        catch (DateTimeException e) {
            System.out.println("Fecha: Fecha u hora inválida (ej: mes 13).");
        }
    }
}
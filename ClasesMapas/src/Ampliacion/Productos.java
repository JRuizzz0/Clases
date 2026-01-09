package Ampliacion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Productos {
    private static final MyScanner sc = new MyScanner();

    public static void main(String[] args) {
        ArrayList<String> productos = new ArrayList<>();
        productos.add("Pizza");
        productos.add("Leche");
        productos.add("Yogur");
        productos.add("Jamon");
        productos.add("Queso");


        Map<String , Double> precio = new HashMap<>();

        for(String producto: productos){
            precio.put(producto, sc.pedirDecimal("Ingrese el precio de la/el " + producto + ":"));

        }

        System.out.println("====Precio====");
        for(String key: precio.keySet()){
            System.out.println(key + ":" + precio.get(key) + "$");

        }
    }
}

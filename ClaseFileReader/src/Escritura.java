import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Escritura {
    public  static void main(String[] args) {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Alumno.DESKTOP-DI5KTUG\\Downloads\\archivo.txt"))){
            bw.write("Primera linea");
            bw.newLine();
            bw.write("Segunda linea");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

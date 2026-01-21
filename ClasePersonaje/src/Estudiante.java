public class Estudiante extends Persona{
    public  Estudiante(String nombre, int edad,String pais) {
        super(nombre,edad,pais);
    }
    public void mostarInformacion(){
        System.out.println("Estudiante: ");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: "+ getEdad());
        System.out.println("Pais: "+ pais);
    }


}

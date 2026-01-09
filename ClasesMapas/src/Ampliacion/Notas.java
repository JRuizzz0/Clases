package Ampliacion;

public class Notas {
    private double nota;
    private String asignatura;

    public Notas(double nota, String asignatura) {
        this.nota = nota;
        this.asignatura = asignatura;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    @Override
    public String toString() {
        return String.format("Nota %.2f Asignatura: %s", nota, asignatura);
    }
}

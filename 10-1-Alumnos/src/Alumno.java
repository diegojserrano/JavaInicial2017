
public class Alumno {

    private String nombre;
    private int legajo;
    private int nota1, nota2, nota3;
    private int asistencias, faltas;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public int getNota1() {
        return nota1;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    public int getNota2() {
        return nota2;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }

    public int getNota3() {
        return nota3;
    }

    public void setNota3(int nota3) {
        this.nota3 = nota3;
    }

    public int getAsistencias() {
        return asistencias;
    }

    public void setAsistencias(int asistencias) {
        this.asistencias = asistencias;
    }

    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", legajo=" + legajo + ", nota1=" + nota1 + ", nota2=" + nota2 + ", nota3=" + nota3 + ", asistencias=" + asistencias + ", faltas=" + faltas + '}';
    }

    public float promedio() {
        return (nota1 + nota2 + nota3) / 3f;
    }

    public float porcentajeAsistencia() {
        return (faltas / (asistencias + faltas)) * 100;
    }

    public boolean estaLibre() {
        return porcentajeAsistencia() < 70;
    }
}

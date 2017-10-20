
public class Persona {

    private String nombre;
    private String apellido;
    private int nacimiento;
    private float peso;
    private float altura;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(int nacimiento) {
        this.nacimiento = nacimiento;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String nombreCompleto() {
        return nombre + " " + apellido;
    }

    public int edad() {
        return 2016 - nacimiento;
    }

    public float IMC() {
        return peso / (altura * altura);
    }

    public int getEdad() {
        return 2017 - nacimiento;
    }

    public boolean esMayorDeEdad() {
        return edad() >= 18;
    }
    
    public String getNombreCompleto() {
        return nombre + " " + apellido;
    }
    
    public String toString() {
        return nombreCompleto() + " - " + edad() + " años \n" + "peso: " + peso + " kg - altura: " + altura + " m";
    }
}

public class Cliente {
    
    protected int numero;
    protected String nombre;
    protected String telefono;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Cliente() {
    }

    public Cliente(int numero, String nombre, String telefono) {
        this.numero = numero;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Cliente{" + "numero=" + numero + ", nombre=" + nombre + ", telefono=" + telefono + '}';
    }
    
}

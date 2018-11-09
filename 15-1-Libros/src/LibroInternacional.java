public class LibroInternacional extends Libro {
    private int pais;

    public int getPais() {
        return pais;
    }

    public void setPais(int pais) {
        this.pais = pais;
    }

    public LibroInternacional() {
    }

    public LibroInternacional(int codigo, String descripcion, int stock, int tipo, float precio, int pais) {
        super(codigo, descripcion, stock, tipo, precio);
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "LibroInternacional{" + "pais=" + pais + '}';
    }

    @Override
    public float precioVenta() {
        return super.precioVenta() + getPrecio() * 0.2f;
    }
    
}

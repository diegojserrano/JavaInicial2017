public class LibroNacional extends Libro {
    private int provincia;

    public int getProvincia() {
        return provincia;
    }

    public void setProvincia(int provincia) {
        this.provincia = provincia;
    }

    public LibroNacional() {
    }

    public LibroNacional(int codigo, String descripcion, int stock, int tipo, float precio, int provincia) {
        super(codigo, descripcion, stock, tipo, precio);
        this.provincia = provincia;
    }

    @Override
    public String toString() {
        return "LibroNacional{" + "provincia=" + provincia + '}';
    }
    
}

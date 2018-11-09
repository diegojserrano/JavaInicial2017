public abstract class Libro {
    private int codigo;
    private String descripcion;
    private int stock;
    private int tipo;
    private float precio;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public Libro() {
    }

    public Libro(int codigo, String descripcion, int stock, int tipo, float precio) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.stock = stock;
        this.tipo = tipo;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Libro{" + "codigo=" + codigo + ", descripcion=" + descripcion + ", stock=" + stock + ", tipo=" + tipo + ", precio=" + precio + '}';
    }
    
    public float precioVenta() {
        float incremento = 0f;
        switch(tipo) {
            case 1: incremento = 40; break;
            case 2: incremento = 50; break;
            case 3: incremento = 60; break;
            case 4: incremento = 70; break;
        }
        return precio + incremento;
    }
}

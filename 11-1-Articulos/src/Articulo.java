public class Articulo {
    private int codigo;
    private String nombre;
    private float precio;
    private int stock;
    private String proveedor;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }
    
    public Articulo() {
        System.out.println("Creación de artículo");
    }

    public Articulo(int codigo, String nombre) {
        this();
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public Articulo(int codigo, String nombre, float precio, int stock, String proveedor) {
        this(codigo, nombre);
        this.precio = precio;
        this.stock = stock;
        this.proveedor = proveedor;
    }
    
}

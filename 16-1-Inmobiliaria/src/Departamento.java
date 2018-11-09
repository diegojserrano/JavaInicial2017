public class Departamento extends Inmueble {
    private String piso;
    private String numero;
    private float expensas;

    public String getPiso() {
        return piso;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public float getExpensas() {
        return expensas;
    }

    public void setExpensas(float expensas) {
        this.expensas = expensas;
    }

    public Departamento() {
    }

    public Departamento(float alquiler, int superficie, int habitaciones, String dirección, float impuestos, String piso, String departamento, float expensas) {
        super(alquiler, superficie, habitaciones, dirección, impuestos);
        this.piso = piso;
        this.numero = departamento;
        this.expensas = expensas;
    }

    @Override
    public float montoTotal() {
        return alquiler + impuestos + expensas;
    }

    String direccionCompleta() {
        return direccion + " " + piso + " " + numero;
    }
    
}

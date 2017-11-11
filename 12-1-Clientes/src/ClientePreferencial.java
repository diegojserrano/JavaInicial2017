public class ClientePreferencial extends Cliente {

    private String domicilio;
    private float saldo;

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public ClientePreferencial() {
    }

    public ClientePreferencial(int numero, String nombre, String telefono, String domicilio, float saldo) {
        super(numero, nombre, telefono);
        this.domicilio = domicilio;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "ClientePreferencial{" + super.toString() + ", domicilio=" + domicilio + ", saldo=" + saldo + '}';
    }
    
}

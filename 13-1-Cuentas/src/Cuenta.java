public abstract class Cuenta {
    private String cliente;
    private int numero;
    protected float saldo;

    public Cuenta(String cliente, int numero) {
        this.cliente = cliente;
        this.numero = numero;
        this.saldo = 0;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public float getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "cliente=" + cliente + ", numero=" + numero + ", saldo=" + saldo + '}';
    }
    
    public void depositar(float importe) {
        saldo += importe;
    }
    
    public abstract void extraer(float importe);
    
}

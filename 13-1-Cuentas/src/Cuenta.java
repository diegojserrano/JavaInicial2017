public abstract class Cuenta {
    private int numero;
    protected float saldo;

    public int getNumero() {
        return numero;
    }

    public float getSaldo() {
        return saldo;
    }
    public Cuenta(int numero) {
        this.numero = numero;
        this.saldo = 0;
    }

    public void depositar(float importe) {
        if (importe >= 0)
            saldo += importe;
    }
    
    public abstract void extraer(float importe);
    
    @Override
    public String toString() {
        return "Cuenta{" + "numero=" + numero + ", saldo=" + saldo + '}';
    }
    
}

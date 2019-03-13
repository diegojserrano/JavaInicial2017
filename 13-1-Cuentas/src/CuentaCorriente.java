public class CuentaCorriente extends Cuenta {
    
    private float limite;

    @Override
    public void extraer(float importe) {
        if (saldo + limite >= importe) {
            saldo -= importe;
        }
    }

    public CuentaCorriente(String cliente, int numero, float limite) {
        super(cliente, numero);
        this.limite = limite;
    }

    @Override
    public String toString() {
        return "CuentaCorriente{" + "limite=" + limite + '}';
    }
 
    
}

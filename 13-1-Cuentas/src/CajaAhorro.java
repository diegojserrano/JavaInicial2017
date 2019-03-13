public class CajaAhorro extends Cuenta {

    @Override
    public void extraer(float importe) {
        if (saldo >= importe) {
            saldo -= importe;
        }
    }

    public CajaAhorro(String cliente, int numero) {
        super(cliente, numero);
    }

    @Override
    public String toString() {
        return "CajaAhorro{" + '}';
    }
    
    
}

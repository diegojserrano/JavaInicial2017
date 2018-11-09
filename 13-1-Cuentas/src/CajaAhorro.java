public class CajaAhorro extends Cuenta {

    public CajaAhorro(int numero) {
        super(numero);
    }

    @Override
    public void extraer(float importe) {
        if (saldo >= importe)
            saldo -= importe;
    }

    @Override
    public String toString() {
        return "Soy una CajaAhorro{" + super.toString() + '}';
    }

    
}

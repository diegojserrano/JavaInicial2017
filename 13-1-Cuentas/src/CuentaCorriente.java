public class CuentaCorriente extends Cuenta {

    private float acuerdo;

    public float getAcuerdo() {
        return acuerdo;
    }

    public void setAcuerdo(float acuerdo) {
        this.acuerdo = acuerdo;
    }

    public CuentaCorriente(int numero, float limite) {
        super(numero);
        this.acuerdo = limite;
    }

    @Override
    public void extraer(float importe) {
        if (saldo - importe >= -acuerdo)
            saldo -= importe;
    }

    @Override
    public String toString() {
        return "Soy una CuentaCorriente{" + super.toString() + '}';
    }

    
}

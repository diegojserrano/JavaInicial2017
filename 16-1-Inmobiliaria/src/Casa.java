public class Casa extends Inmueble {
    public boolean tienePileta;

    public boolean isTienePileta() {
        return tienePileta;
    }

    public void setTienePileta(boolean tienePileta) {
        this.tienePileta = tienePileta;
    }

    public Casa() {    }

    public Casa(float alquiler, int superficie, int habitaciones, String dirección, float impuestos, boolean tienePileta) {
        super(alquiler, superficie, habitaciones, dirección, impuestos);
        this.tienePileta = tienePileta;
    }

    @Override
    public float montoTotal() {
        float total = alquiler + impuestos;
        if (tienePileta) total += 1000;
        return total;
    }        
}

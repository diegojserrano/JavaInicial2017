public abstract class Inmueble {
    protected float alquiler;
    protected int superficie;
    protected int habitaciones;
    protected String direccion;
    protected float impuestos;

    public float getAlquiler() {
        return alquiler;
    }

    public void setAlquiler(float alquiler) {
        this.alquiler = alquiler;
    }

    public int getSuperficie() {
        return superficie;
    }

    public void setSuperficie(int superficie) {
        this.superficie = superficie;
    }

    public int getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(int habitaciones) {
        this.habitaciones = habitaciones;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public float getImpuestos() {
        return impuestos;
    }

    public void setImpuestos(float impuestos) {
        this.impuestos = impuestos;
    }

    public Inmueble() {
    }

    public Inmueble(float alquiler, int superficie, int habitaciones, String dirección, float impuestos) {
        this.alquiler = alquiler;
        this.superficie = superficie;
        this.habitaciones = habitaciones;
        this.direccion = dirección;
        this.impuestos = impuestos;
    }
    
    public abstract float montoTotal();
}

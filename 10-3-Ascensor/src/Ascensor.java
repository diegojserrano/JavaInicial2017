public class Ascensor {
    private int pisoMinimo;
    private int pisoMaximo;
    private int capacidad;
    private int pisoActual;
    private int cantidadPersonas;

    public int getPisoMinimo() {
        return pisoMinimo;
    }

    public void setPisoMinimo(int pisoMinimo) {
        this.pisoMinimo = pisoMinimo;
    }

    public int getPisoMaximo() {
        return pisoMaximo;
    }

    public void setPisoMaximo(int pisoMaximo) {
        this.pisoMaximo = pisoMaximo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getPisoActual() {
        return pisoActual;
    }

    public int getCantidadPersonas() {
        return cantidadPersonas;
    }

    @Override
    public String toString() {
        return "El ascensor está en el piso " + pisoActual + " con " + cantidadPersonas + " personas adentro";
    }
    
    public boolean irAPiso(int nuevoPiso) {
        if (nuevoPiso >= pisoMinimo && nuevoPiso <= pisoMaximo)
        {    
            pisoActual = nuevoPiso;
            return true;
        }
        return false;        
    }
    
    public int subir(int quierenSubir) {
        if (quierenSubir <= 0) return -1;
        
        int suben = 0;
        if (quierenSubir + cantidadPersonas > capacidad)
            suben = capacidad - cantidadPersonas;
        else
            suben = quierenSubir;

        cantidadPersonas += suben;
        return suben;
    }
    
    public int bajar(int quierenBajar) {
        if (quierenBajar <= 0) return -1;
        
        int bajan = 0;
        if (quierenBajar <= cantidadPersonas)
            bajan = quierenBajar;
        else
            bajan = cantidadPersonas;
        
        cantidadPersonas -= bajan;
        
        return bajan;
    }
}

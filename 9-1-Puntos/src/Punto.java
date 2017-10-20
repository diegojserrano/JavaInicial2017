public class Punto {
    private float x;
    private float y;

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    
    public int cuadrante() {
        int cuad = 0;
        if (x == 0 || y == 0) {
            // Está en un eje o en el origen
            if (x == 0 && y == 0) {
                cuad = 0;
            } else if (x == 0) {
                cuad = -1;
            } else {
                cuad = -2;
            }
        } else {
            // Está en un cuadrante
            if (x > 0) {
                if (y > 0) {
                    cuad = 1;
                } else {
                    cuad = 4;
                }
            } else {
                if (y > 0) {
                    cuad = 2;
                } else {
                    cuad = 3;
                }
            }
        }
        return cuad;
    }
    
    public double distanciaOrigen() {
        return Math.sqrt(x*x + y*y);
    }
    
    public double distanciaPunto(Punto otro) {
        float difX = this.x - otro.x;
        float difY = this.y - otro.y;
        return Math.sqrt(difX*difX + difY*difY);
    }
    
    public void mover(float dx, float dy) {
        x += dx;
        y += dy;
    }
}

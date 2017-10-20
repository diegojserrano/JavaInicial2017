import java.util.Scanner;

public class Coordenadas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x, y, cuadrante;

        System.out.println("Ingrese las coordenadas x e y de un punto en el plano");
        x = sc.nextInt();
        y = sc.nextInt();

        if (x == 0 || y == 0) {
            // Está en un eje o en el origen
            if (x == 0 && y == 0) {
                System.out.println("Está en el origen");
            } else if (x == 0) {
                System.out.println("Está en el eje de las abcisas");
            } else {
                System.out.println("Está en el eje de las ordenadas");
            }
        } else {
            // Está en un cuadrante
            if (x > 0) {
                if (y > 0) {
                    cuadrante = 1;
                } else {
                    cuadrante = 4;
                }
            } else {
                if (y > 0) {
                    cuadrante = 2;
                } else {
                    cuadrante = 3;
                }
            }
            System.out.println("El punto se encuentra en el cuadrante " + cuadrante);
        }
    }
}


import java.util.Scanner;

public class Promedio {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x, c;
        int mayor, menor, suma;
        float promedio;

        mayor = menor = suma = 0;
        System.out.println("Ingrese 10 números");
        for (c = 0; c < 10; c++) {
            x = sc.nextInt();
            suma += x;
            if (c == 1) {
                mayor = menor = x;
            } else {
                if (x > mayor) {
                    mayor = x;
                } else if (x < menor) {
                    menor = x;
                }
            }
        }

        promedio = (float) suma / 10;
        System.out.println("Mayor: " + mayor);
        System.out.println("Menor: " + menor);
        System.out.println("Promedio: " + promedio);
    }
}

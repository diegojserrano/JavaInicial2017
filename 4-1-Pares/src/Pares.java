import java.util.Scanner;

public class Pares {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x;

        System.out.println("Ingrese números. Fin con 0");
        x = sc.nextInt();

        while (x != 0) {
            if (x % 2 == 0) {
                System.out.println("El número es par");
            }
            x = sc.nextInt();
        }
    }

}

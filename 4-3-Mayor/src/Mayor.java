import java.util.Scanner;

public class Mayor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x, mayor = 0;

        System.out.println("Ingrese números. Fin con 0");
        x = sc.nextInt();

        while (x != 0) {
            if (x > mayor) {
                mayor = x;
            }
            x = sc.nextInt();
        }
    }
}

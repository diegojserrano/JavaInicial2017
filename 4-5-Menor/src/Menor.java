import java.util.Scanner;

public class Menor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x, menor;

        System.out.println("Ingrese números. Fin con 0");
        x = sc.nextInt();
        menor = x;
        
        while (x != 0) {
            if (x < menor) {
                menor = x;
            }
            x = sc.nextInt();
        }
    }
}
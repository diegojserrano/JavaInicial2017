import java.util.Scanner;

public class Temperaturas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int temperatura;

        System.out.println("Ingrese temperaturas. Fin con 99");
        temperatura = sc.nextInt();

        while (temperatura != 99) {
            if (temperatura < 15) {
                System.out.println("FRIO!");
            }
            temperatura = sc.nextInt();
        }
    }
}

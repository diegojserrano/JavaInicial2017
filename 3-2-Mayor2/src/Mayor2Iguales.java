import java.util.Scanner;

public class Mayor2Iguales {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, mayor;

        System.out.println("Ingrese dos números");
        a = sc.nextInt();
        b = sc.nextInt();

        if (a == b) {
            System.out.println("Los números son iguales");
        } else {
            if (a > b) {
                mayor = a;
            } else {
                mayor = b;
            }

            System.out.println("El mayor es " + mayor);
        }
    }
}

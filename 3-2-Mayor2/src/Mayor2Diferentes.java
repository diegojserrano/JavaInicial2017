import java.util.Scanner;

public class Mayor2Diferentes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, mayor;

        System.out.println("Ingrese dos números diferentes");
        a = sc.nextInt();
        b = sc.nextInt();

        if (a > b) {
            mayor = a;
        } else {
            mayor = b;
        }

        System.out.println("El mayor es " + mayor);
    }
}

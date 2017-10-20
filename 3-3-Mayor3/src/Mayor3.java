import java.util.Scanner;

public class Mayor3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c, mayor;

        System.out.println("Ingrese tres números diferentes");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if (a > b && a > c) {
            mayor = a;
        } else if (b > c) {
            mayor = b;
        } else {
            mayor = c;
        }
        
        System.out.println("El mayor es " + mayor);
    }
}

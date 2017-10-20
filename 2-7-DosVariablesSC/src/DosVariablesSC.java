import java.util.Scanner;

public class DosVariablesSC {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a, b;
        
        System.out.println("Ingrese dos números");
        a = sc.nextInt();
        b = sc.nextInt();
        
        int suma = a + b;
        int diferencia = a - b;
        int producto = a * b;
        
        System.out.println("La suma es: " + suma);
        System.out.println("La diferencia es: " + diferencia);
        System.out.println("El producto es: " + producto);
    }
}

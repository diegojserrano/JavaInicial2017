import java.util.Scanner;

public class ValidacionNota {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nota;

        do {
            System.out.println("Ingrese una nota entre 1 y 10");
            nota = sc.nextInt();
        } while (nota < 1 || nota > 10);

        if (nota >= 4) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Reprobado");
        }
    }
}

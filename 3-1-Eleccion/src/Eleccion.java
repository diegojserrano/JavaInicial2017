import java.util.Scanner;

public class Eleccion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int votos1, votos2, total;
        float porcentaje1, porcentaje2;

        System.out.println("Ingrese la cantidad de votos del candidato 1");
        votos1 = sc.nextInt();

        System.out.println("Ingrese la cantidad de votos del candidato 2");
        votos2 = sc.nextInt();

        total = votos1 + votos2;

        porcentaje1 = (float) (votos1 * 100) / total;
        porcentaje2 = (float) (votos2 * 100) / total;

        System.out.println("Porcentaje del candidato 1: " + porcentaje1);
        System.out.println("Porcentaje del candidato 2: " + porcentaje2);
        if (votos1 > votos2)
            System.out.println("Ganador Candidato 1");
        else
            System.out.println("Ganador Candidato 2");
    }
    
}

import java.util.Scanner;

public class Alumnos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String nombre;
        int nota1, nota2, nota3, cantidad = 0;
        float promedio;
        
        System.out.println("Ingrese los datos de 5 alumnos");
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese nombre y tres notas");
            nombre = sc.nextLine();
            nota1 = sc.nextInt();
            nota2 = sc.nextInt();
            nota3 = sc.nextInt();
            sc.nextLine();
            
            promedio = (float) (nota1+nota2+nota3) / 3;
            if (promedio >= 7)
                cantidad++;
        }
        
        System.out.println("Hay " + cantidad + " alumnos con promedio >= 7");
    }
    
}

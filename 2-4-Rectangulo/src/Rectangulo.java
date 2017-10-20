import java.util.Scanner;

public class Rectangulo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float base, altura;
        float perimetro, superficie;

        System.out.println("Ingrese la base del rectángulo");
        base = sc.nextFloat();

        System.out.println("Ingrese la altura");
        altura = sc.nextFloat();
        
        superficie = base * altura;
        perimetro = 2 * (base + altura);
        
        System.out.println("El perimetro es de: " + perimetro);
        System.out.println("La superficie es de: " + superficie);        
    }
}

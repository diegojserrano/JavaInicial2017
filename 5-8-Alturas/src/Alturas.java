import java.util.Scanner;

public class Alturas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int altura, mayor = 0, menor = 0;
        
        System.out.println("Ingrese la altura de 10 personas");
        for (int i = 0; i < 10; i++) {
            altura = sc.nextInt();
            if (i == 0 || altura > mayor)
                mayor = altura;
            if (i == 0 || altura < menor)
                menor = altura;
        }
        
        System.out.println("La mayor altura es: " + mayor);
        System.out.println("La menor altura es: " + menor);
        
    }
    
}
import java.util.Scanner;

public class Pares {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int x, c;
        int cp, suma;
        cp = suma = 0;
        
        System.out.println("Ingrese 10 números");
        for (c = 0; c < 10; c++) {
            x = sc.nextInt();
            suma += x;
            if (x % 2 == 0)
                cp++;
            
        }
        
        System.out.println("Cantidad de pares: " + cp);
        System.out.println("Sumatoria de todos: " + suma);
    }    
}

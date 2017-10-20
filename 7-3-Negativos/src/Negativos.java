
import java.util.Scanner;

public class Negativos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int []v = new int[20];
        int cantidadNegativos = 0;
        
        System.out.println("Ingrese 20 números");
        for (int i = 0; i < v.length; i++) {
            v[i] = sc.nextInt();
        }
        
        for (int i = 0; i < v.length; i++) {
            if (v[i] < 0) cantidadNegativos++;
        }
        
        int []negativos = new int[cantidadNegativos];
        int j = 0;
        
        for (int i = 0; i < v.length; i++) {
            if (v[i] < 0) {
                negativos[j] = v[i];
                j++;
            }
        }
        
        System.out.println("Todos los negativos: ");
        for (int i = 0; i < negativos.length; i++) {
            System.out.println(negativos[i]);
        }
    }    
}


import java.util.Scanner;

public class Articulos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String []nombres = new String[5];
        float []precios = new float[5];
        int mayor, menor;
        
        System.out.println("Ingrese nombre y precio de 5 artículos");
        for (int i = 0; i < 5; i++) {
            nombres[i] = sc.nextLine();
            precios[i] = sc.nextFloat();
            sc.nextLine();
        }
        
        mayor = menor = 0;
        for (int i = 1; i < 5; i++) {
            if (precios[i] > precios[mayor])
                mayor = i;
            if (precios[i] < precios[menor])
                menor = i;
        }
        
        System.out.println("Nombre del más caro: " + nombres[mayor]);
        System.out.println("Y del más barato: " + nombres[menor]);
    }
}

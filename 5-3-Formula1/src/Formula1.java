import java.util.Scanner;

public class Formula1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int i, cantidad, tiempo_ganador, tiempo_corredor, tiempo_maximo;
        int cantidad_autorizados = 0;
        
        System.out.println("Ingrese el tiempo del ganador de la clasificación:");
        tiempo_ganador = sc.nextInt();
        
        tiempo_maximo = (int)(tiempo_ganador * 1.15);
        System.out.println("Ingrese la cantidad de corredores:");
        cantidad = sc.nextInt();
        
        for (i = 0; i < cantidad; i++) {
            tiempo_corredor = sc.nextInt();
            if (tiempo_corredor < tiempo_maximo)
                cantidad_autorizados++;
        }
        
        System.out.println("Cantidad de corredores autorizados: " + cantidad_autorizados);
    }    
}
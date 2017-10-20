import java.util.Scanner;

public class Vendedores {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        float venta, comision, suma = 0;
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese total vendedor: ");
            venta = sc.nextFloat();
            
            comision = venta * 0.02f;
            if (venta > 10000) comision += 500;
            suma += comision;
            
            System.out.println("La comision es de: " + comision);
        }
        
        System.out.println("Total de comisiones a pagar: " + suma);
    }
}
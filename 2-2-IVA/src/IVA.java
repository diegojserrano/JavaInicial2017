import java.util.Scanner;

public class IVA {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float precio, impuesto, total;
        
        System.out.println("Ingrese el precio del artículo");
        precio = sc.nextFloat();
        
        impuesto = precio * 0.21f;
        
        total = precio + impuesto;
        
        System.out.println("El precio con IVA es $" + total);
    }
    
}

import java.util.Scanner;


public class Factura {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        float precio1, precio2, precio3;
        int cantidad1, cantidad2, cantidad3;
        float subtotal1, subtotal2, subtotal3, total;
        
        System.out.println("Ingrese el precio del artículo 1");
        precio1 = sc.nextFloat();
        
        System.out.println("Ingrese la cantidad del artículo 1");
        cantidad1 = sc.nextInt();
        
        System.out.println("Ingrese el precio del artículo 2");
        precio2 = sc.nextFloat();
        
        System.out.println("Ingrese la cantidad del artículo 2");
        cantidad2 = sc.nextInt();
        
        System.out.println("Ingrese el precio del artículo 3");
        precio3 = sc.nextFloat();
        
        System.out.println("Ingrese la cantidad del artículo 3");
        cantidad3 = sc.nextInt();
        
        subtotal1 = precio1 * cantidad1;
        subtotal2 = precio2 * cantidad2;
        subtotal3 = precio3 * cantidad3;
        total = subtotal1 + subtotal2 + subtotal3;
        
        System.out.println("El total de la factura es de: $" + total);
    }
}

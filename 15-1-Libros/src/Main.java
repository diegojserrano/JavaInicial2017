
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Libro []v;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de libros");
        int n = sc.nextInt();
        
        v = new Libro[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el origen del libro (1- Nacional, 2-Internacional)");
            int origen = sc.nextInt();
            
            System.out.println("Ingrese el código");
            int codigo = sc.nextInt();
            
            System.out.println("Ingrese la descripción");
            sc.nextLine();
            String descripcion = sc.nextLine();
            
            System.out.println("Ingrese el tipo (1-Texto 2-Manual 3-Novela 4-Infantil)");
            int tipo = sc.nextInt();
            
            System.out.println("Ingrese el stock");
            int stock = sc.nextInt();
            
            System.out.println("Ingrese el precio de compra");
            float precio = sc.nextFloat();
            
            if (origen == 1)
            {
                System.out.println("Ingrese la provincia de origen (1-Cordoba 2-Santa Fe 3-Buenos Aires)");
                int provincia = sc.nextInt();
                
                v[i] = new LibroNacional(codigo, descripcion, stock, tipo, precio, provincia);
            }
            else
            {
                System.out.println("Ingrese el país de origen (1-Italia 2-Francia 3-Alemania)");
                int pais = sc.nextInt();
                
                v[i] = new LibroInternacional(codigo, descripcion, stock, tipo, precio, pais);
            }
        }
        
        System.out.println("Listado de precios de venta");
        for(Libro l: v){
            System.out.println(l.getCodigo() + " - " + l.getDescripcion() + ": $ " + l.precioVenta());
        }
        
        int stockInternacionales = 0;
        int c1, c2, c3, c4;
         
        c1 = c2 = c3 = c4 = 0;
        for(Libro l: v){
            if (l instanceof LibroInternacional) {
                stockInternacionales += l.getStock();
                switch(l.getTipo()) {
                    case 1: c1++; break;
                    case 2: c2++; break;
                    case 3: c3++; break;
                    case 4: c4++; break;
                }
            }
        }
        
        System.out.println("Stock de libros internacionales: " + stockInternacionales);
        System.out.println("Cantidad de libros internacionales por tipo");
        System.out.println("Libros de texto: " + c1);
        System.out.println("Manuales: " + c2);
        System.out.println("Novelas: " + c3);
        System.out.println("Infantiles: " + c4);
    }
    
}



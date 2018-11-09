import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Inmueble []v;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de inmuebles");
        int n = sc.nextInt();
        
        v = new Inmueble[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese tipo de inmueble (1- Casa, 2- Departamento)");
            int tipo = sc.nextInt();
            
            System.out.println("Ingrese la dirección");
            sc.nextLine();
            String direccion = sc.nextLine();
            
            System.out.println("Ingrese el precio del alquier");
            float alquiler = sc.nextFloat();
            
            System.out.println("Ingrese el importe de los impuestos");
            float impuestos = sc.nextFloat();
            
            System.out.println("Ingrese la superficie");
            int superficie = sc.nextInt();
            
            System.out.println("Ingrese la cantidad de habitaciones");
            int habitaciones = sc.nextInt();
            
            if (tipo == 1)
            {
                System.out.println("Ingrese 1 si tiene pileta y 0 si no");
                int pileta = sc.nextInt();
                
                v[i] = new Casa(alquiler, superficie, habitaciones, direccion, impuestos, pileta == 1);
            }
            else
            {
                System.out.println("Ingrese el importe de las expensas");
                float expensas = sc.nextFloat();
                
                System.out.println("Ingrese el piso");
                sc.nextLine();
                String piso = sc.nextLine();
                
                System.out.println("Ingrese el número");
                String depto = sc.nextLine();
                
                v[i] = new Departamento(alquiler, superficie, habitaciones, direccion, impuestos, piso, depto, expensas);
            }
        }
        
        float acumTotal = 0;
        for(Inmueble i: v){
            acumTotal += i.montoTotal();
        }
        float promedio = acumTotal / v.length;
        
        int cantidadCasas = 0;
        for (Inmueble i : v) {
            if (i instanceof Casa && i.getHabitaciones() == 2) 
                cantidadCasas++;
        }
        
        Departamento masCaro = null;
        for (Inmueble i: v) {
            if (i instanceof Departamento) {
                if (masCaro == null || i.getAlquiler() > masCaro.getAlquiler())
                    masCaro = (Departamento)i;
            }
        }
        
        System.out.println("Promedio de alquileres: " + promedio);
        System.out.println("Cantidad de casas con 2 habitaciones: " + cantidadCasas);
        System.out.println("Dirección del departamento más caro: " + masCaro.direccionCompleta());
    }
    
}
 
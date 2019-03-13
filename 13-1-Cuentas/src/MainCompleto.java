import java.util.Scanner;

public class MainCompleto {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String cliente;
        int numero;
        float limite;
        Cuenta v[];
        System.out.println("Ingrese la cantidad de cuentas");
        int cantidad = sc.nextInt();
        
        v = new Cuenta[cantidad];
        
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese tipo de cuenta: 1- Caja de ahorros | 2- Cuenta corriente ");
            int tipo = sc.nextInt();
            
            switch (tipo) {
                case 1:
                    //Cargar caja de ahorros
                    System.out.println("Ingrese nombre del cliente");
                    cliente = sc.next();
                    System.out.println("Ingrese número de cuenta");
                    numero = sc.nextInt();
                    
                    v[i] = new CajaAhorro(cliente, numero);
                    break;
                case 2: 
                    //Cargar cuenta corriente
                    System.out.println("Ingrese nombre del cliente");
                    cliente = sc.next();
                    System.out.println("Ingrese número de cuenta");
                    numero = sc.nextInt();
                    System.out.println("Ingrese límite de descubierto");
                    limite = sc.nextFloat();
                    
                    v[i] = new CuentaCorriente(cliente, numero, limite);
                    
            }
        }

        int opcion;
        float importe;
        
        System.out.println("Carga de operaciones");
        System.out.println("1- Depósito");
        System.out.println("2- Extracción");
        System.out.println("3- Salir");
        
        opcion = sc.nextInt();
        while (opcion != 3) {
        
            System.out.println("Ingrese número de cuenta");
            numero = sc.nextInt();
            System.out.println("Ingrese importe");
            importe = sc.nextFloat();
            Cuenta cuentaEncontrada = null;
            for (Cuenta c : v) {
                if (c.getNumero() == numero) {
                    cuentaEncontrada = c;
                    break;
                }
            }
            
            if (cuentaEncontrada != null) {
                switch (opcion) {
                    case 1: cuentaEncontrada.depositar(importe); break;
                    case 2: cuentaEncontrada.extraer(importe);
                }
            }
            else
            {
                System.out.println("No existe esa cuenta");
            }

            System.out.println("Carga de operaciones");
            System.out.println("1- Depósito");
            System.out.println("2- Extracción");
            System.out.println("3- Salir");

            opcion = sc.nextInt();
        }
        
        for (Cuenta c : v) {
            System.out.println(c.getNumero() + ": $ " + c.getSaldo());
        }
    }
}

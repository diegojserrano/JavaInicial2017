import java.util.Scanner;

public class Epec {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int consumo, categoria;
        float tarifa = 0;

        System.out.println("Ingrese la categoría (1, 2 o 3)");
        categoria = sc.nextInt();

        System.out.println("Ingrese el consumo");
        consumo = sc.nextInt();

        switch (categoria) {
            case 1:
                tarifa = 0.28f;
                break;
            case 2:
                tarifa = 0.32f;
                break;
            case 3:
                tarifa = 0.41f;
        }

        float subtotal = tarifa * consumo;
        float iva = subtotal * 0.21f;
        float total = subtotal + iva;

        if (categoria == 2 || categoria == 3) {
            System.out.println("Subtotal: $" + subtotal);
            System.out.println("IVA: $" + iva);
        }
        System.out.println("Total: $" + total);
    }
}

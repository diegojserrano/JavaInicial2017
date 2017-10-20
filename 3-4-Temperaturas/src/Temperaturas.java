import java.util.Scanner;

public class Temperaturas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int temp1, temp2, temp3, temp4;
        int mayor, menor;
        float promedio;

        System.out.println("Ingrese cuatro temperaturas");
        temp1 = sc.nextInt();
        temp2 = sc.nextInt();
        temp3 = sc.nextInt();
        temp4 = sc.nextInt();

        if (temp1 > temp2 && temp1 > temp3 && temp1 > temp4) {
            mayor = temp1;
        } else if (temp2 > temp3 && temp2 > temp4) {
            mayor = temp2;
        } else if (temp3 > temp4) {
            mayor = temp3;
        } else {
            mayor = temp4;
        }

        if (temp1 < temp2 && temp1 < temp3 && temp1 < temp4) {
            menor = temp1;
        } else if (temp2 < temp3 && temp2 < temp4) {
            menor = temp2;
        } else if (temp3 < temp4) {
            menor = temp3;
        } else {
            menor = temp4;
        }

        promedio = (temp1 + temp2 + temp3 + temp4) / 4f;

        System.out.println("Mayor temperatura: " + mayor);
        System.out.println("Menor temperatura: " + menor);
        System.out.println("Promedio: " + promedio);
        
        System.out.println("Temperaturas mayores que el promedio");
        if (temp1 > promedio) {
            System.out.println(temp1);
        }
        if (temp2 > promedio) {
            System.out.println(temp2);
        }
        if (temp3 > promedio) {
            System.out.println(temp3);
        }
        if (temp4 > promedio) {
            System.out.println(temp4);
        }
    }
}

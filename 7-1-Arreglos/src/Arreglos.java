import java.util.Scanner;

public class Arreglos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int []v;
        int tamaño, cantidadMenor10, sumaPares;
        boolean ingreso5 = false; 
        
        System.out.println("Ingrese la cantidad de números");
        tamaño = sc.nextInt();
        v = new int[tamaño];
        
        System.out.println("Ingrese los números");
        for (int i = 0; i < v.length; i++) {
            v[i] = sc.nextInt();
        }
        
        cantidadMenor10 = sumaPares = 0;
        for (int i = 0; i < v.length; i++) {
            if (v[i] < 10) cantidadMenor10 ++;
            if (v[i] % 2 == 0) sumaPares += v[i];
            if (v[i] == 5) ingreso5 = true;
        }
        System.out.println("Cantidad de menores a 10: " + cantidadMenor10);
        System.out.println("Suma de los pares: " + sumaPares);
        if (ingreso5) 
            System.out.println("Ingresó el 5");
        else 
            System.out.println("No ingresó el 5");
    }
}
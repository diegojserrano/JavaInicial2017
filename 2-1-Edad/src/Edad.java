import java.util.Scanner;

public class Edad {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nacimiento, edad;
        
        System.out.println("Ingrese su año de nacimiento");
        nacimiento = sc.nextInt();
        
        edad = 2016 - nacimiento;
        
        System.out.println("A fin de año ud. tendrá " + edad + " años");
    }    
}

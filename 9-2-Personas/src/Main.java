
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Persona per = new Persona();

        System.out.println("Ingrese nombre, apellido, año de nacimiento, peso y altura de una persona");

        per.setNombre(sc.next());
        per.setApellido(sc.next());
        per.setNacimiento(sc.nextInt());
        per.setPeso(sc.nextInt());
        per.setAltura(sc.nextFloat());

        System.out.println("Tiene " + per.edad() + " años");
        if (per.esMayorDeEdad()) 
            System.out.println("Es mayor de edad");
        else
            System.out.println("No es mayor de edad");
        System.out.println("IMC = " + per.IMC());
        
        
        
        System.out.println("Datos completos: ");
        System.out.println(per);
    }
}


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Persona per1 = new Persona();
        Persona per2 = new Persona();
        Persona per3 = new Persona();

        System.out.println("Ingrese nombre, apellido, edad, documento y altura de tres personas");

        System.out.println("Ingrese los datos de la persona 1");
        per1.setNombre(sc.next());
        per1.setApellido(sc.next());
        per1.setEdad(sc.nextInt());
        per1.setDocumento(sc.nextInt());
        per1.setAltura(sc.nextFloat());

        System.out.println("Ingrese los datos de la persona 2");
        per2.setNombre(sc.next());
        per2.setApellido(sc.next());
        per2.setEdad(sc.nextInt());
        per2.setDocumento(sc.nextInt());
        per2.setAltura(sc.nextFloat());

        System.out.println("Ingrese los datos de la persona 3");
        per3.setNombre(sc.next());
        per3.setApellido(sc.next());
        per3.setEdad(sc.nextInt());
        per3.setDocumento(sc.nextInt());
        per3.setAltura(sc.nextFloat());

        Persona mayor = null;

        if (per1.getAltura() > per2.getAltura()) {
            mayor = per1;
        } else {
            mayor = per2;
        }
        if (per3.getAltura() > mayor.getAltura()) {
            mayor = per3;
        }

        System.out.println("La persona más alta es: " + mayor.getNombre() + " " + mayor.getApellido());
    }
}

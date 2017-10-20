
import java.util.Scanner;


public class Principal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        Persona per1 = new Persona();
        Persona per2 = new Persona();
        Persona per3 = new Persona();

        System.out.println("Ingrese los datos de una persona");

        per1.setNombre(sc.next());
        per1.setApellido(sc.next());
        per1.setNacimiento(sc.nextInt());
        per1.setAltura(sc.nextFloat());
        
        System.out.println("Ingrese los datos de una persona");

        per2.setNombre(sc.next());
        per2.setApellido(sc.next());
        per2.setNacimiento(sc.nextInt());
        per2.setAltura(sc.nextFloat());
        
        System.out.println("Ingrese los datos de una persona");

        per3.setNombre(sc.next());
        per3.setApellido(sc.next());
        per3.setNacimiento(sc.nextInt());
        per3.setAltura(sc.nextFloat());
        
        System.out.println(per1.getNombreCompleto() + " " + per1.getEdad());
        System.out.println(per2.getNombreCompleto() + " " + per2.getEdad());
        System.out.println(per3.getNombreCompleto() + " " + per3.getEdad());
        
        Persona mayorAltura;
        
        if (per1.getAltura() > per2.getAltura())
            mayorAltura = per1;
        else
            mayorAltura = per2;
        
        if (per3.getAltura() > mayorAltura.getAltura())
            mayorAltura = per3;

        Persona mayorEdad;
        
        if (per1.getEdad() > per2.getEdad())
            mayorEdad = per1;
        else
            mayorEdad = per2;
        
        if (per3.getEdad() > mayorEdad.getEdad())
            mayorEdad = per3;

        System.out.println("La persona más alta es: " + mayorAltura.getNombreCompleto());
        System.out.println("La persona más grande es: " + mayorEdad.getNombreCompleto());
        
        if (mayorAltura == mayorEdad)
            System.out.println("La persona más alta es la más grande");
        else
            System.out.println("La persona más alta no es la más grande");
    }

}

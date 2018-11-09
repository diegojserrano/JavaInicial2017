
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de alumnos");
        int cantidad = sc.nextInt();
        
        Alumno [] v= new Alumno[cantidad];
        
        for (int i = 0; i < cantidad; i++) {
            v[i] = new Alumno();
            
            System.out.println("Ingrese nombre del alumno " + (i+1));
            v[i].setNombre(sc.next());
            
            System.out.println("Ingrese legajo");
            v[i].setLegajo(sc.nextInt());
            
            System.out.println("Ingrese tres notas");
            v[i].setNota1(sc.nextInt());
            v[i].setNota2(sc.nextInt());
            v[i].setNota3(sc.nextInt());
            
            System.out.println("Ingrese cantidad de asistencias");
            v[i].setAsistencias(sc.nextInt());

            System.out.println("Ingrese cantidad de faltas");
            v[i].setFaltas(sc.nextInt());
        }
        
        System.out.println("Listado de alumnos");
        for (Alumno a : v) {
            System.out.println(a);
        }
        
    }
    
}

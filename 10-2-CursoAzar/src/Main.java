
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        
        String nombreCurso;
        int cantidadAlumnos;
        Alumno[] alumnos;

        System.out.println("Ingrese el nombre del curso");
        nombreCurso = sc.next();
        System.out.println("Ingrese la cantidad de alumnos");
        cantidadAlumnos = sc.nextInt();
        
        alumnos = new Alumno[cantidadAlumnos];
        for (int i = 0; i < alumnos.length; i++) {
            String nombre = NombresAzar.nombreApellido();
            int legajo = r.nextInt(1000);
            float promedio = r.nextFloat()*10;

            alumnos[i] = new Alumno(nombre, legajo, promedio);
        }

        System.out.println("Listado de alumnos ingresados");
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println(alumnos[i]);
        }

        float suma = 0;
        int cantidadMayor8 = 0;

        for (Alumno a : alumnos) {
            suma += a.getPromedio();
            if (a.getPromedio() > 8) {
                cantidadMayor8++;
            }
        }

        float promedio = suma / alumnos.length;

        System.out.println("El promedio general del curso es: " + promedio);
        System.out.println("Hay " + cantidadMayor8 + " alumnos con promedio > 8");
    }
}

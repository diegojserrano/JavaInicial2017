
import java.util.Random;

public class NombresAzar {

    private static String[] nombres = {
        "Maria",
        "Natalia",
        "Laura",
        "Belen",
        "Eugenia",
        "Florencia",
        "Soledad",
        "Jose",
        "Fernanda",
        "Cecilia",
        "Miguel",
        "Juan",
        "Luis",
        "Carlos",
        "Julio",
        "Jorge",
        "Manuel",
        "Pablo"};

    private static String[] apellidos = {
        "Diaz",
        "Sanchez",
        "Alvarez",
        "Romero",
        "Sosa",
        "Ruiz",
        "Torres",
        "Suarez",
        "Castro",
        "Gimenez",
        "Vazquez",
        "Acosta",
        "Gutierrez",
        "Pereyra",
        "Ramirez",
        "Flores",
        "Benitez",
        "Aguirre",
        "Molina",
        "Ortiz",
        "Medina",
        "Herrera",
        "Dominguez",
        "Martin",
        "Moreno",
        "Rojas",
        "Blanco",
        "Quiroga",
        "Cabrera",
        "Ferreyra",
        "Peralta",
        "Alonso",
        "Silva",
        "Morales",
        "Luna",
        "Mendez",
        "Ramos",
        "Rios",
        "Arias",
        "Muñoz",
        "Godoy",
        "Vega",
        "Rossi",
        "Navarro"};

    private final static Random r = new Random();

    public static String nombre() {
        int i = r.nextInt(nombres.length);

        return nombres[i];
    }

    public static String apellido() {
        int i = r.nextInt(apellidos.length);

        return apellidos[i];
    }

    public static String nombreApellido() {
        return nombre() + " " + apellido();
    }
}

public class Main {

    public static void main(String[] args) {

        Persona per1 = new Persona();
        Persona per2 = new Persona();
        
        per1.nombre = "Juan";
        per1.edad = 23;
        
        per2.nombre = "Maria";
        per2.edad = 20;
        
        
        System.out.println(per1.nombre + " " + per1.edad);
        System.out.println(per2.nombre + " " + per2.edad);
    }
}
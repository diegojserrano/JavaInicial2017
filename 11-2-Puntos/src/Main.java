public class Main {

    public static void main(String[] args) {
        
        Punto A = new Punto();
        Punto B = new Punto();
        
        A.setX(1);
        A.setY(2.5f);
        B.setX(3);
        B.setY(2);
        
        System.out.println(A.distancia());
        System.out.println(A.distancia(B));
    }
}
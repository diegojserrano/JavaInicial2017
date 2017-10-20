public class Figuras {

    public static void main(String[] args) {
        int i, j;
        
        System.out.println("Figura 1");

        for (i = 0; i < 4; i++) {
            for (j = 0; j < 6; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        System.out.println("");
        
        System.out.println("Figura 2");

        for (i = 0; i < 4; i++) {
            if (i % 2 != 0) System.out.print(" ");
            for (j = 0; j < 6; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        System.out.println("");
        
        System.out.println("Figura 3");

        for (i = 0; i < 4; i++) {
            for (j = 0; j < i+1; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        System.out.println("");
        
        System.out.println("Figura 4");

        for (i = 0; i < 4; i++) {
            for (j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (j = i; j < 4; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}

import java.util.Random;

public class Aleatorio {

    public static void main(String[] args) {

        Random r = new Random();

        for (int i = 0; i < 30; i++) {
            System.out.println(r.nextInt(100));
        }
    }
}

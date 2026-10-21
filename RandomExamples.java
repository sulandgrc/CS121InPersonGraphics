import java.util.Random;

public class RandomExamples {

    public static void main(String[] args) {
        Random rand = new Random();

        for (int i = 0; i < 15; i++) {
            // generate 5,6,7,8,9 or 10
            //min, max
            int num = rand.nextInt(5, 11);
            System.out.print(num + " ");
        }
    }
    
}

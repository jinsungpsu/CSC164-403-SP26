import java.util.Random;

public class RandomNums {
    public static void main(String[] args) {
        Random random = new Random();
        // 0 to 4 (upper bound is exclusive)
        int randomNumber = random.nextInt(0, 5);

        int[] randomNumbers = new int[10];
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = random.nextInt(5, 25);
            // 5 to 24
        }
    }
}

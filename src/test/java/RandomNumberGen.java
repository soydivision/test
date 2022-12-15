import java.util.Random;

public class RandomNumberGen {
    public static int getRandomNumber(int min, int max) {
        Random random = new Random();
        return (Integer) random.nextInt(max - min) + min;
    }
}

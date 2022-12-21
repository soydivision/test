package utils;

import java.util.Random;

public class RandomNumberGen {
    public static Integer getRandomNumber(int min, int max) {
        Random random = new Random();
        return (Integer) random.nextInt(max - min) + min;
    }

    public static String getRandomNumberAsFormattedString(int min, int max, int desiredNumberOfDigits) {
        Random random = new Random();
        int number = random.nextInt(max - min) + min;
        String numberOfDigits = "%0" + desiredNumberOfDigits + "d";
        return String.format(numberOfDigits, number);
    }


    public static void main(String[] args) {
        System.out.println(getRandomNumberAsFormattedString(0, 99, 3));
    }
}

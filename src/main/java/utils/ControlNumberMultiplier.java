package utils;

import java.util.Arrays;

public class ControlNumberMultiplier {
    static int[] controlMultiplicationNumber = new int[]{2, 7, 9, 1, 4, 6, 3, 5, 8, 2, 7, 9};

    public static int[] convertStringToCharArray(String input) {
        char[] digits = input.toCharArray();
        int[] arrayOfValues = new int[12];
        for (int i = 0; i < digits.length; i++) {
            arrayOfValues[i] = Integer.parseInt(String.valueOf(digits[i])) * controlMultiplicationNumber[i];
        }
        return arrayOfValues;
    }

    public static int findArraySum(int[] array) {
        return Arrays.stream(array).sum();
    }

    public static int countLastDigit(String CNP) {
        int summ = findArraySum(convertStringToCharArray(CNP));
        int remainder = summ % 11;
        return (remainder == 10) ? 1 : remainder;
    }
}


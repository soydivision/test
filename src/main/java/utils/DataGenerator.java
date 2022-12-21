package utils;

import java.time.LocalDate;

public class DataGenerator {

    public static String generateCNP() {
        StringBuilder CNP = new StringBuilder(13);
        RandomDate rd = new RandomDate();
        RandomSex randomSex = new RandomSex();
        DateToCNPConverter converter = new DateToCNPConverter();

        LocalDate dateOfBirth = rd.getRandomDate();
        String sex = randomSex.getRandomSex();

        CNP.append(converter.getFirstDigit(dateOfBirth, sex));
        CNP.append(String.valueOf(dateOfBirth.getYear()).substring(2));
        CNP.append(converter.getFormattedValue(dateOfBirth.getMonthValue(), 2));
        CNP.append(converter.getFormattedValue(dateOfBirth.getDayOfMonth(), 2));
        CNP.append(RandomNumberGen.getRandomNumberAsFormattedString(0, 52, 2));
        CNP.append(RandomNumberGen.getRandomNumberAsFormattedString(0, 999, 3));
        ControlNumberMultiplier.countLastDigit(CNP.toString());
        CNP.append(ControlNumberMultiplier.countLastDigit(CNP.toString()));
        System.out.println(CNP);
        return CNP.toString();
    }
}

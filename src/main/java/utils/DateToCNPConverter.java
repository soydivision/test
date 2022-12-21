package utils;

import java.time.LocalDate;

public class DateToCNPConverter {


    public static int getFirstDigit(LocalDate localDate, String sex) {
        LocalDate nineteenthCenturyStart = LocalDate.parse("1800-01-01");
        LocalDate nineteenthCenturyEnd = LocalDate.parse("1899-12-31");

        LocalDate twentiethCenturyStart = LocalDate.parse("1900-01-01");
        LocalDate twentiethCenturyEnd = LocalDate.parse("1999-12-31");

        LocalDate twentyFirstCenturyStart = LocalDate.parse("2000-01-01");
        LocalDate twentyFirstCenturyEnd = LocalDate.parse("2099-12-31");
        int result = 0;

        if (localDate.isAfter(nineteenthCenturyStart) & localDate.isBefore(nineteenthCenturyEnd) & sex.equals("male")) {
            result = 3;
        } else if (localDate.isAfter(twentiethCenturyStart) & localDate.isBefore(twentiethCenturyEnd) & sex.equals("male")) {
            result = 1;
        } else if (localDate.isAfter(twentyFirstCenturyStart) & localDate.isBefore(twentyFirstCenturyEnd) & sex.equals("male")) {
            result = 5;
        } else if (localDate.isAfter(nineteenthCenturyStart) & localDate.isBefore(nineteenthCenturyEnd) & sex.equals("female")) {
            result = 4;
        } else if (localDate.isAfter(twentiethCenturyStart) & localDate.isBefore(twentiethCenturyEnd) & sex.equals("female")) {
            result = 2;
        } else if (localDate.isAfter(twentyFirstCenturyStart) & localDate.isBefore(twentyFirstCenturyEnd) & sex.equals("female")) {
            result = 6;
        }
        return result;
    }

    public static String getFormattedValue(int value, int desiredNumberOfDigits) {
        String numberOfDigits = "%0" + desiredNumberOfDigits + "d";
        return String.format(numberOfDigits, value);
    }
}

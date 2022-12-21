package utils;

import java.time.LocalDate;
import java.util.Random;

public class RandomDate {
    private final LocalDate MIN_Date = LocalDate.of(1800, 1, 1);
    private final LocalDate MAX_Date = LocalDate.now();
    private final Random random = new Random();

    public LocalDate getRandomDate() {
        int minDay = (int) MIN_Date.toEpochDay();
        int maxDay = (int) MAX_Date.toEpochDay();
        long randomDay = minDay + random.nextInt(maxDay - minDay);
        return LocalDate.ofEpochDay(randomDay);
    }

    @Override
    public String toString() {
        return "RandomDate{" +
                "maxDate=" + MAX_Date +
                ", minDate=" + MIN_Date +
                '}';
    }
}

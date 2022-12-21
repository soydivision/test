package utils;

import java.util.Random;

public class RandomSex {
    String[] sex = {"male", "female"};

    public String getRandomSex() {
        Random random = new Random();
        int randomIndex = random.nextInt(sex.length);
        return sex[randomIndex];
    }
}

package Assignment5.prob1;

import java.util.Random;

public class RandomNumber {
    public static String getSevenDigitNumber() {
        Random random = new Random();
        StringBuilder randomNumber = new StringBuilder();
        for (int i = 0; i < 7; i++) {
            int digit = random.nextInt(10);
            randomNumber.append(digit);
        }
        return randomNumber.toString();
    }
}

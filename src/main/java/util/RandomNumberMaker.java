package util;

import java.util.Random;

public class RandomNumberMaker {
    private final static int MIN_NUMBER = 0;
    private final static int MAX_NUMBER = 10

    public static int getRandomNumber() {
        Random random = new Random();
        return (random.nextInt(MAX_NUMBER) + MIN_NUMBER);
    }
}

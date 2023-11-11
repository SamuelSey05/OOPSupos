package HiLoGame;

import java.util.Random;

public class Randomizer {
    public static int generateRan(int max) {
        Random rand = new Random();

        return (rand.nextInt(max) + 1);
    }
}
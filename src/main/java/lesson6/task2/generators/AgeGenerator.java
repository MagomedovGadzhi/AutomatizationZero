package lesson6.task2.generators;

import java.util.Random;

public class AgeGenerator {
    public static int generate() {
        return new Random().nextInt(56) + 20;
    }
}
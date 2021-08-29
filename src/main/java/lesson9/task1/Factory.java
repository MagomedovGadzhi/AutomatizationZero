package lesson9.task1;

import lesson9.task1.cars.*;

import java.util.Random;

public class Factory {
    public static Car make() {
        int random = new Random().nextInt(101);
        if (random <= 40) return new Renault();
        else if (random > 40 && random <= 70) return new Nissan();
        else if (random > 70 && random <= 90) return new Mitsubishi();
        else if (random > 90 && random <= 100) return new Mercedes();
        throw new IllegalArgumentException();
    }
}
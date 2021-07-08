package lesson7.task2;

import java.util.Random;

public class Passport {
    int series;
    int number;

    Passport() {
        series = new Random().nextInt(9999) + 1;
        number = new Random().nextInt(999999) + 1;
    }
}
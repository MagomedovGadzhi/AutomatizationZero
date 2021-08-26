package lesson8.task2;

import java.util.Random;

public class Persons {
    protected int birthDate;

    public Persons(int birthDate) {
        this.birthDate = new Random().nextInt(365) + 1;
    }
}
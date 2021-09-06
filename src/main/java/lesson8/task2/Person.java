package lesson8.task2;

import java.util.Objects;
import java.util.Random;

public class Person {
    private int birthDate;

    public Person() {
        this.birthDate = new Random().nextInt(365) + 1;
    }

    public int getBirthDate() {
        return birthDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(birthDate, person.birthDate);
    }

    @Override
    public int hashCode() {
        return birthDate;
    }
}
package lesson8.task1;

import java.util.Objects;
import java.util.Random;

public class Person {
    protected String firstName;
    protected String lastName;

    public Person() {
        this.firstName = "Имя-" + (new Random().nextInt(20) + 1);
        this.lastName = "Фамилия-" + (new Random().nextInt(20) + 1);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(firstName, person.firstName) &&
                Objects.equals(lastName, person.lastName);
    }

    @Override
    public int hashCode() {
        int result = lastName != null ? lastName.hashCode() : 0;
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Фамилия: " + lastName +
                ", Имя: " + firstName;
    }
}
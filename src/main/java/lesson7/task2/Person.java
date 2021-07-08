package lesson7.task2;

import lesson6.task4.NameGenerator;

public class Person {
    String firstName;
    String lastName;

    Person() {
        firstName = NameGenerator.generate();
        lastName = NameGenerator.generate();
    }
}
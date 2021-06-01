package lesson4.task4;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Human {
    private String lastName;
    private String firstName;
    private int age;
    private Passport passport;

    //сеттеры
    public Human setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public Human setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public Human setAge(int age) {
        this.age = age;
        return this;
    }

    public Human setPassport(Passport passport) {
        if (passport.getSeries() == null) {
            System.out.println("Ошибка. Паспорт не привязан, т.к. серия паспорта не указана");
        } else if (passport.getNumber() == null) {
            System.out.println("Ошибка. Паспорт не привязан, т.к. номер паспорта не указан");
        } else {
            this.passport = passport;
            System.out.println("Паспорт привязан.");
        }
        return this;
    }

    //геттеры
    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }

    public Passport getPassport() {
        return passport;
    }
}
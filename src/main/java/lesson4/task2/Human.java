package lesson4.task2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Human {
    private String lastName;
    private String firstName;
    private Date birthDate;

    private final String LAST_NAME = "фамилии";
    private final String FIRST_NAME = "имени";
    private final String BIRTH_DATE = "даты рождения";
    private final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd.MM.yyyy");

    //сеттеры
    public Human setLastName(String lastName) {
        if (lastName.matches("^[А-Я][а-я]{2,}$")) {
            this.lastName = lastName;
            setCorrectPrint(LAST_NAME, lastName);
        } else {
            setIncorrectPrint(lastName);
        }
        return this;
    }

    public Human setFirstName(String firstName) {
        if (firstName.matches("^[А-Я][а-я]{2,}$")) {
            this.firstName = firstName;
            setCorrectPrint(FIRST_NAME, firstName);
        } else {
            setIncorrectPrint(firstName);
        }
        return this;
    }

    public Human setBirthDate(Date birthDate) {
        Date today = new Date();
        if (birthDate.before(today)) {
            this.birthDate = birthDate;
            setCorrectPrint(BIRTH_DATE, DATE_FORMAT.format(birthDate));
        } else {
            setIncorrectPrint(DATE_FORMAT.format(birthDate));
        }
        return this;
    }

    //геттеры
    public String getLastName() {
        getPrint(LAST_NAME, lastName);
        return lastName;
    }

    public String getFirstName() {
        getPrint(FIRST_NAME, firstName);
        return firstName;
    }

    public Date getBirthDate() {
        String date;
        if (birthDate != null) {
            date = DATE_FORMAT.format(birthDate);
        } else {
            date = null;
        }
        getPrint(BIRTH_DATE, date);
        return birthDate;
    }

    private void getPrint(String fieldType, String value) {
        System.out.printf("Получено значение %s: %s%n", fieldType, value);
    }

    private void setCorrectPrint(String fieldType, String value) {
        System.out.printf("Установлено корректное значение %s: %s%n", fieldType, value);
    }

    private void setIncorrectPrint(String value) {
        System.out.printf("Введённое значение некорректно: %s%n", value);
    }
}
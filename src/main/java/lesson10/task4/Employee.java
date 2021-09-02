package lesson10.task4;

import java.util.Random;

public class Employee implements Generatable {
    private String firstName;
    private String lastName;
    private Passport passport;
    private Double salary;

    public Double getSalary() {
        return salary;
    }

    public Employee() {
        this.generate();
    }

    @Override
    public Employee generate() {
        this.firstName = StringGenerator.generateString(Property.EMPLOYEE_FIRSTNAME_LENGTH, Property.EMPLOYEE_NAME_PATTERN);
        this.lastName = StringGenerator.generateString(Property.EMPLOYEE_LASTNAME_LENGTH, Property.EMPLOYEE_NAME_PATTERN);
        this.passport = new Passport();
        this.salary = new Random().nextDouble() * (Property.EMPLOYEE_SALARY_MAX - Property.EMPLOYEE_SALARY_MIN) + Property.EMPLOYEE_SALARY_MIN;
        return this;
    }

    @Override
    public String toString() {
        return String.format("%s %s, %s, %.2f", firstName, lastName, passport, salary);
    }
}
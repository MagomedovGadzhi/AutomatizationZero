package lesson11.task4;

import java.util.List;

// создал для проверки кода
public class Application {
    public static void main(String[] args) {
        List<Person> persons;
        persons = FileHelper.getPersonsFromExcel("src\\main\\java\\lesson11\\task4\\persons.xlsx", "Persons1");
        for (Person person : persons) {
            System.out.println(person);
        }
    }
}
package lesson4.task1;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Application {
    public static void main(String[] args) throws ParseException {
        Human human = new Human();
        human.setLastName("Иванов");
        human.setFirstName("Иван");
        human.setBirthDate(SIMPLE_DATE_FORMAT.parse("01.01.1990"));
        human.getLastName();
        human.getFirstName();
        human.getBirthDate();
    }

    private final static SimpleDateFormat SIMPLE_DATE_FORMAT = new SimpleDateFormat("dd.MM.yyyy");
}
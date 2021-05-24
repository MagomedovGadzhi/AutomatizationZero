package lesson4.task1;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Application {
    public static void main(String[] args) throws ParseException {
        Human human = new Human();
        human.setLastName("Иванов");
        human.setFirstName("Иван");
        human.setBirthDate(simpleDateFormat.parse("01.01.1990"));
        human.getLastName();
        human.getFirstName();
        human.getBirthDate();
    }

    private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");
}
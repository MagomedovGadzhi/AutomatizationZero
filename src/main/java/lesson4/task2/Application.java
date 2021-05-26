package lesson4.task2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.io.*;

public class Application {
    private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");

    public static void main(String[] args) throws IOException, ParseException {
        Human[] humans = new Human[] {new Human(), new Human(), new Human()};
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //Вариант 1.
        System.out.println("Введите Фамилию, Имя и дату рождения в формате [%s %s %s]:");
        do {
            for (int i = 0; i < 3; i++) {
                String inputLine;
                do {
                    inputLine = reader.readLine();
                    if (Validator.validateStringForSpaces(inputLine)) {
                        String[] lines = Validator.stringToArray(inputLine);
                        humans[i].setLastName(lines[0])
                                .setFirstName(lines[1])
                                .setBirthDate(simpleDateFormat.parse(lines[2]));
                    }
                } while (!Validator.validateHuman(humans[i]));
            }
        } while (Validator.validateHumanArray(humans));
        reader.close();
    }
    /*  Вариант 2, без класса Validator, т.к. в условия не сказано что его обязательно использовать.))
            for (int i = 0; i < 3; i++) {
                do {
                    humans[i].setLastName(reader.readLine());
                } while (humans[i].getLastName() == null);
                do {
                    humans[i].setFirstName(reader.readLine());
                } while (humans[i].getFirstName() == null);
                do {
                    humans[i].setBirthDate(simpleDateFormat.parse(reader.readLine()));
                } while (humans[i].getBirthDate() == null);
            }
    */
}
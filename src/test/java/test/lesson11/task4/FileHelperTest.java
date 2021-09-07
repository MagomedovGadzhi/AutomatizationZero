package test.lesson11.task4;

import lesson11.task4.FileHelper;
import lesson11.task4.Passport;
import lesson11.task4.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class FileHelperTest {
    public static final String PATH = "src\\main\\java\\lesson11\\task4\\persons.xlsx";
    public static final String INVALID_PATH = "src\\main\\java\\lesson11\\task4444\\persons.xlsx";

    public Date parseStringToDate(String string) throws ParseException {
        return new SimpleDateFormat("DD.mm.yyyy").parse(string);
    }

    @Test
    @DisplayName("Проверка парсинга листа Persons1")
    public void getPersonsFromExcelTest() throws ParseException {
        List<Person> persons = FileHelper.getPersonsFromExcel(PATH, "Persons1");

        List<Person> expectedPersons = Arrays.asList(
                new Person("Иванов", "Владимир", "Михайлович", parseStringToDate("14.01.1990"), new Passport(4510, 155442)),
                new Person("Петров", "Михаил", "Валерьевич", parseStringToDate("12.06.1984"), new Passport(4511, 523533)),
                new Person("Васильев", "Валерий", "Александрович", parseStringToDate("17.12.1991"), new Passport(4512, 325235)),
                new Person("Михайлов", "Константин", "Игоревич", parseStringToDate("18.05.1972"), new Passport(4500, 535344)),
                new Person("Александрова", "Мария", "Сергеевна", parseStringToDate("19.11.1985"), new Passport(4502, 154333)),
                new Person("Кузнецов", "Сергей", "Николаевич", parseStringToDate("17.07.1978"), new Passport(4504, 532212))
        );

        Assertions.assertNotNull(persons);
        Assertions.assertEquals(expectedPersons.size(), persons.size());
        for (int i = 0; i < persons.size(); i++) {
            Assertions.assertEquals(expectedPersons.get(i), persons.get(i));
        }
    }

    @Test
    @DisplayName("Проверка парсинга листа Persons2")
    void getPersonsFromSheet2Test() throws ParseException {
        List<Person> persons = FileHelper.getPersonsFromExcel(PATH, "Persons2");

        List<Person> expectedPersons = Arrays.asList(
                new Person("Иванов", "Владимир", "Михайлович", parseStringToDate("14.01.1990"), new Passport(4510, 155442)),
                new Person("Петров", "Михаил", "Валерьевич", parseStringToDate("12.06.1984"), new Passport(4511, 523533)),
                new Person("Васильев", "Валерий", "Александрович", parseStringToDate("17.12.1991"), new Passport(4512, 325235)),
                new Person("Александрова", "Мария", "Сергеевна", parseStringToDate("19.11.1985"), new Passport(4502, 154333)),
                new Person("Кузнецов", "Сергей", "Николаевич", parseStringToDate("17.07.1978"), new Passport(4504, 532212))
        );

        Assertions.assertNotNull(persons);
        Assertions.assertEquals(expectedPersons.size(), persons.size());
        for (int i = 0; i < persons.size(); i++) {
            Assertions.assertEquals(expectedPersons.get(i), persons.get(i));
        }
    }

    @Test
    @DisplayName("Проверка парсинга несуществующего листа")
    void getPersonFromWrongSheetTest() {
        List<Person> persons = FileHelper.getPersonsFromExcel(PATH, "PersonsNA");
        Assertions.assertNull(persons);
    }

    @Test
    @DisplayName("Проверка парсинга несуществующего файла")
    void getPersonFromWrongFileTest() {
        List<Person> persons = FileHelper.getPersonsFromExcel(INVALID_PATH, "Persons1");
        Assertions.assertNull(persons);
    }

    @Test
    @DisplayName("Проверка парсинга листа = null")
    void getPersonFromNullSheetTest() {
        List<Person> persons = FileHelper.getPersonsFromExcel(PATH, null);
        Assertions.assertNull(persons);
    }

    @Test
    @DisplayName("Проверка парсинга файла = null")
    void getPersonFromNullFileTest() {
        List<Person> persons = FileHelper.getPersonsFromExcel(null, "Persons1");
        Assertions.assertNull(persons);
    }
}
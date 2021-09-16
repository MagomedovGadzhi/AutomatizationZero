package test.lesson12.task3;

import Lesson12.task3.person.*;
import com.google.gson.Gson;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class PersonTest {
    private final String PATH = "src\\main\\java\\Lesson12\\task3\\person\\person.json";

    @Test
    @DisplayName("Проверка корректности десериализации класса person")
    void testPersonDeserialization() throws IOException {
        List<String> content = Files.readAllLines(Paths.get(PATH));
        String personToString = String.join("", content);
        Person person = new Gson().fromJson(personToString, Person.class);

        Person expectedPerson = new Person()
                .setName("Иван")
                .setAge(37)
                .setMother(new Mother().setName("Ольга").setAge(58))
                .setChildren(Arrays.asList("Маша", "Игорь", "Таня"))
                .setMarried(true);

        Assertions.assertEquals(expectedPerson, person);
    }
}
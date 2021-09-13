package test.lesson12.task1;

import Lesson12.task1.helpers.JsonHelper;
import Lesson12.task1.model.House;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JsonSerializeTest {
    @Test
    @DisplayName("Проверка сериализации объекта House в JSON")
    public void houseSerializeTest() throws IOException {
        House house = new House().generate();
        String actualJsonHouse = new JsonHelper().serialize(house);
        String expectedJsonHouse = Files.readAllLines(Paths.get("src\\main\\java\\Lesson12\\task1\\expected_json.txt")).get(0);

        Assertions.assertEquals(expectedJsonHouse, actualJsonHouse);
    }
}
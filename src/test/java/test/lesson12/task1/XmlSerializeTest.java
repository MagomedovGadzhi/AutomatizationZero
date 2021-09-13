package test.lesson12.task1;

import Lesson12.task1.helpers.XmlHelper;
import Lesson12.task1.model.House;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class XmlSerializeTest {
    @Test
    @DisplayName("Проверка сериализации объекта")
    void serializationTest() throws IOException {
        House house = new House().generate();

        String actualHouseXml = new XmlHelper().serialize(house);
        String EXPECTED_RESULT_FILE_PATH = "src\\main\\java\\Lesson12\\task1\\expected_xml.txt";
        String expectedHouseXml = Files.readAllLines(Paths.get(EXPECTED_RESULT_FILE_PATH)).get(0);

        Assertions.assertEquals(expectedHouseXml, actualHouseXml);
    }
}
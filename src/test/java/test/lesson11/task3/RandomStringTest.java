package test.lesson11.task3;

import lesson11.task3.Generator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class RandomStringTest {
    @Test
    @DisplayName("Проверка генерации случайной строки")
    public void randomStringTest() {
        for (int i = 0; i < 10000; i++) {
            int min = new Random().nextInt(10);
            int max = new Random().nextInt(10) + 10;
            String actualResult = Generator.randomString(min, max);
            Assertions.assertTrue(actualResult.matches("^[A-Za-z]{0,20}$"));
        }
    }
}
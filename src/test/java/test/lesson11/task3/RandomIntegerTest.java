package test.lesson11.task3;

import lesson11.task3.Generator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class RandomIntegerTest {
    @Test
    @DisplayName("Проверка генерации случайного числа")
    public void randomIntegerTest() {
        for (int i = 0; i < 10000; i++) {
            int min = new Random().nextInt(100);
            int max = new Random().nextInt(100) + 100;
            int actualResult = Generator.randomInteger(min, max);
            Assertions.assertEquals(100, actualResult, 100);
        }
    }
}
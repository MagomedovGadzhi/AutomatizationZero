package test.lesson10.task1;

import lesson11.task1.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MultiplyTest {
    @Test
    @DisplayName("Проверка произведения")
    public void testGetMultiply() {
        Assertions.assertEquals(6, Calculator.getMultiply(3, 2));
        Assertions.assertEquals(720, Calculator.getMultiply(1, 2, 3, 4, 5, 6));
    }
}
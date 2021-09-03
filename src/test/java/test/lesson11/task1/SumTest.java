package test.lesson11.task1;

import lesson11.task1.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SumTest {
    @Test
    @DisplayName("Проверка суммирования")
    public void testGetSum() {
        Assertions.assertEquals(8, Calculator.getSum(5, 3));
        Assertions.assertEquals(21, Calculator.getSum(1, 2, 3, 4, 5, 6));
    }
}
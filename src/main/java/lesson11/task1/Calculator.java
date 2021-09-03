package lesson11.task1;

public class Calculator {
    public static int getSum(int... values) {
        int sum = 0;
        for (int i : values) {
            sum += i;
        }
        return sum;
    }

    public static int getMultiply(int... values) {
        int multiply = 1;
        for (int i : values) {
            multiply *= i;
        }
        return multiply;
    }
}
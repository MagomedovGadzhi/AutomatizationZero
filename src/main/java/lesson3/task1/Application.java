package lesson3.task1;

public class Application {
    public static void main(String[] args) {
        Calculator example = new Calculator();
        System.out.println(example.summ(4, 2));
        System.out.println(example.subtract(5, 3));
        System.out.println(example.multiply(2, 6));
        System.out.println(example.divide(5, 3));
    }
}
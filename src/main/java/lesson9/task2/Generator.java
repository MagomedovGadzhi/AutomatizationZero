package lesson9.task2;

public class Generator {
    public static int number = 0;

    public static Object generate() {
        if (number > 3) number = 0;
        switch (number) {
            case (0):
                number++;
                return new Square();
            case (1):
                number++;
                return new Circle();
            case (2):
                number++;
                return new Box();
            case (3):
                number++;
                return new Table();
        }
        throw new IllegalArgumentException();
    }
}
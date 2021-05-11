package lesson1.task2;

public class Rectangle {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle.isRectangleSquareBiggerThanPerimeter(2, 7));
        System.out.println(rectangle.isRectangleSquareBiggerThanPerimeter(6, 5));
        System.out.println(rectangle.isRectangleSquareBiggerThanPerimeter(6, 3));
    }

    public boolean isRectangleSquareBiggerThanPerimeter(int width, int height) {
        int square = width * height;
        int perimeter = 2 * (width + height);
        return square > perimeter;
    }
}
package lesson1.task1;

public class Square {

    public static void main(String[] args) {
        Square square = new Square();

        System.out.println(square.getSquare(0));
        System.out.println(square.getSquare(2));
        System.out.println(square.getSquare(100));
    }

    public float getSquare (int radius){
        final float PI = 3.14f;
        return PI * radius * radius;
    }
}
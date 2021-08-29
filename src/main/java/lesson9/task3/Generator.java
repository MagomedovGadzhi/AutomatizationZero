package lesson9.task3;

import lesson9.task3.figures.*;

public class Generator {
    public static int number = 0;

    public static Figure generateFigure(){
        if (number > 5) number = 0;
        switch (number) {
            case (0):
                number++;
                return new Square();
            case (1):
                number++;
                return new Circle();
            case (2):
                number++;
                return new EquilateralTriangle();
            case (3):
                number++;
                return new Rectangle();
            case (4):
                number++;
                return new Ellipse();
            case (5):
                number++;
                return new RightTriangle();
        }
        throw new IllegalArgumentException();
    }
}
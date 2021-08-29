package lesson9.task3.figures;

import lesson9.task3.FigureArea;
import lesson9.task3.FigureLength;

public class Rectangle extends TwoParameterFigure {
    @Override
    public double getArea() {
        return (parameter1 * parameter2);
    }

    @Override
    public double getLength() {
        return 2 * (parameter1 + parameter2);
    }
}
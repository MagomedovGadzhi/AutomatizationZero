package lesson9.task3.figures;

import lesson9.task3.FigureArea;
import lesson9.task3.FigureLength;

public class Circle extends OneParameterFigure {
    @Override
    public double getArea() {
        return (Math.PI * Math.pow(parameter1, 2));
    }

    @Override
    public double getLength() {
        return (2 * Math.PI * parameter1);
    }
}
package lesson9.task3.figures;

import lesson9.task3.FigureArea;
import lesson9.task3.FigureLength;

public class Ellipse extends TwoParameterFigure {
    @Override
    public double getArea() {
        return Math.PI * parameter1 * parameter2;
    }

    @Override
    public double getLength() {
        double a = Math.max(parameter1, parameter2);
        double b = Math.min(parameter1, parameter2);
        return 4d * (Math.PI * a * b + a - b) / (a + b);
    }
}
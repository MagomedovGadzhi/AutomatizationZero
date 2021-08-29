package lesson9.task3.figures;

import lesson9.task3.FigureArea;
import lesson9.task3.FigureLength;

public class EquilateralTriangle extends OneParameterFigure {
    @Override
    public double getArea() {
        return (Math.pow(parameter1, 2) * Math.sqrt(3)) / 4;
    }

    @Override
    public double getLength() {
        return (parameter1 * 3);
    }
}
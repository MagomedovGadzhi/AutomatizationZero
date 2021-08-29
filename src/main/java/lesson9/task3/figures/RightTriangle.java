package lesson9.task3.figures;

import lesson9.task3.FigureArea;
import lesson9.task3.FigureLength;

public class RightTriangle extends TwoParameterFigure {
    public double getHypotenuse() {
        return Math.sqrt(Math.pow(parameter1, 2) + Math.pow(parameter2, 2));
    }

    @Override
    public double getArea() {
        return (parameter1 * parameter2)/ 2;
    }

    @Override
    public double getLength() {
        return parameter1 + parameter2 + new RightTriangle().getHypotenuse();
    }
}
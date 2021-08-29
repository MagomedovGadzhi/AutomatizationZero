package lesson9.task3.figures;

import lesson9.task3.FigureArea;
import lesson9.task3.FigureLength;

public abstract class Figure implements FigureArea, FigureLength {
    protected double parameter1;

    public double getParameter1() {
        return parameter1;
    }
}
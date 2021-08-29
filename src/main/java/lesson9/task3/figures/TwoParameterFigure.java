package lesson9.task3.figures;

import java.util.Random;

public abstract class TwoParameterFigure extends Figure {
    protected double parameter2;

    public double getParameter2() {
        return parameter2;
    }

    public TwoParameterFigure() {
        this.parameter1 = new Random().nextInt(10) + 1;
        this.parameter2 = new Random().nextInt(10) + 1;
    }
}
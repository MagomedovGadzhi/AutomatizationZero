package lesson9.task3.figures;

import java.util.Random;

public abstract class OneParameterFigure extends Figure {
    public OneParameterFigure() {
        this.parameter1 = new Random().nextInt(10) + 1;
    }
}
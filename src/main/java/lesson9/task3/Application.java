package lesson9.task3;

import lesson9.task3.figures.Figure;
import lesson9.task3.figures.OneParameterFigure;
import lesson9.task3.figures.RightTriangle;
import lesson9.task3.figures.TwoParameterFigure;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Figure> figures = new ArrayList<>();
        for (int i = 0; i < 18; i++) {
            figures.add(Generator.generateFigure());
        }

        for (Figure f : figures) {
            if (f instanceof OneParameterFigure) {
                OneParameterFigure opf = (OneParameterFigure) f;
                System.out.printf("%s %.1f: Длина - %.1f, Площадь - %.1f %n",
                        opf.getClass().getSimpleName(), opf.getParameter1(), opf.getLength(), opf.getArea());
            }
            if (f instanceof TwoParameterFigure) {
                TwoParameterFigure opf = (TwoParameterFigure) f;
                System.out.printf("%s %.1f, %.1f: Длина - %.1f, Площадь - %.1f %n",
                        opf.getClass().getSimpleName(), opf.getParameter1(), opf.getParameter2(), opf.getLength(), opf.getArea());
            }
        }

        for (Figure f : figures) {
            if (f instanceof RightTriangle) {
                RightTriangle opf = (RightTriangle) f;
                System.out.printf("Гипотенуза треугольника [%.1f, %.1f] равна %.1f%n",
                        opf.getParameter1(), opf.getParameter2(), opf.getHypotenuse());
            }
        }
    }
}
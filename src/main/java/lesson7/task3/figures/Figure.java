package lesson7.task3.figures;

import lesson7.task3.chess.Player;
import lesson7.task3.chess.Position;

import java.util.Set;

public abstract class Figure {

    protected Position position;
    protected String name;
    protected Player color;

    Figure(Position position, Player color) {
        this.position = position;
        this.color = color;
    }
    public abstract Set<Position> getAvailableMoves();

    public Position getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }

    public Player getColor() {
        return color;
    }
}
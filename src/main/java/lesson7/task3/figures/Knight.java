package lesson7.task3.figures;

import lesson7.task3.chess.ChessBoard;
import lesson7.task3.chess.Player;
import lesson7.task3.chess.Position;

import java.util.Set;
import java.util.TreeSet;

import static java.lang.Math.abs;

public class Knight extends Figure {

    public Knight(Position position, Player color) {
        super(position, color);
        this.name = "Конь";
    }

    @Override
    public Set<Position> getAvailableMoves() {
        Set<Position> result = new TreeSet<>();
        for (Position currentChessField : ChessBoard.BOARD) {
            char x = currentChessField.getX();
            int y = currentChessField.getY();
            char lx = position.getX();
            int ly = position.getY();

            int dy = ly - y;
            int dx = lx - x;
            if ((abs(dx) == 1 && abs(dy) == 2) || (abs(dx) == 2 && abs(dy) == 1)) {
                result.add(currentChessField);
            }
        }
        return result;
    }
}
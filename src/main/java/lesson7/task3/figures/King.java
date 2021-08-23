package lesson7.task3.figures;

import lesson7.task3.chess.ChessBoard;
import lesson7.task3.chess.Player;
import lesson7.task3.chess.Position;

import java.util.Set;
import java.util.TreeSet;

public class King extends Figure {
    public King(Position position, Player color) {
        super(position, color);
        this.name = "Король";
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
            if ((dx != 0 || dy != 0) && (Math.abs(dy) <= 1 && Math.abs(dx) <= 1)) {
                result.add(currentChessField);
            }
        }
        return result;
    }
}
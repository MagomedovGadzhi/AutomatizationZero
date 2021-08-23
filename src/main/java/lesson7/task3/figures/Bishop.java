package lesson7.task3.figures;

import lesson7.task3.chess.ChessBoard;
import lesson7.task3.chess.Player;
import lesson7.task3.chess.Position;

import java.util.Set;
import java.util.TreeSet;

public class Bishop extends Figure {
    public Bishop(Position position, Player color) {
        super(position, color);
        this.name = "Слон";
    }

    @Override
    public Set<Position> getAvailableMoves() {
        Set<Position> result = new TreeSet<>();
        for (Position currentChessField : ChessBoard.BOARD) {
            char x = currentChessField.getX();
            int y = currentChessField.getY();
            char lx = position.getX();
            int ly = position.getY();

            int dx = lx - x;
            int dy = ly - y;
            if ((dx != 0 && dy != 0) && (Math.abs(dx) == Math.abs(dy))) {
                result.add(currentChessField);
            }
        }
        return result;
    }
}
package lesson7.task3.figures;

import lesson7.task3.chess.ChessBoard;
import lesson7.task3.chess.Player;
import lesson7.task3.chess.Position;

import java.util.Set;
import java.util.TreeSet;

public class Rook extends Figure {

    public Rook(Position position, Player color) {
        super(position, color);
        this.name = "Ладья";
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
            if (dy == 0 && dx != 0) {
                result.add(currentChessField);
            }
            if (dx == 0 && dy != 0) {
                result.add(currentChessField);
            }
        }
        return result;
    }
}
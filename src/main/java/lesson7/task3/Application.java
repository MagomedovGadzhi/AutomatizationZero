package lesson7.task3;

import lesson7.task3.chess.ChessBoard;
import lesson7.task3.chess.Player;
import lesson7.task3.chess.Position;
import lesson7.task3.figures.*;

import java.util.Iterator;
import java.util.Set;

public class Application {

    public static void main(String[] args) {
        System.out.printf("Доска: %s%n", ChessBoard.BOARD);

        Figure king = new King(new Position('D', 2), Player.BLACK);
        printMoves(king);

        Figure queen = new Queen(new Position('D', 2), Player.BLACK);
        printMoves(queen);

        Figure rook = new Rook(new Position('D', 6), Player.BLACK);
        printMoves(rook);

        Figure knight = new Knight(new Position('E', 4), Player.WHITE);
        printMoves(knight);

        Figure bishop = new Bishop(new Position('D', 3), Player.BLACK);
        printMoves(bishop);

        Figure pawn = new Pawn(new Position('A', 2), Player.WHITE);
        printMoves(pawn);

        Figure pawn2 = new Pawn(new Position('A', 3), Player.WHITE);
        printMoves(pawn2);

        Figure pawn3 = new Pawn(new Position('A', 7), Player.BLACK);
        printMoves(pawn3);

        Figure pawn4 = new Pawn(new Position('A', 6), Player.BLACK);
        printMoves(pawn4);

        Figure pawn5 = new Pawn(new Position('A', 1), Player.BLACK);
        printMoves(pawn5);
    }

    public static void printMoves(Figure figure) {
        Set<Position> positionsSet = figure.getAvailableMoves();
        StringBuilder sb = new StringBuilder(figure.getName())
                .append(" (")
                .append(figure.getPosition())
                .append("):");
        Iterator<Position> iterator = positionsSet.iterator();
        while (iterator.hasNext()) {
            Position position = iterator.next();
            sb.append(", ").append(position);
        }
        System.out.println(sb.toString().replaceFirst(",", ""));
    }
}
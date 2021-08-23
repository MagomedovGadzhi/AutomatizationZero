package lesson7.task3.chess;

public class Position implements Comparable<Position> {
    char x;
    int y;

    public Position(char x, int y) {
        this.x = x;
        this.y = y;
    }

    public char getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Position position = (Position) o;

        if (x != position.x) {
            return false;
        }
        return y == position.y;
    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        return result;
    }

    @Override
    public String toString() {
        return String.valueOf(x) + y;
    }

    @Override
    public int compareTo(Position other) {
        return (x == other.x)
                ? y - other.y
                : x - other.x;

        // this == A5,  other == A7
        // this == A7,  other == A5
    }
}

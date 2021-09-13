package Lesson12.task1.model;

public class Room implements Generatable<Room> {
    private int width;
    private int height;

    public Room(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Room() {
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public Room generate() {
        this.width = 5;
        this.height = 3;
        return this;
    }
}
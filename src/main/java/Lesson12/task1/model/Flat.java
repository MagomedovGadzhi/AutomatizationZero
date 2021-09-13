package Lesson12.task1.model;

import java.util.ArrayList;
import java.util.List;

public class Flat implements Generatable<Flat> {
    private List<Room> rooms = new ArrayList<>();

    public Flat(List<Room> rooms) {
        this.rooms = rooms;
    }

    public Flat() {
    }

    public List<Room> getRooms() {
        return rooms;
    }

    @Override
    public Flat generate() {
        rooms.add(new Room().generate());
        rooms.add(new Room().generate());
        return this;
    }
}
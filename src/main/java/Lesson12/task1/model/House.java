package Lesson12.task1.model;

import java.util.ArrayList;
import java.util.List;

public class House implements Generatable<House> {
    private List<Flat> flats = new ArrayList<>();

    public House(List<Flat> flats) {
        this.flats = flats;
    }

    public House() {
    }

    public List<Flat> getFlats() {
        return flats;
    }

    @Override
    public House generate() {
        for (int i = 0; i < 5; i++) {
            this.flats.add(new Flat().generate());
        }
        return this;
    }
}
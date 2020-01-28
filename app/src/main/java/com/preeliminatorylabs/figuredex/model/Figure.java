package com.preeliminatorylabs.figuredex.model;

public class Figure {
    private String name;
    private String sides;

    public Figure(String name, String sides) {
        this.name = name;
        this.sides = sides;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSides() {
        return sides;
    }

    public void setSides(String sides) {
        this.sides = sides;
    }
}

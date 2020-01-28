package com.preeliminatorylabs.figuredex.factory;

import com.preeliminatorylabs.figuredex.model.Figure;

public class FigureFactory {
    private Figure circle;
    private Figure triangle;
    private Figure square;
    private Figure pentagon;

    public FigureFactory(){
        circle = new Figure("Círculo","0");
        triangle = new Figure("Triángulo","3");
        square = new Figure("Cuadrado","4");
        pentagon = new Figure("Pentágono","5");
    }

    public Figure getCircle() {
        return circle;
    }

    public void setCircle(Figure circle) {
        this.circle = circle;
    }

    public Figure getTriangle() {
        return triangle;
    }

    public void setTriangle(Figure triangle) {
        this.triangle = triangle;
    }

    public Figure getSquare() {
        return square;
    }

    public void setSquare(Figure square) {
        this.square = square;
    }

    public Figure getPentagon() {
        return pentagon;
    }

    public void setPentagon(Figure pentagon) {
        this.pentagon = pentagon;
    }
}

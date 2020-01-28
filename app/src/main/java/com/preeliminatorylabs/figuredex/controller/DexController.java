package com.preeliminatorylabs.figuredex.controller;

import com.preeliminatorylabs.figuredex.factory.FigureFactory;
import com.preeliminatorylabs.figuredex.model.Figure;

public class DexController {

    FigureFactory factory = new FigureFactory();

    public void getDexResult(String sides, DexInterface listener){
        switch (sides){
            case "0":
                listener.handleFigure(factory.getCircle());
                break;
            case "3":
                listener.handleFigure(factory.getTriangle());
                break;
            case "4":
                listener.handleFigure(factory.getSquare());
                break;
            case "5":
                listener.handleFigure(factory.getPentagon());
                break;
        }

    }
}

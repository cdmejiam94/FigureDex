package com.preeliminatorylabs.figuredex.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.preeliminatorylabs.figuredex.controller.DexController;
import com.preeliminatorylabs.figuredex.controller.DexInterface;
import com.preeliminatorylabs.figuredex.model.Figure;

public class FigureDexViewModel extends ViewModel implements DexInterface {
    private DexController dexController;
    private MutableLiveData<Figure> figureMutableLiveData;

    public FigureDexViewModel() {
        this.dexController = new DexController();
        this.figureMutableLiveData = new MutableLiveData<>();
    }

    public LiveData<Figure> getFigure(){
        return figureMutableLiveData;
    }

    public void getUserFigure(String sides){
        dexController.getDexResult(sides,this);
    }

    @Override
    public void handleFigure(Figure figure){
        figureMutableLiveData.setValue(figure);
    }
}

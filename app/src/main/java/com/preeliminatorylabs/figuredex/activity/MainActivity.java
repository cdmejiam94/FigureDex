package com.preeliminatorylabs.figuredex.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import com.preeliminatorylabs.figuredex.R;
import com.preeliminatorylabs.figuredex.databinding.ActivityMainBinding;
import com.preeliminatorylabs.figuredex.factory.FigureFactory;
import com.preeliminatorylabs.figuredex.model.Figure;
import com.preeliminatorylabs.figuredex.viewmodel.FigureDexViewModel;

public class MainActivity extends AppCompatActivity {

    private FigureDexViewModel figureDexViewModel;
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setUpView();
    }

    private void setUpView(){
        figureDexViewModel = ViewModelProviders.of(this).get(FigureDexViewModel.class);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);

        final Observer<Figure> figureObserver = new Observer<Figure>() {
            @Override
            public void onChanged(Figure figure) {
                identify(figure);
            }
        };

        figureDexViewModel.getFigure().observe(this,figureObserver);
        binding.btnCircle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                figureDexViewModel.getUserFigure("0");
            }
        });

        binding.btnTriangle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                figureDexViewModel.getUserFigure("3");
            }
        });

        binding.btnSquare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                figureDexViewModel.getUserFigure("4");
            }
        });

        binding.btnPentagon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                figureDexViewModel.getUserFigure("5");
            }
        });

    }

    private void identify(Figure figure){
        binding.txtResult.setText(new StringBuilder().append("El ")
                .append(figure.getName())
                .append(" tiene ")
                .append(figure.getSides())
                .append(" lados.")
        );
    }
}

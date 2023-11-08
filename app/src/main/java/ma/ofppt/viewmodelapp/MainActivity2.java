package ma.ofppt.viewmodelapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;

import ma.ofppt.viewmodelapp.databinding.ActivityMain2Binding;
import ma.ofppt.viewmodelapp.databinding.ActivityMainBinding;
import ma.ofppt.viewmodelapp.viewmodel.MyViewModel;

public class MainActivity2 extends AppCompatActivity {
    ActivityMain2Binding binding;
    MyViewModel model;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMain2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        model = new ViewModelProvider(this).get(MyViewModel.class);
        //model = new MyViewModel(); ne marche pas
        model.number.observe(this, number -> binding.txtNumber.setText(number.toString()));
        binding.btnAddOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                model.addOne();

            }
        });

    }
}
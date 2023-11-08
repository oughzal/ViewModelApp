package ma.ofppt.viewmodelapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import ma.ofppt.viewmodelapp.databinding.ActivityMainBinding;
import ma.ofppt.viewmodelapp.viewmodel.MyViewModel;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    MyViewModel model;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
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
        binding.btnGo.setOnClickListener(v ->{
            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            startActivity(intent);
        });
    }
}
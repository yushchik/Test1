package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        String str1 = String.valueOf(binding.editText.getText());
        //обработчик нажатия конпки
        binding.btn.setOnClickListener(v -> {
            //создаем интент для перехода на MainActivity3
            Intent intent = new Intent(this, MainActivity3.class);
            //добавляем данные, которые будут переданы в MainActivity3.
            //данные передаеются парами ключ-значение
            //PUTTEXT - ключ, Hello - значение
            intent.putExtra("PUTTEXT", "Hello");
            //добавляем флаг
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
            //запускаем MainActivity3 активити
            startActivity(intent);
        });
    }
}
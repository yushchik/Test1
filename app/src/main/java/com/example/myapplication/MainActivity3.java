package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.databinding.ActivityMain3Binding;

public class MainActivity3 extends AppCompatActivity {

    ActivityMain3Binding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMain3Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        //создаем объект intent для получения данных
        Intent intent = getIntent();
        //получаем данные по ключу PUTTEXT
        String src3 = intent.getStringExtra("PUTTEXT");
        //полученные данные записываем в textView
        binding.textView.setText(src3);
    }
}

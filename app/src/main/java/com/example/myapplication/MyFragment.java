package com.example.myapplication;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.myapplication.databinding.FragmentBinding;

public class MyFragment extends Fragment {

    //создаем объект биндинга, который отвечает за разметку фрагмента
    FragmentBinding binding;
    static String frTitle;

    //метод, для получения данный из активити (в какой-то степени аналог intent.putExtras
    // данный метод принимает столько параметров, сколько вам надо передать из активити.
    // Например если надо передать 2 параметра метод будет выглядить следущим образом
    //    public static MyFragment newInstance(String title, Integer id) {
    //        Bundle args = new Bundle();
    //        args.putString("title", title);
    //        args.putInt("title", id);
    //        frTitle = title;
    //        Integer newId = id;
    //
    //        MyFragment fragment = new MyFragment();
    //        fragment.setArguments(args);
    //        return fragment;
    //    }
    // обратите внимание на то, что метод возвращает экземпляр класса фрагмента,
    // поэтому нам необходимо вернуть это экземпляр
    // return fragment;

    public static MyFragment newInstance(String title) {
        Bundle args = new Bundle();
        args.putString("title", title);
        frTitle = title;

        MyFragment fragment = new MyFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        //инициализируем биндинг. Обратите внимание на разницу инициализации биндинга в активити и во фрагменте.
        // А так же на то что метод onCreateView возвращает View, поэтому во фрагменте мы должны прописать return binding.getRoot();,
        // а не setContentView(binding.getRoot()); как в активити
        binding = FragmentBinding.inflate(inflater, container, false);

        //в текстовое поле записываем текст, который нам передала активити
        binding.rvTitle.setText(frTitle);

        //при нажатии на кнопку в поле текст записываем текст, который ввели в editText
        binding.btn.setOnClickListener(v -> {
            binding.text.setText(binding.editText.getText());
        });
        return binding.getRoot();
    }


}

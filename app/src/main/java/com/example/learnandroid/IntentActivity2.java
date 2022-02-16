package com.example.learnandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.learnandroid.databinding.ActivityIntent1Binding;
import com.example.learnandroid.databinding.ActivityIntent2Binding;

public class IntentActivity2 extends AppCompatActivity {


   private ActivityIntent2Binding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityIntent2Binding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());


    }
}
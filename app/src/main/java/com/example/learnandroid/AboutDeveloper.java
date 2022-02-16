package com.example.learnandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.Toolbar;

import com.example.learnandroid.databinding.ActivityAboutDeveloperBinding;

public class AboutDeveloper extends BaseActivity {

    Context context;
   private ActivityAboutDeveloperBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAboutDeveloperBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        context = this;



    }
}
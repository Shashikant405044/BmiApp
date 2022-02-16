package com.example.learnandroid;


import android.os.Bundle;
import android.view.View;

import com.example.learnandroid.databinding.ActivityBmiChartBinding;
import com.example.learnandroid.databinding.ActivityMainBinding;

public class BmiChartActivity extends BaseActivity {

private ActivityBmiChartBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityBmiChartBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

    }


}

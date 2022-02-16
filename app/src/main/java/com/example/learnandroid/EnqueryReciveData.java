package com.example.learnandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.learnandroid.databinding.ActivityEnqueryFormBinding;
import com.example.learnandroid.databinding.ActivityEnqueryReciveDataBinding;

public class EnqueryReciveData extends AppCompatActivity {

    private ActivityEnqueryReciveDataBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityEnqueryReciveDataBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());

        Intent intent = getIntent();

        String fname = intent.getStringExtra("fname");
        String lname = intent.getStringExtra("lname");
        String email = intent.getStringExtra("email");
        String phone = intent.getStringExtra("phoneno");
        String course = intent.getStringExtra("course");

        String gender = intent.getStringExtra("gender");


        binding.FNameText.setText(fname);
        binding.LNameText.setText(lname);
        binding.EmailText.setText(email);
        binding.phoneText.setText(phone);
        binding.genderText.setText(gender);
        binding.CourseText.setText(course);
    }
}
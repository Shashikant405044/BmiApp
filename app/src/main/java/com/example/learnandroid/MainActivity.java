package com.example.learnandroid;



import androidx.annotation.NonNull;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;

import android.widget.Toast;

import com.example.learnandroid.databinding.ActivityMainBinding;


public class MainActivity extends BaseActivity implements View.OnClickListener {
    Context context;
    private ActivityMainBinding binding;
    String output ="";
    String course ="";
    CheckBox checkBox;
    //RadioButton radioButton;
    boolean isAllFieldChecked = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.activity_main);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        context = this;
        binding.BmiCal.setOnClickListener(this);
        binding.enqueryForm.setOnClickListener(this);
        binding.intentExample.setOnClickListener(this);
        binding.popUpMenu.setOnClickListener(this);
        binding.ShareIntent.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.enquery_Form:

                Intent intent = new Intent(MainActivity.this, EnqueryForm.class);
                startActivity(intent);

                break;
            case R.id.Bmi_cal:
                     Intent bmical = new Intent(MainActivity.this, BmiApplication.class);
                      startActivity(bmical);

                    break;

            case  R.id.intentExample:
                Intent intentexample = new Intent(MainActivity.this, IntentActivity1.class);
                startActivity(intentexample);
                break;

            case  R.id.popUpMenu:
                Intent popup = new Intent(MainActivity.this, PopUpMenu.class);
                startActivity(popup);
                break;
            case  R.id.ShareIntent:
                Intent share = new Intent(MainActivity.this, EnqueryForm.class);
                 startActivity(share);
                break;

        }
    }
}

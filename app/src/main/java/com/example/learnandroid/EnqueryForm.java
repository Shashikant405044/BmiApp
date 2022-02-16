package com.example.learnandroid;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

import com.example.learnandroid.databinding.ActivityEnqueryFormBinding;


public class EnqueryForm extends BaseActivity implements View.OnClickListener {
    private ActivityEnqueryFormBinding binding;
   private String output = "";
   private String course = "";
   private RadioButton radioButton;

    boolean isAllFieldChecked = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityEnqueryFormBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.submit.setOnClickListener(this);
        binding.clear.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {

        isAllFieldChecked = validation();

        switch (view.getId()) {

            case R.id.submit:
                if (isAllFieldChecked) {
                    binding.submit.setVisibility(View.GONE);
                }
                if (isAllFieldChecked) {
                    binding.clear.setVisibility(View.VISIBLE);

                }
                if (isAllFieldChecked) {
                    etDataOrRadio();
                }

                if (isAllFieldChecked) {
                    Intent intent = new Intent(EnqueryForm.this, EnqueryReciveData.class);

                    intent.putExtra("fname", binding.fName.getText().toString());
                    intent.putExtra("lname", binding.LName.getText().toString());
                    intent.putExtra("email", binding.emailId.getText().toString());
                    intent.putExtra("phoneno", binding.phoneNo.getText().toString());
                    intent.putExtra("course", binding.item1.getText().toString());
                    int selectedId = binding.rgGroup.getCheckedRadioButtonId();
                    intent.putExtra("gender",selectedId);

                    startActivity(intent);

                }

                break;
            case R.id.clear:
                binding.fName.setText("");
                binding.LName.setText("");
                binding.emailId.setText("");
                binding.phoneNo.setText("");
                binding.mailNoDis.setText("");
                binding.firstDis.setText("");
                binding.phoneNo.setText("");
                binding.item1.clearFocus();
                binding.phonenodis.setText("");
                binding.lNameDis.setText("");
                binding.mailNoDis.setText("");
                binding.mailNoDis.setText("");

//
//                binding.submit.setVisibility(View.INVISIBLE);
//                //radioButton.setChecked(false);
//                break;

        }

    }
    





    @SuppressLint("ResourceType")
    private void etDataOrRadio() {
//        String outputName = binding.fName.getText().toString();
//        String outputLastName = binding.LName.getText().toString();
//        String outputEmail = binding.emailId.getText().toString();
//        String outputphoneNo = binding.phoneNo.getText().toString();


        checkBoxDataGetting();
//        binding.firstDis.setText("Name" + outputName + "-" + outputLastName);
//        binding.mailNoDis.setText(outputEmail);
//        binding.phonenodis.setText(outputphoneNo);
       int selectedId = binding.rgGroup.getCheckedRadioButtonId();
        radioButton = (RadioButton) findViewById(selectedId);
          binding.gender.setText(radioButton.getText());
//        binding.checkitemdis.setText(course);


    }

    private void checkBoxDataGetting() {
        if (binding.item1.isChecked()) {
            course += binding.item1.getText().toString();

        }
        if (binding.item2.isChecked()) {
            course += binding.item2.getText().toString();

        }
        if (binding.item3.isChecked()) {
            course += binding.item3.getText().toString();

        }
        if (binding.item4.isChecked()) {
            course += binding.item4.getText().toString();

        }
        if (binding.item5.isChecked()) {
            course += binding.item5.getText().toString();

        }
        if (binding.item6.isChecked()) {
            course += binding.item6.getText().toString();

        }
        if (binding.item7.isChecked()) {
            course += binding.item7.getText().toString();

        }
    }

    private boolean validation() {







        if (binding.fName.getText().toString().length() == 0) {
            binding.fName.setError("Please Enter First Name");
            return false;
        }  if (binding.LName.getText().toString().length() == 0) {
            binding.LName.setError("Enter Last Name");
            return false;

        }  if (binding.emailId.getText().toString().length() == 0) {
            binding.emailId.setError("Enter Email Id ");
            return false;

        }  if(binding.phoneNo.getText().toString().length() ==0) {
            binding.phoneNo.setError(" Enter Phone No");

           // isVailidSelphoneNumber();
            return false;

        }


         if (binding.rgGroup.getCheckedRadioButtonId() == -1) {

            Toast.makeText(this, "Please Select the Gender", Toast.LENGTH_SHORT).show();


             return false;
        } else if (binding.item1.getText().toString().length() == -1) {
            Toast.makeText(this, "Please Select CheckBox", Toast.LENGTH_SHORT).show();

            return false;
        }

        return true;
    }

//    private boolean isVailidSelphoneNumber(CharSequence target) {
//        if(target==null || target.length()<6 || target.length() > 13)
//        {
//            return false;
//
//        }else return android.util.Patterns.PHONE.matcher(target).matches();
//
//    }
}

//  public  final  static boolean isVailidSelphoneNumber(CharSequence target)
//    {
//
//    }


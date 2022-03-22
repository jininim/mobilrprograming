package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.myapplication.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.api40);
        setTitle("20180858 이진");

        //더하기
        binding.btnAdd.setOnClickListener(view -> {
            if(binding.edit1.length() != 0 && binding.edit2.length() !=0) {
                String num1 = binding.edit1.getText().toString();
                String num2 = binding.edit2.getText().toString();
                Double result = Double.parseDouble(num1) + Double.parseDouble(num2);
                binding.TextResult.setText("계산결과 : " + result);
            }else{
                Toast.makeText(this,"값이입력되지않음",Toast.LENGTH_LONG).show();
            }
        });
        //빼기
        binding.btnSub.setOnClickListener(view -> {
            if(binding.edit1.length() != 0 && binding.edit2.length() !=0) {
                String num1 = binding.edit1.getText().toString();
                String num2 = binding.edit2.getText().toString();
                Double result = Double.parseDouble(num1) - Double.parseDouble(num2);
                binding.TextResult.setText("계산결과 : " + result);
            }else{
                Toast.makeText(this,"값이입력되지않음",Toast.LENGTH_LONG).show();
            }
        });
        //곱하기
        binding.btnMul.setOnClickListener(view -> {
            if(binding.edit1.length() != 0 && binding.edit2.length() !=0) {
                String num1 = binding.edit1.getText().toString();
                String num2 = binding.edit2.getText().toString();
                Double result = Double.parseDouble(num1) * Double.parseDouble(num2);
                binding.TextResult.setText("계산결과 : " + result);
            }else{
                Toast.makeText(getApplicationContext(),"값이입력되지않음",Toast.LENGTH_LONG).show();
            }
        });
        //나누기
        binding.btnDiv.setOnClickListener(view -> {
            if(binding.edit1.length() != 0 && binding.edit2.length() !=0) {
                int zero = Integer.parseInt(binding.edit2.getText().toString());
                if(zero == 0){
                    Toast.makeText(this,"나누는값이 0입니다",Toast.LENGTH_LONG).show();
                }else{
                    String num1 = binding.edit1.getText().toString();
                    String num2 = binding.edit2.getText().toString();
                    Double result = Double.parseDouble(num1) / Double.parseDouble(num2);
                    binding.TextResult.setText("계산결과 : " + result);
                }

            }else{
                Toast.makeText(this,"값이입력되지않음",Toast.LENGTH_LONG).show();
            }
        });
        //나머지
        binding.btnRemainder.setOnClickListener(view -> {
            if(binding.edit1.length() != 0 && binding.edit2.length() !=0) {
                String num1 = binding.edit1.getText().toString();
                String num2 = binding.edit2.getText().toString();
                Double result = Double.parseDouble(num1) % Double.parseDouble(num2);
                binding.TextResult.setText("계산결과 : " + result);
            }else{
                Toast.makeText(this,"값이입력되지않음",Toast.LENGTH_LONG).show();
            }
        });







    }

}
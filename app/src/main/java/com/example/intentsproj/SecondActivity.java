package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private EditText Num1, Num2;
    private String no1, no2, Ans;
    private int inputnum1, inputnum2, answer;
    private TextView ans;
    private Button addButton, subButton, divideButton, multyplyButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        Num1 = findViewById(R.id.editTextNumber);
        Num2 = findViewById(R.id.editTextNumber3);
        ans = findViewById(R.id.textView);


        addButton = findViewById(R.id.button2);
        subButton = findViewById(R.id.button6);
        multyplyButton = findViewById(R.id.button7);
        divideButton = findViewById(R.id.button8);

        Intent intent = getIntent();
        no1 = intent.getStringExtra(FirstActivity.number1);
        no2 = intent.getStringExtra(FirstActivity.number2);


        inputnum1 = Integer.parseInt(no1);
        inputnum2 = Integer.parseInt(no2);

        Num1.setText(no1);
        Num2.setText(no2);
    }

    @Override
    protected void onResume() {
        super.onResume();

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer = inputnum1 + inputnum2;
                ans.setText(inputnum1 + " + " + inputnum2 + " = " + answer);

            }
        });

        subButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer = inputnum1 - inputnum2;
                ans.setText(inputnum1 + " - " + inputnum2 + " = " + answer);

            }
        });

        multyplyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer = inputnum1  * inputnum2;
                ans.setText(inputnum1 + " * " + inputnum2 + " = " + answer);

            }
        });

        divideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer = inputnum1 / inputnum2;
                ans.setText(inputnum1 + " / " + inputnum2 + " = " + answer);

            }
        });
    }
}
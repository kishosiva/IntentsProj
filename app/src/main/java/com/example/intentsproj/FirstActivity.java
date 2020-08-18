package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.NumberPicker;
import android.widget.TextView;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    private EditText Num1,Num2;
    private String no1,no2;
    private Button button;
    public static final String number1 = "Activity1_input1";
    public static final String number2 = "Activity1_input2";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        Num1 = findViewById(R.id.editTextNumber);
        Num2 = findViewById(R.id.editTextNumber3);
        button = findViewById(R.id.button);


        LayoutInflater laIn = getLayoutInflater();
        View layout = laIn.inflate(R.layout.customtoast, (ViewGroup) findViewById(R.id.custom_toast_layout));


        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.setView(layout);
        toast.show();
    }

    protected void onResume() {
        super.onResume();

        button.setOnClickListener((new View.OnClickListener() {
            public void onClick(View v) {
                openSecondActivity();
                showToast();
            }
        }));


    }

    public void openSecondActivity() {
        no1 = Num1.getText().toString();
        no2 = Num2.getText().toString();
        Intent intent = new Intent(this,SecondActivity.class);
        intent.putExtra(number1,no1);
        intent.putExtra(number2,no2);
        startActivity(intent);


    }
    public void showToast() {
        Context context = getApplicationContext();
        CharSequence message = "You just clicked the OK button";
        //Display string
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, message, duration);
        toast.show();

    }


}
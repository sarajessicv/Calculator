package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText number1;
    EditText number2;
    Button addButton;
    TextView result;
    int number_1;
    int number_2;
    int resultNumber;
    String finalResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number1 = (EditText) findViewById(R.id.number1);
        number2 = (EditText) findViewById(R.id.number2);
        addButton = (Button) findViewById(R.id.button);
        result = (TextView) findViewById(R.id.result);
    }

    public void add(View v){
        number_1 = Integer.valueOf(number1.getText().toString());
        number_2 = Integer.valueOf(number2.getText().toString());
        resultNumber = number_1 + number_2;
        finalResult = String.valueOf(resultNumber);
        result.setText(finalResult);
    }

}
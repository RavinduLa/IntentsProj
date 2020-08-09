package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    int takeExtra1, takeExtra2, result, num1, num2 ;
    String stringExtra1, stringExtra2, resultString;
    Button addButton, subtractButton, multiplyButton, divideButton;
    TextView textView1, textView2, textView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        Log.i("secondActivity", "get intent");

        /*takeExtra1 = intent.getIntExtra("number1", 0);
        takeExtra2 = intent.getIntExtra("number2", 0);*/

        stringExtra1 = intent.getStringExtra("number1");
        stringExtra2 = intent.getStringExtra("number2");

        takeExtra1 = Integer.parseInt(stringExtra1);
        takeExtra2 = Integer.parseInt(stringExtra2);

        Log.i("secondActivity", "Extras assigned");

        textView1 = findViewById(R.id.editTextNum1);
        textView2 = findViewById(R.id.editTextNum2);
        textView3  = findViewById(R.id.textView1);

        Log.i("secondActivity", "Found views by ids");

        textView1.setText(stringExtra1);
        textView2.setText(stringExtra2);
        Log.i("secondActivity", "assigned 2 strings to text views");
        textView3.setText(stringExtra1+","+stringExtra2);

        addButton = findViewById(R.id.addbutton);
        subtractButton = findViewById(R.id.subtractButton);
        multiplyButton = findViewById(R.id.multiplyButton);
        divideButton = findViewById(R.id.divideButton);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("secondActivity", "in add button onClick()");

                num1 = Integer.parseInt(textView1.getText().toString()  );
                num2 = Integer.parseInt(textView2.getText().toString()  );
                result = num1 + num2;
                resultString = String.valueOf(result);
                textView3.setText(resultString);
            }
        });

        subtractButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("secondActivity", "in subtract button onClick()");

                num1 = Integer.parseInt(textView1.getText().toString()  );
                num2 = Integer.parseInt(textView2.getText().toString()  );
                result = num1 - num2;
                resultString = String.valueOf(result);
                textView3.setText(resultString);
            }
        });

        multiplyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("secondActivity", "in add multiply onClick()");

                num1 = Integer.parseInt(textView1.getText().toString()  );
                num2 = Integer.parseInt(textView2.getText().toString()  );
                result = num1 * num2;
                resultString = String.valueOf(result);
                textView3.setText(resultString);
            }
        });

        divideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("secondActivity", "in divide button onClick()");

                num1 = Integer.parseInt(textView1.getText().toString()  );
                num2 = Integer.parseInt(textView2.getText().toString()  );

                Double doubleNum1 = new Double(num1);
                Double doubleNum2 = new Double(num2);
                Double doubleResult = doubleNum1 / doubleNum2 ;
                resultString = String.valueOf(doubleResult);
                textView3.setText(resultString);
            }
        });

        Log.i("secondActivity", "end of buttons");




        Log.i("secondActivity", "end of onCreate");
    }
}
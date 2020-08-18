package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    Button button;
    //TextView numberTxtView1, numberTxtView2;
    EditText numberTxtView1, numberTxtView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Log.i("firstActivity","onCreate() invoked");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.okbtn);
        numberTxtView1 = findViewById(R.id.editTextNumber);
        numberTxtView2 = findViewById(R.id.editTextNumber2);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("firstActivity","onClick() invoked");
                Context context = getApplicationContext();
                String message = "You pressed the OK button";
                int duration  = Toast.LENGTH_SHORT;

                //Creating the LayoutInflater instance
                LayoutInflater li = getLayoutInflater();

                //Getting the View object as defined in the customtoast.xml file
                View layout = li.inflate(R.layout.custom_toast, (ViewGroup)findViewById(R.id.custom_toast_layout));


                Toast toast = new Toast(getApplicationContext());
                toast.setDuration(Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER_VERTICAL,0,0);
                toast.setView(layout);
                toast.show();
                Log.i("firstActivity","after toast");


                if (numberTxtView1.getText().toString().length() == 0)
                {
                    numberTxtView1.setText("0");
                    Log.i("firstActivity","turned number to 0 as 1st number was null");
                }

                if (numberTxtView2.getText().toString().length() == 0)
                {
                    numberTxtView2.setText("0");
                    Log.i("firstActivity","turned number to 0 as 2nd number was null");
                }
                Log.i("firstActivity","After 2 ifs");
                /*int num1 = Integer.parseInt(numberTxtView1.getText().toString() );
                int num2 = Integer.parseInt(numberTxtView2.getText().toString() );*/

                String num1String = "5";//numberTxtView1.getText().toString();
                String num2String = "6"; //numberTxtView2.getText().toString();

                num1String = numberTxtView1.getText().toString();
                num2String = numberTxtView2.getText().toString();

                if (numberTxtView1.getText().toString().length() == 0)
                {
                    Log.i("firstActivity","still zero");
                }

                Log.i("firstActivity","took num1 and num2 as strings and parsed to ints");

                /*int num1, num2;
                num1 = 1;
                num2 = 3;*/
                Intent intent = new Intent(FirstActivity.this, SecondActivity.class);

                Log.i("firstActivity","new intent created");

                intent.putExtra("number1",num1String);
                intent.putExtra("number2",num2String);
                Log.i("firstActivity","Extras put");
                startActivity(intent);

                Log.i("firstActivity","end of onClick()");

            }
        });

    }



}
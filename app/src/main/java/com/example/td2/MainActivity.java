package com.example.td2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private EditText addLHS,addRHS;
    private TextView result, result1, result2, result3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("MainActivity", "The activity was created");

        this.addLHS = findViewById(R.id.editTextTextPersonName2);
        this.addRHS = findViewById(R.id.editTextTextPersonName3);
        this.result = findViewById(R.id.textView4);
        this.result1 = findViewById(R.id.subtract);
        this.result2 = findViewById(R.id.divide);
        this.result3 = findViewById(R.id.multiply);
       // int add = 0;

    }

   public void  computeAdd(View v){
        try {
            int val1 = Integer.parseInt(addLHS.getText().toString());
            int val2 = Integer.parseInt(addRHS.getText().toString());
            int add = val1 + val2;
            int minus = val1 - val2;
            int div = val1 / val2;
            int prod = val1 * val2;
            result.setText("Addition:"+add);
            result1.setText("subtraction:"+minus);
            result2.setText("division:"+div);
            result3.setText("Multiplication:"+prod);
        }catch (ArithmeticException e){
            Toast.makeText(getApplicationContext(), "division by zero", Toast.LENGTH_SHORT).show();
        }

    }
}
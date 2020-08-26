package com.example.currencyconvert;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void onShowClick (View view){
        EditText input = findViewById(R.id.price);
        TextView discounted = findViewById(R.id.total);

        //conversion
        int input2 = Integer.parseInt(input.getText().toString());

        //calculate the price after discount
        if (input2 >= 1000){
            double answer = input2 - (input2 * 0.14)  ;
            discounted.setText(String.valueOf(answer));
        }
        else if (input2 < 1000){
            double answer2 = input2 - (input2 * 0.02) ;
            discounted.setText(String.valueOf(answer2));
        }
        else {
            discounted.setText("No discount");
        }
    }


}
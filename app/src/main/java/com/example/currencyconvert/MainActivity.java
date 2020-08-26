package com.example.currencyconvert;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onDisplayClick (View view){
        EditText currency = findViewById(R.id.money);
        EditText country = findViewById(R.id.place);
        TextView end = findViewById(R.id.last);
        //Currency variables
        int ugandanShs = 3672;
        int kenyanShs = 108;
        int tanzanianShs = 2320;
        //Country variables
        String uganda = "uganda";
        String kenya = "kenya";
        String tanzania = "tanzania";

        //Conversion
        String convertedCountry = country.getText().toString();
        int convertedCurrency = Integer.parseInt(currency.getText().toString());

        //the operation, logic
        if (convertedCountry.equals(kenya)){
            int ans1 = convertedCurrency * kenyanShs;
            end.setText(String.valueOf(ans1));
        }
        else if (convertedCountry.equals(uganda)){
            int ans2 = convertedCurrency * ugandanShs;
            end.setText(String.valueOf(ans2));
        }
        else if (convertedCountry.equals(tanzania)){
            int ans3 = convertedCurrency * ugandanShs;
            end.setText(String.valueOf(ans3));
        }
        else {
            end.setText("Please Enter a valid country");
        }


    }
    public void onNextClick (View view) {
        Intent Intent = new Intent(this, MainActivity2.class);
        startActivity(Intent);
    }
}
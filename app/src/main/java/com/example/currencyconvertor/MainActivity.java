package com.example.currencyconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void ConvertCurrency(View view){
        Log.i(
                "info", "Buttion Pressed"
        );

        EditText editText = (EditText) findViewById(R.id.editTextNumberDecimal);

        // Getting Amount in Pounds
        String amtInPounds = editText.getText().toString();

        // Converting Pounds to Double data type
        Double PoundsInDouble = Double.parseDouble(amtInPounds);

        // Applying international Exchange rate for £->$
        double DollarsInDouble = PoundsInDouble * 1.14;

        //String amtInDollars = Double.toString(DollarsInDouble);
        
        String amtInDollars = String.format("%.2f",DollarsInDouble); // reducing to 2 decimal places

        Toast.makeText(this, "£"+amtInPounds+" is $"+ amtInDollars, Toast.LENGTH_LONG).show();
        Log.i(
                "Amount in Dollars: ", amtInDollars);

        Log.i(
                "Currency-Converted", editText.getText().toString()
        );

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
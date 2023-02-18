package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convert(View view){

        EditText inrAmountEditText = (EditText) findViewById(R.id.inrAmountEditText);

        Double inrAmountDouble = Double.parseDouble(inrAmountEditText.getText().toString());
        Double dollarAmount = inrAmountDouble * 82.75;

        Toast.makeText(this, dollarAmount.toString() , Toast.LENGTH_SHORT).show();

        Log.i("amount",inrAmountEditText.getText().toString());
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
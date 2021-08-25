package com.example.example01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    TextView text2;
    RadioGroup radioOptions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        radioOptions = findViewById(R.id.radioOptions);

        text2 = findViewById(R.id.text2);

        Toast.makeText(this, "Ir a la actividad dos",Toast.LENGTH_LONG).show();


    }

    public void goBack(View view) {
        Intent intent = new Intent( this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
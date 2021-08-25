package com.example.example01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvWelcome;
    CheckBox checkBox1, checkBox2, checkBox3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBox1 = findViewById(R.id.checkBox1);
        checkBox2 = findViewById(R.id.checkBox2);
        checkBox3 = findViewById(R.id.checkBox3);

        tvWelcome = findViewById(R.id.tvWelcome);

    }

    public void goNext(View view) {
        Intent intent = new Intent( this, SecondActivity.class);
        startActivity(intent);

    }
}
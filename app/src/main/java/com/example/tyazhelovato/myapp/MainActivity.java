package com.example.tyazhelovato.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView myTextView = (TextView) findViewById(R.id.myText);
        myTextView.setText("Сашеватый какашеватый");

        Button myBtn = (Button) findViewById(R.id.myBtn);
        myBtn.setText("Марусина кнопочка");


    }
}
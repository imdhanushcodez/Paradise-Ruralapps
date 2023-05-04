package com.example.paradise;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageButton;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class spcl extends AppCompatActivity {
AppCompatImageButton k;
AppCompatButton k2;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pot2);

        k = findViewById(R.id.existspcl);
        k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(spcl.this,ushome.class);
                startActivity(i);
            }
        });

        k2 = findViewById(R.id.spclbuy01);
        k2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(spcl.this,details.class);
                startActivity(i);
            }
        });
    }
}
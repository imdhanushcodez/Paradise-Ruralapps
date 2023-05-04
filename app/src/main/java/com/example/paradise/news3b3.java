package com.example.paradise;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageButton;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class news3b3 extends AppCompatActivity {
    AppCompatButton k;
    AppCompatImageButton k2;
    @SuppressLint("MissingInflatedId")

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news3b3);
        k=findViewById(R.id.eng3);
        k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(news3b3.this,news3a3.class);
                startActivity(i);
            }
        });

        k2=findViewById(R.id.existnewst3);
        k2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(news3b3.this,news.class);
                startActivity(i);
            }
        });

    }
}
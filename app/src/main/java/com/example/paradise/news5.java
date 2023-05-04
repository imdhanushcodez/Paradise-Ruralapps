package com.example.paradise;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageButton;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class news5 extends AppCompatActivity {
    AppCompatButton k;
    AppCompatImageButton k2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news5);
        k = findViewById(R.id.eng5);
        k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(news5.this,news5b.class);
                startActivity(i);
            }
        });

        k2 = findViewById(R.id.exist5t);
        k2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(news5.this,news.class);
                startActivity(i);
            }
        });
    }
}
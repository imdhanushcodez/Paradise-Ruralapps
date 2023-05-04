package com.example.paradise;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageButton;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class news5b extends AppCompatActivity {
    AppCompatButton k;
    AppCompatImageButton k2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news5b);
        k=findViewById(R.id.ta5);
        k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(news5b.this,news5.class);
                startActivity(i);
            }
        });

        k2=findViewById(R.id.exist5e);
        k2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(news5b.this,news.class);
                startActivity(i);
            }
        });


    }
}
package com.example.paradise;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageButton;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class news3a3 extends AppCompatActivity {
    AppCompatButton k;
    AppCompatImageButton k2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news3a3);
         k= findViewById(R.id.tamil3);
         k.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent i = new Intent(news3a3.this,news3b3.class);
                 startActivity(i);
             }
         });

         k2=findViewById(R.id.ese3);
         k2.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent i = new Intent(news3a3.this,news.class);
                 startActivity(i);
             }
         });
    }
}
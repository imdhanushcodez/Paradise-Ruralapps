package com.example.paradise;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageButton;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class art1 extends AppCompatActivity {
    AppCompatImageButton k;
    AppCompatButton v;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_art1);
         k=findViewById(R.id.existart1);
         k.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent i = new Intent(art1.this,artlist.class);
                 startActivity(i);
             }
         });

        v=findViewById(R.id.artist01);
        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(art1.this,details.class);
                startActivity(i);
            }
        });
    }
}
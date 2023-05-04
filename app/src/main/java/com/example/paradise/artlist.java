package com.example.paradise;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageButton;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class artlist extends AppCompatActivity {
    AppCompatButton k1,k2,k3,k4,k5,k6;
    AppCompatImageButton r1;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artlist);

        k1 = findViewById(R.id.book11);
        k1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(artlist.this,art1.class);
                startActivity(i);
            }
        });

        k2 = findViewById(R.id.book12);
        k2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(artlist.this,art2.class);
                startActivity(i);
            }
        });

        k3 = findViewById(R.id.book13);
        k3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(artlist.this,art3.class);
                startActivity(i);
            }
        });

        k4 = findViewById(R.id.book14);
        k4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(artlist.this,art4.class);
                startActivity(i);
            }
        });

        k5 = findViewById(R.id.book15);
        k5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(artlist.this,art5.class);
                startActivity(i);
            }
        });

        k6 = findViewById(R.id.book16);
        k6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(artlist.this,art6.class);
                startActivity(i);
            }
        });

        r1=findViewById(R.id.existartlist1);
        r1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(artlist.this,ushome.class);
                startActivity(i);
            }
        });





    }
}
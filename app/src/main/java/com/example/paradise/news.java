package com.example.paradise;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageButton;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class news extends AppCompatActivity {
    AppCompatImageButton k1,k2,k3,k4,k5,k6,k7,k8,k9,e;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
        k1=findViewById(R.id.newss1);
        k1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(news.this,news1.class);
                startActivity(i);
            }
        });

        e=findViewById(R.id.e1);
        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(news.this,ushome.class);
                startActivity(i);
            }
        });

        k2=findViewById(R.id.newss2);
        k2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(news.this,errornews2.class);
                startActivity(i);
            }
        });

        k3=findViewById(R.id.newss3);
        k3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(news.this,news41.class);
                startActivity(i);
            }
        });

        k4=findViewById(R.id.newss4);
        k4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(news.this,news3b3.class);
                startActivity(i);
            }
        });

        k5=findViewById(R.id.newss5);
        k5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(news.this,news5.class);
                startActivity(i);
            }
        });

        k6=findViewById(R.id.newss2);
        k6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(news.this,errornews2.class);
                startActivity(i);
            }
        });

      /*  k7=findViewById(R.id.newss7);
        k7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(news.this,news31.class);
                startActivity(i);
            }
        });*/

        k8=findViewById(R.id.newss2);
        k8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(news.this,errornews2.class);
                startActivity(i);
            }
        });

        k9=findViewById(R.id.newss9);
        k9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(news.this,news9.class);
                startActivity(i);
            }
        });



    }
}
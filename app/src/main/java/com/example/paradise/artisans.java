package com.example.paradise;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageButton;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class artisans extends AppCompatActivity {
    private AppCompatButton k1,k2,k3,k4,k5,k6,k7,k8,k9,k11,k12,k13,k14,k15,k10;
    private AppCompatImageButton ik;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.artisans);
        ik = findViewById(R.id.existart);
        ik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(artisans.this,ushome.class);
                startActivity(i);
            }
        });

        k1 = findViewById(R.id.prod1);
        k1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(artisans.this,pot2.class);
                startActivity(i);
            }
        });

        k2 = findViewById(R.id.prod2);
        k2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(artisans.this,pot3.class);
                startActivity(i);
            }
        });

        k3 = findViewById(R.id.prod3);
        k3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(artisans.this,pot4.class);
                startActivity(i);
            }
        });

        k4 = findViewById(R.id.prod4);
        k4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(artisans.this,pot5.class);
                startActivity(i);
            }
        });

        k5 = findViewById(R.id.prod5);
        k5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(artisans.this,pot6.class);
                startActivity(i);
            }
        });

        k6 = findViewById(R.id.prod6);
        k6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(artisans.this,wood3.class);
                startActivity(i);
            }
        });

        k7 = findViewById(R.id.prod7);
        k7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(artisans.this,wood33.class);
                startActivity(i);
            }
        });

        k8 = findViewById(R.id.prod8);
        k8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(artisans.this,wood4.class);
                startActivity(i);
            }
        });

        k9 = findViewById(R.id.prod9);
        k9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(artisans.this,wood5.class);
                startActivity(i);
            }
        });

        k10 = findViewById(R.id.prod10);
        k10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(artisans.this,toy2.class);
                startActivity(i);
            }
        });

        k11 = findViewById(R.id.prod11);
        k11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(artisans.this,toy3.class);
                startActivity(i);
            }
        });

        k12 = findViewById(R.id.prod12);
        k12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(artisans.this,toy4.class);
                startActivity(i);
            }
        });

        k13 = findViewById(R.id.prod13);
        k13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(artisans.this,toy5.class);
                startActivity(i);
            }
        });

        k14 = findViewById(R.id.prod14);
        k14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(artisans.this,toy6.class);
                startActivity(i);
            }
        });


    }
}
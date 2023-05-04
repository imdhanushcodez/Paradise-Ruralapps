package com.example.paradise;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageButton;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class produts extends AppCompatActivity {
    AppCompatButton v1,v2,v3,v4,v5,v6,v7,v8,v9,v10,v11,v12,v13,v14;
AppCompatImageButton k;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produts);
         k = findViewById(R.id.existpr);
         k.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent i = new Intent(produts.this,ushome.class);
                 startActivity(i);
             }
         });

         v1 = findViewById(R.id.vie1);
         v1.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent i = new Intent(produts.this,details.class);
                 startActivity(i);
             }
         });

        v2 = findViewById(R.id.vie2);
        v2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(produts.this,details.class);
                startActivity(i);
            }
        });

        v3 = findViewById(R.id.vie3);
        v3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(produts.this,details.class);
                startActivity(i);
            }
        });

        v4 = findViewById(R.id.vie4);
        v4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(produts.this,details.class);
                startActivity(i);
            }
        });

        v5 = findViewById(R.id.vie5);
        v5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(produts.this,details.class);
                startActivity(i);
            }
        });

        v6 = findViewById(R.id.vie6);
        v6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(produts.this,details.class);
                startActivity(i);
            }
        });

        v7 = findViewById(R.id.vie7);
        v7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(produts.this,details.class);
                startActivity(i);
            }
        });

        v8 = findViewById(R.id.vie8);
        v8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(produts.this,details.class);
                startActivity(i);
            }
        });

        v9 = findViewById(R.id.vie9);
        v9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(produts.this,details.class);
                startActivity(i);
            }
        });

        v10 = findViewById(R.id.vie10);
        v10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(produts.this,details.class);
                startActivity(i);
            }
        });

        v11 = findViewById(R.id.vie11);
        v11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(produts.this,details.class);
                startActivity(i);
            }
        });

        v12 = findViewById(R.id.vie12);
        v12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(produts.this,details.class);
                startActivity(i);
            }
        });

        v13 = findViewById(R.id.vie13);
        v13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(produts.this,details.class);
                startActivity(i);
            }
        });

        v14 = findViewById(R.id.vie14);
        v14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(produts.this,details.class);
                startActivity(i);
            }
        });
    }
}
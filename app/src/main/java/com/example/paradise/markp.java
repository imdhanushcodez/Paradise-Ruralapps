package com.example.paradise;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageButton;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class markp extends AppCompatActivity {
    private AppCompatButton k,v2,v3,v4,v5,v6,v7,v8,v9,v10,v11,v12;
    private AppCompatImageButton e;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.marketprice);
        k = findViewById(R.id.view1);
        k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(markp.this,grp.class);
                startActivity(i);
            }
        });

        e = findViewById(R.id.exist31);
        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(markp.this,ushome.class);
                startActivity(i);
            }
        });

        v2= findViewById(R.id.view2);
        v2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(markp.this,graphblack.class);
                startActivity(i);
            }
        });

        v3= findViewById(R.id.view3);
        v3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(markp.this,tomato.class);
                startActivity(i);
            }
        });

        v4= findViewById(R.id.view4);
        v4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(markp.this,onion.class);
                startActivity(i);
            }
        });

        v5= findViewById(R.id.view5);
        v5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(markp.this,ladys.class);
                startActivity(i);
            }
        });

        v6= findViewById(R.id.view6);
        v6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(markp.this,banana.class);
                startActivity(i);
            }
        });

        v7= findViewById(R.id.view7);
        v7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(markp.this,cotton.class);
                startActivity(i);
            }
        });

        v8= findViewById(R.id.view8);
        v8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(markp.this,greengram.class);
                startActivity(i);
            }
        });

        v9= findViewById(R.id.view9);
        v9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(markp.this,carrot.class);
                startActivity(i);
            }
        });

        v10= findViewById(R.id.view10);
        v10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(markp.this,horsegram.class);
                startActivity(i);
            }
        });

        v11= findViewById(R.id.view11);
        v11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(markp.this,brinjal.class);
                startActivity(i);
            }
        });

        v12= findViewById(R.id.view12);
        v12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(markp.this,goa.class);
                startActivity(i);
            }
        });
    }
}

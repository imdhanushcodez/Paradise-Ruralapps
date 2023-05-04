package com.example.paradise;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class equipments extends AppCompatActivity {
    AppCompatButton a,b,c,d,e;
    AppCompatImageButton ab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_equipments);
        a = findViewById(R.id.eqbtn1);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(equipments.this,details.class);
                startActivity(i);
            }
        });

        ab = findViewById(R.id.existep);
        ab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(equipments.this,ushome.class);
                startActivity(i);
            }
        });

        b = findViewById(R.id.eqbtn2);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(equipments.this,details.class);
                startActivity(i);
            }
        });

        c = findViewById(R.id.eqbtn3);
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(equipments.this,details.class);
                startActivity(i);
            }
        });

        d = findViewById(R.id.eqbtn4);
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(equipments.this,details.class);
                startActivity(i);
            }
        });

        e = findViewById(R.id.eqbtn5);
        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(equipments.this,details.class);
                startActivity(i);
            }
        });
    }
}
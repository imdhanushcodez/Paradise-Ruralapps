package com.example.paradise;

import static com.example.paradise.R.id.exist12;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class brinjal extends AppCompatActivity {
    private AppCompatImageButton k;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.brinjal);
        k = findViewById(exist12);
        k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(brinjal.this,markp.class);
                startActivity(i);
            }
        });
    }
}
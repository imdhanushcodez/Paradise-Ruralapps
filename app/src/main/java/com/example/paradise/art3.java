package com.example.paradise;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class art3 extends AppCompatActivity {
    AppCompatImageButton k;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_art3);
        k=findViewById(R.id.existart3);
        k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(art3.this,artlist.class);
                startActivity(i);
            }
        });
    }
}
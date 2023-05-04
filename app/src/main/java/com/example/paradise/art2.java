package com.example.paradise;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class art2 extends AppCompatActivity {
    AppCompatImageButton k;
    AppCompatButton v;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_art2);
        k=findViewById(R.id.existart2);
        k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(art2.this,artlist.class);
                startActivity(i);
            }
        });

        /*v=findViewById(R.id.artist01);
        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(art1.this,details.class);
                startActivity(i);
            }
        });*/
    }
}
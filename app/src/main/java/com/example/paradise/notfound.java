package com.example.paradise;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageButton;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class notfound extends AppCompatActivity {
AppCompatImageButton k;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notfound);
         k =  findViewById(R.id.existnf);
         k.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent i = new Intent(notfound.this,ushome.class);
                 startActivity(i);
             }
         });

    }
}
package com.example.paradise;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class email extends AppCompatActivity {
    EditText a,b;
    AppCompatButton k;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email);
        a=findViewById(R.id.sub);
        b=findViewById(R.id.content);
        k=findViewById(R.id.mail);
        k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_SENDTO);
                i.setData(Uri.parse("mailto:"));
                i.putExtra(Intent.EXTRA_EMAIL,"dhanusmileking@gmail.com");
                i.putExtra(Intent.EXTRA_SUBJECT,a.getText().toString());
                i.putExtra(Intent.EXTRA_TEXT,b.getText().toString());
            }
        });
    }
}
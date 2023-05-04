package com.example.paradise;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class order extends AppCompatActivity {
TextView t;
LinearLayout lay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        String o = getIntent().getStringExtra("keyname");
        String o2 = getIntent().getStringExtra("keyname1");
        String o3 =  getIntent().getStringExtra("keyname2");
        String o4 =  getIntent().getStringExtra("keyname3");
        lay = findViewById(R.id.container);
        addc(o,o2,o3,o4);

    }
    @SuppressLint("MissingInflatedId")
    public void addc(String o,String o2,String o3,String o4)
    {
        View v = getLayoutInflater().inflate(R.layout.card,null);
        TextView vi = v.findViewById(R.id.tt2);
        TextView v2 = v.findViewById(R.id.tt1);
        TextView v3 = v.findViewById(R.id.tt3);
        TextView v4 = v.findViewById(R.id.tt4);
        vi.setText(o);
        v2.setText(o2);
        v3.setText(o3);
        v4.setText(o4);
        lay.addView(v);
    }
}
package com.example.paradise;

import static com.example.paradise.R.layout.activity_order;
import static com.example.paradise.R.layout.orders2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageButton;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class details extends AppCompatActivity {
    private EditText fn,ph,city,address,state,item,qq;
    private AppCompatButton but;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details);
         fn = findViewById(R.id.firstn);
         address = findViewById(R.id.addressn);
         item = findViewById(R.id.itemn);
         qq = findViewById(R.id.qauntityn);
         but = findViewById(R.id.ordern);
         but.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 String u = String.valueOf(fn.getText());
                 String u2 = String.valueOf(address.getText());
                 String u3 = String.valueOf(item.getText());
                 String u4 = String.valueOf(qq.getText());
                 Intent i = new Intent(details.this,order.class);
                 i.putExtra("keyname",u);
                 i.putExtra("keyname1",u2);
                 i.putExtra("keyname2",u3);
                 i.putExtra("keyname3",u4);

                 startActivity(i);
             }
         });
    }
}
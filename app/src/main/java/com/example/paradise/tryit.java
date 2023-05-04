package com.example.paradise;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class tryit extends AppCompatActivity {
    ViewFlipper vp;
    int array[] = {R.drawable.firstposter,R.drawable.addver2};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.doit);
        vp = findViewById(R.id.flip);
        for(int i=0;i<array.length;i++)
            images(array[i]);
    }
    public void images(int image)
    {
        ImageView i = new ImageView(this);
        i.setBackgroundResource(image);
        vp.addView(i);
        vp.setFlipInterval(3000);
        vp.setAutoStart(true);
        vp.setInAnimation(this, android.R.anim.slide_in_left);
        vp.setOutAnimation(this, android.R.anim.slide_out_right);
    }
}
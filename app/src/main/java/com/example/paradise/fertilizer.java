package com.example.paradise;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageButton;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class fertilizer extends AppCompatActivity {
    AppCompatImageButton jl;
    MediaPlayer mp,mp2,mp3;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fertilizer);

        jl = findViewById(R.id.existtips);
        jl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(fertilizer.this,ushome.class);
                startActivity(i);
            }
        });
    }
    public void play(View v)
    {
       if(mp==null)
        {
            mp = MediaPlayer.create(this,R.raw.green);
        }
        mp.start();
    }
    public void stop(View v)
    {
        stopp();
    }
    public void pause(View v)
    {
        if(mp != null){
            mp.pause();
        }
    }

    public void stopp()
    {
        if(mp != null)
        {
            mp.release();
            mp = null;
            Toast.makeText(this,"audiostopped",Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        stopp();
    }

    public void play2(View v)
    {
        if(mp2==null)
        {
            mp2 = MediaPlayer.create(this,R.raw.song2);
        }
        mp2.start();
    }
    public void stop2(View v)
    {
        stopp2();
    }
    public void pause2(View v)
    {
        if(mp2 != null){
            mp2.pause();
        }
    }

    public void stopp2()
    {
        if(mp2 != null)
        {
            mp2.release();
            mp2 = null;
            Toast.makeText(this,"audio stopped",Toast.LENGTH_SHORT).show();
        }
    }

    public void play3(View v)
    {
        if(mp3==null)
        {
            mp3 = MediaPlayer.create(this,R.raw.bug);
        }
        mp3.start();
    }
    public void stop3(View v)
    {
        stopp3();
    }
    public void pause3(View v)
    {
        if(mp3 != null){
            mp3.pause();
        }
    }

    public void stopp3()
    {
        if(mp3 != null)
        {
            mp3.release();
            mp3 = null;
            Toast.makeText(this,"audio stopped",Toast.LENGTH_SHORT).show();
        }
    }

}
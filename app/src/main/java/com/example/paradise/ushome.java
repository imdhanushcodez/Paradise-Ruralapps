package com.example.paradise;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageButton;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ViewFlipper;

public class ushome extends AppCompatActivity {
    private AppCompatImageButton k,na,pot,k1,news1,newsr2,newsr3,k17,up,s,ss,tra,em;
    private AppCompatButton but,call,spcl,see;
    EditText ed;
    public MediaPlayer mp;
    ViewFlipper vp;
    int array[] = {R.drawable.firstposter,R.drawable.post2,R.drawable.post3};

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ushome);

        vp = findViewById(R.id.flip);
        for(int i=0;i<array.length;i++)
            images(array[i]);

        k=findViewById(R.id.markps);
        k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ushome.this,markp.class);
                startActivity(i);
            }
        });


        up=findViewById(R.id.op);
        up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ushome.this,produts.class);
                startActivity(i);
            }
        });



        tra=findViewById(R.id.tra);
        tra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ushome.this,equipments.class);
                startActivity(i);
            }
        });


        ed=findViewById(R.id.searchspace);
        s=findViewById(R.id.searchbar);
        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String f = String.valueOf(ed.getText());
                f=f.toLowerCase();
                if(f.contains("rate"))
                {
                    Intent i = new Intent(ushome.this,markp.class);
                    startActivity(i);
                }
                else if(f.contains("mango") || f.contains("paddy") || f.contains("brinjal") || f.contains("guava") || f.contains("tomato") || f.contains("veg") || f.contains("fruits"))
                {
                    Intent i = new Intent(ushome.this,produts.class);
                    startActivity(i);
                }
                else if(f.contains("handcraft") || f.contains("pot") || f.contains("wood") || f.contains("leather"))
                {
                    Intent i = new Intent(ushome.this,artisans.class);
                    startActivity(i);
                }
                else if(f.contains("art"))
                {
                    Intent i = new Intent(ushome.this,artlist.class);
                    startActivity(i);
                }
                else if(f.contains("schem"))
                {
                    Intent i = new Intent(ushome.this,equipments.class);
                    startActivity(i);
                }
                else if(f.contains("equpi"))
                {
                    Intent i = new Intent(ushome.this,equipments.class);
                    startActivity(i);
                }
                else {
                    Intent i = new Intent(ushome.this,notfound.class);
                    startActivity(i);
                }
            }
        });


        news1=findViewById(R.id.whtnews1);
        news1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ushome.this,news1.class);
                startActivity(i);
            }
        });

        k17=findViewById(R.id.ids);
        k17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ushome.this,artlist.class);
                startActivity(i);
            }
        });

        see=findViewById(R.id.seeall1);
        see.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ushome.this,news.class);
                startActivity(i);
            }
        });

        spcl=findViewById(R.id.spcl1);
        spcl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ushome.this,spcl.class);
                startActivity(i);
            }
        });

        newsr2=findViewById(R.id.whtnews2);
        newsr2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ushome.this,errornews2.class);
                startActivity(i);
            }
        });

        newsr3=findViewById(R.id.whtnews3);
        newsr3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ushome.this,ename31.class);
                startActivity(i);
            }
        });

        call = findViewById(R.id.treat2);
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:"+"8973645887"));
                startActivity(intent);
            }
        });

        k1 = findViewById(R.id.ferts);
        k1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ushome.this,fertilizer.class);
                startActivity(i);
            }
        });

       /* k17 = findViewById(R.id.ids);
        k17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ushome.this,order.class);
                startActivity(i);
            }
        });*/



        na=findViewById(R.id.navi1);
        na.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ushome.this,navi.class);
                startActivity(i);
            }
        });

        pot=findViewById(R.id.potterybtn);
        pot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ushome.this,artisans.class);
                startActivity(i);
            }
        });

        but=findViewById(R.id.treat);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent i = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                    startActivity(i);
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
        });

        mp = MediaPlayer.create(this,R.raw.songss);

    }

    public void images(int image)
    {
        ImageView i = new ImageView(this);
        i.setBackgroundResource(image);
        vp.addView(i);
        vp.setFlipInterval(2000);
        vp.setAutoStart(true);
        vp.setInAnimation(this, android.R.anim.slide_in_left);
        vp.setOutAnimation(this, android.R.anim.slide_out_right);
    }

    public void play(View v)
    {
       /* if(mp==null)
        {
            mp = MediaPlayer.create(this,R.raw.songss);
        }*/
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
            Toast.makeText(this,"mediaplayer",Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        stopp();
    }
}
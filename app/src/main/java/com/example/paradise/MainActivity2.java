package com.example.paradise;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageButton;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity2 extends AppCompatActivity {
    private AppCompatImageButton k;
    private AppCompatButton j,login;
    private EditText a,b;
    FirebaseAuth mAuth;
     // @Override
    /*public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = mAuth.getCurrentUser();
        if(currentUser != null){
            Intent i = new Intent(MainActivity2.this,ushome.class);
            startActivity(i);
            finish();
        }
    }*/


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page11);
        a=findViewById(R.id.logus);
        b=findViewById(R.id.logpass);
        mAuth= FirebaseAuth.getInstance();
        login=findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String em,pass;
                em= String.valueOf(a.getText());
                pass= String.valueOf(b.getText());
                mAuth.signInWithEmailAndPassword(em, pass)
                        .addOnCompleteListener( new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if (task.isSuccessful()) {
                                    // Sign in success, update UI with the signed-in user's information
                                    Toast.makeText(MainActivity2.this, "logined successfully",
                                            Toast.LENGTH_SHORT).show();
                                    if(em.contains(".ad"))
                                    {
                                        Intent i = new Intent(MainActivity2.this,adhome.class);
                                        startActivity(i);
                                        finish();
                                    }
                                    else {
                                        Intent i = new Intent(MainActivity2.this, ushome.class);
                                        startActivity(i);
                                        finish();
                                    }


                                } else {
                                    // If sign in fails, display a message to the user.

                                    Toast.makeText(MainActivity2.this, "Authentication failed.",
                                            Toast.LENGTH_SHORT).show();

                                }
                            }
                        });


            }
        });
        k = findViewById(R.id.exist);
        k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity2.this,MainActivity.class);
                startActivity(i);
            }
        });

        j = findViewById(R.id.reg);
        j.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity2.this,registration.class);
                startActivity(i);
            }
        });
    }
}
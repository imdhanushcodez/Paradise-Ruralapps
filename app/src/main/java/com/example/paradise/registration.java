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

public class registration extends AppCompatActivity {
    private AppCompatImageButton k;
    private EditText a,b,c;
    private AppCompatButton but;
    FirebaseAuth mAuth;

   /* @Override
    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = mAuth.getCurrentUser();
        if(currentUser != null){
            Intent i = new Intent(registration.this,ushome.class);
            startActivity(i);
            finish();
        }
    }*/

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resgiration);
        mAuth= FirebaseAuth.getInstance();
        k=findViewById(R.id.exist1);
        k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(registration.this,MainActivity2.class);
                startActivity(i);
            }
        });

        a=findViewById(R.id.resu);
        b=findViewById(R.id.regemail);
        c=findViewById(R.id.regpass);
        but=findViewById(R.id.reg);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String us,em,pass;
                us= String.valueOf(a.getText());
                em= String.valueOf(b.getText());
                pass= String.valueOf(c.getText());

                mAuth.createUserWithEmailAndPassword(em, pass)
                        .addOnCompleteListener( new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if (task.isSuccessful()) {
                                    // Sign in success, update UI with the signed-in user's information

                                    Toast.makeText(registration.this, "account created",
                                            Toast.LENGTH_SHORT).show();
                                    Intent i = new Intent(registration.this,MainActivity2.class);
                                    startActivity(i);


                                } else {
                                    // If sign in fails, display a message to the user.
                                    Toast.makeText(registration.this, "Authentication failed.",
                                            Toast.LENGTH_SHORT).show();

                                }
                            }
                        });


            }
        });

    }
}
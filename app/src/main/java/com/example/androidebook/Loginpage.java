package com.example.androidebook;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.button.MaterialButton;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;


public class Loginpage extends AppCompatActivity {

    MaterialButton google;

    MaterialButton login;
    EditText e1,e2;
    FirebaseAuth fAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginpage);
        TextView textView = findViewById(R.id.textView3);

        login = findViewById(R.id.login);
        e1 = findViewById(R.id.email);
        e2 = findViewById(R.id.pass);
        fAuth = FirebaseAuth.getInstance();
        EditText emailEditText = findViewById(R.id.email);

        emailEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean hasFocus) {
                if (hasFocus) {
                    // Hide the drawableLeft icon when EditText gains focus
                    emailEditText.setCompoundDrawablesWithIntrinsicBounds(null, null, null, null);
                } else {
                    // Optional: Show the icon again when focus is lost
                    Drawable icon = getResources().getDrawable(R.drawable.email2);
                    emailEditText.setCompoundDrawablesWithIntrinsicBounds(icon, null, null, null);
                }
            }
        });
        EditText password= findViewById(R.id.pass);

        password.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean hasFocus) {
                if (hasFocus) {
                    // Hide the drawableLeft icon when EditText gains focus
                    password.setCompoundDrawablesWithIntrinsicBounds(null, null, null, null);
                } else {
                    // Optional: Show the icon again when focus is lost
                    Drawable icon = getResources().getDrawable(R.drawable.padlock);
                    password.setCompoundDrawablesWithIntrinsicBounds(icon, null, null, null);
                }
            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = e1.getText().toString().trim();
                String password = e2.getText().toString().trim();
                if (email.isEmpty()) {
                    e2.setError("Email is Required.");
                    return;
                }
                if (password.isEmpty()) {
                    e2.setError("Password is Required.");
                    return;
                }
                if (password.length() < 6) {
                    e2.setError("Password must be grater than or equal to 6");
                    return;
                }
                fAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            Toast.makeText(Loginpage.this, "Login Successfully", Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(Loginpage.this, MainActivity3.class));
                        } else {
                            // Handle other authentication errors
                            Toast.makeText(Loginpage.this, "Error! " + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                        }

                    }
                });
            }
        });

        SpannableString spannableString = new SpannableString("Don't have any account? Sign-up");
        ClickableSpan clickableSpan = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View widget) {

                Intent browserIntent = new Intent(Loginpage.this, signup.class);
                startActivity(browserIntent);
            }
        };
        // Set the ClickableSpan for a specific range of characters in the SpannableString
        // Set the ClickableSpan for a specific range of characters in the SpannableString
        spannableString.setSpan(clickableSpan, 23, 31, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);


        // Apply the SpannableString to the TextView
        textView.setText(spannableString);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        // Enable the movement method for the TextView to make it clickable

    }
}
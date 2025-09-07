package com.example.androidebook;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
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

public class signup extends AppCompatActivity {
    EditText usernameEditText, emailEditText, passwordEditText;
    MaterialButton signUpButton;
    FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        TextView loginLinkTextView = findViewById(R.id.textView3);
        usernameEditText = findViewById(R.id.username);
        emailEditText = findViewById(R.id.email);
        passwordEditText = findViewById(R.id.pass);
        signUpButton = findViewById(R.id.materialButton);
        firebaseAuth = FirebaseAuth.getInstance();
        EditText emailEditText1 = findViewById(R.id.username);

        emailEditText1.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean hasFocus) {
                if (hasFocus) {
                    // Hide the drawableLeft icon when EditText gains focus
                    emailEditText1.setCompoundDrawablesWithIntrinsicBounds(null, null, null, null);
                } else {
                    // Optional: Show the icon again when focus is lost
                    Drawable icon = getResources().getDrawable(R.drawable.user);
                    emailEditText1.setCompoundDrawablesWithIntrinsicBounds(icon, null, null, null);
                }
            }
        });
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

        SpannableString spannableString = new SpannableString("Already have an account? Login-in");
        ClickableSpan clickableSpan = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View widget) {
                startActivity(new Intent(signup.this, Loginpage.class));
            }
        };

        spannableString.setSpan(clickableSpan, 26, 32, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        loginLinkTextView.setText(spannableString);
        loginLinkTextView.setMovementMethod(LinkMovementMethod.getInstance());

        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = emailEditText.getText().toString().trim();
                String password = passwordEditText.getText().toString().trim();

                if (email.isEmpty()) {
                    emailEditText.setError("Email is required.");
                    return;
                }
                if (password.isEmpty()) {
                    passwordEditText.setError("Password is required.");
                    return;
                }
                if (password.length() < 6) {
                    passwordEditText.setError("Password must be at least 6 characters long.");
                    return;
                }

                firebaseAuth.createUserWithEmailAndPassword(email, password)
                        .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if (task.isSuccessful()) {
                                    Toast.makeText(signup.this, "User Created", Toast.LENGTH_SHORT).show();
                                    startActivity(new Intent(signup.this, Loginpage.class));
                                    finish(); // Optionally finish this activity
                                } else {
                                    // Handle Firebase authentication failures
                                    String errorMessage = "Error creating user: ";
                                    Exception exception = task.getException();
                                    if (exception != null) {
                                        errorMessage += exception.getMessage();
                                    }
                                    Toast.makeText(signup.this, errorMessage, Toast.LENGTH_SHORT).show();
                                }
                            }
                        });
            }
        });
    }
}

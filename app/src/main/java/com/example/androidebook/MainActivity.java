package com.example.androidebook;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private static final long DELAY_MILLIS = 5000; // 5 seconds delay

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Delayed action to start the login activity
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, Loginpage.class);
                startActivity(intent);
                finish(); // Optional: finish MainActivity so it's removed from the back stack
            }
        }, DELAY_MILLIS);
    }
}

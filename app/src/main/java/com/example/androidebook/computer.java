package com.example.androidebook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.button.MaterialButton;

public class computer extends AppCompatActivity {
   Button b1;
   MaterialButton m1,m2,m3,m4,m5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_computer);
        b1=findViewById(R.id.arrow);
        m1=findViewById(R.id.java);
        m2=findViewById(R.id.software);
        m3=findViewById(R.id.GUI);
        m4=findViewById(R.id.Dcc);
        m5=findViewById(R.id.MIC);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(computer.this,SemesterActivity.class);
                startActivity(intent);
            }
        });
        m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://drive.google.com/file/d/1JgdIykhJFtcO2vMg5succ6fYvNA1-mH0/view?usp=drive_link"));
                startActivity(intent);
            }
        });
        m2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://drive.google.com/file/d/12Wf62PtuYrsuloYGi7BhrgD-UmTfxdpr/view?usp=drive_link"));
                startActivity(intent);
            }
        });
        m3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://drive.google.com/file/d/1BD5xh6_BwWpqJHAjx8KCwZD0DT9zbzbd/view?usp=drivesdk"));
                startActivity(intent);
            }
        });
        m4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://drive.google.com/file/d/1UKa_np3T9UfNzqpCyDXqcWBmzhrfJv4h/view?usp=drive_link"));
                startActivity(intent);
            }
        });
        m5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://drive.google.com/file/d/1NZB4LNz_Omrr4olGIL5wlGlbCad5GRhi/view?usp=drive_link"));
                startActivity(intent);
            }
        });

    }
}
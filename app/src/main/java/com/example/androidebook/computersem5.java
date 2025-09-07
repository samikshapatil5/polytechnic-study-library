package com.example.androidebook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.button.MaterialButton;

public class computersem5 extends AppCompatActivity {
    Button b1;
    MaterialButton m1,m2,m3,m4,m5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_computersem5);
        b1=findViewById(R.id.arrow);
        m1=findViewById(R.id.EVS);
        m2=findViewById(R.id.OSY);
        m3=findViewById(R.id.AJP);
        m4=findViewById(R.id.CSS);
        m5=findViewById(R.id.STE);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(computersem5.this,SemesterActivity.class);
                startActivity(intent);
            }
        });
        m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://drive.google.com/file/d/1GR6LxiuzlFZcrkhz3yECgNhfRFG-3xWM/view?usp=drive_link"));
                startActivity(intent);
            }
        });
        m2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://drive.google.com/file/d/1-nqIs4IdHt1Xdw1H69MSb98ZHHCy5IC9/view?usp=drive_link"));
                startActivity(intent);
            }
        });
        m3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://drive.google.com/file/d/1_fGlrFGvLcBebGTTwPqDxOi0qEUOHHvu/view?usp=drive_link"));
                startActivity(intent);
            }
        });
        m4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://drive.google.com/file/d/1sd4Mrk8ZrgUVl0rV8Ijk8RpvjsdH75_-/view?usp=drive_link"));
                startActivity(intent);
            }
        });
        m5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://drive.google.com/file/d/17qS67ZXMH3-aUrAd839vkjs2rBvZziR2/view?usp=drive_link"));
                startActivity(intent);
            }
        });

    }
}
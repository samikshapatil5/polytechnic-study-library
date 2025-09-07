package com.example.androidebook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.button.MaterialButton;

public class computersem2 extends AppCompatActivity {
    Button b1;
    MaterialButton m1,m2,m3,m4,m5,m6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_computersem2);
        b1=findViewById(R.id.arrow);
        m1=findViewById(R.id.math);
        m2=findViewById(R.id.BE);
        m3=findViewById(R.id.pci);
        m4=findViewById(R.id.CPH);
        m5=findViewById(R.id.html);
        m6=findViewById(R.id.EEE);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(computersem2.this,SemesterActivity.class);
                startActivity(intent);
            }
        });
        m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://drive.google.com/file/d/0B0vdR_jt9M--YkVMTjV0eVFMNWc/view?usp=drive_link&resourcekey=0-v1P31aMWnkA0hYiPQYklcA"));
                startActivity(intent);
            }
        });
        m2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://drive.google.com/file/d/14rcR1tZQSKhCMgkSeR4Y6fKcXnyG1ImC/view?usp=drive_link"));
                startActivity(intent);
            }
        });
        m3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://drive.google.com/file/d/0B633TIYUDLMZVGlGdkZHcXl2S0E/view?usp=drive_link&resourcekey=0-G34Gwa9S-pBvgCZ0BVyHjQ"));
                startActivity(intent);
            }
        });
        m4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://drive.google.com/file/d/1K62WCCkX2Y6uYfwcTzrQk-93ji2s_vb0/view?usp=drive_link"));
                startActivity(intent);
            }
        });
        m5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://drive.google.com/file/d/1C9U6sbpvDoR0_-Rhulu8xCuiScxbEHAC/view?usp=drive_link"));
                startActivity(intent);
            }
        });
        m6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://drive.google.com/file/d/1HHVR6qM0MWGi_SFHgtVQfWe3u9KxAw0f/view?usp=drive_link"));
                startActivity(intent);
            }
        });


    }
}
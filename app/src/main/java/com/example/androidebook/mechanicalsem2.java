package com.example.androidebook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.button.MaterialButton;

public class mechanicalsem2 extends AppCompatActivity {
    Button b1;
    MaterialButton m1,m2,m3,m4,m5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mechanicalsem2);
        b1=findViewById(R.id.arrow);
        m1=findViewById(R.id.sc);
        m2=findViewById(R.id.mech);
        m3=findViewById(R.id.math);
        m4=findViewById(R.id.drawing);
        m5=findViewById(R.id.bcc);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(mechanicalsem2.this,Mechnicalsem.class);
                startActivity(intent);
            }
        });
        m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://drive.google.com/file/d/1HI0t7S7bJfWOVukExJa_JxxSSSWf_8yy/view?usp=drive_link"));
                startActivity(intent);
            }
        });
        m2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://drive.google.com/file/d/1L7WHYMb6Eu2QOgM_4cknOq4f4VKKcwzG/view?usp=drive_link"));
                startActivity(intent);
            }
        });
        m3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://drive.google.com/file/d/0B0vdR_jt9M--YkVMTjV0eVFMNWc/view?usp=drive_link&resourcekey=0-v1P31aMWnkA0hYiPQYklcA"));
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
                intent.setData(Uri.parse("https://drive.google.com/file/d/1poYFvgeV59ODn7voxoxcoJOUjvXn2TEX/view?usp=drive_link"));
                startActivity(intent);
            }
        });


    }
}
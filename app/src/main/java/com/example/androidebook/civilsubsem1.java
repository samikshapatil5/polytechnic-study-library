package com.example.androidebook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.button.MaterialButton;

public class civilsubsem1 extends AppCompatActivity {
    Button b1;
    MaterialButton m1,m2,m3,m4,m5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_civilsubsem1);
        b1=findViewById(R.id.arrow);
        m1=findViewById(R.id.ict);
        m2=findViewById(R.id.english);
        m3=findViewById(R.id.science);
        m4=findViewById(R.id.Math);
        m5=findViewById(R.id.graphics);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(civilsubsem1.this,civilsem.class);
                startActivity(intent);
            }
        });
        m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://drive.google.com/file/d/19hpoRq6yRCq86Ha5IUJV_7zoqvmfg6eI/view?usp=drive_link"));
                startActivity(intent);
            }
        });
        m2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://drive.google.com/file/d/1wSHau7mcre__h8Pd116bi14vVd3y6LNE/view?usp=drive_link"));
                startActivity(intent);
            }
        });
        m3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://drive.google.com/file/d/1iJBRP0r_MuR0YP938ntpSaIchm5-29BB/view?usp=drive_link"));
                startActivity(intent);
            }
        });
        m4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://drive.google.com/file/d/0B0vdR_jt9M--YkVMTjV0eVFMNWc/view?usp=drive_link&resourcekey=0-v1P31aMWnkA0hYiPQYklcA"));
                startActivity(intent);
            }
        });
        m5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://drive.google.com/file/d/1K62WCCkX2Y6uYfwcTzrQk-93ji2s_vb0/view?usp=drive_link"));
                startActivity(intent);
            }
        });

    }
}
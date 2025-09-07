package com.example.androidebook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.button.MaterialButton;

public class SemesterActivity extends AppCompatActivity {
    Button b1;
    MaterialButton m1,m2,m3,m4,m5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.semester);
        b1=findViewById(R.id.arrow);
        m1=findViewById(R.id.s4);
        m2=findViewById(R.id.fifth);
        m3=findViewById(R.id.sixth);
        m4=findViewById(R.id.first);
        m5=findViewById(R.id.second);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(SemesterActivity.this, MainActivity.class);
                startActivity(intent1);
            }
        });
        m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2=new Intent(SemesterActivity.this, computer.class);
                startActivity(intent2);
            }
        });
        m2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SemesterActivity.this, computersem5.class);
                startActivity(intent);
            }
        });
        m4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SemesterActivity.this,Computersem1.class);
                startActivity(intent);
            }
        });
        m5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SemesterActivity.this,computersem2.class);
                startActivity(intent);
            }
        });

    }
}
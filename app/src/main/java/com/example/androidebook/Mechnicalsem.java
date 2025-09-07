package com.example.androidebook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.button.MaterialButton;

public class Mechnicalsem extends AppCompatActivity {
   Button b1;
    MaterialButton m1,m2,m3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mechnicalsem);
        b1=findViewById(R.id.arrow);
        m1=findViewById(R.id.first);
        m2=findViewById(R.id.second);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Mechnicalsem.this, MainActivity.class);
                startActivity(intent);
            }
        });m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2=new Intent(Mechnicalsem.this, mechanicalsem1.class);
                startActivity(intent2);
            }
        });
        m2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2=new Intent(Mechnicalsem.this, mechanicalsem2.class);
                startActivity(intent2);
            }
        });


    }
}
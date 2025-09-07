package com.example.androidebook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class MainActivity3 extends AppCompatActivity {
    CardView c1,c2,c3,c4,c5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        c1=findViewById(R.id.comp);
        c2=findViewById(R.id.civil);
        c3=findViewById(R.id.ET);
        c4=findViewById(R.id.electric1);
        c5=findViewById(R.id.Mech2);
        c1.setOnClickListener(v -> {
            Intent intent=new Intent(MainActivity3.this, SemesterActivity.class);
            startActivity(intent);

        });
        c5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity3.this, Mechnicalsem.class);
                startActivity(intent);
            }
        });
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity3.this, civilsem.class);
                startActivity(intent);
            }
        });
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity3.this, Electronics.class);
                startActivity(intent);
            }
        });
        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity3.this, Electrical.class);
                startActivity(intent);
            }
        });

    }
}
package com.example.androidebook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.button.MaterialButton;

public class electronicssem2 extends AppCompatActivity {
    Button b1;
    MaterialButton m1,m2,m3,m4,m5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electronicssem2);
        b1=findViewById(R.id.arrow);
        m1=findViewById(R.id.math);
        m2=findViewById(R.id.EET);
        m3=findViewById(R.id.EEM);
        m4=findViewById(R.id.ele);
        m5=findViewById(R.id.cprom);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(electronicssem2.this,Electronics.class);
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
                intent.setData(Uri.parse("https://drive.google.com/file/d/1HHVR6qM0MWGi_SFHgtVQfWe3u9KxAw0f/view?usp=drive_link"));
                startActivity(intent);
            }
        });
        m3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://drive.google.com/file/d/1Jxecq8N1zjpcFKtCb7UcBF4GWtZ4M45q/view?usp=drive_link"));
                startActivity(intent);
            }
        });
        m4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://drive.google.com/file/d/1-D-iW3ePo0upb_ORPc4oEY11ETa3_0IV/view?usp=drive_link"));
                startActivity(intent);
            }
        });
        m5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://drive.google.com/file/d/0B633TIYUDLMZVGlGdkZHcXl2S0E/view?usp=drive_link&resourcekey=0-G34Gwa9S-pBvgCZ0BVyHjQ"));
                startActivity(intent);

            }
        });

    }
}
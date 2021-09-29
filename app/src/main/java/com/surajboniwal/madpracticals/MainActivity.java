package com.surajboniwal.madpracticals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.surajboniwal.madpracticals.practical1.Practial1Activity;
import com.surajboniwal.madpracticals.practical2.Practical2Activity;
import com.surajboniwal.madpracticals.practical3.Practical3Activity;
import com.surajboniwal.madpracticals.practical4.Practical4Activity;
import com.surajboniwal.madpracticals.practical5.Practical5Activity;
import com.surajboniwal.madpracticals.practical6.Practical6Activity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        findViewById(R.id.prac1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Practial1Activity.class);
                startActivity(intent);
            }
        });


        findViewById(R.id.prac2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Practical2Activity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.prac3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Practical3Activity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.prac4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Practical4Activity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.prac5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Practical5Activity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.prac6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Practical6Activity.class);
                startActivity(intent);
            }
        });
    }
}
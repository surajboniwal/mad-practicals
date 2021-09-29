package com.surajboniwal.madpracticals.practical3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.surajboniwal.madpracticals.R;

public class Practical3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical3);

        findViewById(R.id.explicitIntent).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Practical3Activity.this, ExplicitActivity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.implicitIntent).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.setAction(Intent.ACTION_VIEW);
                i.setData(Uri.parse("content://call_log/calls/"));
                startActivity(i);
            }
        });
    }
}
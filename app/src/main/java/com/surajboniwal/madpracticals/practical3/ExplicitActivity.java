package com.surajboniwal.madpracticals.practical3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.surajboniwal.madpracticals.R;

public class ExplicitActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explicit);
    }
}
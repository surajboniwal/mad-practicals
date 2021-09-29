package com.surajboniwal.madpracticals.practical2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TableLayout;
import android.widget.Toast;

import com.surajboniwal.madpracticals.R;

public class Practical2Activity extends AppCompatActivity {

    LinearLayout linearLayout;
    RelativeLayout relativeLayout;
    TableLayout tableLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical2);

        linearLayout =  (LinearLayout) findViewById(R.id.linearlayout);
        relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);
        tableLayout = (TableLayout) findViewById(R.id.tableLayout);

        linearLayout.setVisibility(View.VISIBLE);


        findViewById(R.id.buttonLinear).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linearLayout.setVisibility(View.VISIBLE);
                relativeLayout.setVisibility(View.GONE);
                tableLayout.setVisibility(View.GONE);
                Toast.makeText(Practical2Activity.this, "Linear Layout Visible", Toast.LENGTH_SHORT).show();
            }
        });

        findViewById(R.id.buttonRelative).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linearLayout.setVisibility(View.GONE);
                relativeLayout.setVisibility(View.VISIBLE);
                tableLayout.setVisibility(View.GONE);
                Toast.makeText(Practical2Activity.this, "Relative Layout Visible", Toast.LENGTH_SHORT).show();

            }
        });

        findViewById(R.id.buttonLinear).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linearLayout.setVisibility(View.GONE);
                relativeLayout.setVisibility(View.GONE);
                tableLayout.setVisibility(View.VISIBLE);
                Toast.makeText(Practical2Activity.this, "Table Layout Visible", Toast.LENGTH_SHORT).show();

            }
        });


    }
}
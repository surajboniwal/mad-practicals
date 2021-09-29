package com.surajboniwal.madpracticals.practical6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.surajboniwal.madpracticals.R;

public class Practical6Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical6);

        ListItem[] myListData = new ListItem[] {
                new ListItem("Student 1", "https://randomuser.me/api/portraits/men/20.jpg"),
                new ListItem("Student 2", "https://randomuser.me/api/portraits/men/21.jpg"),
                new ListItem("Student 3", "https://randomuser.me/api/portraits/men/22.jpg"),
                new ListItem("Student 4", "https://randomuser.me/api/portraits/men/23.jpg"),
                new ListItem("Student 5", "https://randomuser.me/api/portraits/men/24.jpg"),
                new ListItem("Student 6", "https://randomuser.me/api/portraits/men/25.jpg"),
                new ListItem("Student 7", "https://randomuser.me/api/portraits/men/26.jpg"),
                new ListItem("Student 8", "https://randomuser.me/api/portraits/men/27.jpg"),
                new ListItem("Student 9", "https://randomuser.me/api/portraits/men/28.jpg"),
                new ListItem("Student 10", "https://randomuser.me/api/portraits/men/29.jpg"),
        };

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        ListAdapter adapter = new ListAdapter(myListData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

    }
}
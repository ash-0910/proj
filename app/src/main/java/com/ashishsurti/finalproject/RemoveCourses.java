package com.ashishsurti.finalproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class RemoveCourses extends AppCompatActivity {

    RecyclerView rv;
    CoursesData cd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_remove_courses);

        cd = new CoursesData();

        rv = findViewById(R.id.recyclerview);
        rv.setLayoutManager(new LinearLayoutManager(this));

        MyAdapter adapter = new MyAdapter(this,cd.Usercourses);
        rv.setAdapter(adapter);
    }
}

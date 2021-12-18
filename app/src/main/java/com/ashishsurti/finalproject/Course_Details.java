package com.ashishsurti.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Course_Details extends AppCompatActivity {

    TextView coursename , coursecode , courseprofessor , coursedescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_details);

        Intent intent = getIntent();
        String coursen = intent.getExtras().getString("coursename");

        CoursesData cd = new CoursesData();

        cd.courseInfo(coursen);

        coursename = findViewById(R.id.cname);
        coursecode = findViewById(R.id.ccode);
        courseprofessor = findViewById(R.id.cprofessor);
        coursedescription = findViewById(R.id.cdescription);

        coursename.setText(cd.coursename);
        coursecode.setText(cd.coursecode);
        courseprofessor.setText(cd.courseprofessor);
        coursedescription.setText(cd.coursedescription);



    }
}
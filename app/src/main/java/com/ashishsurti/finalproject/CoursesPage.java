package com.ashishsurti.finalproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class CoursesPage extends AppCompatActivity {

    Userdata userdata ;
    RecyclerView rv;
    CoursesData cd;

    Button rcyclerbtn;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courses_page);

        Intent intent = getIntent();
        String Sid = intent.getExtras().getString("StudentID");

        cd = new CoursesData();

        rv = findViewById(R.id.recyclerview);
        rv.setLayoutManager(new LinearLayoutManager(this));

        MyAdapter adapter = new MyAdapter(this,cd.Usercourses);
        rv.setAdapter(adapter);

        rcyclerbtn = findViewById(R.id.rcycbtn);



        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_nav_bar);

        bottomNavigationView.setSelectedItemId(R.id.navigation_Courses);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch(item.getItemId()){
                    case R.id.navigation_Courses:
                        return true;
                    case R.id.navigation_Profile:
                        Intent i = new Intent(getApplicationContext() , Profile_Page.class);
                        i.putExtra("StudentID", Sid);
                        startActivity(i);
                        finish();
                        break;
                }

                return false;
            }
        });
    }

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.options_menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem){
        switch (menuItem.getItemId()){
            case R.id.deletecourses:
                startActivity(new Intent(getApplicationContext(), RemoveCourses.class));
                break;
        }
        return true;
    }
}
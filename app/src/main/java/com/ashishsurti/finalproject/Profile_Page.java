package com.ashishsurti.finalproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class Profile_Page extends AppCompatActivity {

    TextInputEditText firstname , lastname , email, id ;
    TextInputLayout firstnamelayout , lastnamelayout , emaillayout , idlayout;
    RadioButton rbonline , rboffline;
    Button editbtn , donebtn;

    Userdata ud;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_page);

        Intent intent = getIntent();
        String Sid = intent.getExtras().getString("StudentID");

        ud = new Userdata();

        ud.Userdata(Sid);

        setViews();
        disableedittext();

        rbonline = findViewById(R.id.rbonline);
        rboffline = findViewById(R.id.rboffline);
        editbtn = findViewById(R.id.editbtn);
        donebtn = findViewById(R.id.donebtn);

        checkradiobuttons();
        disableradiobuttons();

        donebtn.setVisibility(View.GONE);

        firstname.setText(ud.firstname);
        lastname.setText(ud.lastname);
        email.setText(ud.email);
        id.setText(Sid);


       // firstname.setFocusable(false);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_nav_bar);

        bottomNavigationView.setSelectedItemId(R.id.navigation_Profile);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch(item.getItemId()){
                    case R.id.navigation_Courses:
                        Intent i = new Intent(getApplicationContext() , CoursesPage.class);
                        i.putExtra("StudentID", Sid);
                        startActivity(i);
                        finish();
                        break;
                    case R.id.navigation_Profile:
                        return true;
                }

                return false;
            }
        });

        editbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enableedittext();
                enableradiobuttons();
                editbtn.setVisibility(View.GONE);
                donebtn.setVisibility(View.VISIBLE);

            }
        });

        donebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disableedittext();
                disableradiobuttons();
                editbtn.setVisibility(View.VISIBLE);
                donebtn.setVisibility(View.GONE);

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

    public void setViews(){

        firstname = findViewById(R.id.firstnametext);
        lastname = findViewById(R.id.lastnametext);
        email = findViewById(R.id.emailtext);
        id = findViewById(R.id.idtext);

        firstnamelayout = findViewById(R.id.studentFirstName);
        lastnamelayout = findViewById(R.id.StudentLastName);
        emaillayout = findViewById(R.id.StudentEmail);
        idlayout = findViewById(R.id.StudentID);

    }

    public void disableedittext(){
        firstnamelayout.setEnabled(false);
        lastnamelayout.setEnabled(false);
        emaillayout.setEnabled(false);
        idlayout.setEnabled(false);
    }

    public void enableedittext(){
        firstnamelayout.setEnabled(true);
        lastnamelayout.setEnabled(true);
        emaillayout.setEnabled(true);
        idlayout.setEnabled(true);
    }

    public void disableradiobuttons(){
        rboffline.setEnabled(false);
        rbonline.setEnabled(false);
    }

    public void enableradiobuttons(){
        rboffline.setEnabled(true);
        rbonline.setEnabled(true);
    }

    public void checkradiobuttons(){
        String rbchk = ud.programofstudy;

        switch (rbchk){
            case "online":
                rbonline.setChecked(true);
                break;
            case "offline":
                rboffline.setChecked(true);
                break;

        }
    }
}
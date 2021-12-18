package com.ashishsurti.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    Button buttonLogin;
    TextView textViewRegister;

    TextInputLayout studentid,studentpass;
    TextInputEditText studentidtext, studentpasstext;

    Userdata userdata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userdata = new Userdata();

        buttonLogin = findViewById(R.id.signin);

        studentidtext = findViewById(R.id.studentidtext);
        studentpasstext = findViewById(R.id.studentpassword);



        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String sid = studentidtext.getText().toString().trim();
                String pass = studentpasstext.getText().toString().trim();

                if(sid.equals("")){
                    Toast.makeText(getApplicationContext(), "Please Enter Student ID", Toast.LENGTH_SHORT).show();
                }
                else if(sid.equals("")){
                    Toast.makeText(getApplicationContext(), "Please Enter Password", Toast.LENGTH_SHORT).show();
                }
                else{

                    if(sid.length()>0 && sid.length()<10) {

                        userdata.Userdata(sid);

                        if (userdata.message.equals("")) {
                            if (pass.equals(userdata.password)) {
                                Intent i = new Intent(getApplicationContext() , CoursesPage.class);
                                i.putExtra("StudentID", sid);
                                startActivity(i);
                                finish();
                            }
                            else{
                                Toast.makeText(getApplicationContext(), "Password is Incorrect", Toast.LENGTH_SHORT).show();
                            }
                        } else {
                            Toast.makeText(getApplicationContext(), userdata.message.toString(), Toast.LENGTH_SHORT).show();
                        }
                    }
                    else{
                        Toast.makeText(getApplicationContext(), "Student ID is invalid", Toast.LENGTH_SHORT).show();
                    }

                }






            }
        });
    }
}
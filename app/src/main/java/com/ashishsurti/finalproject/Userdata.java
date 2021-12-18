package com.ashishsurti.finalproject;

import androidx.annotation.NonNull;

import java.util.Locale;

public class Userdata {

    public String studentid , firstname , lastname , email , password, programofstudy , message = "";

    public void Userdata(@NonNull String studntId){


        switch (studntId.toLowerCase(Locale.ROOT)){
            case "a00244471":
                firstname="ashish";
                lastname="surti";
                email="a00244471@mycambrian.ca";
                password="ashish1234";
                programofstudy="online";
                studentid="a00244471";
                break;
            case "a00246892":
                firstname="mike";
                lastname="russel";
                email="a00246892@mycambrian.ca";
                password="mike1234";
                programofstudy="offline";
                studentid="a00246892";
                break;
                default:
                    message = "No user found";

        }
    }

    public String getStudentid(){
        return studentid;
    }

    public void setstudentid(String studentid){
        this.studentid = studentid;
    }
}

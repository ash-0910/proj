package com.ashishsurti.finalproject;

import android.widget.Switch;

public class CoursesData {

    public String coursename , coursecode , courseprofessor , coursedescription;

    public String[] courses = new String[]{"App Development for Web", "App Development for Android", "App Development for iOS" ,
     "Database Mgmt & Warehousing" , "Foundations of B.A." };

    public String[] Usercourses = new String[]{"App Development for Web", "App Development for Android", "App Development for iOS" ,
            "Database Mgmt & Warehousing" , "Foundations of B.A." };



    public void courseInfo(String courses){

        switch(courses){
            case "App Development for Web":
                coursename="App Development for Web";
                coursecode="WEB1001";
                courseprofessor="Brent";
                coursedescription="In this course, students will discover the core concepts of developing software for the web. " +
                        "Students will use a variety of programming tools, design elements, data types, controls, objects, and browsers. " +
                        "Students will solve problems in code and proceed to work through larger, more complex problems. " +
                        "Students will evaluate and create user interfaces, and they will be introduced to " +
                        "important web development concepts. Students will create, build, debug, and test applications for the web.";
                break;
            case "App Development for Android":
                coursename="App Development for Android";
                coursecode="JAV1001";
                courseprofessor="David";
                coursedescription="In this course, students will explore the core concepts of developing software for the " +
                        "Android platform. Students will use a variety of programming tools, data types, controls, objects, " +
                        "and emulators. Students will solve problems in code and proceed to work through larger, " +
                        "more complex problems. Students will evaluate and create user interfaces, and they will be introduced to " +
                        "important mobile development concepts. Students will create, " +
                        "build, debug, and test applications for the Android platform.";
                break;
            case "App Development for iOS":
                coursename="App Development for iOS";
                coursecode="ISP1002";
                courseprofessor="Joshua";
                coursedescription="In this course, students will learn the core concepts of developing " +
                        "software for the iOS platform. Students will use a variety of programming tools, data types," +
                        " controls, objects, and emulators. Students will solve problems in code and proceed to work through " +
                        "larger, more complex problems. Students will evaluate and create user interfaces, " +
                        "and they will be introduced to important mobile development concepts. Students will create, build," +
                        " debug, and test applications for the iOS platform.";
                break;
            case "Database Mgmt & Warehousing":
                coursename="Database Mgmt & Warehousing";
                coursecode="DBA1000";
                courseprofessor="Omar";
                coursedescription="In this course, students will explore fundamental concepts in data and information management. " +
                        "The course content centers on the essential skills of identifying organizational requirements," +
                        " modelling requirements using conceptual data modelling techniques, converting conceptual models into " +
                        "relational data models, and verifying structural characteristics with normalization techniques. " +
                        "Students will focus on the Structured Query Language (SQL) to define and manipulate data. " +
                        "Additionally, students will explore the data warehouse lifecycle and dimensional modelling for " +
                        "data warehousing.";
                break;
            case "Foundations of B.A.":
                coursename="Foundations of B.A.";
                coursecode="BTA1002";
                courseprofessor="Imane";
                coursedescription="In this course, students will define the role of the IT Business Analyst. " +
                        "This course is an overview of the extensiveness of the Business Analysis profession. " +
                        "It is a critical look at the broader context of the body of knowledge required to perform this work." +
                        " Cases will be discussed, opinions formed, defended, and challenged to grasp better the relationships" +
                        " between people, projects, the business, and the technical environment. " +
                        "A secondary focus on leading organizational change will allow the learner to examine the Business " +
                        "Analyst's role as a change agent. Finally, current best practices in guiding people through constant" +
                        " change are discussed.";
                break;
        }
    }



}

package com.ashishsurti.finalproject;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder {

    TextView coursetxt;
    Button btndet;
    CoursesData coursesData;

    public ViewHolder(@NonNull View itemView) {
        super(itemView);

        coursetxt = itemView.findViewById(R.id.CourseHead);

        btndet = itemView.findViewById(R.id.rcycbtn);

        itemView.findViewById(R.id.rcycbtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String header =  coursetxt.getText().toString();
                Intent i = new Intent(itemView.getContext() , Course_Details.class);
                i.putExtra("coursename", header);

            }
        });
    }
}

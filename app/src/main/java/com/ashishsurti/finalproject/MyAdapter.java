package com.ashishsurti.finalproject;


import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<ViewHolder> {

    Context c;
    String[] courses;

    public MyAdapter(Context c , String[] courses){
        this.c = c;
        this.courses = courses;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(c).inflate(R.layout.recycler_items,parent,false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.coursetxt.setText(courses[position]);
        /*holder.btndet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String header =  coursetxt.getText().toString();
                Intent i = new Intent(v.getContext() , Course_Details.class);
                i.putExtra("coursename", header);
            }
        });*/
    }

    @Override
    public int getItemCount() {
        return courses.length;
    }
}

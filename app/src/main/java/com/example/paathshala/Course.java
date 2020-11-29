package com.example.paathshala;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class Course extends AppCompatActivity {
CardView year,year1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course);
        year=(CardView)findViewById(R.id.year);
        year1=(CardView)findViewById(R.id.year2);
        year.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Course.this,Curriculum.class);
                startActivity(i);
            }
        });
        year1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Course.this,Curriculum.class);
                startActivity(i);
            }
        });

    }
}

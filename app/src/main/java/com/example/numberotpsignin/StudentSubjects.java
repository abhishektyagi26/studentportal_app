package com.example.numberotpsignin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class StudentSubjects extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_subjects);
        String arr[]={"Advance Java","Compiler Designing",
                "Software Project Mangement",
                "Neural Networks",
                "Advance Computer Architecture"
        };
        RecyclerView rv=findViewById(R.id.subjectsList);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(new SubjectsAdapter(arr));
    }
}
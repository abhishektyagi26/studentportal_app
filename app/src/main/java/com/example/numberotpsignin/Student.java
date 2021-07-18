package com.example.numberotpsignin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

public class Student extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);
        String i=getIntent().getStringExtra("student");

        TextView studentProfile=findViewById(R.id.studentProfile);
        TextView studentFaculties=findViewById(R.id.studentfaculties);
        TextView studentGrievance=findViewById(R.id.studentGreivance);
        TextView studentSubjects=findViewById(R.id.studentSubjects);
        TextView studentSignOut=findViewById(R.id.studentsignOut);
        studentProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent b=new Intent(view.getContext(),SStudentProfile.class);
                b.putExtra("student",i);
                startActivity(b);

            }
        });

        studentFaculties.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent b=new Intent(view.getContext(),SStudentProfile.class);
                b.putExtra("student",i);
                startActivity(b);
            }
        });
        studentSubjects.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent b=new Intent(view.getContext(),StudentSubjects.class);
                b.putExtra("student",i);
                startActivity(b);
            }
        });
        studentGrievance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent b=new Intent(view.getContext(),SStudentProfile.class);
                b.putExtra("student",i);
                startActivity(b);
            }
        });
        studentSignOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseAuth.getInstance().signOut();
                Intent b=new Intent(getApplicationContext(),login.class);
                startActivity(b);
                finish();

            }
        });
    }
}
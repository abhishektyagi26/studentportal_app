package com.example.numberotpsignin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

public class FacultyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_faculty2);
        TextView facultyProfile=findViewById(R.id.facultyProfile);
        TextView facultyStudents=findViewById(R.id.studentsList);
        TextView facultyAssignedSubjects=findViewById(R.id.assignedSubjects);
        TextView facultySignOut=findViewById(R.id.signOut);
        facultySignOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseAuth.getInstance().signOut();
                Intent i=new Intent(getApplicationContext(),login.class);
                startActivity(i);
                finish();
            }
        });
        facultyProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),FFacultyProfile.class);
                startActivity(i);
            }
        });
        facultyStudents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),FacultyStudentlist.class);
                startActivity(i);
            }
        });
    }
}
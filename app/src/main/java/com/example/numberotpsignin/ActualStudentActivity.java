package com.example.numberotpsignin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ActualStudentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actual_student);
        getSupportFragmentManager()
                .beginTransaction()
                .addToBackStack("abhishek")
                .replace(R.id.actualStudentActivity,new frag1())
                .commit();
    }
}
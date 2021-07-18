package com.example.numberotpsignin;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class SStudentProfile extends AppCompatActivity {
    Button bt;
    EditText e1,e2,e3,e4,e5,e6,e7;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sstudent_profile);
        String m=getIntent().getStringExtra("student");
        System.out.println(m);
        bt=findViewById(R.id.submitbtn);
        e1=findViewById(R.id.ed1);
        e2=findViewById(R.id.ed2);
        e3=findViewById(R.id.ed3);
        e4=findViewById(R.id.ed4);
        e5=findViewById(R.id.ed5);
        e6=findViewById(R.id.ed6);
        e7=findViewById(R.id.ed7);

                DatabaseReference myref = FirebaseDatabase.getInstance().getReference("Student");
                bt.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                    }
                });
                myref.addChildEventListener(new ChildEventListener() {
                    @Override
                    public void onChildAdded(@NonNull @NotNull DataSnapshot snapshot, @Nullable @org.jetbrains.annotations.Nullable String previousChildName) {

                        Helperclass h=snapshot.getValue(Helperclass.class);
                           e1.setText(h.name);
                            e2.setText(h.father_name);
                            e3.setText(h.getCourse());
                            e4.setText(h.roll_number);
                            e5.setText(h.email);
                            e6.setText(h.contact_no);
                            e7.setText(h.address);

                    }

                    @Override
                    public void onChildChanged(@NonNull @NotNull DataSnapshot snapshot, @Nullable @org.jetbrains.annotations.Nullable String previousChildName) {

                    }

                    @Override
                    public void onChildRemoved(@NonNull @NotNull DataSnapshot snapshot) {

                    }

                    @Override
                    public void onChildMoved(@NonNull @NotNull DataSnapshot snapshot, @Nullable @org.jetbrains.annotations.Nullable String previousChildName) {

                    }

                    @Override
                    public void onCancelled(@NonNull @NotNull DatabaseError error) {

                    }
                });


    }
}
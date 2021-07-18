package com.example.numberotpsignin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            setTitle("Main");
        Handler handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
                if (user != null) {
                    String userPhoneNumber = user.getPhoneNumber().substring(3);
                    Log.d("userPhoneNumber",userPhoneNumber);
                    DatabaseReference myRef= FirebaseDatabase.getInstance().getReference("Student");
                    DatabaseReference myRef1= FirebaseDatabase.getInstance().getReference("Faculty");
                    if(myRef.child(userPhoneNumber)!=null){
                        Intent i=new Intent(getApplicationContext(),Student.class);
                        i.putExtra("student",userPhoneNumber);
                        startActivity(i);
                    }
                    else if(myRef1.child(userPhoneNumber)!=null){
                        Intent i=new Intent(getApplicationContext(),FacultyActivity.class);
                        i.putExtra("faculty",userPhoneNumber);
                        startActivity(i);
                    }
                    //DatabaseReference myRef2= FirebaseDatabase.getInstance().getReference("Student");

                } else {
                    Intent intent = new Intent(getApplicationContext(), login.class);
                    startActivity(intent);

                }
                finish();
            }
        },2500);

    }
}
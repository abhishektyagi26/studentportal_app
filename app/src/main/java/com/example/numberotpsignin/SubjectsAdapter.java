package com.example.numberotpsignin;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
public class SubjectsAdapter extends RecyclerView.Adapter<SubjectsAdapter.SubjectHolder> {
    String data[];

    public SubjectsAdapter(String[] data) {
        this.data = data;
        Log.d("xyx",this.data[0]);
    }

    @NonNull
    @NotNull
    @Override
    public SubjectsAdapter.SubjectHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View view= layoutInflater.inflate(R.layout.subject_items,parent,false);
        return new SubjectHolder(view);
    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull SubjectHolder holder, int position) {
        TextView tx=holder.itemView.findViewById(R.id.subjectsListItem);
        tx.setText(data[position]);

    }
    class SubjectHolder extends RecyclerView.ViewHolder{


        public SubjectHolder(@NonNull @NotNull View itemView) {

            super(itemView);

        }
    }


    }
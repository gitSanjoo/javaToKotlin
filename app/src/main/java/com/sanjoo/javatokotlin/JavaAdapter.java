package com.sanjoo.javatokotlin;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class JavaAdapter extends RecyclerView.Adapter<JavaAdapter.JavaViewHolder>{
    @NonNull
    @Override
    public JavaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull JavaViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class JavaViewHolder extends RecyclerView.ViewHolder{
        public JavaViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}

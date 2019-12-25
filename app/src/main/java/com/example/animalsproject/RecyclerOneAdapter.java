package com.example.animalsproject;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerOneAdapter extends RecyclerView.Adapter<RecyclerOneAdapter.RecyclerOneViewHolder> {
    ArrayList<String> myList;
   public  RecyclerOneAdapter(ArrayList list){

      myList = list;

    }
    @NonNull
    @Override
    public RecyclerOneViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler1_item,parent,false);
       RecyclerOneViewHolder holder = new RecyclerOneViewHolder(v);
       return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerOneViewHolder holder, int position) {


             holder.btnAnimals.setText(myList.get(position));

    }

    @Override
    public int getItemCount() {
        return myList.size();
    }

    class RecyclerOneViewHolder extends  RecyclerView.ViewHolder{
        Button btnAnimals;
        public RecyclerOneViewHolder(@NonNull View itemView) {
            super(itemView);
            btnAnimals =itemView.findViewById(R.id.btnAnimals);
        }
    }
}

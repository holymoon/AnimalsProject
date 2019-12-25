package com.example.animalsproject;

import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class RecyclerTwoAdapter extends RecyclerView.Adapter<RecyclerTwoAdapter.RecyclerTwoViewHolder> {

    @NonNull
    @Override
    public RecyclerTwoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler2_item,parent,false);
       RecyclerTwoViewHolder holder = new RecyclerTwoViewHolder(v);
       return holder;

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerTwoViewHolder holder, int position) {
        switch (position){
            case 0 :

                holder.imgAnimal.setImageResource(R.drawable.cat);

                break;
            case 1 :
                holder.imgAnimal.setImageResource(R.drawable.cow);

                break;
            case 2 :
                holder.imgAnimal.setImageResource(R.drawable.dog);

                break;
            case 3 :
                holder.imgAnimal.setImageResource(R.drawable.dolphin);
                break;
            case 4 :
                holder.imgAnimal.setImageResource(R.drawable.elephant);

                break;
            case 5 :
                holder.imgAnimal.setImageResource(R.drawable.giraffe);
                break;
            case 6 :
                holder.imgAnimal.setImageResource(R.drawable.horse);
                break;
            case 7 :
                holder.imgAnimal.setImageResource(R.drawable.kangaroo);
                break;
            case 8 :
                holder.imgAnimal.setImageResource(R.drawable.penguin);

                break;
            case 9:
                holder.imgAnimal.setImageResource(R.drawable.zebra);
                break;

        }

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    class RecyclerTwoViewHolder extends RecyclerView.ViewHolder{
         ImageView imgAnimal;
         ImageView imgPlay;
         MediaPlayer mediaplayer;
        public RecyclerTwoViewHolder(@NonNull View itemView) {
            super(itemView);
            imgAnimal = itemView.findViewById(R.id.imgAnimal);


        }
    }
}

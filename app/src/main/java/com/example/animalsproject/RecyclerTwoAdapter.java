package com.example.animalsproject;

import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class RecyclerTwoAdapter extends RecyclerView.Adapter<RecyclerTwoAdapter.RecyclerTwoViewHolder> {

    @NonNull
    @Override
    public RecyclerTwoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler2_item, parent, false);
        RecyclerTwoViewHolder holder = new RecyclerTwoViewHolder(v);
        return holder;


    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerTwoViewHolder holder, int position) {
        switch (position) {
            case 0:

                holder.imgAnimal.setImageResource(R.drawable.cat);
                holder.txtShow.setText("cat");
                holder.imgPlay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        MediaPlayer mediaPlayer = MediaPlayer.create(v.getContext(), R.raw.cat1);
                        mediaPlayer.start();
                    }
                });



                break;
            case 1:
                holder.imgAnimal.setImageResource(R.drawable.cow);
                holder.txtShow.setText("cow");
                break;
            case 2:
                holder.imgAnimal.setImageResource(R.drawable.dog);
                holder.txtShow.setText("dog");
                break;
            case 3:
                holder.imgAnimal.setImageResource(R.drawable.dolphin);
                holder.txtShow.setText("dolphin");
                break;
            case 4:
                holder.imgAnimal.setImageResource(R.drawable.elephant);
                holder.txtShow.setText("elephant");
                break;
            case 5:
                holder.imgAnimal.setImageResource(R.drawable.giraffe);
                holder.txtShow.setText("giraffe");
                break;
            case 6:
                holder.imgAnimal.setImageResource(R.drawable.horse);
                holder.txtShow.setText("horse");
                break;
            case 7:
                holder.imgAnimal.setImageResource(R.drawable.kangaroo);
                holder.txtShow.setText("kangaroo");
                break;
            case 8:
                holder.imgAnimal.setImageResource(R.drawable.penguin);
                holder.txtShow.setText("penguin");

                break;
            case 9:
                holder.imgAnimal.setImageResource(R.drawable.zebra);
                holder.txtShow.setText("zebra");
                break;

        }

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    class RecyclerTwoViewHolder extends RecyclerView.ViewHolder {
        ImageView imgAnimal;
        TextView txtShow;
        ImageButton imgPlay;
        MediaPlayer mediaPlayer;
        public RecyclerTwoViewHolder(@NonNull View itemView) {
            super(itemView);
            imgAnimal = itemView.findViewById(R.id.imgAnimal);
            txtShow = itemView.findViewById(R.id.txtShow);
            imgPlay = itemView.findViewById(R.id.imgPlay);
        }
    }
}

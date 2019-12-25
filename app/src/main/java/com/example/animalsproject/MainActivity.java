package com.example.animalsproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.media.MediaPlayer;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recycler1 = findViewById(R.id.recycler1);
        RecyclerView recycler2 = findViewById(R.id.recycler2);
        ArrayList<String> list = new ArrayList<>();
        list.add("All animals");
        list.add("Birds");
        list.add("Farm animals");
        list.add("Wild animals");
        list.add("Pet animals");
        list.add("Mammals");
        list.add("Reptiles and Amphibians");
        list.add("Insects");
        list.add("Land animals");
        list.add("Water animals");







        RecyclerOneAdapter adapter = new RecyclerOneAdapter(list);
        recycler1.setAdapter(adapter);

        recycler1.setLayoutManager(new LinearLayoutManager(MainActivity.this,RecyclerView.HORIZONTAL,false));

        RecyclerTwoAdapter adapter2 = new RecyclerTwoAdapter();
        recycler2.setAdapter(adapter2);
        recycler2.setLayoutManager(new LinearLayoutManager(MainActivity.this,RecyclerView.VERTICAL,false));



    }
}

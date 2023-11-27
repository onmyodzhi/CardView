package com.example.cardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<GameModel> gameList;
    RecyclerView recyclerView;
    MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        gameList =  new ArrayList<>();
        gameList.add(new GameModel("Gothic", R.drawable.gothic));
        gameList.add(new GameModel("Cyberpunk 2077", R.drawable.cyberpunk));
        gameList.add(new GameModel("Skyrim", R.drawable.skyrim));
        gameList.add(new GameModel("Dragon Age Origins", R.drawable.dragon_age));
        gameList.add(new GameModel("The Witcher 3", R.drawable.thewitcher));
        gameList.add(new GameModel("Terraria", R.drawable.terraria));

        adapter = new MyAdapter(this, gameList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(
                this,
                LinearLayoutManager.VERTICAL,
                false
        );
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);


    }
}
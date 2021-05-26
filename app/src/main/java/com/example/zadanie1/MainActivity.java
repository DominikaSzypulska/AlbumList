package com.example.zadanie1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Album> albums;
    private ListView mainList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainList = findViewById(R.id.mainList);

        albums = new ArrayList<>();

        albums.add(new Album(this, "Miles Davis", "Kind of blue", R.drawable.milesdavis, R.raw.milesdavissong));
        albums.add(new Album(this, "Justin Bieber", "Purpose", R.drawable.justinbieber, R.raw.justinbiebersong));
        albums.add(new Album(this, "Selena Gomez", "Revival", R.drawable.selenagomez, R.raw.selenagomezsong));
        albums.add(new Album(this, "Justin Timberlake", "Kind of blue", R.drawable.justintimberlake, R.raw.justintimberlakesong ));

        AlbumAdapter adapter = new AlbumAdapter(this, albums);
        mainList.setAdapter(adapter);
    }
}
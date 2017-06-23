package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView allSong = (TextView) findViewById(R.id.all_song_id);

        allSong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AllSongActivity.class);
                startActivity(intent);
            }
        });

        TextView Trending = (TextView) findViewById(R.id.text_for_trending);

        Trending.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Trending.class);
                startActivity(intent);
            }
        });

        TextView archived = (TextView) findViewById(R.id.text_for_archived);

        archived.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Archived.class);
                startActivity(intent);
            }
        });

        TextView top50 = (TextView) findViewById(R.id.text_for_top50);

        top50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Top50.class);
                startActivity(intent);
            }
        });

        TextView search = (TextView) findViewById(R.id.search_button);

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Search.class);
                startActivity(intent);
            }
        });

    }
}

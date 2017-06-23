package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Top50 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top50);

        //get the home screen button id.
        Button homeScreen = (Button) findViewById(R.id.home_screen_button);

        //take the user to home screen when the button is clicked
        homeScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Top50.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}

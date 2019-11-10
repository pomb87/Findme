package com.pombdev.games.pb.findme.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.pombdev.games.pb.findme.R;

public class MenuActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageButton buttonPlay;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /** init buttons **/
        buttonPlay = findViewById(R.id.buttonPlay);
        buttonPlay.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view == buttonPlay) {
            //TODO
            //transition from MenuActivity to GameActivity
            startActivity(new Intent(MenuActivity.this, GameActivity.class));
        }
    }
}

package com.example.pc1.digitalstory;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

    }

    public void quiz1(View view){
        finish();
        final MediaPlayer go = MediaPlayer.create(this, R.raw.next);
        go.start();
        Intent i = new Intent(this, quiz1.class);
        startActivity(i);
    }
}

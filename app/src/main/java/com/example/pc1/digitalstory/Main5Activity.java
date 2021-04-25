package com.example.pc1.digitalstory;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        final MediaPlayer intro = MediaPlayer.create(this, R.raw.intro);
        intro.start();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(Main5Activity.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        },3000);
    }
}

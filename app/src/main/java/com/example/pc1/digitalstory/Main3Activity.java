package com.example.pc1.digitalstory;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }
    public void go2(View view){
        finish();
        final MediaPlayer go = MediaPlayer.create(this, R.raw.next);
        go.start();
        Intent intent= new Intent(this, Main6Activity.class);
        startActivity(intent);
    }
    public void go3(View view){
        finish();
        final MediaPlayer go = MediaPlayer.create(this, R.raw.next);
        go.start();
        Intent intent= new Intent(this, Main4Activity.class);
        startActivity(intent);
    }
}

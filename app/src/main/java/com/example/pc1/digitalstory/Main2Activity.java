package com.example.pc1.digitalstory;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void go1(View view){
        finish();
        final MediaPlayer go = MediaPlayer.create(this, R.raw.next);
        go.start();
        Intent intent= new Intent(this, Main3Activity.class);
        startActivity(intent);
    }
}

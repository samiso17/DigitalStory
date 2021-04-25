package com.example.pc1.digitalstory;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class quiz1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz1);
    }
    public void vrai(View view){
        finish();
        final MediaPlayer go = MediaPlayer.create(this, R.raw.correct1);
        go.start();
        Toast.makeText(getApplicationContext(), "Trés bien", Toast.LENGTH_LONG).show();
        Intent i = new Intent(this, quiz11.class);
        startActivity(i);
    }
    public void faux(View view){
        final MediaPlayer wrong = MediaPlayer.create(this, R.raw.wrong);
        wrong.start();
        Toast.makeText(getApplicationContext(), "Faux! Essayez une autre fois", Toast.LENGTH_LONG).show();
    }
}

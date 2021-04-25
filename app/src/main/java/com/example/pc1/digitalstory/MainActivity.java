package com.example.pc1.digitalstory;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void go(View view){
        final MediaPlayer go = MediaPlayer.create(this, R.raw.next);
        go.start();
Intent intent= new Intent(this, Main2Activity.class);
startActivity(intent);
    }
    public void it(View view){
        Intent browserIntent = new Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://www.facebook.com/centreITPLUS/"));
        startActivity(browserIntent);
    }
    public void itt(View view){
        Intent browserIntent = new Intent(
                Intent.ACTION_VIEW,
                Uri.parse("http://itplus.samatounes.org.tn/"));
        startActivity(browserIntent);
    }
    public void email(View view){

        final Intent emailIntent = new Intent(android.content.Intent.ACTION_SEND);

        emailIntent.setType("text/plain");
        emailIntent.putExtra(android.content.Intent.EXTRA_EMAIL, new String[]{"samatounes2012@gmail.com"});
        emailIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "New Story");
        emailIntent.putExtra(android.content.Intent.EXTRA_TEXT, "Ecrivez votre (Nom et Prénom et le titre de votre histoire) et puis écrivez votre histoire au dessous ou joignez un fichier, veuillez insérez quelques photos si possible. Vous pouvez aussi l'écrire via le formulaire dans http://itplus.samatounes.org.tn/digital-story/");
        startActivity(Intent.createChooser(emailIntent, "Send mail..."));
    }
    public void popup (View view){
        final MediaPlayer go = MediaPlayer.create(this, R.raw.next);
        go.start();
        Intent intent= new Intent(this, pop.class);
        startActivity(intent);
    }
    }

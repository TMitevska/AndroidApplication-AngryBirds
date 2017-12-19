package com.example.tamara.smartangrybirds;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    MediaPlayer ring;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ring = MediaPlayer.create(this, R.raw.song);
        ring.setLooping(true);
        ring.start();


    }
    @Override
    protected void onResume()
    {   ring.start();
        super.onResume();

    }
    @Override
    protected void onStart()
    {   ring.start();
        super.onStart();

    }
    @Override
    protected void onRestart()
    {   ring.start();
        super.onRestart();

    }
    public void math(View view)
    { ring.pause();

        Intent i =new Intent(MainActivity.this,Math.class);
        startActivity(i);
    }
    public void alphabet(View view)
    {   ring.pause();
        Intent i =new Intent(MainActivity.this,alphabet.class);
        startActivity(i);
    }
    public void games(View view)
    {   ring.pause();

        Intent i =new Intent(MainActivity.this,games.class);
        startActivity(i);
    }
    public void movie(View view)
    { ring.pause();
        Intent i =new Intent(MainActivity.this,movie.class);
        startActivity(i);
    }

}

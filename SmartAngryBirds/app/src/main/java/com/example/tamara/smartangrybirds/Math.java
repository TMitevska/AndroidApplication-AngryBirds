package com.example.tamara.smartangrybirds;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by tamara on 11/18/17.
 */

public class Math extends MainActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.math);


    }
    protected void onPause() {super.onPause();ring.stop();}
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
    public void plus(View view)
    {   ring.pause();
        Intent i =new Intent(Math.this,Plus.class);
        startActivity(i);
    }
    public void minus(View view)
    {   ring.pause();
        Intent i =new Intent(Math.this,Minus.class);
        startActivity(i);
    }
    public void mnozi(View view)
    {    ring.pause();
        Intent i =new Intent(Math.this,Multiply.class);
        startActivity(i);
    }
    public void deli(View view)
    {     ring.pause();
        Intent i =new Intent(Math.this,Divide.class);
        startActivity(i);
    }

}

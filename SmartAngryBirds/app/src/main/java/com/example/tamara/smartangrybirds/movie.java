package com.example.tamara.smartangrybirds;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

/**
 * Created by tamara on 11/19/17.
 */

public class movie extends MainActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.movie);


    }
    protected void onPause() {super.onPause();ring.stop();}
    public void film(View v)
    {
        ring.stop();
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://123moviesfull.org/movie/the-angry-birds-movie-2016/10/watching/?ep=8"));
        startActivity(browserIntent);
    }
}

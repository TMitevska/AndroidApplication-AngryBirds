package com.example.tamara.smartangrybirds;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

/**
 * Created by tamara on 11/19/17.
 */

public class games extends MainActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.games);


    }
    protected void onPause() {super.onPause();ring.stop();}
    public void link(View v)
    {
        if(v.getId()==R.id.i1 || v.getId()==R.id.t1)
        {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.1mobile.com/angry-birds-rio-84545.html"));
            startActivity(browserIntent);
        }
        else if(v.getId()==R.id.i2 || v.getId()==R.id.t2)
        {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.1mobile.com/angry-birds-space-361026.html"));
            startActivity(browserIntent);
        }
         else if(v.getId()==R.id.i3 || v.getId()==R.id.t3)
        {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.1mobile.com/angry-birds-go-1301126.html"));
            startActivity(browserIntent);
        }
        else if(v.getId()==R.id.i4 || v.getId()==R.id.t4)
        {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.1mobile.com/angry-birds-friends-805822.html"));
            startActivity(browserIntent);
        }
        else if(v.getId()==R.id.i5 || v.getId()==R.id.t5)
        {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.1mobile.com/angry-birds-seasons-79543.html"));
            startActivity(browserIntent);
        }
        else if(v.getId()==R.id.i6 || v.getId()==R.id.t6)
        {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.1mobile.com/angry-birds-pop-bubble-shooter-2657673.html"));
            startActivity(browserIntent);
        }
        else if(v.getId()==R.id.i7 || v.getId()==R.id.t7)
        {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.1mobile.com/tips-angry-birds-match-3588224.html"));
            startActivity(browserIntent);
        }
        else if(v.getId()==R.id.i8 || v.getId()==R.id.t8)
        {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.1mobile.com/bad-piggies-585088.html"));
            startActivity(browserIntent);
        }
        else if(v.getId()==R.id.i9 || v.getId()==R.id.t9)
        {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.1mobile.com/smash-birds-2-free-cool-game-2392772.html"));
            startActivity(browserIntent);
        }
        else if(v.getId()==R.id.i10 || v.getId()==R.id.t10)
        {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.1mobile.com/birds-bomber-match3-3057221.html"));
            startActivity(browserIntent);
        }
        else if(v.getId()==R.id.i11 || v.getId()==R.id.t11)
        {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.1mobile.com/latest-angry-birds-2-guide-3481521.html"));
            startActivity(browserIntent);
        }
        else if(v.getId()==R.id.i12 || v.getId()==R.id.t12)
        {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.1mobile.com/easy-draw-angry-birds-2143858.html"));
            startActivity(browserIntent);
        }

    }



}

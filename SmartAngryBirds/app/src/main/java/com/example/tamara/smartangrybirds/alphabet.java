package com.example.tamara.smartangrybirds;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.view.MotionEventCompat;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

/**
 * Created by tamara on 11/19/17.
 */

public class alphabet extends MainActivity {
    ImageView image;
    int suma=0;int a;Random rand=new Random();EditText sc;
    final  String[] niza={"car","house","cat","dog","cake","rainbow","ball","book","high-heels"};
    final  int[] slika={R.drawable.im1,R.drawable.im6,R.drawable.im4, R.drawable.im3,R.drawable.im5,R.drawable.im7,R.drawable.im2, R.drawable.im9,R.drawable.im8};
    EditText text,score; Button b;
    MediaPlayer ring2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alphabet);
        ring.stop();
        ring2 = MediaPlayer.create(this, R.raw.operacija);
        ring2.setLooping(true);
        ring2.start();
        text = (EditText) findViewById(R.id.Answer);
        image= (ImageView)findViewById(R.id.imageView5);

    }
    @Override
    protected void onPause() {super.onPause();ring2.stop();}
    private Rect mRect = new Rect();
    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        final int action = MotionEventCompat.getActionMasked(ev);

        int[] location = new int[2];
        text.getLocationOnScreen(location);
        mRect.left = location[0];
        mRect.top = location[1];
        mRect.right = location[0] + text.getWidth();
        mRect.bottom = location[1] + text.getHeight();

        int x = (int) ev.getX();
        int y = (int) ev.getY();

        if (action == MotionEvent.ACTION_DOWN && !mRect.contains(x, y)) {
            InputMethodManager input = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
            input.hideSoftInputFromWindow(text.getWindowToken(), 0);
        }
        return super.dispatchTouchEvent(ev);
    }
    public void onButtonClick(View v)
    { b=(Button)findViewById(R.id.checkAlpha);

        sc=(EditText) findViewById(R.id.score);
        if(v.getId()==R.id.checkAlpha) {
            if (b.getText().equals("Start")) {
                slik(v);
                suma = 0;
                b.setText("check answer");
            }
            else {


                String t = text.getText().toString().toLowerCase().replace(" ", "");

                if(!t.equals(niza[a]))
                {
                    Toast.makeText(this, "Wrong answer",
                            Toast.LENGTH_LONG).show();
                }
                else
                {
                    suma=suma+10;
                    String h="";
                    h=Integer.toString(suma);
                    sc.setText(h);
                }
                slik(v);text.setText("  ");


            }
        }

    }
    public void slik(View v)
    {
        a=rand.nextInt(niza.length-1);



        Drawable drawable= getResources().getDrawable(slika[a]);
        image.setImageDrawable(drawable);

    }


}

package com.example.tamara.smartangrybirds;

import android.content.Context;
import android.graphics.Rect;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.view.MotionEventCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

/**
 * Created by tamara on 11/18/17.
 */

public class Minus extends Math{
    int suma,f;int num1,num2,num3; int res; boolean flag=true;
    TextView t1,t2,t4; String n1,n2,n3,s; EditText t3;
    Button b;
    MediaPlayer ring2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.minus);
        ring.stop();
        t3=(EditText)findViewById(R.id.editText6);
        ring2 = MediaPlayer.create(this, R.raw.operacija);
        ring2.setLooping(true);
        ring2.start();
        suma=0;
        f=9;
    }
    @Override
    protected void onPause()
    {   super.onPause();
        ring2.stop();
    }
    @Override
    protected void onResume()
    {   super.onResume();
        ring2.start();
    }
    private Rect mRect = new Rect();
    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        final int action = MotionEventCompat.getActionMasked(ev);

        int[] location = new int[2];
        t3.getLocationOnScreen(location);
        mRect.left = location[0];
        mRect.top = location[1];
        mRect.right = location[0] + t3.getWidth();
        mRect.bottom = location[1] + t3.getHeight();

        int x = (int) ev.getX();
        int y = (int) ev.getY();

        if (action == MotionEvent.ACTION_DOWN && !mRect.contains(x, y)) {
            InputMethodManager input = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
            input.hideSoftInputFromWindow(t3.getWindowToken(), 0);
        }
        return super.dispatchTouchEvent(ev);
    }
    public void odzemi(View v)
    {
        t1=(TextView) findViewById(R.id.textView4);
        t2=(TextView)findViewById(R.id.textView6);

        t4=(TextView) findViewById(R.id.textView7);
        b=(Button)findViewById(R.id.check);
        Random rand=new Random();

        if(v.getId()==R.id.check && flag==true)
        {
            num1=rand.nextInt(f)+1;
            num2=rand.nextInt(num1)+1;
            num3=num1-num2;
            n1=String.valueOf(num1);
            n2=String.valueOf(num2);
            n3=String.valueOf(num3);
            t1.setText( n1);
            t2.setText(n2);
            t3.setText(" ");

            flag=false;
            b.setText("Check Answer");
        }
        else if(v.getId()==R.id.check && flag==false)
        {   String m=t3.getText().toString().replace(" ", "");
            res=Integer.valueOf(m);

            if(res== num3)
            {
                suma=suma+10; s=String.valueOf(suma);
                t4.setText(s);

                Toast.makeText(this, "Correct Answer",
                        Toast.LENGTH_LONG).show();
            }
            else
            {
                Toast.makeText(this, "Wrong Answer",
                        Toast.LENGTH_LONG).show();

            }

            num1=rand.nextInt(f)+1;
            num2=rand.nextInt(num1)+1;
            num3=num1-num2;
            n1=String.valueOf(num1);
            n2=String.valueOf(num2);
            n3=String.valueOf(num3);
            t1.setText( n1);
            t2.setText(n2);
            t3.setText(" ");

        }
    }
}

package com.example.yxtzhu.flipcoin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageButton;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    final Animation in = new AlphaAnimation(0.0f, 1.0f);
    final RotateAnimation rotate = new RotateAnimation(0, 360f,
            Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF,
            0.5f);

    public MainActivity(){
        in.setDuration(2000);
        rotate.setInterpolator(new LinearInterpolator());
        rotate.setDuration(200);
        //rotate.setRepeatCount(Animation.INFINITE);
        rotate.setRepeatCount(2);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Randomly generate an integer between 0 and 1
    public void coinflip(View view){
        String result = (Math.random()>=0.5) ? "HEAD" : "TAIL";
        TextView textView = (TextView) findViewById(R.id.textView);
        ImageButton imageButton2 = (ImageButton) findViewById(R.id.imageButton2);

        imageButton2.setAnimation(rotate);
        textView.startAnimation(in);
        textView.setText(result);


    }

}

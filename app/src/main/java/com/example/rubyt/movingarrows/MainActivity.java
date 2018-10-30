package com.example.rubyt.movingarrows;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.graphics.Path;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.PathInterpolator;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtV;
    Button btnRight;
    Button btnLeft;
    Button btnDown;
    Button btnUp;
    PathInterpolator pathInterpolator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtV = (TextView)findViewById(R.id.txtMove);
        btnRight = (Button) findViewById(R.id.btn_Right);
        btnLeft = (Button)findViewById(R.id.btn_left);
        btnDown = (Button)findViewById(R.id.btn_Down);
        btnUp = (Button)findViewById(R.id.btn_Up);

       //Here is an example of an ObjectAnimator that moves the view to 100 pixels from the left of the screen in 2 seconds:
        /*ObjectAnimator animation = ObjectAnimator.ofFloat(view, "translationX", 100f);
        animation.setDuration(2000);
        animation.start();
        */
//translationX and translationY: These properties control where the View is located as a delta from
// its left and top coordinates which are set by its layout container.



        btnRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /* //This moves an object top-left at an angle
                //The ViewPropertyAnimator provides a simple way to animate several
                properties of a View in parallel, using a single underlying Animator object
                PropertyValuesHolder pvhX = PropertyValuesHolder.ofFloat("x", 50f);
                PropertyValuesHolder pvhY = PropertyValuesHolder.ofFloat("y", 100f);
                ObjectAnimator.ofPropertyValuesHolder(txtV, pvhX, pvhY).start();
                */

                //pass (object, idk, distance to right in px)
                ObjectAnimator animation = ObjectAnimator.ofFloat(txtV, "translationX", 200f);
               // animation.end();
                //speed/time of moving object 1 sec
                animation.setDuration(1000);
                animation.start();




            }
        });

        btnLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //pass (object, idk, distance to right in px)
                ObjectAnimator animation = ObjectAnimator.ofFloat(txtV, "translationX", -200f);
               // animation.();
                //speed/time of moving object 1 sec
                //animation.end();

                animation.setDuration(1000);
                animation.start();
            }
        });

        btnDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //pass (object, idk, distance to right in px)
                ObjectAnimator animation = ObjectAnimator.ofFloat(txtV, "translationY", 200f);
                //animation.end();

                //speed/time of moving object 1 sec
                animation.setDuration(1000);
                animation.start();

            }
        });


        btnUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //pass (object, idk, distance to right in px)
                ObjectAnimator animation = ObjectAnimator.ofFloat(txtV, "translationY", -200f);
                //animation.end();

                //speed/time of moving object 1 sec
                animation.setDuration(1000);
                animation.start();

            }
        });

    }





}

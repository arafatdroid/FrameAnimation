package com.example.mazharulislam.frameanimation;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView view;
    private AnimationDrawable frameAnimation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Type casting the Image View
        view = (ImageView) findViewById(R.id.imageView);

        // Setting animation_list.xml as the background of the image view
        view.setBackgroundResource(R.drawable.frame_animation_list);

        // Type casting the Animation drawable
        frameAnimation = (AnimationDrawable) view.getBackground();

        //set true if you want to animate only once
        frameAnimation.setOneShot(true);

//        findViewById(R.id.start).setOnClickListener(this);
//        findViewById(R.id.stop).setOnClickListener(this);

    }

    public void start(View view)
    {


        frameAnimation.start();

}
        public void stop(View view)
        {


            frameAnimation.stop();
}



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }






}

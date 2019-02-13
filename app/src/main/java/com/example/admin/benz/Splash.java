package com.example.admin.benz;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        ImageView mImageViewFilling = (ImageView) findViewById(R.id.imageView);
        ((AnimationDrawable) mImageViewFilling.getBackground()).start();


        Thread background=new Thread()
        {
            public void run()
            {
                try{
                    sleep(3000);
                }
                catch (Exception e){
                    System.out.println(e);
                }
                finally {
                    Intent i=new Intent(Splash.this,MainActivity.class);
                    startActivity(i);
                }
            }
        };
        background.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}

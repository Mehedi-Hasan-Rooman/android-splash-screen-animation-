package com.example.splash_screen_animation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static int SPLASH_SCREEN =5000;

    Animation top_animation,bottom_animation;
    ImageView imageView;
    TextView textView1,textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        top_animation = AnimationUtils.loadAnimation(this,R.anim.top_animation);
        bottom_animation = AnimationUtils.loadAnimation(this,R.anim.bottom_animation);

        imageView = findViewById(R.id.splash_image);
        textView1 = findViewById(R.id.splash_text1);
        textView2 = findViewById(R.id.splash_text2);

        imageView.setAnimation(top_animation);
        textView1.setAnimation(bottom_animation);
        textView2.setAnimation(bottom_animation);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);
                finish();

            }
        },SPLASH_SCREEN);

    }
}
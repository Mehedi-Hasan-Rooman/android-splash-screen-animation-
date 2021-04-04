package com.example.splash_screen_animation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Main2Activity extends AppCompatActivity {

  private ImageView imageView;
  private Animation Top_anim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        imageView = findViewById(R.id.splash2_image);

        Top_anim = AnimationUtils.loadAnimation(this,R.anim.top_animation);


        imageView.setAnimation(Top_anim);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent = new Intent(Main2Activity.this,Main3Activity.class);
                startActivity(intent);
                finish();


            }
        },5000);





    }
}
package com.juwon_lee.sharedelementtransitionanimation;

import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ImageView iv = findViewById(R.id.image);
        iv.setImageResource(R.drawable.card);
        Animation anim = AnimationUtils.loadAnimation(this, R.anim.scale);
        iv.startAnimation(anim);

        TextView tv = findViewById(R.id.text);
        tv.setText("detail page W/ transition!");
    }

    @Override
    public void onBackPressed() {
        ActivityCompat.finishAfterTransition(this);
    }
}

package com.tashfia.loadimagefromnet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    ImageView view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        view=(ImageView)findViewById(R.id.imageView);


        Glide.with(this)
                .load("http://ste.india.com/sites/default/files/2018/02/14/660473-tamim-iqbal-970-twitter.jpg")
                .placeholder(R.drawable.placeholder)
                .error(R.drawable.not_found)
                .into(view);



    }
}

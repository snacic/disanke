package com.example.administrator.disanke;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class ImageViewActivity extends AppCompatActivity {

    private ImageView iv4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view);
        iv4=findViewById(R.id.iv_4);
        Glide.with(this).load("https://p.ssl.qhimg.com/dmfd/125_71_/t0139f00a0261f20b13.png").into(iv4);



    }
}

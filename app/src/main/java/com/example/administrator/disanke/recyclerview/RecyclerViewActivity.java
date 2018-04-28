package com.example.administrator.disanke.recyclerview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.administrator.disanke.R;

public class RecyclerViewActivity extends AppCompatActivity {

    private Button mBtnlist,mBtnhor,mBtngrid,mBtnpu,mBtwangye;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        mBtnlist=findViewById(R.id.btn_rclist);
        mBtnhor=findViewById(R.id.btn_hor);
        mBtngrid=findViewById(R.id.btn_grid);
        mBtnpu=findViewById(R.id.btn_purecycler);
        mBtwangye=findViewById(R.id.btn_web);
        mBtwangye.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(RecyclerViewActivity.this,WebActivity.class);
                startActivity(intent);
            }
        });
        mBtnpu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(RecyclerViewActivity.this,PuRecyclerViewActivity.class);
                startActivity(intent);
            }
        });
        mBtngrid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(RecyclerViewActivity.this,GridRecyclerActivity.class);
                startActivity(intent);
            }
        });
        mBtnlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent intent=new Intent(RecyclerViewActivity.this,ListRecyclerActivity.class);
            startActivity(intent);
            }
        });
        mBtnhor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(RecyclerViewActivity.this,RecyclerHorActivity.class);
                startActivity(intent);
            }
        });
    }
}

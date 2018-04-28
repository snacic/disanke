package com.example.administrator.disanke.recyclerview;

import android.graphics.Rect;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.Toast;

import com.example.administrator.disanke.R;

public class RecyclerHorActivity extends AppCompatActivity {

    private RecyclerView HorRecycler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_hor);
        HorRecycler=findViewById(R.id.tv_hor);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(RecyclerHorActivity.this);
        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        HorRecycler.setLayoutManager(linearLayoutManager);
        HorRecycler.addItemDecoration(new MyDecoration());
        HorRecycler.setAdapter(new HorAdapter(RecyclerHorActivity.this, new HorAdapter.OnItemClickListener() {
            @Override
            public void onClick(int pos) {
                Toast.makeText(RecyclerHorActivity.this,"巴拉巴拉"+pos,Toast.LENGTH_SHORT).show();
            }
        }));

    }
    class MyDecoration extends  RecyclerView.ItemDecoration{
        @Override
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
            super.getItemOffsets(outRect, view, parent, state);
            outRect.set(0,0,getResources().getDimensionPixelOffset(R.dimen.dividerHeight),0);
        }
    }

}

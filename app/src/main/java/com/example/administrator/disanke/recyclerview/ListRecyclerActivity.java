package com.example.administrator.disanke.recyclerview;

import android.graphics.Rect;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.example.administrator.disanke.R;

public class ListRecyclerActivity extends AppCompatActivity {
    private RecyclerView mRvmain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_recycler);
        mRvmain=findViewById(R.id.rv_main);
        mRvmain.setLayoutManager(new LinearLayoutManager(ListRecyclerActivity.this));
        mRvmain.addItemDecoration(new MyDecoration());
        mRvmain.setAdapter(new LinearAdapter(ListRecyclerActivity.this, new LinearAdapter.OnItemClickListener() {
            @Override
            public void onClick(int pos) {
                Toast.makeText(ListRecyclerActivity.this,"click"+pos,Toast.LENGTH_SHORT).show();
            }
        }));

    }
    class MyDecoration extends  RecyclerView.ItemDecoration{
        @Override
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
            super.getItemOffsets(outRect, view, parent, state);
            outRect.set(0,0,0,getResources().getDimensionPixelOffset(R.dimen.dividerHeight));
        }
    }
    }


package com.example.administrator.disanke.recyclerview;

import android.graphics.Rect;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.widget.Toast;

import com.example.administrator.disanke.R;

public class PuRecyclerViewActivity extends AppCompatActivity {

    private RecyclerView pubuliu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pu_recycler);
        pubuliu=findViewById(R.id.tv_pu);
        pubuliu.addItemDecoration(new MyDecoration());
        pubuliu.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));
        pubuliu.setAdapter(new PuAdapter(PuRecyclerViewActivity.this, new PuAdapter.OnItemClickListener() {
            @Override
            public void onClick(int pos) {
                Toast.makeText(PuRecyclerViewActivity.this,"aaa"+pos,Toast.LENGTH_SHORT).show();
            }
        }));
    }
    class MyDecoration extends  RecyclerView.ItemDecoration{
        @Override
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
            super.getItemOffsets(outRect, view, parent, state);
            int gap=getResources().getDimensionPixelOffset(R.dimen.dividerHeight2);
            outRect.set(gap,gap,gap,gap);
        }
    }
}

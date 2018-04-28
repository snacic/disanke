package com.example.administrator.disanke.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.example.administrator.disanke.R;

public class GridRecyclerActivity extends AppCompatActivity {

    private RecyclerView gridrc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_recycler);
        gridrc=findViewById(R.id.tv_grid);
        gridrc.setLayoutManager(new GridLayoutManager(GridRecyclerActivity.this,4));
        gridrc.setAdapter(new GridAdapter(GridRecyclerActivity.this, new GridAdapter.OnItemClickListener() {
            @Override
            public void onClick(int pos) {
                Toast.makeText(GridRecyclerActivity.this,"蚊笨"+pos,Toast.LENGTH_SHORT).show();
            }
        }));
    }
}

package com.example.administrator.disanke.listview;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.administrator.disanke.R;

public class ListViewActivity extends Activity {
    private ListView lsv;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);
        lsv=findViewById(R.id.lv_1);
        lsv.setAdapter(new MyListAdapter(ListViewActivity.this));
        lsv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ListViewActivity.this,"pos:"+position,Toast.LENGTH_SHORT).show();
            }
        });
        lsv.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ListViewActivity.this,"长安:"+position,Toast.LENGTH_SHORT).show();
                return true;
            }
        });
    }
}

package com.example.administrator.disanke.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.administrator.disanke.R;

public class MyListAdapter extends BaseAdapter {
    private Context mContext;
    private LayoutInflater mLayoutInflater;
    public MyListAdapter(Context context){
        this.mContext=context;
        mLayoutInflater=LayoutInflater.from(context);
    }
    @Override
    public int getCount() {
        return 10;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    static class ViewHolder{
        public ImageView imageView;
        public TextView tv1,tv2,tv3;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder=null;
        if(convertView == null){
            convertView=mLayoutInflater.inflate(R.layout.layout_list_item,null);
            holder=new ViewHolder();
            holder.imageView=convertView.findViewById(R.id.iv);
            holder.tv1=convertView.findViewById(R.id.test1);
            holder.tv2=convertView.findViewById(R.id.test2);
            holder.tv3=convertView.findViewById(R.id.test3);
            convertView.setTag(holder);
        }else{
            holder= (ViewHolder) convertView.getTag();
        }
        holder.tv1.setText("这是标题");
        holder.tv2.setText("2078-08-08");
        holder.tv3.setText("类型啊啊");
        Glide.with(mContext).load("https://ss0.baidu.com/6ONWsjip0QIZ8tyhnq/it/u=3607836084,2314501217&fm=58&w=121&h=121&img.JPEG").into(holder.imageView);
        return convertView;
    }
}

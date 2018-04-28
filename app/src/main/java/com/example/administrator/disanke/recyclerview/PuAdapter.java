package com.example.administrator.disanke.recyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.administrator.disanke.R;

public class PuAdapter extends RecyclerView.Adapter<PuAdapter.LinearViewHolder> {
    private Context mContext;
    private OnItemClickListener mListener;
    public PuAdapter(Context context, OnItemClickListener listener){

        this.mContext=context;
        this.mListener=listener;
    }

    @Override
    public PuAdapter.LinearViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new LinearViewHolder(LayoutInflater.from(mContext).inflate(R.layout.layout_pu_item,parent,false));
    }

    @Override
    public void onBindViewHolder(PuAdapter.LinearViewHolder holder, final int position) {
        if(position%2!=0){
            holder.imageView.setImageResource(R.drawable.ss);
        }else{
            holder.imageView.setImageResource(R.drawable.pp);
        }
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListener.onClick(position);
            }
        });

    }

    @Override
    public int getItemCount() {

        return 30;
    }
    class LinearViewHolder extends RecyclerView.ViewHolder{

        private ImageView imageView;
        public  LinearViewHolder(View itemView){
            super(itemView);
            imageView=itemView.findViewById(R.id.iv);
        }
    }
    public interface OnItemClickListener{
        void onClick(int pos);
    }
}

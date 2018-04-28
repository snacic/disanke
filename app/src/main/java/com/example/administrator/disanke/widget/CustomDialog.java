package com.example.administrator.disanke.widget;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

import com.example.administrator.disanke.R;

public class CustomDialog extends Dialog implements View.OnClickListener{
    private TextView mTvTitle,mTvMessage,mTvCancel,mTvConfirm;
    private String title,message,cancel,confirm;
    private IOnConfirmListener confirmListener;
    private IOnCancelListener cancelListener;

    public CustomDialog setTitle(String title) {
        this.title = title;
        return this;
    }

    public CustomDialog setMessage(String message) {
        this.message = message;
        return this;
    }

    public CustomDialog setCancel(String cancel,IOnCancelListener listener) {
        this.cancel = cancel;
        this.cancelListener=listener;
        return  this;
    }

    public CustomDialog setConfirm(String confirm,IOnConfirmListener listener) {
        this.confirm = confirm;
        this.confirmListener=listener;
        return this;
    }


    public CustomDialog(@NonNull Context context) {
        super(context);
    }

    public CustomDialog(@NonNull Context context, int themeId) {
        super(context, themeId);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_custom_dialog);
        WindowManager m=getWindow().getWindowManager();
        Display d=m.getDefaultDisplay();
        WindowManager.LayoutParams p=getWindow().getAttributes();
        Point size=new Point();
        d.getSize(size);
        p.width=(int)(size.x*0.8);
        getWindow().setAttributes(p);
        mTvTitle=findViewById(R.id.tv_title);
        mTvMessage=findViewById(R.id.tv_message);
        mTvCancel=findViewById(R.id.tv_cancel);
        mTvConfirm=findViewById(R.id.tv_confirm);
        if(!TextUtils.isEmpty(title)){
            mTvTitle.setText(title);
        }
        if(!TextUtils.isEmpty(message)){
            mTvMessage.setText(message);
        }
        if(!TextUtils.isEmpty(cancel)){
            mTvCancel.setText(cancel);
        }
        if(!TextUtils.isEmpty(confirm)){
            mTvConfirm.setText(confirm);
        }
        mTvCancel.setOnClickListener(this);
        mTvConfirm.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.tv_cancel:
                if(cancelListener!=null){
                    cancelListener.onCancel(this);
                }
                dismiss();
                break;

            case R.id.tv_confirm:
                if(confirmListener!=null){
                    confirmListener.onConfirm(this);
                }
                dismiss();
                break;

        }
    }


    public interface IOnCancelListener{
        void onCancel(CustomDialog dialog);
    }
    public interface IOnConfirmListener{
        void onConfirm(CustomDialog dialog);
    }
}

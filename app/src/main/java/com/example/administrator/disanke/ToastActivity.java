package com.example.administrator.disanke;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.administrator.disanke.util.ToastUtil;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

public class ToastActivity extends AppCompatActivity {

    private Button t1,t2,t3,t4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast);
        t1=findViewById(R.id.toast_1);
        t2=findViewById(R.id.toast_2);
        t3=findViewById(R.id.toast_3);
        t4=findViewById(R.id.toast_4);
        OnClick onClick=new OnClick();
        t1.setOnClickListener(onClick);
        t2.setOnClickListener(onClick);
        t3.setOnClickListener(onClick);
        t4.setOnClickListener(onClick);
    }
    class OnClick implements View.OnClickListener{

        @Override
        public void onClick(View v) {
          switch(v.getId()){
              case R.id.toast_1:
                  Toast.makeText(getApplicationContext(),"Toast",Toast.LENGTH_SHORT).show();
                  break;
              case R.id.toast_2:
                  Toast toastCenter=Toast.makeText(getApplicationContext(),"居中",Toast.LENGTH_SHORT);
                  toastCenter.setGravity(Gravity.TOP,0,0);
                  toastCenter.show();
                  break;
              case R.id.toast_3:
                  Toast toastCustm=new Toast(getApplicationContext());
                  LayoutInflater inflater=LayoutInflater.from(ToastActivity.this);
                  View view=inflater.inflate(R.layout.layout_toast,null);
                  ImageView imageView=view.findViewById(R.id.iv_toast);
                  TextView textView=view.findViewById(R.id.tv_toast);
                  imageView.setImageResource(R.mipmap.lsj);
                  textView.setText("这是一个展示");
                  toastCustm.setView(view);
                  toastCustm.setDuration(Toast.LENGTH_LONG);
                  toastCustm.show();
                  break;
              case R.id.toast_4:
                  ToastUtil.showMsg(getApplicationContext(),"封装过的");
                  break;

          }
        }
    }
}

package com.example.administrator.disanke;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

import com.example.administrator.disanke.util.ToastUtil;

public class ProgressActivity extends AppCompatActivity {

    private ProgressBar mpb3;
    private Button mpbbtn,progressdialog1,progressdialog2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress);
        mpb3=findViewById(R.id.pb3);
        mpb3.setProgress(10);
        mpbbtn=findViewById(R.id.btn_start);
        progressdialog1=findViewById(R.id.btn_progress_dialog1);
        progressdialog2=findViewById(R.id.btn_progress_dialog2);
        mpbbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handler.sendEmptyMessage(0);
            }
        });
        progressdialog1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ProgressDialog progressDialog=new ProgressDialog(ProgressActivity.this);
                progressDialog.setTitle("提示");
                progressDialog.setMessage("正在加载");
                progressDialog.setOnCancelListener(new DialogInterface.OnCancelListener() {
                    @Override
                    public void onCancel(DialogInterface dialog) {
                        ToastUtil.showMsg(ProgressActivity.this,"cancel.....");
                    }
                });
                progressDialog.setCancelable(true);
                progressDialog.dismiss();
                progressDialog.show();
            }
        });
        progressdialog2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ProgressDialog progressDialog2=new ProgressDialog(ProgressActivity.this);
               progressDialog2.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
                progressDialog2.setTitle("提示");
                progressDialog2.setMessage("大风车转");
                progressDialog2.setButton(DialogInterface.BUTTON_POSITIVE, "棒", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        ToastUtil.showMsg(ProgressActivity.this,"不会啊123456789");
                    }
                });
                progressDialog2.setButton(DialogInterface.BUTTON_NEGATIVE, "不好", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        ToastUtil.showMsg(ProgressActivity.this,"121222");
                    }
                });
                progressDialog2.show();

            }
        });
    }
    Handler handler=new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            if(mpb3.getProgress()<100){
                handler.postDelayed(runnable,500);
            }else {
                ToastUtil.showMsg(ProgressActivity.this,"加载完成");
            }
        }
    };
    Runnable runnable=new Runnable() {
        @Override
        public void run() {
            mpb3.setProgress(mpb3.getProgress()+5);
            handler.sendEmptyMessage(0);
        }
    };

}

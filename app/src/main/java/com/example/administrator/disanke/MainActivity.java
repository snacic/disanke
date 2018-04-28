package com.example.administrator.disanke;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mBtnUI,mBtnPro,mBtncustomdialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnUI=findViewById(R.id.btn_ui);
        mBtnPro=findViewById(R.id.btn_progress);
        mBtncustomdialog=findViewById(R.id.customdialog);

        OnClick onClick=new OnClick();
        mBtnUI.setOnClickListener(onClick);
        mBtnPro.setOnClickListener(onClick);
        mBtncustomdialog.setOnClickListener(onClick);


        }
        class OnClick implements View.OnClickListener{

            @Override
            public void onClick(View v) {
                Intent intent=null;
                switch(v.getId()){
                    case R.id.btn_ui:
                        intent=new Intent(MainActivity.this,UIActivity.class);
                        break;
                    case R.id.btn_progress:
                        intent=new Intent(MainActivity.this,ProgressActivity.class);
                        break;
                    case R.id.customdialog:
                        intent=new Intent(MainActivity.this,CustomDialogActivity.class);
                        break;

                }
                startActivity(intent);
            }
        }
}

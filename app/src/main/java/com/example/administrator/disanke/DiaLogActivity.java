package com.example.administrator.disanke;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.administrator.disanke.util.ToastUtil;

public class DiaLogActivity extends AppCompatActivity {

    private Button dia1, dia2, dia3, dia4,dia5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dia_log);
        dia1 = findViewById(R.id.btn_dialog1);
        dia2 = findViewById(R.id.btn_dialog2);
        dia3 = findViewById(R.id.btn_dialog3);
        dia4 = findViewById(R.id.btn_dialog4);
        dia5=findViewById(R.id.btn_dialog5);
        OnClick onClick = new OnClick();
        dia1.setOnClickListener(onClick);
        dia2.setOnClickListener(onClick);
        dia3.setOnClickListener(onClick);
        dia4.setOnClickListener(onClick);
        dia5.setOnClickListener(onClick);
    }

    class OnClick implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.btn_dialog1:
                    AlertDialog.Builder builder = new AlertDialog.Builder(DiaLogActivity.this);
                    builder.setTitle("请回答").setMessage("你这条狗")
                            .setIcon(R.mipmap.keai)
                            .setPositiveButton("棒极了", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    ToastUtil.showMsg(DiaLogActivity.this,"你很生吃");
                                }
                            }).setNeutralButton("还行", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            ToastUtil.showMsg(DiaLogActivity.this,"你在看看啊");
                        }
                    }).setNegativeButton("太烂", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            ToastUtil.showMsg(DiaLogActivity.this,"你去死了吧");
                        }
                    }).show();
                    break;
                case R.id.btn_dialog2:
                    final String[] array2=new String[]{"男","女"};
                    AlertDialog.Builder builder2=new AlertDialog.Builder(DiaLogActivity.this);
                    builder2.setTitle("选择性别").setItems(array2, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            ToastUtil.showMsg(DiaLogActivity.this,array2[which]);
                        }
                    }).show();
                    break;
                case R.id.btn_dialog3:
                    final String[] array3=new String[]{"男","女"};
                    AlertDialog.Builder builder3=new AlertDialog.Builder(DiaLogActivity.this);
                    builder3.setSingleChoiceItems(array3, 0, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            ToastUtil.showMsg(DiaLogActivity.this,array3[which]);
                            dialog.dismiss();
                        }
                    }).setCancelable(false).show();
                    break;
                case R.id.btn_dialog4:
                    final String[] array4=new String[]{"男","女","人妖"};
                    boolean[] isSelected=new boolean[]{false,false,true};
                    AlertDialog.Builder builder4=new AlertDialog.Builder(DiaLogActivity.this);
                    builder4.setTitle("选择老婆").setMultiChoiceItems(array4, isSelected, new DialogInterface.OnMultiChoiceClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which, boolean isChecked) {
                            ToastUtil.showMsg(DiaLogActivity.this,array4[which]+":"+isChecked);
                        }
                    }).setCancelable(false).setPositiveButton("确定", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    }).setNegativeButton("取消", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    }).show();
                    break;
                case R.id.btn_dialog5:
                   AlertDialog.Builder builder5=new AlertDialog.Builder(DiaLogActivity.this);
                   View view=LayoutInflater.from(DiaLogActivity.this).inflate(R.layout.layout_dialog,null);
                   EditText edun=view.findViewById(R.id.et_username);
                    EditText edpw=view.findViewById(R.id.et_password);
                    Button btnlogin=view.findViewById(R.id.btn_login);
                    btnlogin.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                        }
                    });
                   builder5.setTitle("请您登陆").setView(view).show();
                    break;
            }
        }
    }
}

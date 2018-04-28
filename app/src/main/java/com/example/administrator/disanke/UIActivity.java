package com.example.administrator.disanke;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.administrator.disanke.gridview.GridViewActivity;
import com.example.administrator.disanke.listview.ListViewActivity;
import com.example.administrator.disanke.recyclerview.RecyclerViewActivity;

public class UIActivity extends AppCompatActivity {

    private Button mBtnTextView,mBtnButton,mBtnEditText,mBtnRadioButton,mBtnCheckBox,mBtnImageView,mBtnListView,mBtnGridView,mBtnRecycler,mBtnToast,mBtnDiaLog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ui);
        mBtnTextView=findViewById(R.id.btn_textview);
        mBtnButton=findViewById(R.id.btn_button);
        mBtnEditText=findViewById(R.id.btn_edit);
        mBtnRadioButton=findViewById(R.id.btn_rb);
        mBtnCheckBox=findViewById(R.id.btn_cb);
        mBtnImageView=findViewById(R.id.btn_iv);
        mBtnListView=findViewById(R.id.btn_listview);
        mBtnGridView=findViewById(R.id.btn_gridview);
        mBtnRecycler=findViewById(R.id.recy);
        mBtnToast=findViewById(R.id.toast);
        mBtnDiaLog=findViewById(R.id.dialog);

        setListeners();

    }
    private void setListeners(){
        OnClick onClick=new OnClick();
        mBtnTextView.setOnClickListener(onClick);
        mBtnButton.setOnClickListener(onClick);
        mBtnEditText.setOnClickListener(onClick);
        mBtnRadioButton.setOnClickListener(onClick);
        mBtnCheckBox.setOnClickListener(onClick);
        mBtnImageView.setOnClickListener(onClick);
        mBtnListView.setOnClickListener(onClick);
        mBtnGridView.setOnClickListener(onClick);
        mBtnRecycler.setOnClickListener(onClick);
        mBtnToast.setOnClickListener(onClick);
        mBtnDiaLog.setOnClickListener(onClick);

    }
    private class OnClick implements  View.OnClickListener{
        @Override
        public void onClick(View v){
            Intent intent=null;
            switch(v.getId()){
                case R.id.btn_textview:
                    intent=new Intent(UIActivity.this,TextViewActivity.class);
                break;
                case R.id.btn_button:
                    intent=new Intent(UIActivity.this,ButtonActivity.class);
                    break;
                case R.id.btn_edit:
                    intent=new Intent(UIActivity.this,EditTextActivity.class);
                    break;
                case R.id.btn_rb:
                    intent=new Intent(UIActivity.this,RadioButtonActivity.class);
                    break;
                case R.id.btn_cb:
                    intent=new Intent(UIActivity.this,CheckBoxActivity.class);
                    break;
                case R.id.btn_iv:
                    intent=new Intent(UIActivity.this,ImageViewActivity.class);
                    break;
                case R.id.btn_listview:
                    intent=new Intent(UIActivity.this,ListViewActivity.class);
                    break;
                case R.id.btn_gridview:
                    intent=new Intent(UIActivity.this,GridViewActivity.class);
                    break;
                case R.id.recy:
                    intent=new Intent(UIActivity.this,RecyclerViewActivity.class);
                    break;
                case R.id.toast:
                    intent=new Intent(UIActivity.this,ToastActivity.class);
                    break;
                case R.id.dialog:
                    intent=new Intent(UIActivity.this,DiaLogActivity.class);
                    break;
            }
            startActivity(intent);
        }
    }
}

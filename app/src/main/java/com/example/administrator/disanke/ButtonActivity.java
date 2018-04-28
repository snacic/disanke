package com.example.administrator.disanke;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ButtonActivity extends AppCompatActivity {

    private Button mbtn3;
    private TextView wenzi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);
        mbtn3=findViewById(R.id.btn_3);
        mbtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ButtonActivity.this,"fuck you little bitch",Toast.LENGTH_SHORT).show();
            }
        });
        wenzi=findViewById(R.id.litao1);
        wenzi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ButtonActivity.this,"fuck you  ",Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void  showToast(View view){
        Toast.makeText(this,"刚才我被点了一下",Toast.LENGTH_SHORT).show();
    }
}

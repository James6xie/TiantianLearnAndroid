package com.example.chaozhuoxzt.h5appdemo1;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button bt1;
    private Button bt2;
    private ImageButton imgbt;
    private Context context;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.factivity);

        context = this;
        bt1 = findViewById(R.id.buttonFirst);
        bt2 = findViewById(R.id.buttonSecond);
        imgbt = (ImageButton)findViewById(R.id.imageButtonTian);
        textView = findViewById(R.id.textView1);

        //jump by startActivity
        bt1.setOnClickListener(new MyOnClickListener() {
            @Override
            public void onClick(View v) {
                super.onClick(v);//call base class onClick
                Intent intent = new Intent(context,SActivity.class);
                startActivity(intent);
            }
        });

        //jump by startActivityForResult
        bt2.setOnClickListener(new MyOnClickListener() {
            @Override
            public void onClick(View v) {
                super.onClick(v);
                Intent intent = new Intent(context,SActivity.class);
                startActivityForResult(intent,1);
            }
        });

        //image button 的监听
        imgbt.setOnClickListener(this);
    }

    //jump and recive return data
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode ==1 && resultCode == 2){
            String content = data.getStringExtra("data");
            textView.setText(content);
        }
    }

    //接口方式
    @Override
    public void onClick(View v) {
        Log.i("tag","接口方式实现监听");
    }
}

class MyOnClickListener implements View.OnClickListener{

    @Override
    public void onClick(View v) {
        Log.i("tag","父类的Onclick方法");
        v.setAlpha(0.5f);
    }
}
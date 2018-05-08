package com.example.chaozhuoxzt.h5appdemo1;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;


/**
 * Created by chaozhuoxzt on 18-5-7.
 */

public class SActivity extends AppCompatActivity {

    private Button bt;
    private String content = "你好!!你好!!你好!!你好!!你好!!你好!!你好!!你好!!你好!!你好!!你好!!你好!!";
    private AutoCompleteTextView autoCompleteTextView;
    //data resource
    private String[] res = {"beijin","beijin1","beijinnihao","beijincheng","beijing2","beijing3"};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sactivity);

        bt = findViewById(R.id.buttonSactivity);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent data = new Intent();
                data.putExtra("data",content);
                setResult(2,data);
                finish();
            }
        });

        //initial autoCompleteTextView widget
        autoCompleteTextView = findViewById(R.id.autoCompleteTextView);

        //create adapter
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,res);

        //adapter bind with widget
        autoCompleteTextView.setAdapter(arrayAdapter);
    }
}

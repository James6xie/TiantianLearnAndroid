package com.example.chaozhuoxzt.h5appdemo1;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.MultiAutoCompleteTextView;
import android.widget.ToggleButton;


/**
 * Created by chaozhuoxzt on 18-5-7.
 */

public class SActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {

    private Button bt;
    private String content = "你好!!你好!!你好!!你好!!你好!!你好!!你好!!你好!!你好!!你好!!你好!!你好!!";
    private AutoCompleteTextView autoCompleteTextView;
    //data resource
    private String[] res = {"beijin","beijin1","beijinnihao","beijincheng","beijing2","beijing3"};
    private MultiAutoCompleteTextView multiAutoCompleteTextView;

    private ToggleButton toggleButton;
    private ImageView image;

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
        multiAutoCompleteTextView = findViewById(R.id.multiAutoCompleteTextView);

        //create adapter
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,res);
        ArrayAdapter<String> arrayAdapterM = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,res);

        //adapter bind with widget
        autoCompleteTextView.setAdapter(arrayAdapter);
        multiAutoCompleteTextView.setAdapter(arrayAdapterM);

        //set comma split
        multiAutoCompleteTextView.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());

        //ToggleButton
        toggleButton = (ToggleButton) findViewById(R.id.toggleButton);
        image = (ImageView) findViewById(R.id.imageView2);

        toggleButton.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        image.setBackgroundResource(isChecked ? R.drawable.on : R.drawable.off);
    }
}

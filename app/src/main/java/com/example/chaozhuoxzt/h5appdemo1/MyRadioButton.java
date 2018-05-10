package com.example.chaozhuoxzt.h5appdemo1;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.RadioGroup;

/**
 * Created by chaozhuoxzt on 18-5-10.
 */

public class MyRadioButton extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener{

    private RadioGroup radioButton;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.radiobutton);

        radioButton =findViewById(R.id.radioGroup1);
        radioButton.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        switch (checkedId){
            case R.id.radioBtNugout:
                Log.i("tag","点了一下 radioBtNugout");
                break;
            case R.id.radioBtOreo:
                Log.i("tag","点了一下 radioBtOreo");
                break;
            default:
                break;
        }

    }
}

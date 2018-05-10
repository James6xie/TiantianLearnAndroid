package com.example.chaozhuoxzt.h5appdemo1;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.CheckBox;
import android.widget.CompoundButton;

/**
 * Created by chaozhuoxzt on 18-5-10.
 */

public class MyCheckBox extends AppCompatActivity {

    private CheckBox checkBox;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.checkbox);

        //checkbox init
        checkBox = (CheckBox) findViewById(R.id.checkBox_meat);

        //set checkbox listener handle checkbox status
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    String text = checkBox.getText().toString();
                    Log.i("tag","checked is: "+text);
                }else {
                    Log.i("tag","unCheck meat, i like vegetables!!");
                }
            }
        });

    }
}

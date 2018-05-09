package com.example.chaozhuoxzt.h5appdemo1;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.chaozhuoxzt.h5appdemo1.R;

/**
 * Created by chaozhuoxzt on 18-5-9.
 */

public class MySpinner extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private Spinner spinner;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.myspinner);

        spinner = (Spinner) findViewById(R.id.spinnerTest);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.planets_array,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);


        spinner.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String [] planets = getResources().getStringArray(R.array.planets_array);
        Toast.makeText(this,"你点的是:"+planets[position],2000).show();
        Log.i("tag","选择了一个Item");
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}

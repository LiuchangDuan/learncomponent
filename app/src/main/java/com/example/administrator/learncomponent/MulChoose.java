package com.example.administrator.learncomponent;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

public class MulChoose extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {

    private CheckBox cb1, cb2, cb3, cb4;
    private TextView tvResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mul_choose);

        tvResult = (TextView) findViewById(R.id.tvResult);

        cb1 = (CheckBox) findViewById(R.id.checkBox);
        cb2 = (CheckBox) findViewById(R.id.checkBox2);
        cb3 = (CheckBox) findViewById(R.id.checkBox3);
        cb4 = (CheckBox) findViewById(R.id.checkBox4);

        cb1.setOnCheckedChangeListener(this);
        cb2.setOnCheckedChangeListener(this);
        cb3.setOnCheckedChangeListener(this);
        cb4.setOnCheckedChangeListener(this);

//        cb1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
//
//            }
//        });

    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        String str = "";

        if (cb1.isChecked()) {
            str += cb1.getText() + ",";
        }
        if (cb2.isChecked()) {
            str += cb2.getText() + ",";
        }
        if (cb3.isChecked()) {
            str += cb3.getText() + ",";
        }
        if (cb4.isChecked()) {
            str += cb4.getText();
        }

        tvResult.setText(str);

    }
}

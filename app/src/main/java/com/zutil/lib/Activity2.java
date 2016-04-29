package com.zutil.lib;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.jaeger.library.StatusBarUtil;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);

        //设置透明度，1- 255
           StatusBarUtil.setTranslucent( Activity2.this , 127 ) ;
    }
}

package com.zutil.lib;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;

import com.jaeger.library.StatusBarUtil;

public class Activity4 extends AppCompatActivity {

    private DrawerLayout mDrawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity4);

        mDrawerLayout = (DrawerLayout) findViewById( R.id.drawer_layout );
        mDrawerLayout.setDrawerShadow(R.mipmap.ic_launcher , GravityCompat.START);

        StatusBarUtil.setColorForDrawerLayout( Activity4.this  , mDrawerLayout , Color.BLUE) ;
    }
}

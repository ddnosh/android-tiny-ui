package com.androidwind.ui.sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.androidwind.ui.handler.TinyTextViewHandler;
import com.androidwind.ui.view.TinyTextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void BtnClick(View view) {
        TinyTextView ttv = findViewById(R.id.ttv);
        //获取Helper
        TinyTextViewHandler handler = ttv.getViewHandler();
        handler.setBackgroundColorNormal(getResources().getColor(android.R.color.holo_red_dark))
                .setBorderColorNormal(getResources().getColor(android.R.color.holo_orange_light))
                .setBorderWidthNormal(12)
                .setCornerRadius(25);
    }
}

package com.zsp.myarouterdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * author：Andy on 2019/6/10 0010-15:18
 * email:zsp872126510@gmail.com
 */

//@Route(path = "/app/SecondActivity")
public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
    }
}

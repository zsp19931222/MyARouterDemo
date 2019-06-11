package com.zsp.myarouterdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;

import static com.zsp.mylibrary.Content.URL00;
import static com.zsp.mylibrary.Content.URL01;

@Route(path = URL00)
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void start(View view) {
        ARouter.getInstance().build(URL01).navigation();
    }
}

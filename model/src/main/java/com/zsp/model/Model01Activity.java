package com.zsp.model;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;

import static com.zsp.mylibrary.Content.URL01;
import static com.zsp.mylibrary.Content.URL02;

/**
 * author：Andy on 2019/6/10 0010-16:35
 * email:zsp872126510@gmail.com
 */
@Route(path = URL01)
public class Model01Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }
    public void start(View view) {
        Bundle bundle=new Bundle();
        bundle.putInt("int",0);
        bundle.putString("str","str");
        ARouter.getInstance().build(URL02).with(bundle).navigation();
    }
}

package com.zsp.model02;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;

import static com.zsp.mylibrary.Content.URL00;
import static com.zsp.mylibrary.Content.URL02;

/**
 * author：Andy on 2019/6/10 0010-16:48
 * email:zsp872126510@gmail.com
 */
@Route(path = URL02)
public class Model02Activity extends AppCompatActivity {
    Bundle bundle;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        bundle=getIntent().getExtras();
        Log.d("zspbundle", "bundle: " + bundle.getString("str"));
    }

    public void start(View view) {
        ARouter.getInstance().build(URL00).navigation();
    }
}

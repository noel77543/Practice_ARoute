package com.noel.sung.pratice_aroute;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.noel.sung.pratice_aroute.implement.SpeakService;

@Route(path = RouteInfo.ROUTE_TEST_2_ACTIVITY)
public class Test2Activity extends AppCompatActivity {

    @Autowired
    String name;
    @Autowired
    int age;
    @Autowired
    boolean boy;
    @Autowired
    int high;
    @Autowired
    String obj;
    @Autowired(name = RouteInfo.ROUTE_SPEAK_SERVICE)
    SpeakService speakService;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test2);
        ARouter.getInstance().inject(this);

        speakService.speak(this, "不需要實作，直接認定對應SpeakService之Path");

        Log.e("T3", "參數-> " + "name: " + name + "  age: " + age + " boy: " + boy + " high:" + high + " obj: " + obj);
    }
}

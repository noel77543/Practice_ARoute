package com.noel.sung.pratice_aroute;

import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;

@Route(path = RouteInfo.ROUTE_TEST_1_ACTIVITY)
public class Test1Activity extends AppCompatActivity {

    //可透過name來指定前一頁的Key值
    @Autowired(name = "Key")
    String test;
    @Autowired(name = "Key3")
    TestObject testObject;
    @Autowired
    boolean Key2;


    private Uri uri = Uri.parse("sung://noel" + RouteInfo.ROUTE_TEST_2_ACTIVITY + "?name=alex&age=18&boy=true&high=180&obj={\"name\":\"jack\",\"id\":\"666\"}");

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        ARouter.getInstance().inject(this);
        Log.e("T1", test + "");
        Log.e("T2", Key2 + "");

        Log.e("T3", testObject.getName() + "");
        Log.e("T3", testObject.getAge() + "");
        Log.e("T3", testObject.isIsEnable() + "");


        findViewById(R.id.text_view).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ARouter
                        .getInstance()
                        //前往的項目路徑
                        .build(uri)
                        //前往
                        .navigation();
            }
        });


    }
}

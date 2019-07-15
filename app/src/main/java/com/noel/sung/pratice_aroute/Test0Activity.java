package com.noel.sung.pratice_aroute;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;

//定義本畫面的路徑
@Route(path = RouteInfo.ROUTE_TEST_0_ACTIVITY)
public class Test0Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final TestObject testObject = new TestObject();
        testObject.setAge(18);
        testObject.setIsEnable(true);
        testObject.setName("Noel");

        findViewById(R.id.text_view).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ARouter
                        .getInstance()
                        //前往的項目路徑
                        .build(RouteInfo.ROUTE_TEST_1_ACTIVITY)
                        .withString("Key", "Value")
                        .withBoolean("Key2", true)
                        .withParcelable("Key3", testObject)
                        //前往
                        .navigation();
            }
        });
    }
}

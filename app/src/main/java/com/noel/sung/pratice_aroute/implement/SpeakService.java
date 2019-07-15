package com.noel.sung.pratice_aroute.implement;

import android.content.Context;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.noel.sung.pratice_aroute.RouteInfo;

/**
 * 實現接口
 */
@Route(path = RouteInfo.ROUTE_SPEAK_SERVICE)
public class SpeakService implements BaseService {
    @Override
    public void speak(Context context, String text) {
        Toast.makeText(context, text, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void init(Context context) {

    }
}

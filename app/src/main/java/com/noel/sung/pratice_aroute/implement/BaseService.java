package com.noel.sung.pratice_aroute.implement;

import android.content.Context;

import com.alibaba.android.arouter.facade.template.IProvider;

/**
 * 聲明接口
 */
public interface BaseService extends IProvider {
    void speak(Context context, String text);
}

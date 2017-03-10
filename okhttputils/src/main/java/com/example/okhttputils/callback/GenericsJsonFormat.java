package com.example.okhttputils.callback;


import android.util.Log;

import com.example.okhttputils.GsonUtils;

/**
 * 实现了一个由Json字符串到对象的转换
 *
 * Created by lishuangling on 2016/12/21.
 */
public class GenericsJsonFormat implements IGenericsFormat {

    @Override
    public <T> T transform(String response, Class<T> classOfT) {
        return GsonUtils.getGson().fromJson(response, classOfT);
    }
}

package com.example.okhttputils.callback;

import android.support.annotation.NonNull;

import java.io.IOException;

import okhttp3.Response;

/**
 * 这个抽象类是用来提供一个预处理Response的接口,
 * 通过构造方法里传入一个IGenericsFormat的子类对象来实现
 *
 * Created by lishuangling on 2016/12/21.
 */
public abstract class GenericsCallback<T> extends Callback<T> {

    /**
     *
     */
    private IGenericsFormat mGenericsFormat;
    /**
     *
     */
    private Class<T> mClazz;

    /**
     *
     */
    private String mContent;

    /**
     *
     * @param format
     * @param clazz
     */
    public GenericsCallback(@NonNull IGenericsFormat format, @NonNull Class<T> clazz) {
        mGenericsFormat = format;
        mClazz = clazz;
    }

    @Override
    public T parseNetworkResponse(Response response, int id) throws IOException {
        mContent = response.body().string();
        if (mClazz == String.class) {
            return (T) mContent;
        }
        return mGenericsFormat.transform(mContent, mClazz);
    }

    @Override
    public String getResponseBodyContent() {
        return mContent;
    }
}

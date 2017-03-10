package com.example.okhttputils.callback;

/**
 * Created by lishuangling on 2016/12/21.
 */

public interface IGenericsFormat {
    <T> T transform(String response, Class<T> classOfT);
}

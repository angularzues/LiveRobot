package com.example.okhttputils;

import com.google.gson.Gson;

/**
 * Created by lishuangling on 2017/2/23.
 */

public class GsonUtils {

    private static Gson mGson;

    public static Gson getGson() {
        if (mGson == null) {
            synchronized (GsonUtils.class) {
                if (mGson == null)
                    mGson = new Gson();
            }
        }
        return mGson;
    }
}